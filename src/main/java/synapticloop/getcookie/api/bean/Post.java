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

public class Post {
	@JsonProperty("id")   private static String id;
	@JsonProperty("title")   private static String title;
	@JsonProperty("title_v2")   private static String title_v2;
	@JsonProperty("description")   private static String description;
	@JsonProperty("og_title")   private static String ogTitle;
	@JsonProperty("og_description")   private static String ogDescription;
	@JsonProperty("nsfw")   private static boolean isNsfw; 
	@JsonProperty("created_at")   private static long created_at;
	@JsonProperty("color_id")   private static String color_id; 
	@JsonProperty("color_code")   private static String color_code;
	@JsonProperty("latitude")   private static String latitude; 
	@JsonProperty("longitude")   private static String longitude; 
	@JsonProperty("country")   private static String country;

	//	@JsonProperty("stat")   private static String stat; //  : +{ ... },
	//	@JsonProperty("cover_photo")   private static String cover_photo; //  : +{ ... },
	//	@JsonProperty("content_photos")   private static String content_photos; //  : +[ ... ],
	@JsonProperty("cover_video")   private static String cover_video; 
//	@JsonProperty("owner")   private static String owner; //  : +{ ... },
	@JsonProperty("anonymous")   private static boolean isAnonymous;
	@JsonProperty("featured")   private static boolean isFeatured;
//	@JsonProperty("groups")   private static String groups; //  : +[ ... ],
//	@JsonProperty("comment")   private static String comment; //  : +{ ... },
	@JsonProperty("is_live")   private static boolean isLive;
	@JsonProperty("url")   private static String url;
	@JsonProperty("comment_url")   private static String comment_url;

}
