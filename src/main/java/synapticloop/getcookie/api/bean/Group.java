package synapticloop.getcookie.api.bean;

import java.util.List;

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

public class Group {

	@JsonProperty("id")                   private String id;
	@JsonProperty("title")                private String title;
	@JsonProperty("description")          private String description;
	@JsonProperty("og_title")             private String ogTitle;
	@JsonProperty("og_desctiption")       private String ogDescription;
	@JsonProperty("nsfw")                 private boolean isNsfw;
	@JsonProperty("type")                 private int type;
	@JsonProperty("stat")                 private Statistics statistics;
	@JsonProperty("cover_photo")          private CoverPhoto coverPhoto;

	@JsonProperty("upload_placeholder")   private String uploadPlaceholder;
	@JsonProperty("canonical_name")       private String canonicalName;
	@JsonProperty("is_local")             private boolean isLocal;
	@JsonProperty("created_at")           private long createdAt;
	@JsonProperty("featured")             private boolean isFeatured;
	@JsonProperty("country")              private String country;
	@JsonProperty("comment_url")          private String comment_url;
	@JsonProperty("url")                  private String url;
	@JsonProperty("next_offset")          private long nextOffset;
	@JsonProperty("has_next")             private boolean hasNext;

	@JsonProperty("posts")                private List<Post> posts;

	public String getId() { return this.id; }

	public String getTitle() { return this.title; }

	public String getDescription() { return this.description; }

	public String getOgTitle() { return this.ogTitle; }

	public String getOgDescription() { return this.ogDescription; }

	public boolean getIsNsfw() { return this.isNsfw; }

	public int getType() { return this.type; }

	public Statistics getStatistics() { return this.statistics; }

	public CoverPhoto getCoverPhoto() { return this.coverPhoto; }

	public String getUploadPlaceholder() { return this.uploadPlaceholder; }

	public String getCanonicalName() { return this.canonicalName; }

	public boolean getIsLocal() { return this.isLocal; }

	public long getCreatedAt() { return this.createdAt; }

	public boolean getIsFeatured() { return this.isFeatured; }

	public String getCountry() { return this.country; }

	public String getComment_url() { return this.comment_url; }

	public String getUrl() { return this.url; }

	public long getNextOffset() { return this.nextOffset; }

	public boolean getHasNext() { return this.hasNext; }

	public List<Post> getPosts() { return this.posts; }

	
}
