/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * TrackedTime worked time for an issue / pr
 */
@ApiModel(description = "TrackedTime worked time for an issue / pr")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-24T18:24:48.590+01:00")
public class TrackedTime {
  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("issue_id")
  private Long issueId = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("user_id")
  private Long userId = null;

  public TrackedTime created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public TrackedTime id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TrackedTime issueId(Long issueId) {
    this.issueId = issueId;
    return this;
  }

   /**
   * Get issueId
   * @return issueId
  **/
  @ApiModelProperty(value = "")
  public Long getIssueId() {
    return issueId;
  }

  public void setIssueId(Long issueId) {
    this.issueId = issueId;
  }

  public TrackedTime time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Time in seconds
   * @return time
  **/
  @ApiModelProperty(value = "Time in seconds")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public TrackedTime userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackedTime trackedTime = (TrackedTime) o;
    return Objects.equals(this.created, trackedTime.created) &&
        Objects.equals(this.id, trackedTime.id) &&
        Objects.equals(this.issueId, trackedTime.issueId) &&
        Objects.equals(this.time, trackedTime.time) &&
        Objects.equals(this.userId, trackedTime.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, id, issueId, time, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedTime {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

