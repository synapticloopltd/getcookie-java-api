package synapticloop.getcookie.api.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

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

public class PostStatistics {
	@JsonProperty("comment")   private static Integer numComment;
	@JsonProperty("fb_like")   private static Integer numFbLike;
	@JsonProperty("fb_share")   private static Integer numFbShare;
	@JsonProperty("fb_comment")   private static Integer numFbComment;
	@JsonProperty("comment_v2")   private static Integer numCommentV2;
	@JsonProperty("upvote")   private static Integer numUpvote;
	@JsonProperty("downvote")   private static Integer numDownvote;
	@JsonProperty("score")   private static Integer numScore;
	@JsonProperty("report")   private static Integer numReport;
	@JsonProperty("coin")   private static Integer numCoin;
	@JsonProperty("comment_coin")   private static Integer numCommentCoin;
	@JsonProperty("create_comment_coin")   private static Integer numCreateCommentCoin;
	@JsonProperty("total_coin")   private static Integer numTotalCoin;

	public static Integer getNumComment() { return numComment; }
	public static Integer getNumFbLike() { return numFbLike; }
	public static Integer getNumFbShare() { return numFbShare; }
	public static Integer getNumFbComment() { return numFbComment; }
	public static Integer getNumCommentV2() { return numCommentV2; }
	public static Integer getNumUpvote() { return numUpvote; }
	public static Integer getNumDownvote() { return numDownvote; }
	public static Integer getNumScore() { return numScore; }
	public static Integer getNumReport() { return numReport; }
	public static Integer getNumCoin() { return numCoin; }
	public static Integer getNumCommentCoin() { return numCommentCoin; }
	public static Integer getNumCreateCommentCoin() { return numCreateCommentCoin; }
	public static Integer getNumTotalCoin() { return numTotalCoin; }

	
}
