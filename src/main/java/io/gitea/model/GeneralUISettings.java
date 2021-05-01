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
import java.util.ArrayList;
import java.util.List;

/**
 * GeneralUISettings contains global ui settings exposed by API
 */
@ApiModel(description = "GeneralUISettings contains global ui settings exposed by API")

public class GeneralUISettings {
  @SerializedName("allowed_reactions")
  private List<String> allowedReactions = null;

  @SerializedName("default_theme")
  private String defaultTheme = null;

  public GeneralUISettings allowedReactions(List<String> allowedReactions) {
    this.allowedReactions = allowedReactions;
    return this;
  }

  public GeneralUISettings addAllowedReactionsItem(String allowedReactionsItem) {
    if (this.allowedReactions == null) {
      this.allowedReactions = new ArrayList<String>();
    }
    this.allowedReactions.add(allowedReactionsItem);
    return this;
  }

   /**
   * Get allowedReactions
   * @return allowedReactions
  **/
  @ApiModelProperty(value = "")
  public List<String> getAllowedReactions() {
    return allowedReactions;
  }

  public void setAllowedReactions(List<String> allowedReactions) {
    this.allowedReactions = allowedReactions;
  }

  public GeneralUISettings defaultTheme(String defaultTheme) {
    this.defaultTheme = defaultTheme;
    return this;
  }

   /**
   * Get defaultTheme
   * @return defaultTheme
  **/
  @ApiModelProperty(value = "")
  public String getDefaultTheme() {
    return defaultTheme;
  }

  public void setDefaultTheme(String defaultTheme) {
    this.defaultTheme = defaultTheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralUISettings generalUISettings = (GeneralUISettings) o;
    return Objects.equals(this.allowedReactions, generalUISettings.allowedReactions) &&
        Objects.equals(this.defaultTheme, generalUISettings.defaultTheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedReactions, defaultTheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralUISettings {\n");
    
    sb.append("    allowedReactions: ").append(toIndentedString(allowedReactions)).append("\n");
    sb.append("    defaultTheme: ").append(toIndentedString(defaultTheme)).append("\n");
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

