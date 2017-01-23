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

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"id",
	"username",
	"gender",
	"age",
	"country",
	"country_name",
	"avatar",
	"level",
	"badges",
	"activity",
	"user_level",
	"posts_url",
	"url"
})
public class Owner {
	private static final Logger LOGGER = LoggerFactory.getLogger(Owner.class);

	@JsonProperty("id") private String id;
	@JsonProperty("username") private String username;
	@JsonProperty("gender") private Integer gender;
	@JsonProperty("age") private Integer age;
	@JsonProperty("country") private String country;
	@JsonProperty("country_name") private String countryName;
	@JsonProperty("avatar") private Avatar avatar;
	@JsonProperty("level") private Integer level;
	@JsonProperty("badges") private List<Integer> badges = null;
	@JsonProperty("activity") private Activity activity;
	@JsonProperty("user_level") private UserLevel userLevel;
	@JsonProperty("posts_url") private String postsUrl;
	@JsonProperty("url") private String url;
	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	@JsonProperty("username")
	public void setUsername(String username) {
		this.username = username;
	}

	@JsonProperty("gender")
	public Integer getGender() {
		return gender;
	}

	@JsonProperty("gender")
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@JsonProperty("age")
	public Integer getAge() {
		return age;
	}

	@JsonProperty("age")
	public void setAge(Integer age) {
		this.age = age;
	}

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("country_name")
	public String getCountryName() {
		return countryName;
	}

	@JsonProperty("country_name")
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@JsonProperty("avatar")
	public Avatar getAvatar() {
		return avatar;
	}

	@JsonProperty("avatar")
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}

	@JsonProperty("level")
	public Integer getLevel() {
		return level;
	}

	@JsonProperty("level")
	public void setLevel(Integer level) {
		this.level = level;
	}

	@JsonProperty("badges")
	public List<Integer> getBadges() {
		return badges;
	}

	@JsonProperty("badges")
	public void setBadges(List<Integer> badges) {
		this.badges = badges;
	}

	@JsonProperty("activity")
	public Activity getActivity() {
		return activity;
	}

	@JsonProperty("activity")
	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	@JsonProperty("user_level")
	public UserLevel getUserLevel() {
		return userLevel;
	}

	@JsonProperty("user_level")
	public void setUserLevel(UserLevel userLevel) {
		this.userLevel = userLevel;
	}

	@JsonProperty("posts_url")
	public String getPostsUrl() {
		return postsUrl;
	}

	@JsonProperty("posts_url")
	public void setPostsUrl(String postsUrl) {
		this.postsUrl = postsUrl;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		LOGGER.warn("No native setter for key '{}' with value '{}'", name, value);
		this.additionalProperties.put(name, value);
	}

}
