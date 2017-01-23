
package synapticloop.getcookie.api.gmodel;

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

import synapticloop.getcookie.api.model.Comment;
import synapticloop.getcookie.api.model.ContentPhoto;
import synapticloop.getcookie.api.model.Owner;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "title_v2",
    "description",
    "og_title",
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
    "featured",
    "groups",
    "comment",
    "is_live",
    "url",
    "comment_url"
})
public class Post {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_v2")
    private String titleV2;
    @JsonProperty("description")
    private String description;
    @JsonProperty("og_title")
    private String ogTitle;
    @JsonProperty("og_description")
    private String ogDescription;
    @JsonProperty("nsfw")
    private Boolean nsfw;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("color_id")
    private Object colorId;
    @JsonProperty("color_code")
    private Object colorCode;
    @JsonProperty("latitude")
    private Object latitude;
    @JsonProperty("longitude")
    private Object longitude;
    @JsonProperty("country")
    private Object country;
    @JsonProperty("stat")
    private Stat_ stat;
    @JsonProperty("cover_photo")
    private CoverPhoto_ coverPhoto;
    @JsonProperty("content_photos")
    private List<ContentPhoto> contentPhotos = null;
    @JsonProperty("cover_video")
    private Object coverVideo;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("anonymous")
    private Boolean anonymous;
    @JsonProperty("featured")
    private Boolean featured;
    @JsonProperty("groups")
    private List<Group_> groups = null;
    @JsonProperty("comment")
    private Comment comment;
    @JsonProperty("is_live")
    private Boolean isLive;
    @JsonProperty("url")
    private String url;
    @JsonProperty("comment_url")
    private String commentUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("title_v2")
    public String getTitleV2() {
        return titleV2;
    }

    @JsonProperty("title_v2")
    public void setTitleV2(String titleV2) {
        this.titleV2 = titleV2;
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

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("color_id")
    public Object getColorId() {
        return colorId;
    }

    @JsonProperty("color_id")
    public void setColorId(Object colorId) {
        this.colorId = colorId;
    }

    @JsonProperty("color_code")
    public Object getColorCode() {
        return colorCode;
    }

    @JsonProperty("color_code")
    public void setColorCode(Object colorCode) {
        this.colorCode = colorCode;
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

    @JsonProperty("country")
    public Object getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Object country) {
        this.country = country;
    }

    @JsonProperty("stat")
    public Stat_ getStat() {
        return stat;
    }

    @JsonProperty("stat")
    public void setStat(Stat_ stat) {
        this.stat = stat;
    }

    @JsonProperty("cover_photo")
    public CoverPhoto_ getCoverPhoto() {
        return coverPhoto;
    }

    @JsonProperty("cover_photo")
    public void setCoverPhoto(CoverPhoto_ coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    @JsonProperty("content_photos")
    public List<ContentPhoto> getContentPhotos() {
        return contentPhotos;
    }

    @JsonProperty("content_photos")
    public void setContentPhotos(List<ContentPhoto> contentPhotos) {
        this.contentPhotos = contentPhotos;
    }

    @JsonProperty("cover_video")
    public Object getCoverVideo() {
        return coverVideo;
    }

    @JsonProperty("cover_video")
    public void setCoverVideo(Object coverVideo) {
        this.coverVideo = coverVideo;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("anonymous")
    public Boolean getAnonymous() {
        return anonymous;
    }

    @JsonProperty("anonymous")
    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    @JsonProperty("featured")
    public Boolean getFeatured() {
        return featured;
    }

    @JsonProperty("featured")
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    @JsonProperty("groups")
    public List<Group_> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Group_> groups) {
        this.groups = groups;
    }

    @JsonProperty("comment")
    public Comment getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    @JsonProperty("is_live")
    public Boolean getIsLive() {
        return isLive;
    }

    @JsonProperty("is_live")
    public void setIsLive(Boolean isLive) {
        this.isLive = isLive;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("comment_url")
    public String getCommentUrl() {
        return commentUrl;
    }

    @JsonProperty("comment_url")
    public void setCommentUrl(String commentUrl) {
        this.commentUrl = commentUrl;
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
