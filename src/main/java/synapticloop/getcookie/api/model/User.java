package synapticloop.getcookie.api.model;

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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"id",
	"username",
	"fullname",
	"account_id",
	"gender",
	"age",
	"zodiac",
	"country",
	"country_name",
	"jid",
	"status",
	"bio",
	"avatar",
	"cover_photo",
	"content_photos",
	"activity",
	"level",
	"point",
	"posts_url",
	"url",
	"next_offset",
	"has_next",
	"posts"
})
public class User {
	private static final Logger LOGGER = LoggerFactory.getLogger(User.class);

	@JsonProperty("id") private String id;
	@JsonProperty("username") private String username;
	@JsonProperty("fullname") private String fullname;
	@JsonProperty("account_id") private Integer accountId;
	@JsonProperty("gender") private Integer gender;
	@JsonProperty("age") private Integer age;
	@JsonProperty("zodiac") private String zodiac;
	@JsonProperty("country") private String country;
	@JsonProperty("country_name") private String countryName;
	@JsonProperty("jid") private String jid;
	@JsonProperty("status") private Integer status;
	@JsonProperty("bio") private String bio;
	@JsonProperty("avatar") private Avatar avatar;
	@JsonProperty("cover_photo") private Object coverPhoto;
	@JsonProperty("content_photos") private List<ContentPhoto> contentPhotos = null;
	@JsonProperty("activity") private Activity activity;
	@JsonProperty("level") private Integer level;
	@JsonProperty("point") private Integer point;
	@JsonProperty("posts_url") private String postsUrl;
	@JsonProperty("url") private String url;
	@JsonProperty("next_offset") private Long nextOffset;
	@JsonProperty("has_next") private Boolean hasNext;
	@JsonProperty("posts") private List<Post> posts = null;

	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getId() { return id; }

	public String getUsername() { return username; }

	public String getFullname() { return fullname; }

	public Integer getAccountId() { return accountId; }

	public Integer getGender() { return gender; }

	public Integer getAge() { return age; }

	public String getZodiac() { return zodiac; }

	public String getCountry() { return country; }

	public String getCountryName() { return countryName; }

	public String getJid() { return jid; }

	public Integer getStatus() { return status; }

	public String getBio() { return bio; }

	public Avatar getAvatar() { return avatar; }

	public Object getCoverPhoto() { return coverPhoto; }

	public List<ContentPhoto> getContentPhotos() { return contentPhotos; }

	public Activity getActivity() { return activity; }

	public Integer getLevel() { return level; }

	public Integer getPoint() { return point; }

	public String getPostsUrl() { return postsUrl; }

	public String getUrl() { return url; }

	public Long getNextOffset() { return nextOffset; }

	public Boolean getHasNext() { return hasNext; }

	public List<Post> getPosts() { return posts; }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		LOGGER.warn("No native setter for key '{}' with value '{}'", name, value);
		this.additionalProperties.put(name, value);
	}

}
