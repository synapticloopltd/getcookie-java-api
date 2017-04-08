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

import com.fasterxml.jackson.annotation.JsonAnySetter;

public abstract class ModelBase {
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public abstract Logger getLogger();

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		getLogger().warn("No native setter for key '{}' with value '{}'", name, value);
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
