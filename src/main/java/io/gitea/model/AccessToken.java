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
 * AccessToken
 */

public class AccessToken {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sha1")
  private String sha1 = null;

  @SerializedName("token_last_eight")
  private String tokenLastEight = null;

  public AccessToken id(Long id) {
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

  public AccessToken name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccessToken sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

   /**
   * Get sha1
   * @return sha1
  **/
  @ApiModelProperty(value = "")
  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public AccessToken tokenLastEight(String tokenLastEight) {
    this.tokenLastEight = tokenLastEight;
    return this;
  }

   /**
   * Get tokenLastEight
   * @return tokenLastEight
  **/
  @ApiModelProperty(value = "")
  public String getTokenLastEight() {
    return tokenLastEight;
  }

  public void setTokenLastEight(String tokenLastEight) {
    this.tokenLastEight = tokenLastEight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessToken accessToken = (AccessToken) o;
    return Objects.equals(this.id, accessToken.id) &&
        Objects.equals(this.name, accessToken.name) &&
        Objects.equals(this.sha1, accessToken.sha1) &&
        Objects.equals(this.tokenLastEight, accessToken.tokenLastEight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sha1, tokenLastEight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    tokenLastEight: ").append(toIndentedString(tokenLastEight)).append("\n");
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

