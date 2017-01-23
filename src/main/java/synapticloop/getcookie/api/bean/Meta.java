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

public class Meta {
	@JsonProperty("code")          private int code;
	@JsonProperty("status_code")   private String statusCode;
	@JsonProperty("message")       private String data;

	public int getCode() { return this.code; }

	public String getStatusCode() { return this.statusCode; }

	public String getData() { return this.data; }

}
