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
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"member",
	"post",
	"daily_post",
	"comment",
	"comment_v2",
	"live_post"
})
public class GroupStat {

	@JsonProperty("member") private Integer member;
	@JsonProperty("post") private Integer post;
	@JsonProperty("daily_post") private Integer dailyPost;
	@JsonProperty("comment") private Integer comment;
	@JsonProperty("comment_v2") private Integer commentV2;
	@JsonProperty("live_post") private Integer livePost;

	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("member")
	public Integer getMember() {
		return member;
	}

	@JsonProperty("member")
	public void setMember(Integer member) {
		this.member = member;
	}

	@JsonProperty("post")
	public Integer getPost() {
		return post;
	}

	@JsonProperty("post")
	public void setPost(Integer post) {
		this.post = post;
	}

	@JsonProperty("daily_post")
	public Integer getDailyPost() {
		return dailyPost;
	}

	@JsonProperty("daily_post")
	public void setDailyPost(Integer dailyPost) {
		this.dailyPost = dailyPost;
	}

	@JsonProperty("comment")
	public Integer getComment() {
		return comment;
	}

	@JsonProperty("comment")
	public void setComment(Integer comment) {
		this.comment = comment;
	}

	@JsonProperty("comment_v2")
	public Integer getCommentV2() {
		return commentV2;
	}

	@JsonProperty("comment_v2")
	public void setCommentV2(Integer commentV2) {
		this.commentV2 = commentV2;
	}

	@JsonProperty("live_post")
	public Integer getLivePost() {
		return livePost;
	}

	@JsonProperty("live_post")
	public void setLivePost(Integer livePost) {
		this.livePost = livePost;
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
		this.additionalProperties.put(name, value);
	}

}
