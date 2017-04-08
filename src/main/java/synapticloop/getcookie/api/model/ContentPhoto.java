package synapticloop.getcookie.api.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"animated",
	"id",
	"title",
	"has_tiles",
	"tile_thumbnails",
	"thumbnails"
})
public class ContentPhoto extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(ContentPhoto.class);

	@JsonProperty("animated")         private Boolean animated;
	@JsonProperty("id")               private String id;
	@JsonProperty("title")            private Object title;
	@JsonProperty("has_tiles")        private Boolean hasTiles;
	@JsonProperty("tile_thumbnails")  private TileThumbnails tileThumbnails;
	@JsonProperty("thumbnails")       private Thumbnails thumbnails;

	@JsonProperty("animated")
	public Boolean getAnimated() {
		return animated;
	}

	public String getId() { return id; }

	public Object getTitle() { return title; }

	public Boolean getHasTiles() { return hasTiles; }

	public TileThumbnails getTileThumbnails() { return tileThumbnails; }

	public Thumbnails getThumbnails() { return thumbnails; }

	@Override
	public Logger getLogger() { return(LOGGER); }

}
