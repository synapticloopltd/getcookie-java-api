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

public class Statistics {
	@JsonProperty("member") private int numMember;
	@JsonProperty("post") private int numPost;
	@JsonProperty("daily_post") private int numDailyPost;
	@JsonProperty("comment") private int numComment;
	@JsonProperty("comment_v2") private int numCommentV2;
	@JsonProperty("live_post") private int numLivePost;

	public int getNumMember() { return this.numMember; }
	public int getNumPost() { return this.numPost; }
	public int getNumDailyPost() { return this.numDailyPost; }
	public int getNumComment() { return this.numComment; }
	public int getNumCommentV2() { return this.numCommentV2; }
	public int getNumLivePost() { return this.numLivePost; }

}
