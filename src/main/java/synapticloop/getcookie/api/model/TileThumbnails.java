package synapticloop.getcookie.api.model;

import java.util.ArrayList;
import java.util.List;

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

})
public class TileThumbnails extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(TileThumbnails.class);

	@JsonProperty("480wt") private List<Thumbnail> _480wts = new ArrayList<Thumbnail>();

	public List<Thumbnail> get480wts() { return this._480wts; }

	@Override
	public Logger getLogger() { return(LOGGER); }

}
