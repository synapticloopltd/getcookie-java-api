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
	"online",
	"last_online_time",
	"current_country",
	"latitude",
	"longitude"
})
public class Activity extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Activity.class);

	@JsonProperty("online")            private Boolean online;
	@JsonProperty("last_online_time")  private Integer lastOnlineTime;
	@JsonProperty("current_country")   private String currentCountry;
	@JsonProperty("latitude")          private Object latitude;
	@JsonProperty("longitude")         private Object longitude;

	public Boolean getOnline() { return online; }

	public Integer getLastOnlineTime() { return lastOnlineTime; }

	public String getCurrentCountry() { return currentCountry; }

	public Object getLatitude() { return latitude; }

	public Object getLongitude() { return longitude; }

	@Override
	public Logger getLogger() { return(LOGGER); }

}
