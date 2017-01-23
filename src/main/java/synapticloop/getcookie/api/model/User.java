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
	@JsonProperty("next_offset") private Integer nextOffset;
	@JsonProperty("has_next") private Boolean hasNext;
	@JsonProperty("posts") private List<Post> posts = null;
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

	@JsonProperty("fullname")
	public String getFullname() {
		return fullname;
	}

	@JsonProperty("fullname")
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@JsonProperty("account_id")
	public Integer getAccountId() {
		return accountId;
	}

	@JsonProperty("account_id")
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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

	@JsonProperty("zodiac")
	public String getZodiac() {
		return zodiac;
	}

	@JsonProperty("zodiac")
	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
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

	@JsonProperty("jid")
	public String getJid() {
		return jid;
	}

	@JsonProperty("jid")
	public void setJid(String jid) {
		this.jid = jid;
	}

	@JsonProperty("status")
	public Integer getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(Integer status) {
		this.status = status;
	}

	@JsonProperty("bio")
	public String getBio() {
		return bio;
	}

	@JsonProperty("bio")
	public void setBio(String bio) {
		this.bio = bio;
	}

	@JsonProperty("avatar")
	public Avatar getAvatar() {
		return avatar;
	}

	@JsonProperty("avatar")
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}

	@JsonProperty("cover_photo")
	public Object getCoverPhoto() {
		return coverPhoto;
	}

	@JsonProperty("cover_photo")
	public void setCoverPhoto(Object coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	@JsonProperty("content_photos")
	public List<ContentPhoto> getContentPhotos() {
		return contentPhotos;
	}

	@JsonProperty("content_photos")
	public void setContentPhotos(List<ContentPhoto> contentPhotos) {
		this.contentPhotos = contentPhotos;
	}

	@JsonProperty("activity")
	public Activity getActivity() {
		return activity;
	}

	@JsonProperty("activity")
	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	@JsonProperty("level")
	public Integer getLevel() {
		return level;
	}

	@JsonProperty("level")
	public void setLevel(Integer level) {
		this.level = level;
	}

	@JsonProperty("point")
	public Integer getPoint() {
		return point;
	}

	@JsonProperty("point")
	public void setPoint(Integer point) {
		this.point = point;
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

	@JsonProperty("next_offset")
	public Integer getNextOffset() {
		return nextOffset;
	}

	@JsonProperty("next_offset")
	public void setNextOffset(Integer nextOffset) {
		this.nextOffset = nextOffset;
	}

	@JsonProperty("has_next")
	public Boolean getHasNext() {
		return hasNext;
	}

	@JsonProperty("has_next")
	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}

	@JsonProperty("posts")
	public List<Post> getPosts() {
		return posts;
	}

	@JsonProperty("posts")
	public void setPosts(List<Post> posts) {
		this.posts = posts;
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
