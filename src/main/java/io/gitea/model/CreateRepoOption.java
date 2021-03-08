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
 * CreateRepoOption options when creating repository
 */
@ApiModel(description = "CreateRepoOption options when creating repository")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-09T00:25:51.647+03:00")
public class CreateRepoOption {
  @SerializedName("auto_init")
  private Boolean autoInit = null;

  @SerializedName("default_branch")
  private String defaultBranch = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("gitignores")
  private String gitignores = null;

  @SerializedName("issue_labels")
  private String issueLabels = null;

  @SerializedName("license")
  private String license = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("readme")
  private String readme = null;

  @SerializedName("template")
  private Boolean template = null;

  /**
   * TrustModel of the repository
   */
  @JsonAdapter(TrustModelEnum.Adapter.class)
  public enum TrustModelEnum {
    DEFAULT("default"),
    
    COLLABORATOR("collaborator"),
    
    COMMITTER("committer"),
    
    COLLABORATORCOMMITTER("collaboratorcommitter");

    private String value;

    TrustModelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TrustModelEnum fromValue(String text) {
      for (TrustModelEnum b : TrustModelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TrustModelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TrustModelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TrustModelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TrustModelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("trust_model")
  private TrustModelEnum trustModel = null;

  public CreateRepoOption autoInit(Boolean autoInit) {
    this.autoInit = autoInit;
    return this;
  }

   /**
   * Whether the repository should be auto-intialized?
   * @return autoInit
  **/
  @ApiModelProperty(value = "Whether the repository should be auto-intialized?")
  public Boolean isAutoInit() {
    return autoInit;
  }

  public void setAutoInit(Boolean autoInit) {
    this.autoInit = autoInit;
  }

  public CreateRepoOption defaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
    return this;
  }

   /**
   * DefaultBranch of the repository (used when initializes and in template)
   * @return defaultBranch
  **/
  @ApiModelProperty(value = "DefaultBranch of the repository (used when initializes and in template)")
  public String getDefaultBranch() {
    return defaultBranch;
  }

  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }

  public CreateRepoOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the repository to create
   * @return description
  **/
  @ApiModelProperty(value = "Description of the repository to create")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateRepoOption gitignores(String gitignores) {
    this.gitignores = gitignores;
    return this;
  }

   /**
   * Gitignores to use
   * @return gitignores
  **/
  @ApiModelProperty(value = "Gitignores to use")
  public String getGitignores() {
    return gitignores;
  }

  public void setGitignores(String gitignores) {
    this.gitignores = gitignores;
  }

  public CreateRepoOption issueLabels(String issueLabels) {
    this.issueLabels = issueLabels;
    return this;
  }

   /**
   * Label-Set to use
   * @return issueLabels
  **/
  @ApiModelProperty(value = "Label-Set to use")
  public String getIssueLabels() {
    return issueLabels;
  }

  public void setIssueLabels(String issueLabels) {
    this.issueLabels = issueLabels;
  }

  public CreateRepoOption license(String license) {
    this.license = license;
    return this;
  }

   /**
   * License to use
   * @return license
  **/
  @ApiModelProperty(value = "License to use")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public CreateRepoOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the repository to create
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the repository to create")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateRepoOption _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Whether the repository is private
   * @return _private
  **/
  @ApiModelProperty(value = "Whether the repository is private")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public CreateRepoOption readme(String readme) {
    this.readme = readme;
    return this;
  }

   /**
   * Readme of the repository to create
   * @return readme
  **/
  @ApiModelProperty(value = "Readme of the repository to create")
  public String getReadme() {
    return readme;
  }

  public void setReadme(String readme) {
    this.readme = readme;
  }

  public CreateRepoOption template(Boolean template) {
    this.template = template;
    return this;
  }

   /**
   * Whether the repository is template
   * @return template
  **/
  @ApiModelProperty(value = "Whether the repository is template")
  public Boolean isTemplate() {
    return template;
  }

  public void setTemplate(Boolean template) {
    this.template = template;
  }

  public CreateRepoOption trustModel(TrustModelEnum trustModel) {
    this.trustModel = trustModel;
    return this;
  }

   /**
   * TrustModel of the repository
   * @return trustModel
  **/
  @ApiModelProperty(value = "TrustModel of the repository")
  public TrustModelEnum getTrustModel() {
    return trustModel;
  }

  public void setTrustModel(TrustModelEnum trustModel) {
    this.trustModel = trustModel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRepoOption createRepoOption = (CreateRepoOption) o;
    return Objects.equals(this.autoInit, createRepoOption.autoInit) &&
        Objects.equals(this.defaultBranch, createRepoOption.defaultBranch) &&
        Objects.equals(this.description, createRepoOption.description) &&
        Objects.equals(this.gitignores, createRepoOption.gitignores) &&
        Objects.equals(this.issueLabels, createRepoOption.issueLabels) &&
        Objects.equals(this.license, createRepoOption.license) &&
        Objects.equals(this.name, createRepoOption.name) &&
        Objects.equals(this._private, createRepoOption._private) &&
        Objects.equals(this.readme, createRepoOption.readme) &&
        Objects.equals(this.template, createRepoOption.template) &&
        Objects.equals(this.trustModel, createRepoOption.trustModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoInit, defaultBranch, description, gitignores, issueLabels, license, name, _private, readme, template, trustModel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRepoOption {\n");
    
    sb.append("    autoInit: ").append(toIndentedString(autoInit)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gitignores: ").append(toIndentedString(gitignores)).append("\n");
    sb.append("    issueLabels: ").append(toIndentedString(issueLabels)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    readme: ").append(toIndentedString(readme)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    trustModel: ").append(toIndentedString(trustModel)).append("\n");
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

