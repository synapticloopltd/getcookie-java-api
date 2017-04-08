package synapticloop.getcookie.api.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"id",
	"title",
	"description",
	"og_title",
	"og_description",
	"nsfw",
	"type",
	"upload_placeholder",
	"canonical_name",
	"is_local",
	"created_at",
	"stat",
	"cover_photo",
	"featured",
	"country",
	"comment_url",
	"url",
	"next_offset",
	"has_next",
	"posts"
})
public class Group extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Group.class);

	@JsonProperty("id")                  private String id;
	@JsonProperty("title")               private String title;
	@JsonProperty("description")         private String description;
	@JsonProperty("og_title")            private String ogTitle;
	@JsonProperty("og_description")      private String ogDescription;
	@JsonProperty("nsfw")                private Boolean nsfw;
	@JsonProperty("type")                private Integer type;
	@JsonProperty("upload_placeholder")  private String uploadPlaceholder;
	@JsonProperty("canonical_name")      private String canonicalName;
	@JsonProperty("is_local")            private Boolean isLocal;
	@JsonProperty("created_at")          private Integer createdAt;
	@JsonProperty("stat")                private GroupStatistics stat;
	@JsonProperty("cover_photo")         private CoverPhoto coverPhoto;
	@JsonProperty("featured")            private Boolean featured;
	@JsonProperty("country")             private String country;
	@JsonProperty("comment_url")         private String commentUrl;
	@JsonProperty("url")                 private String url;
	@JsonProperty("next_offset")         private Long nextOffset;
	@JsonProperty("has_next")            private Boolean hasNext;
	@JsonProperty("posts")               private List<Post> posts = new ArrayList<Post>();

	public String getId() { return id; }

	public String getTitle() { return title; }

	public String getDescription() { return description; }

	public String getOgTitle() { return ogTitle; }

	public String getOgDescription() { return ogDescription; }

	public Boolean getNsfw() { return nsfw; }

	public Integer getType() { return type; }

	public String getUploadPlaceholder() { return uploadPlaceholder; }

	public String getCanonicalName() { return canonicalName; }

	public Boolean getIsLocal() { return isLocal; }

	public Integer getCreatedAt() { return createdAt; }

	public GroupStatistics getStat() { return stat; }

	public CoverPhoto getCoverPhoto() { return coverPhoto; }

	public Boolean getFeatured() { return featured; }

	public String getCountry() { return country; }

	public String getCommentUrl() { return commentUrl; }

	public String getUrl() { return url; }

	public Long getNextOffset() { return nextOffset; }

	public Boolean getHasNext() { return hasNext; }

	public List<Post> getPosts() { return posts; }

	@Override
	public Logger getLogger() { return(LOGGER); }
}
