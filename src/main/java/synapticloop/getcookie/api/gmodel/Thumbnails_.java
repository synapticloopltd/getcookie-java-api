
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

import synapticloop.getcookie.api.model._120w_;
import synapticloop.getcookie.api.model._240w_;
import synapticloop.getcookie.api.model._480w_;
import synapticloop.getcookie.api.model._840w_;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "840w",
    "480w",
    "240w",
    "120w",
    "480wa",
    "480wv"
})
public class Thumbnails_ {

    @JsonProperty("840w")
    private _840w_ _840w;
    @JsonProperty("480w")
    private _480w_ _480w;
    @JsonProperty("240w")
    private _240w_ _240w;
    @JsonProperty("120w")
    private _120w_ _120w;
    @JsonProperty("480wa")
    private synapticloop.getcookie.api.model._480wa _480wa;
    @JsonProperty("480wv")
    private synapticloop.getcookie.api.model._480wv _480wv;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("840w")
    public _840w_ get840w() {
        return _840w;
    }

    @JsonProperty("840w")
    public void set840w(_840w_ _840w) {
        this._840w = _840w;
    }

    @JsonProperty("480w")
    public _480w_ get480w() {
        return _480w;
    }

    @JsonProperty("480w")
    public void set480w(_480w_ _480w) {
        this._480w = _480w;
    }

    @JsonProperty("240w")
    public _240w_ get240w() {
        return _240w;
    }

    @JsonProperty("240w")
    public void set240w(_240w_ _240w) {
        this._240w = _240w;
    }

    @JsonProperty("120w")
    public _120w_ get120w() {
        return _120w;
    }

    @JsonProperty("120w")
    public void set120w(_120w_ _120w) {
        this._120w = _120w;
    }

    @JsonProperty("480wa")
    public synapticloop.getcookie.api.model._480wa get480wa() {
        return _480wa;
    }

    @JsonProperty("480wa")
    public void set480wa(synapticloop.getcookie.api.model._480wa _480wa) {
        this._480wa = _480wa;
    }

    @JsonProperty("480wv")
    public synapticloop.getcookie.api.model._480wv get480wv() {
        return _480wv;
    }

    @JsonProperty("480wv")
    public void set480wv(synapticloop.getcookie.api.model._480wv _480wv) {
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
