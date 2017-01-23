package synapticloop.getcookie.api;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

/*
 * Copyright (c) 2017 Synapticloop.
 * 
 * All rights reserved.
 * 
 * This code may contain contributions from other parties which, where 
 * applicable, will be listed in the default build file for the project 
 * ~and/or~ in a file named CONTRIBUTORS.txt in the root of the project.
 * 
 * This source code and any derived binaries are covered by the terms and 
 * conditions of the Licence agreement ("the Licence").  You may not use this 
 * source code or any derived binaries except in compliance with the Licence.  
 * A copy of the Licence is available in the file named LICENSE.txt shipped with 
 * this source code or binaries.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import synapticloop.getcookie.api.exception.GetCookieApiException;
import synapticloop.getcookie.api.model.GroupPost;
import synapticloop.getcookie.api.model.UserPosts;


public class GetCookieApiClient {
	private static final Logger LOGGER = LoggerFactory.getLogger(GetCookieApiClient.class);

	private CloseableHttpClient httpclient;

	public GetCookieApiClient() {
		HttpClientBuilder httpBuilder = HttpClients.custom();
		httpBuilder.setUserAgent(Constants.USER_AGENT);
		this.httpclient = httpBuilder.build();
	}

	/**
	 * Get the posts from a user starting at the latest post 
	 * 
	 * @param username the name of the user to get the posts
	 * 
	 * @return the User posts
	 * 
	 * @throws GetCookieApiException if there was an error with the API call
	 */
	public UserPosts getUserPosts(String username) throws GetCookieApiException {
		return(getUserPosts(username, 0));
	}

	/**
	 * Get the posts from a user starting at the offset
	 * 
	 * @param username the name of the user to get the posts
	 * @param offset the offset to start at
	 * 
	 * @return the user's posts
	 * 
	 * @throws GetCookieApiException if there was an error with the API call
	 */
	public UserPosts getUserPosts(String username, Integer offset) throws GetCookieApiException {
		return(execute(Constants.HTTP_METHOD_GET, 
				Constants.URL_GETCOOKIE_DOT_COM, 
				String.format(Constants.PATH_GET_USER_POSTS, username, offset), 
				200, UserPosts.class));
	}

	public GroupPost getGroupPosts(String group) throws GetCookieApiException {
		return(getGroupPosts(group, 0l));
	}

	public GroupPost getGroupPosts(String group, Long offset) throws GetCookieApiException {
		return(execute(Constants.HTTP_METHOD_GET, 
				Constants.URL_GETCOOKIE_DOT_COM, 
				String.format(Constants.PATH_GET_GROUP_POSTS, group, offset), 
				200, GroupPost.class));
	}

	/**
	 * Execute the request, returning the parsed response object
	 * 
	 * @param httpMethod The HTTP method to execute (GET/POST/PATCH/DELETE/PUT)
	 * @param url The URL to hit
	 * @param path the path to request
	 * @param allowableStatusCode the allowable return HTTP status code
	 * @param returnClass the return class type
	 * 
	 * @return The returned and parsed response
	 * 
	 * @throws ScalewayApiException If there was an error calling the api
	 */
	private <T> T execute(String httpMethod, String url, String path, int allowableStatusCode, Class<T> returnClass) throws GetCookieApiException {
		String requestPath = new StringBuilder(url).append(path).toString();

		HttpGet request = new HttpGet(requestPath);

		HttpResponse response;
		try {
			LOGGER.debug("Executing '{}' for url '{}'", httpMethod, requestPath);
			response = httpclient.execute(request);
		} catch (IOException ex) {
			throw new GetCookieApiException(ex);
		}

		int statusCode = response.getStatusLine().getStatusCode();

		if (statusCode == allowableStatusCode) {
			LOGGER.debug("Status code received: {}, wanted: {}.", statusCode, allowableStatusCode);
			if(null != returnClass) {
				try {
					return parseResponse(response, returnClass);
				} catch (IOException ex) {
					throw new GetCookieApiException(ex);
				}
			} else {
				return(null);
			}
		} else {
			LOGGER.error("Invalid status code received: {}, wanted: {}.", statusCode, allowableStatusCode);
			try {
				throw new GetCookieApiException(IOUtils.toString(response.getEntity().getContent()));
			} catch (UnsupportedOperationException | IOException ex) {
				throw new GetCookieApiException(ex);
			}
		}
	}

	private ObjectMapper initializeObjectMapperJson() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		mapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
		return mapper;
	}

	private <T> T parseResponse(HttpResponse response, Class<T> type) throws IOException {
		HttpEntity responseEntity = response.getEntity();
		String encoding = responseEntity.getContentEncoding() != null ? responseEntity.getContentEncoding().getValue() : "UTF-8";
		String jsonString = IOUtils.toString(responseEntity.getContent(), encoding);
		try {
			return initializeObjectMapperJson().readValue(jsonString, type);
		} catch (Exception ex) {
			LOGGER.error("%s", jsonString);
			throw ex;
		}
	}
}
