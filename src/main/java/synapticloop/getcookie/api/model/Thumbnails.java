
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
    "100x100",
    "400x400",
    "800x800"
})
public class Thumbnails {

    @JsonProperty("100x100")
    private synapticloop.getcookie.api.model._100x100 _100x100;
    @JsonProperty("400x400")
    private synapticloop.getcookie.api.model._400x400 _400x400;
    @JsonProperty("800x800")
    private synapticloop.getcookie.api.model._800x800 _800x800;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("100x100")
    public synapticloop.getcookie.api.model._100x100 get100x100() {
        return _100x100;
    }

    @JsonProperty("100x100")
    public void set100x100(synapticloop.getcookie.api.model._100x100 _100x100) {
        this._100x100 = _100x100;
    }

    @JsonProperty("400x400")
    public synapticloop.getcookie.api.model._400x400 get400x400() {
        return _400x400;
    }

    @JsonProperty("400x400")
    public void set400x400(synapticloop.getcookie.api.model._400x400 _400x400) {
        this._400x400 = _400x400;
    }

    @JsonProperty("800x800")
    public synapticloop.getcookie.api.model._800x800 get800x800() {
        return _800x800;
    }

    @JsonProperty("800x800")
    public void set800x800(synapticloop.getcookie.api.model._800x800 _800x800) {
        this._800x800 = _800x800;
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
