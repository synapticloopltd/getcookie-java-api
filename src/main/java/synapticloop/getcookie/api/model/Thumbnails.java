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

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"840w",
	"480w",
	"240w",
	"120w",
	"480wa",
	"480wv"
})
public class Thumbnails {

	@JsonProperty("840w") private Thumbnail _840w;
	@JsonProperty("480w") private Thumbnail _480w;
	@JsonProperty("240w") private Thumbnail _240w;
	@JsonProperty("120w") private Thumbnail _120w;
	@JsonProperty("480wa") private Thumbnail _480wa;
	@JsonProperty("480wv") private Thumbnail _480wv;

	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Thumbnail get840w() { return _840w; }

	public Thumbnail get480w() { return _480w; }

	public Thumbnail get240w() { return _240w; }

	public Thumbnail get120w() { return _120w; }

	public Thumbnail get480wa() { return _480wa; }

	public Thumbnail get480wv() { return _480wv; }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
