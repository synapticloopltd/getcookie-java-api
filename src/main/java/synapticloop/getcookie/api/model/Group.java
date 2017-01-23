package synapticloop.getcookie.api.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import synapticloop.getcookie.api.gmodel.CoverPhoto;
import synapticloop.getcookie.api.gmodel.Post;
import synapticloop.getcookie.api.gmodel.Stat;

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
public class Group {

	@JsonProperty("id") private String id;
	@JsonProperty("title") private String title;
	@JsonProperty("description") private String description;
	@JsonProperty("og_title") private String ogTitle;
	@JsonProperty("og_description") private String ogDescription;
	@JsonProperty("nsfw") private Boolean nsfw;
	@JsonProperty("type") private Integer type;
	@JsonProperty("upload_placeholder") private String uploadPlaceholder;
	@JsonProperty("canonical_name") private String canonicalName;
	@JsonProperty("is_local") private Boolean isLocal;
	@JsonProperty("created_at") private Integer createdAt;
	@JsonProperty("stat") private Stat stat;
	@JsonProperty("cover_photo") private CoverPhoto coverPhoto;
	@JsonProperty("featured") private Boolean featured;
	@JsonProperty("country") private String country;
	@JsonProperty("comment_url") private String commentUrl;
	@JsonProperty("url") private String url;
	@JsonProperty("next_offset") private Long nextOffset;
	@JsonProperty("has_next") private Boolean hasNext;
	@JsonProperty("posts") private List<Post> posts = null;

	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("og_title")
	public String getOgTitle() {
		return ogTitle;
	}

	@JsonProperty("og_title")
	public void setOgTitle(String ogTitle) {
		this.ogTitle = ogTitle;
	}

	@JsonProperty("og_description")
	public String getOgDescription() {
		return ogDescription;
	}

	@JsonProperty("og_description")
	public void setOgDescription(String ogDescription) {
		this.ogDescription = ogDescription;
	}

	@JsonProperty("nsfw")
	public Boolean getNsfw() {
		return nsfw;
	}

	@JsonProperty("nsfw")
	public void setNsfw(Boolean nsfw) {
		this.nsfw = nsfw;
	}

	@JsonProperty("type")
	public Integer getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(Integer type) {
		this.type = type;
	}

	@JsonProperty("upload_placeholder")
	public String getUploadPlaceholder() {
		return uploadPlaceholder;
	}

	@JsonProperty("upload_placeholder")
	public void setUploadPlaceholder(String uploadPlaceholder) {
		this.uploadPlaceholder = uploadPlaceholder;
	}

	@JsonProperty("canonical_name")
	public String getCanonicalName() {
		return canonicalName;
	}

	@JsonProperty("canonical_name")
	public void setCanonicalName(String canonicalName) {
		this.canonicalName = canonicalName;
	}

	@JsonProperty("is_local")
	public Boolean getIsLocal() {
		return isLocal;
	}

	@JsonProperty("is_local")
	public void setIsLocal(Boolean isLocal) {
		this.isLocal = isLocal;
	}

	@JsonProperty("created_at")
	public Integer getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(Integer createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("stat")
	public Stat getStat() {
		return stat;
	}

	@JsonProperty("stat")
	public void setStat(Stat stat) {
		this.stat = stat;
	}

	@JsonProperty("cover_photo")
	public CoverPhoto getCoverPhoto() {
		return coverPhoto;
	}

	@JsonProperty("cover_photo")
	public void setCoverPhoto(CoverPhoto coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	@JsonProperty("featured")
	public Boolean getFeatured() {
		return featured;
	}

	@JsonProperty("featured")
	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("comment_url")
	public String getCommentUrl() {
		return commentUrl;
	}

	@JsonProperty("comment_url")
	public void setCommentUrl(String commentUrl) {
		this.commentUrl = commentUrl;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("next_offset")
	public Long getNextOffset() {
		return nextOffset;
	}

	@JsonProperty("next_offset")
	public void setNextOffset(Long nextOffset) {
		this.nextOffset = nextOffset;
	}

	@JsonProperty("has_next")
	public Boolean getHasNext() {
		return hasNext;
	}

	@JsonProperty("has_next")
	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}

	@JsonProperty("posts")
	public List<Post> getPosts() {
		return posts;
	}

	@JsonProperty("posts")
	public void setPosts(List<Post> posts) {
		this.posts = posts;
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
