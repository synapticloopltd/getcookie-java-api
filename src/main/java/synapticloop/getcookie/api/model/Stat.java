
package synapticloop.getcookie.api.model;

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
    "comment",
    "fb_like",
    "fb_share",
    "fb_comment",
    "comment_v2",
    "upvote",
    "downvote",
    "score",
    "report",
    "coin",
    "comment_coin",
    "create_comment_coin",
    "total_coin"
})
public class Stat {

    @JsonProperty("comment")
    private Integer comment;
    @JsonProperty("fb_like")
    private Integer fbLike;
    @JsonProperty("fb_share")
    private Integer fbShare;
    @JsonProperty("fb_comment")
    private Integer fbComment;
    @JsonProperty("comment_v2")
    private Integer commentV2;
    @JsonProperty("upvote")
    private Integer upvote;
    @JsonProperty("downvote")
    private Integer downvote;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("report")
    private Integer report;
    @JsonProperty("coin")
    private Integer coin;
    @JsonProperty("comment_coin")
    private Integer commentCoin;
    @JsonProperty("create_comment_coin")
    private Integer createCommentCoin;
    @JsonProperty("total_coin")
    private Integer totalCoin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("comment")
    public Integer getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Integer comment) {
        this.comment = comment;
    }

    @JsonProperty("fb_like")
    public Integer getFbLike() {
        return fbLike;
    }

    @JsonProperty("fb_like")
    public void setFbLike(Integer fbLike) {
        this.fbLike = fbLike;
    }

    @JsonProperty("fb_share")
    public Integer getFbShare() {
        return fbShare;
    }

    @JsonProperty("fb_share")
    public void setFbShare(Integer fbShare) {
        this.fbShare = fbShare;
    }

    @JsonProperty("fb_comment")
    public Integer getFbComment() {
        return fbComment;
    }

    @JsonProperty("fb_comment")
    public void setFbComment(Integer fbComment) {
        this.fbComment = fbComment;
    }

    @JsonProperty("comment_v2")
    public Integer getCommentV2() {
        return commentV2;
    }

    @JsonProperty("comment_v2")
    public void setCommentV2(Integer commentV2) {
        this.commentV2 = commentV2;
    }

    @JsonProperty("upvote")
    public Integer getUpvote() {
        return upvote;
    }

    @JsonProperty("upvote")
    public void setUpvote(Integer upvote) {
        this.upvote = upvote;
    }

    @JsonProperty("downvote")
    public Integer getDownvote() {
        return downvote;
    }

    @JsonProperty("downvote")
    public void setDownvote(Integer downvote) {
        this.downvote = downvote;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("report")
    public Integer getReport() {
        return report;
    }

    @JsonProperty("report")
    public void setReport(Integer report) {
        this.report = report;
    }

    @JsonProperty("coin")
    public Integer getCoin() {
        return coin;
    }

    @JsonProperty("coin")
    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    @JsonProperty("comment_coin")
    public Integer getCommentCoin() {
        return commentCoin;
    }

    @JsonProperty("comment_coin")
    public void setCommentCoin(Integer commentCoin) {
        this.commentCoin = commentCoin;
    }

    @JsonProperty("create_comment_coin")
    public Integer getCreateCommentCoin() {
        return createCommentCoin;
    }

    @JsonProperty("create_comment_coin")
    public void setCreateCommentCoin(Integer createCommentCoin) {
        this.createCommentCoin = createCommentCoin;
    }

    @JsonProperty("total_coin")
    public Integer getTotalCoin() {
        return totalCoin;
    }

    @JsonProperty("total_coin")
    public void setTotalCoin(Integer totalCoin) {
        this.totalCoin = totalCoin;
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
