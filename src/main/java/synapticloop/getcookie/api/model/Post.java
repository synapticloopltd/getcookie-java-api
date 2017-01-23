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
	"title",
	"title_v2",
	"description",
	"og_title",
	"og_description",
	"nsfw",
	"created_at",
	"color_id",
	"color_code",
	"latitude",
	"longitude",
	"country",
	"stat",
	"cover_photo",
	"content_photos",
	"cover_video",
	"owner",
	"anonymous",
	"groups",
	"comment",
	"is_live",
	"url",
	"comment_url"
})
public class Post {
	private static final Logger LOGGER = LoggerFactory.getLogger(Post.class);


	@JsonProperty("id") private String id;
	@JsonProperty("title") private String title;
	@JsonProperty("title_v2") private String titleV2;
	@JsonProperty("description") private String description;
	@JsonProperty("og_title") private String ogTitle;
	@JsonProperty("og_description") private String ogDescription;
	@JsonProperty("nsfw") private Boolean nsfw;
	@JsonProperty("featured") private Boolean featured;
	@JsonProperty("created_at") private Integer createdAt;
	@JsonProperty("color_id") private Object colorId;
	@JsonProperty("color_code") private Object colorCode;
	@JsonProperty("latitude") private Object latitude;
	@JsonProperty("longitude") private Object longitude;
	@JsonProperty("country") private Object country;
	@JsonProperty("stat") private PostStatistics stat;
	@JsonProperty("cover_photo") private CoverPhoto coverPhoto;
	@JsonProperty("content_photos") private List<ContentPhoto> contentPhotos = null;
	@JsonProperty("cover_video") private Object coverVideo;
	@JsonProperty("owner") private Owner owner;
	@JsonProperty("anonymous") private Boolean anonymous;
	@JsonProperty("groups") private List<PostGroup> groups = null;
	@JsonProperty("comment") private Comment comment;
	@JsonProperty("is_live") private Boolean isLive;
	@JsonProperty("url") private String url;
	@JsonProperty("comment_url") private String commentUrl;

	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getId() { return this.id; }

	public String getTitle() { return this.title; }

	public String getTitleV2() { return this.titleV2; }

	public String getDescription() { return this.description; }

	public String getOgTitle() { return this.ogTitle; }

	public String getOgDescription() { return this.ogDescription; }

	public Boolean getNsfw() { return this.nsfw; }

	public Boolean getFeatured() { return this.featured; }

	public Integer getCreatedAt() { return this.createdAt; }

	public Object getColorId() { return this.colorId; }

	public Object getColorCode() { return this.colorCode; }

	public Object getLatitude() { return this.latitude; }

	public Object getLongitude() { return this.longitude; }

	public Object getCountry() { return this.country; }

	public PostStatistics getStat() { return this.stat; }

	public CoverPhoto getCoverPhoto() { return this.coverPhoto; }

	public List<ContentPhoto> getContentPhotos() { return this.contentPhotos; }

	public Object getCoverVideo() { return this.coverVideo; }

	public Owner getOwner() { return this.owner; }

	public Boolean getAnonymous() { return this.anonymous; }

	public List<PostGroup> getGroups() { return this.groups; }

	public Comment getComment() { return this.comment; }

	public Boolean getIsLive() { return this.isLive; }

	public String getUrl() { return this.url; }

	public String getCommentUrl() { return this.commentUrl; }

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
