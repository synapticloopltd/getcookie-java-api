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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class GroupStatistics extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(GroupStatistics.class);

	@JsonProperty("member")      private Integer member;
	@JsonProperty("post")        private Integer post;
	@JsonProperty("daily_post")  private Integer dailyPost;
	@JsonProperty("comment")     private Integer comment;
	@JsonProperty("comment_v2")  private Integer commentV2;
	@JsonProperty("live_post")   private Integer livePost;

	public Integer getMember() { return member; }

	public Integer getPost() { return post; }

	public Integer getDailyPost() { return dailyPost; }

	public Integer getComment() { return comment; }

	public Integer getCommentV2() { return commentV2; }

	public Integer getLivePost() { return livePost; }

	@Override
	public Logger getLogger() { return(LOGGER); }

}
