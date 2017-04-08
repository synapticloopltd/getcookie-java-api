package synapticloop.getcookie.api.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"thumbnails"
})
public class Avatar extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Avatar.class);

	@JsonProperty("thumbnails")  private AvatarThumbnails thumbnails;

	public AvatarThumbnails getThumbnails() {
		return thumbnails;
	}

	@Override
	public Logger getLogger() { return(LOGGER); }

}
