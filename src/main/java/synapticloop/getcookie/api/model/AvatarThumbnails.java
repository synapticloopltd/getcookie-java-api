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
	"100x100",
	"400x400",
	"800x800",
})
public class AvatarThumbnails extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(AvatarThumbnails.class);

	@JsonProperty("100x100") private Thumbnail _100x100;
	@JsonProperty("400x400") private Thumbnail _400x400;
	@JsonProperty("800x800") private Thumbnail _800x800;

	public Thumbnail get100x100() { return _100x100; }

	public Thumbnail get400x400() { return _400x400; }

	public Thumbnail get800x800() { return _800x800; }

	@Override
	public Logger getLogger() { return(LOGGER); }

}
