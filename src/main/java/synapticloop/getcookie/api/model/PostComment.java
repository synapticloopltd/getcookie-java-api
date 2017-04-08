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
	"id", 
	"username", 
	"avatar", 
	"title", 
	"image_url", 
	"upvote", 
	"downvote", 
	"reply"
})


public class PostComment extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(PostComment.class);

	@JsonProperty("id")         private String id;
	@JsonProperty("username")   private String username;
	@JsonProperty("avatar")     private String avatar;
	@JsonProperty("title")      private String title;
	@JsonProperty("image_url")  private String imageUrl;
	@JsonProperty("upvote")     private Integer upVote;
	@JsonProperty("downvote")   private Integer downVote;
	@JsonProperty("reply")      private Integer reply;

	public String getId() { return this.id; }

	public String getUsername() { return this.username; }

	public String getAvatar() { return this.avatar; }

	public String getTitle() { return this.title; }

	public String getImageUrl() { return this.imageUrl; }

	public Integer getUpVote() { return this.upVote; }

	public Integer getDownVote() { return this.downVote; }

	public Integer getReply() { return this.reply; }

	@Override
	public Logger getLogger() { return(LOGGER); }

}
