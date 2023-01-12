/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.18.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gitea.model.CreatePullReviewComment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreatePullReviewOptions are options to create a pull review
 */
@ApiModel(description = "CreatePullReviewOptions are options to create a pull review")

public class CreatePullReviewOptions {
  @SerializedName("body")
  private String body = null;

  @SerializedName("comments")
  private List<CreatePullReviewComment> comments = null;

  @SerializedName("commit_id")
  private String commitId = null;

  @SerializedName("event")
  private String event = null;

  public CreatePullReviewOptions body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public CreatePullReviewOptions comments(List<CreatePullReviewComment> comments) {
    this.comments = comments;
    return this;
  }

  public CreatePullReviewOptions addCommentsItem(CreatePullReviewComment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<CreatePullReviewComment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")
  public List<CreatePullReviewComment> getComments() {
    return comments;
  }

  public void setComments(List<CreatePullReviewComment> comments) {
    this.comments = comments;
  }

  public CreatePullReviewOptions commitId(String commitId) {
    this.commitId = commitId;
    return this;
  }

   /**
   * Get commitId
   * @return commitId
  **/
  @ApiModelProperty(value = "")
  public String getCommitId() {
    return commitId;
  }

  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }

  public CreatePullReviewOptions event(String event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(value = "")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePullReviewOptions createPullReviewOptions = (CreatePullReviewOptions) o;
    return Objects.equals(this.body, createPullReviewOptions.body) &&
        Objects.equals(this.comments, createPullReviewOptions.comments) &&
        Objects.equals(this.commitId, createPullReviewOptions.commitId) &&
        Objects.equals(this.event, createPullReviewOptions.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, comments, commitId, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePullReviewOptions {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

