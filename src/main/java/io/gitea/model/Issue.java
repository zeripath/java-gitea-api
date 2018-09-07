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
import io.gitea.model.Label;
import io.gitea.model.Milestone;
import io.gitea.model.PullRequestMeta;
import io.gitea.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Issue represents an issue in a repository
 */
@ApiModel(description = "Issue represents an issue in a repository")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-07T10:45:35.787+01:00")
public class Issue {
  @SerializedName("assignee")
  private User assignee = null;

  @SerializedName("assignees")
  private List<User> assignees = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("closed_at")
  private OffsetDateTime closedAt = null;

  @SerializedName("comments")
  private Long comments = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("due_date")
  private OffsetDateTime dueDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("labels")
  private List<Label> labels = null;

  @SerializedName("milestone")
  private Milestone milestone = null;

  @SerializedName("number")
  private Long number = null;

  @SerializedName("pull_request")
  private PullRequestMeta pullRequest = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("user")
  private User user = null;

  public Issue assignee(User assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(value = "")
  public User getAssignee() {
    return assignee;
  }

  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }

  public Issue assignees(List<User> assignees) {
    this.assignees = assignees;
    return this;
  }

  public Issue addAssigneesItem(User assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<User>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

   /**
   * Get assignees
   * @return assignees
  **/
  @ApiModelProperty(value = "")
  public List<User> getAssignees() {
    return assignees;
  }

  public void setAssignees(List<User> assignees) {
    this.assignees = assignees;
  }

  public Issue body(String body) {
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

  public Issue closedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
    return this;
  }

   /**
   * Get closedAt
   * @return closedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }

  public Issue comments(Long comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")
  public Long getComments() {
    return comments;
  }

  public void setComments(Long comments) {
    this.comments = comments;
  }

  public Issue createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Issue dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public Issue id(Long id) {
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

  public Issue labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public Issue addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Label>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<Label> getLabels() {
    return labels;
  }

  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }

  public Issue milestone(Milestone milestone) {
    this.milestone = milestone;
    return this;
  }

   /**
   * Get milestone
   * @return milestone
  **/
  @ApiModelProperty(value = "")
  public Milestone getMilestone() {
    return milestone;
  }

  public void setMilestone(Milestone milestone) {
    this.milestone = milestone;
  }

  public Issue number(Long number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public Issue pullRequest(PullRequestMeta pullRequest) {
    this.pullRequest = pullRequest;
    return this;
  }

   /**
   * Get pullRequest
   * @return pullRequest
  **/
  @ApiModelProperty(value = "")
  public PullRequestMeta getPullRequest() {
    return pullRequest;
  }

  public void setPullRequest(PullRequestMeta pullRequest) {
    this.pullRequest = pullRequest;
  }

  public Issue state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Issue title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Issue updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Issue url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Issue user(User user) {
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
    Issue issue = (Issue) o;
    return Objects.equals(this.assignee, issue.assignee) &&
        Objects.equals(this.assignees, issue.assignees) &&
        Objects.equals(this.body, issue.body) &&
        Objects.equals(this.closedAt, issue.closedAt) &&
        Objects.equals(this.comments, issue.comments) &&
        Objects.equals(this.createdAt, issue.createdAt) &&
        Objects.equals(this.dueDate, issue.dueDate) &&
        Objects.equals(this.id, issue.id) &&
        Objects.equals(this.labels, issue.labels) &&
        Objects.equals(this.milestone, issue.milestone) &&
        Objects.equals(this.number, issue.number) &&
        Objects.equals(this.pullRequest, issue.pullRequest) &&
        Objects.equals(this.state, issue.state) &&
        Objects.equals(this.title, issue.title) &&
        Objects.equals(this.updatedAt, issue.updatedAt) &&
        Objects.equals(this.url, issue.url) &&
        Objects.equals(this.user, issue.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, assignees, body, closedAt, comments, createdAt, dueDate, id, labels, milestone, number, pullRequest, state, title, updatedAt, url, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issue {\n");
    
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

