/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.15.0+dev-206-gae6d7860b
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

/**
 * InternalTracker represents settings for internal tracker
 */
@ApiModel(description = "InternalTracker represents settings for internal tracker")

public class InternalTracker {
  @SerializedName("allow_only_contributors_to_track_time")
  private Boolean allowOnlyContributorsToTrackTime = null;

  @SerializedName("enable_issue_dependencies")
  private Boolean enableIssueDependencies = null;

  @SerializedName("enable_time_tracker")
  private Boolean enableTimeTracker = null;

  public InternalTracker allowOnlyContributorsToTrackTime(Boolean allowOnlyContributorsToTrackTime) {
    this.allowOnlyContributorsToTrackTime = allowOnlyContributorsToTrackTime;
    return this;
  }

   /**
   * Let only contributors track time (Built-in issue tracker)
   * @return allowOnlyContributorsToTrackTime
  **/
  @ApiModelProperty(value = "Let only contributors track time (Built-in issue tracker)")
  public Boolean isAllowOnlyContributorsToTrackTime() {
    return allowOnlyContributorsToTrackTime;
  }

  public void setAllowOnlyContributorsToTrackTime(Boolean allowOnlyContributorsToTrackTime) {
    this.allowOnlyContributorsToTrackTime = allowOnlyContributorsToTrackTime;
  }

  public InternalTracker enableIssueDependencies(Boolean enableIssueDependencies) {
    this.enableIssueDependencies = enableIssueDependencies;
    return this;
  }

   /**
   * Enable dependencies for issues and pull requests (Built-in issue tracker)
   * @return enableIssueDependencies
  **/
  @ApiModelProperty(value = "Enable dependencies for issues and pull requests (Built-in issue tracker)")
  public Boolean isEnableIssueDependencies() {
    return enableIssueDependencies;
  }

  public void setEnableIssueDependencies(Boolean enableIssueDependencies) {
    this.enableIssueDependencies = enableIssueDependencies;
  }

  public InternalTracker enableTimeTracker(Boolean enableTimeTracker) {
    this.enableTimeTracker = enableTimeTracker;
    return this;
  }

   /**
   * Enable time tracking (Built-in issue tracker)
   * @return enableTimeTracker
  **/
  @ApiModelProperty(value = "Enable time tracking (Built-in issue tracker)")
  public Boolean isEnableTimeTracker() {
    return enableTimeTracker;
  }

  public void setEnableTimeTracker(Boolean enableTimeTracker) {
    this.enableTimeTracker = enableTimeTracker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalTracker internalTracker = (InternalTracker) o;
    return Objects.equals(this.allowOnlyContributorsToTrackTime, internalTracker.allowOnlyContributorsToTrackTime) &&
        Objects.equals(this.enableIssueDependencies, internalTracker.enableIssueDependencies) &&
        Objects.equals(this.enableTimeTracker, internalTracker.enableTimeTracker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOnlyContributorsToTrackTime, enableIssueDependencies, enableTimeTracker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalTracker {\n");
    
    sb.append("    allowOnlyContributorsToTrackTime: ").append(toIndentedString(allowOnlyContributorsToTrackTime)).append("\n");
    sb.append("    enableIssueDependencies: ").append(toIndentedString(enableIssueDependencies)).append("\n");
    sb.append("    enableTimeTracker: ").append(toIndentedString(enableTimeTracker)).append("\n");
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

