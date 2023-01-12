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
 * Organization represents an organization
 */
@ApiModel(description = "Organization represents an organization")

public class Organization {
  @SerializedName("avatar_url")
  private String avatarUrl = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("repo_admin_change_team_access")
  private Boolean repoAdminChangeTeamAccess = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("visibility")
  private String visibility = null;

  @SerializedName("website")
  private String website = null;

  public Organization avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public Organization description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Organization fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Organization id(Long id) {
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

  public Organization location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Organization name(String name) {
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

  public Organization repoAdminChangeTeamAccess(Boolean repoAdminChangeTeamAccess) {
    this.repoAdminChangeTeamAccess = repoAdminChangeTeamAccess;
    return this;
  }

   /**
   * Get repoAdminChangeTeamAccess
   * @return repoAdminChangeTeamAccess
  **/
  @ApiModelProperty(value = "")
  public Boolean isRepoAdminChangeTeamAccess() {
    return repoAdminChangeTeamAccess;
  }

  public void setRepoAdminChangeTeamAccess(Boolean repoAdminChangeTeamAccess) {
    this.repoAdminChangeTeamAccess = repoAdminChangeTeamAccess;
  }

  public Organization username(String username) {
    this.username = username;
    return this;
  }

   /**
   * deprecated
   * @return username
  **/
  @ApiModelProperty(value = "deprecated")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Organization visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @ApiModelProperty(value = "")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public Organization website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.avatarUrl, organization.avatarUrl) &&
        Objects.equals(this.description, organization.description) &&
        Objects.equals(this.fullName, organization.fullName) &&
        Objects.equals(this.id, organization.id) &&
        Objects.equals(this.location, organization.location) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.repoAdminChangeTeamAccess, organization.repoAdminChangeTeamAccess) &&
        Objects.equals(this.username, organization.username) &&
        Objects.equals(this.visibility, organization.visibility) &&
        Objects.equals(this.website, organization.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, description, fullName, id, location, name, repoAdminChangeTeamAccess, username, visibility, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    repoAdminChangeTeamAccess: ").append(toIndentedString(repoAdminChangeTeamAccess)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

