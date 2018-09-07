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

/**
 * MigrateRepoForm form for migrating repository
 */
@ApiModel(description = "MigrateRepoForm form for migrating repository")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-07T10:45:35.787+01:00")
public class MigrateRepoForm {
  @SerializedName("auth_password")
  private String authPassword = null;

  @SerializedName("auth_username")
  private String authUsername = null;

  @SerializedName("clone_addr")
  private String cloneAddr = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("mirror")
  private Boolean mirror = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("repo_name")
  private String repoName = null;

  @SerializedName("uid")
  private Long uid = null;

  public MigrateRepoForm authPassword(String authPassword) {
    this.authPassword = authPassword;
    return this;
  }

   /**
   * Get authPassword
   * @return authPassword
  **/
  @ApiModelProperty(value = "")
  public String getAuthPassword() {
    return authPassword;
  }

  public void setAuthPassword(String authPassword) {
    this.authPassword = authPassword;
  }

  public MigrateRepoForm authUsername(String authUsername) {
    this.authUsername = authUsername;
    return this;
  }

   /**
   * Get authUsername
   * @return authUsername
  **/
  @ApiModelProperty(value = "")
  public String getAuthUsername() {
    return authUsername;
  }

  public void setAuthUsername(String authUsername) {
    this.authUsername = authUsername;
  }

  public MigrateRepoForm cloneAddr(String cloneAddr) {
    this.cloneAddr = cloneAddr;
    return this;
  }

   /**
   * Get cloneAddr
   * @return cloneAddr
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCloneAddr() {
    return cloneAddr;
  }

  public void setCloneAddr(String cloneAddr) {
    this.cloneAddr = cloneAddr;
  }

  public MigrateRepoForm description(String description) {
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

  public MigrateRepoForm mirror(Boolean mirror) {
    this.mirror = mirror;
    return this;
  }

   /**
   * Get mirror
   * @return mirror
  **/
  @ApiModelProperty(value = "")
  public Boolean isMirror() {
    return mirror;
  }

  public void setMirror(Boolean mirror) {
    this.mirror = mirror;
  }

  public MigrateRepoForm _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public MigrateRepoForm repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

   /**
   * Get repoName
   * @return repoName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }

  public MigrateRepoForm uid(Long uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getUid() {
    return uid;
  }

  public void setUid(Long uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateRepoForm migrateRepoForm = (MigrateRepoForm) o;
    return Objects.equals(this.authPassword, migrateRepoForm.authPassword) &&
        Objects.equals(this.authUsername, migrateRepoForm.authUsername) &&
        Objects.equals(this.cloneAddr, migrateRepoForm.cloneAddr) &&
        Objects.equals(this.description, migrateRepoForm.description) &&
        Objects.equals(this.mirror, migrateRepoForm.mirror) &&
        Objects.equals(this._private, migrateRepoForm._private) &&
        Objects.equals(this.repoName, migrateRepoForm.repoName) &&
        Objects.equals(this.uid, migrateRepoForm.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authPassword, authUsername, cloneAddr, description, mirror, _private, repoName, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateRepoForm {\n");
    
    sb.append("    authPassword: ").append(toIndentedString(authPassword)).append("\n");
    sb.append("    authUsername: ").append(toIndentedString(authUsername)).append("\n");
    sb.append("    cloneAddr: ").append(toIndentedString(cloneAddr)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

