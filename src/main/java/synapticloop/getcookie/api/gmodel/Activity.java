
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
    "online",
    "last_online_time",
    "current_country",
    "latitude",
    "longitude"
})
public class Activity {

    @JsonProperty("online")
    private Boolean online;
    @JsonProperty("last_online_time")
    private Integer lastOnlineTime;
    @JsonProperty("current_country")
    private String currentCountry;
    @JsonProperty("latitude")
    private Object latitude;
    @JsonProperty("longitude")
    private Object longitude;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("online")
    public Boolean getOnline() {
        return online;
    }

    @JsonProperty("online")
    public void setOnline(Boolean online) {
        this.online = online;
    }

    @JsonProperty("last_online_time")
    public Integer getLastOnlineTime() {
        return lastOnlineTime;
    }

    @JsonProperty("last_online_time")
    public void setLastOnlineTime(Integer lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
    }

    @JsonProperty("current_country")
    public String getCurrentCountry() {
        return currentCountry;
    }

    @JsonProperty("current_country")
    public void setCurrentCountry(String currentCountry) {
        this.currentCountry = currentCountry;
    }

    @JsonProperty("latitude")
    public Object getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Object getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
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
