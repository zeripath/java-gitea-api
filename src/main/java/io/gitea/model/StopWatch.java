/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.14.0&#43;dev-803-gf1da46622
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * StopWatch represent a running stopwatch
 */
@ApiModel(description = "StopWatch represent a running stopwatch")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-09T00:25:51.647+03:00")
public class StopWatch {
  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("duration")
  private String duration = null;

  @SerializedName("issue_index")
  private Long issueIndex = null;

  @SerializedName("issue_title")
  private String issueTitle = null;

  @SerializedName("repo_name")
  private String repoName = null;

  @SerializedName("repo_owner_name")
  private String repoOwnerName = null;

  @SerializedName("seconds")
  private Long seconds = null;

  public StopWatch created(OffsetDateTime created) {
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

  public StopWatch duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public StopWatch issueIndex(Long issueIndex) {
    this.issueIndex = issueIndex;
    return this;
  }

   /**
   * Get issueIndex
   * @return issueIndex
  **/
  @ApiModelProperty(value = "")
  public Long getIssueIndex() {
    return issueIndex;
  }

  public void setIssueIndex(Long issueIndex) {
    this.issueIndex = issueIndex;
  }

  public StopWatch issueTitle(String issueTitle) {
    this.issueTitle = issueTitle;
    return this;
  }

   /**
   * Get issueTitle
   * @return issueTitle
  **/
  @ApiModelProperty(value = "")
  public String getIssueTitle() {
    return issueTitle;
  }

  public void setIssueTitle(String issueTitle) {
    this.issueTitle = issueTitle;
  }

  public StopWatch repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

   /**
   * Get repoName
   * @return repoName
  **/
  @ApiModelProperty(value = "")
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }

  public StopWatch repoOwnerName(String repoOwnerName) {
    this.repoOwnerName = repoOwnerName;
    return this;
  }

   /**
   * Get repoOwnerName
   * @return repoOwnerName
  **/
  @ApiModelProperty(value = "")
  public String getRepoOwnerName() {
    return repoOwnerName;
  }

  public void setRepoOwnerName(String repoOwnerName) {
    this.repoOwnerName = repoOwnerName;
  }

  public StopWatch seconds(Long seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * Get seconds
   * @return seconds
  **/
  @ApiModelProperty(value = "")
  public Long getSeconds() {
    return seconds;
  }

  public void setSeconds(Long seconds) {
    this.seconds = seconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopWatch stopWatch = (StopWatch) o;
    return Objects.equals(this.created, stopWatch.created) &&
        Objects.equals(this.duration, stopWatch.duration) &&
        Objects.equals(this.issueIndex, stopWatch.issueIndex) &&
        Objects.equals(this.issueTitle, stopWatch.issueTitle) &&
        Objects.equals(this.repoName, stopWatch.repoName) &&
        Objects.equals(this.repoOwnerName, stopWatch.repoOwnerName) &&
        Objects.equals(this.seconds, stopWatch.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, duration, issueIndex, issueTitle, repoName, repoOwnerName, seconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopWatch {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    issueIndex: ").append(toIndentedString(issueIndex)).append("\n");
    sb.append("    issueTitle: ").append(toIndentedString(issueTitle)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    repoOwnerName: ").append(toIndentedString(repoOwnerName)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
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

