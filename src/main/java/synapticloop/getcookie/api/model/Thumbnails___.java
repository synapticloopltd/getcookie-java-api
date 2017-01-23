
package synapticloop.getcookie.api.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "840w",
    "480w",
    "240w",
    "120w",
    "480wa",
    "480wv"
})
public class Thumbnails___ {

    @JsonProperty("840w")
    private _840w__ _840w;
    @JsonProperty("480w")
    private _480w__ _480w;
    @JsonProperty("240w")
    private _240w__ _240w;
    @JsonProperty("120w")
    private _120w__ _120w;
    @JsonProperty("480wa")
    private _480wa_ _480wa;
    @JsonProperty("480wv")
    private _480wv_ _480wv;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("840w")
    public _840w__ get840w() {
        return _840w;
    }

    @JsonProperty("840w")
    public void set840w(_840w__ _840w) {
        this._840w = _840w;
    }

    @JsonProperty("480w")
    public _480w__ get480w() {
        return _480w;
    }

    @JsonProperty("480w")
    public void set480w(_480w__ _480w) {
        this._480w = _480w;
    }

    @JsonProperty("240w")
    public _240w__ get240w() {
        return _240w;
    }

    @JsonProperty("240w")
    public void set240w(_240w__ _240w) {
        this._240w = _240w;
    }

    @JsonProperty("120w")
    public _120w__ get120w() {
        return _120w;
    }

    @JsonProperty("120w")
    public void set120w(_120w__ _120w) {
        this._120w = _120w;
    }

    @JsonProperty("480wa")
    public _480wa_ get480wa() {
        return _480wa;
    }

    @JsonProperty("480wa")
    public void set480wa(_480wa_ _480wa) {
        this._480wa = _480wa;
    }

    @JsonProperty("480wv")
    public _480wv_ get480wv() {
        return _480wv;
    }

    @JsonProperty("480wv")
    public void set480wv(_480wv_ _480wv) {
        this._480wv = _480wv;
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
