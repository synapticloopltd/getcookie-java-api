package synapticloop.getcookie.api;

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

public class Constants {
	public static final String HTTP_METHOD_PATCH = "PATCH";
	public static final String HTTP_METHOD_PUT = "PUT";
	public static final String HTTP_METHOD_GET = "GET";
	public static final String HTTP_METHOD_POST = "POST";
	public static final String HTTP_METHOD_DELETE = "DELETE";

	public static final String URL_GETCOOKIE_DOT_COM = "http://getcookie.com";

	public static final String PATH_GET_USER_POSTS = "/api/user/%s/posts?offset=%d";
	public static final String PATH_GET_GROUP_POSTS = "/api/group/%s?offset=%d";
	public static final String PATH_GET_POST = "/api/p/%s";

	public static final String USER_AGENT = "synapticloop-getcookie-java-api";

}
