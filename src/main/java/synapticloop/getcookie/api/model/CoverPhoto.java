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
	"animated",
	"id",
	"title",
	"has_tiles",
	"tile_thumbnails",
	"thumbnails"
})
public class CoverPhoto {
	private static final Logger LOGGER = LoggerFactory.getLogger(CoverPhoto.class);

	@JsonProperty("animated") private Boolean animated;
	@JsonProperty("id") private String id;
	@JsonProperty("title") private Object title;
	@JsonProperty("has_tiles") private Boolean hasTiles;
	@JsonProperty("tile_thumbnails") private TileThumbnails tileThumbnails;
	@JsonProperty("thumbnails") private Thumbnails thumbnails;

	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("animated")
	public Boolean getAnimated() {
		return animated;
	}

	@JsonProperty("animated")
	public void setAnimated(Boolean animated) {
		this.animated = animated;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("title")
	public Object getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(Object title) {
		this.title = title;
	}

	@JsonProperty("has_tiles")
	public Boolean getHasTiles() {
		return hasTiles;
	}

	@JsonProperty("has_tiles")
	public void setHasTiles(Boolean hasTiles) {
		this.hasTiles = hasTiles;
	}

	@JsonProperty("tile_thumbnails")
	public TileThumbnails getTileThumbnails() {
		return tileThumbnails;
	}

	@JsonProperty("tile_thumbnails")
	public void setTileThumbnails(TileThumbnails tileThumbnails) {
		this.tileThumbnails = tileThumbnails;
	}

	@JsonProperty("thumbnails")
	public Thumbnails getThumbnails() {
		return thumbnails;
	}

	@JsonProperty("thumbnails")
	public void setThumbnails(Thumbnails thumbnails) {
		this.thumbnails = thumbnails;
	}

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
