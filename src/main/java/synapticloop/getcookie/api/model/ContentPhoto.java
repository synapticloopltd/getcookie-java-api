package synapticloop.getcookie.api.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class ContentPhoto {

	@JsonProperty("animated") private Boolean animated;
	@JsonProperty("id") private String id;
	@JsonProperty("title") private Object title;
	@JsonProperty("has_tiles") private Boolean hasTiles;
	@JsonProperty("tile_thumbnails") private TileThumbnails_ tileThumbnails;
	@JsonProperty("thumbnails") private Thumbnails thumbnails;
	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("animated")
	public Boolean getAnimated() {
		return animated;
	}

	@JsonProperty("animated")
	public void setAnimated(Boolean animated) {
		this.animated = animated;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("title")
	public Object getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(Object title) {
		this.title = title;
	}

	@JsonProperty("has_tiles")
	public Boolean getHasTiles() {
		return hasTiles;
	}

	@JsonProperty("has_tiles")
	public void setHasTiles(Boolean hasTiles) {
		this.hasTiles = hasTiles;
	}

	@JsonProperty("tile_thumbnails")
	public TileThumbnails_ getTileThumbnails() {
		return tileThumbnails;
	}

	@JsonProperty("tile_thumbnails")
	public void setTileThumbnails(TileThumbnails_ tileThumbnails) {
		this.tileThumbnails = tileThumbnails;
	}

	@JsonProperty("thumbnails")
	public Thumbnails getThumbnails() {
		return thumbnails;
	}

	@JsonProperty("thumbnails")
	public void setThumbnails(Thumbnails thumbnails) {
		this.thumbnails = thumbnails;
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
