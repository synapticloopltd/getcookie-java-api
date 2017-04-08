package synapticloop.getcookie.api.model;

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
