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

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class Owner extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Owner.class);

	@JsonProperty("id")            private String id;
	@JsonProperty("username")      private String username;
	@JsonProperty("gender")        private Integer gender;
	@JsonProperty("age")           private Integer age;
	@JsonProperty("country")       private String country;
	@JsonProperty("country_name")  private String countryName;
	@JsonProperty("avatar")        private Avatar avatar;
	@JsonProperty("level")         private Integer level;
	@JsonProperty("badges")        private List<Integer> badges = new ArrayList<Integer>();
	@JsonProperty("activity")      private Activity activity;
	@JsonProperty("user_level")    private UserLevel userLevel;
	@JsonProperty("posts_url")     private String postsUrl;
	@JsonProperty("url")           private String url;

	public String getId() { return id; }

	public String getUsername() { return username; }

	public Integer getGender() { return gender; }

	public Integer getAge() { return age; }

	public String getCountry() { return country; }

	public String getCountryName() { return countryName; }

	public Avatar getAvatar() { return avatar; }

	public Integer getLevel() { return level; }

	public List<Integer> getBadges() { return badges; }

	public Activity getActivity() { return activity; }

	public UserLevel getUserLevel() { return userLevel; }

	public String getPostsUrl() { return postsUrl; }

	public String getUrl() { return url; }

	@Override
	public Logger getLogger() { return(LOGGER); }
}
