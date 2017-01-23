
package synapticloop.getcookie.api.gmodel;

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
    "op_client_id",
    "op_signature"
})
public class Comment {

    @JsonProperty("op_client_id")
    private Integer opClientId;
    @JsonProperty("op_signature")
    private String opSignature;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("op_client_id")
    public Integer getOpClientId() {
        return opClientId;
    }

    @JsonProperty("op_client_id")
    public void setOpClientId(Integer opClientId) {
        this.opClientId = opClientId;
    }

    @JsonProperty("op_signature")
    public String getOpSignature() {
        return opSignature;
    }

    @JsonProperty("op_signature")
    public void setOpSignature(String opSignature) {
        this.opSignature = opSignature;
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
