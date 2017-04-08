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
	"title_v2",
	"description",
	"og_title",
	"og_photo",
	"og_description",
	"nsfw",
	"created_at",
	"color_id",
	"color_code",
	"latitude",
	"longitude",
	"country",
	"stat",
	"cover_photo",
	"content_photos",
	"cover_video",
	"owner",
	"anonymous",
	"groups",
	"comment",
	"comments",
	"is_live",
	"url",
	"comment_url",
	"old_url"
})
public class Post extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Post.class);

	@JsonProperty("id")              private String id;
	@JsonProperty("title")           private String title;
	@JsonProperty("title_v2")        private String titleV2;
	@JsonProperty("description")     private String description;
	@JsonProperty("og_title")        private String ogTitle;
	@JsonProperty("og_photo")        private String ogPhoto;
	@JsonProperty("og_description")  private String ogDescription;
	@JsonProperty("nsfw")            private Boolean nsfw;
	@JsonProperty("featured")        private Boolean featured;
	@JsonProperty("created_at")      private Integer createdAt;
	@JsonProperty("color_id")        private Object colorId;
	@JsonProperty("color_code")      private Object colorCode;
	@JsonProperty("latitude")        private Object latitude;
	@JsonProperty("longitude")       private Object longitude;
	@JsonProperty("country")         private Object country;
	@JsonProperty("stat")            private PostStatistics stat;
	@JsonProperty("cover_photo")     private CoverPhoto coverPhoto;
	@JsonProperty("content_photos")  private List<ContentPhoto> contentPhotos = new ArrayList<ContentPhoto>();
	@JsonProperty("cover_video")     private Object coverVideo;
	@JsonProperty("owner")           private Owner owner;
	@JsonProperty("anonymous")       private Boolean anonymous;
	@JsonProperty("groups")          private List<PostGroup> groups = new ArrayList<PostGroup>();
	@JsonProperty("comment")         private Comment comment;
	@JsonProperty("comments")        private List<PostComment> comments = new ArrayList<PostComment>();
	@JsonProperty("is_live")         private Boolean isLive;
	@JsonProperty("url")             private String url;
	@JsonProperty("comment_url")     private String commentUrl;
	@JsonProperty("old_url")         private String oldUrl;

	public String getId() { return this.id; }

	public String getTitle() { return this.title; }

	public String getTitleV2() { return this.titleV2; }

	public String getDescription() { return this.description; }

	public String getOgTitle() { return this.ogTitle; }

	public String getOgDescription() { return this.ogDescription; }

	public Boolean getNsfw() { return this.nsfw; }

	public Boolean getFeatured() { return this.featured; }

	public Integer getCreatedAt() { return this.createdAt; }

	public Object getColorId() { return this.colorId; }

	public Object getColorCode() { return this.colorCode; }

	public Object getLatitude() { return this.latitude; }

	public Object getLongitude() { return this.longitude; }

	public Object getCountry() { return this.country; }

	public PostStatistics getStat() { return this.stat; }

	public CoverPhoto getCoverPhoto() { return this.coverPhoto; }

	public List<ContentPhoto> getContentPhotos() { return this.contentPhotos; }

	public Object getCoverVideo() { return this.coverVideo; }

	public Owner getOwner() { return this.owner; }

	public Boolean getAnonymous() { return this.anonymous; }

	public List<PostGroup> getGroups() { return this.groups; }

	public Comment getComment() { return this.comment; }

	public Boolean getIsLive() { return this.isLive; }

	public String getUrl() { return this.url; }

	public String getCommentUrl() { return this.commentUrl; }

	public List<PostComment> getComments() { return this.comments; }

	public String getOldUrl() { return this.oldUrl; }

	public String getOgPhoto() { return this.ogPhoto; }

	@Override
	public Logger getLogger() { return(LOGGER); }
}
