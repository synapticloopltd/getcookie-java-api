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

public class Thumbnails {
	@JsonProperty("840w") private Thumbnail eightForty;
	@JsonProperty("480w") private Thumbnail fourEighty;
	@JsonProperty("240w") private Thumbnail twoForty;
	@JsonProperty("120w") private Thumbnail oneTwenty;

	public Thumbnail getEightForty() { return this.eightForty; }
	public Thumbnail getFourEighty() { return this.fourEighty; }
	public Thumbnail getTwoForty() { return this.twoForty; }
	public Thumbnail getOneTwenty() { return this.oneTwenty; }

}
