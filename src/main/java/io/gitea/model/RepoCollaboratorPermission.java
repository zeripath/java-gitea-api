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
import io.gitea.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RepoCollaboratorPermission to get repository permission for a collaborator
 */
@ApiModel(description = "RepoCollaboratorPermission to get repository permission for a collaborator")

public class RepoCollaboratorPermission {
  @SerializedName("permission")
  private String permission = null;

  @SerializedName("role_name")
  private String roleName = null;

  @SerializedName("user")
  private User user = null;

  public RepoCollaboratorPermission permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @ApiModelProperty(value = "")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public RepoCollaboratorPermission roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @ApiModelProperty(value = "")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public RepoCollaboratorPermission user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepoCollaboratorPermission repoCollaboratorPermission = (RepoCollaboratorPermission) o;
    return Objects.equals(this.permission, repoCollaboratorPermission.permission) &&
        Objects.equals(this.roleName, repoCollaboratorPermission.roleName) &&
        Objects.equals(this.user, repoCollaboratorPermission.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, roleName, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoCollaboratorPermission {\n");
    
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

