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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"comment",
	"fb_like",
	"fb_share",
	"fb_comment",
	"comment_v2",
	"upvote",
	"downvote",
	"score",
	"report",
	"coin",
	"comment_coin",
	"create_comment_coin",
	"total_coin"
})
public class PostStatistics {
	private static final Logger LOGGER = LoggerFactory.getLogger(PostStatistics.class);

	@JsonProperty("comment") private Integer comment;
	@JsonProperty("fb_like") private Integer fbLike;
	@JsonProperty("fb_share") private Integer fbShare;
	@JsonProperty("fb_comment") private Integer fbComment;
	@JsonProperty("comment_v2") private Integer commentV2;
	@JsonProperty("upvote") private Integer upvote;
	@JsonProperty("downvote") private Integer downvote;
	@JsonProperty("score") private Integer score;
	@JsonProperty("report") private Integer report;
	@JsonProperty("coin") private Integer coin;
	@JsonProperty("comment_coin") private Integer commentCoin;
	@JsonProperty("create_comment_coin") private Integer createCommentCoin;
	@JsonProperty("total_coin") private Integer totalCoin;

	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();


	public Integer getComment() { return comment; }

	public Integer getFbLike() { return fbLike; }

	public Integer getFbShare() { return fbShare; }

	public Integer getFbComment() { return fbComment; }

	public Integer getCommentV2() { return commentV2; }

	public Integer getUpvote() { return upvote; }

	public Integer getDownvote() { return downvote; }

	public Integer getScore() { return score; }

	public Integer getReport() { return report; }

	public Integer getCoin() { return coin; }

	public Integer getCommentCoin() { return commentCoin; }

	public Integer getCreateCommentCoin() { return createCommentCoin; }

	public Integer getTotalCoin() { return totalCoin; }

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
