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

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostData extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(PostData.class);

	@JsonProperty("posts")        private List<Post> posts = new ArrayList<Post>();
	@JsonProperty("next_offset")  private Long nextOffset;
	@JsonProperty("has_next")     private Boolean hasNext;

	public Long getNextOffset() { return this.nextOffset; }

	public Boolean getHasNext() { return this.hasNext; }

	public List<Post> getPosts() { return posts; }

	@Override
	public Logger getLogger() { return(LOGGER); }
}
