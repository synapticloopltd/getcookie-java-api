
package synapticloop.getcookie.api.gmodel;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import synapticloop.getcookie.api.model._120w;
import synapticloop.getcookie.api.model._240w;
import synapticloop.getcookie.api.model._480w;
import synapticloop.getcookie.api.model._840w;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"840w",
	"480w",
	"240w",
	"120w"
})
public class Thumbnails {

	@JsonProperty("840w") private _840w _840w;
	@JsonProperty("480w") private _480w _480w;
	@JsonProperty("240w") private _240w _240w; 
	@JsonProperty("120w") private _120w _120w; 
	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("840w")
	public _840w get840w() {
		return _840w;
	}

	@JsonProperty("840w")
	public void set840w(_840w _840w) {
		this._840w = _840w;
	}

	@JsonProperty("480w")
	public _480w get480w() {
		return _480w;
	}

	@JsonProperty("480w")
	public void set480w(_480w _480w) {
		this._480w = _480w;
	}

	@JsonProperty("240w")
	public _240w get240w() {
		return _240w;
	}

	@JsonProperty("240w")
	public void set240w(_240w _240w) {
		this._240w = _240w;
	}

	@JsonProperty("120w")
	public _120w get120w() {
		return _120w;
	}

	@JsonProperty("120w")
	public void set120w(_120w _120w) {
		this._120w = _120w;
	}

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
