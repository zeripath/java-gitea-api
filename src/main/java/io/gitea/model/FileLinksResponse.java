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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FileLinksResponse contains the links for a repo&#39;s file
 */
@ApiModel(description = "FileLinksResponse contains the links for a repo's file")

public class FileLinksResponse {
  @SerializedName("git")
  private String git = null;

  @SerializedName("html")
  private String html = null;

  @SerializedName("self")
  private String self = null;

  public FileLinksResponse git(String git) {
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @ApiModelProperty(value = "")
  public String getGit() {
    return git;
  }

  public void setGit(String git) {
    this.git = git;
  }

  public FileLinksResponse html(String html) {
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @ApiModelProperty(value = "")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public FileLinksResponse self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileLinksResponse fileLinksResponse = (FileLinksResponse) o;
    return Objects.equals(this.git, fileLinksResponse.git) &&
        Objects.equals(this.html, fileLinksResponse.html) &&
        Objects.equals(this.self, fileLinksResponse.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(git, html, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileLinksResponse {\n");
    
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

