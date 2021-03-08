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

/**
 * SubmitPullReviewOptions are options to submit a pending pull review
 */
@ApiModel(description = "SubmitPullReviewOptions are options to submit a pending pull review")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-09T00:25:51.647+03:00")
public class SubmitPullReviewOptions {
  @SerializedName("body")
  private String body = null;

  @SerializedName("event")
  private String event = null;

  public SubmitPullReviewOptions body(String body) {
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

  public SubmitPullReviewOptions event(String event) {
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
    SubmitPullReviewOptions submitPullReviewOptions = (SubmitPullReviewOptions) o;
    return Objects.equals(this.body, submitPullReviewOptions.body) &&
        Objects.equals(this.event, submitPullReviewOptions.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitPullReviewOptions {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

