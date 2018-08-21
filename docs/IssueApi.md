# IssueApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**issueAddLabel**](IssueApi.md#issueAddLabel) | **POST** /repos/{owner}/{repo}/issues/{index}/labels | Add a label to an issue
[**issueAddTime**](IssueApi.md#issueAddTime) | **POST** /repos/{owner}/{repo}/issues/{id}/times | Add a tracked time to a issue
[**issueClearLabels**](IssueApi.md#issueClearLabels) | **DELETE** /repos/{owner}/{repo}/issues/{index}/labels | Remove all labels from an issue
[**issueCreateComment**](IssueApi.md#issueCreateComment) | **POST** /repos/{owner}/{repo}/issues/{index}/comments | Add a comment to an issue
[**issueCreateIssue**](IssueApi.md#issueCreateIssue) | **POST** /repos/{owner}/{repo}/issues | Create an issue
[**issueCreateLabel**](IssueApi.md#issueCreateLabel) | **POST** /repos/{owner}/{repo}/labels | Create a label
[**issueCreateMilestone**](IssueApi.md#issueCreateMilestone) | **POST** /repos/{owner}/{repo}/milestones | Create a milestone
[**issueDeleteComment**](IssueApi.md#issueDeleteComment) | **DELETE** /repos/{owner}/{repo}/issues/comments/{id} | Delete a comment
[**issueDeleteCommentDeprecated**](IssueApi.md#issueDeleteCommentDeprecated) | **DELETE** /repos/{owner}/{repo}/issues/{index}/comments/{id} | Delete a comment
[**issueDeleteLabel**](IssueApi.md#issueDeleteLabel) | **DELETE** /repos/{owner}/{repo}/labels/{id} | Delete a label
[**issueDeleteMilestone**](IssueApi.md#issueDeleteMilestone) | **DELETE** /repos/{owner}/{repo}/milestones/{id} | Delete a milestone
[**issueEditComment**](IssueApi.md#issueEditComment) | **PATCH** /repos/{owner}/{repo}/issues/comments/{id} | Edit a comment
[**issueEditCommentDeprecated**](IssueApi.md#issueEditCommentDeprecated) | **PATCH** /repos/{owner}/{repo}/issues/{index}/comments/{id} | Edit a comment
[**issueEditIssue**](IssueApi.md#issueEditIssue) | **PATCH** /repos/{owner}/{repo}/issues/{index} | Edit an issue
[**issueEditIssueDeadline**](IssueApi.md#issueEditIssueDeadline) | **POST** /repos/{owner}/{repo}/issues/{index}/deadline | Set an issue deadline. If set to null, the deadline is deleted.
[**issueEditLabel**](IssueApi.md#issueEditLabel) | **PATCH** /repos/{owner}/{repo}/labels/{id} | Update a label
[**issueEditMilestone**](IssueApi.md#issueEditMilestone) | **PATCH** /repos/{owner}/{repo}/milestones/{id} | Update a milestone
[**issueGetComments**](IssueApi.md#issueGetComments) | **GET** /repos/{owner}/{repo}/issues/{index}/comments | List all comments on an issue
[**issueGetIssue**](IssueApi.md#issueGetIssue) | **GET** /repos/{owner}/{repo}/issues/{index} | Get an issue
[**issueGetLabel**](IssueApi.md#issueGetLabel) | **GET** /repos/{owner}/{repo}/labels/{id} | Get a single label
[**issueGetLabels**](IssueApi.md#issueGetLabels) | **GET** /repos/{owner}/{repo}/issues/{index}/labels | Get an issue&#39;s labels
[**issueGetMilestone**](IssueApi.md#issueGetMilestone) | **GET** /repos/{owner}/{repo}/milestones/{id} | Get a milestone
[**issueGetMilestonesList**](IssueApi.md#issueGetMilestonesList) | **GET** /repos/{owner}/{repo}/milestones | Get all of a repository&#39;s milestones
[**issueGetRepoComments**](IssueApi.md#issueGetRepoComments) | **GET** /repos/{owner}/{repo}/issues/comments | List all comments in a repository
[**issueListIssues**](IssueApi.md#issueListIssues) | **GET** /repos/{owner}/{repo}/issues | List a repository&#39;s issues
[**issueListLabels**](IssueApi.md#issueListLabels) | **GET** /repos/{owner}/{repo}/labels | Get all of a repository&#39;s labels
[**issueRemoveLabel**](IssueApi.md#issueRemoveLabel) | **DELETE** /repos/{owner}/{repo}/issues/{index}/labels/{id} | Remove a label from an issue
[**issueReplaceLabels**](IssueApi.md#issueReplaceLabels) | **PUT** /repos/{owner}/{repo}/issues/{index}/labels | Replace an issue&#39;s labels
[**issueTrackedTimes**](IssueApi.md#issueTrackedTimes) | **GET** /repos/{owner}/{repo}/issues/{id}/times | List an issue&#39;s tracked times


<a name="issueAddLabel"></a>
# **issueAddLabel**
> List&lt;Label&gt; issueAddLabel(owner, repo, index, body)

Add a label to an issue

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | index of the issue
IssueLabelsOption body = new IssueLabelsOption(); // IssueLabelsOption | 
try {
    List<Label> result = apiInstance.issueAddLabel(owner, repo, index, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueAddLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| index of the issue |
 **body** | [**IssueLabelsOption**](IssueLabelsOption.md)|  | [optional]

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueAddTime"></a>
# **issueAddTime**
> TrackedTime issueAddTime(owner, repo, id, body)

Add a tracked time to a issue

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer id = 56; // Integer | index of the issue to add tracked time to
AddTimeOption body = new AddTimeOption(); // AddTimeOption | 
try {
    TrackedTime result = apiInstance.issueAddTime(owner, repo, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueAddTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Integer**| index of the issue to add tracked time to |
 **body** | [**AddTimeOption**](AddTimeOption.md)|  | [optional]

### Return type

[**TrackedTime**](TrackedTime.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueClearLabels"></a>
# **issueClearLabels**
> issueClearLabels(owner, repo, index)

Remove all labels from an issue

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | index of the issue
try {
    apiInstance.issueClearLabels(owner, repo, index);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueClearLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| index of the issue |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="issueCreateComment"></a>
# **issueCreateComment**
> Comment issueCreateComment(owner, repo, index, body)

Add a comment to an issue

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | index of the issue
CreateIssueCommentOption body = new CreateIssueCommentOption(); // CreateIssueCommentOption | 
try {
    Comment result = apiInstance.issueCreateComment(owner, repo, index, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueCreateComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| index of the issue |
 **body** | [**CreateIssueCommentOption**](CreateIssueCommentOption.md)|  | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueCreateIssue"></a>
# **issueCreateIssue**
> Issue issueCreateIssue(owner, repo, body)

Create an issue

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
CreateIssueOption body = new CreateIssueOption(); // CreateIssueOption | 
try {
    Issue result = apiInstance.issueCreateIssue(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueCreateIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **body** | [**CreateIssueOption**](CreateIssueOption.md)|  | [optional]

### Return type

[**Issue**](Issue.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueCreateLabel"></a>
# **issueCreateLabel**
> Label issueCreateLabel(owner, repo, body)

Create a label

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
CreateLabelOption body = new CreateLabelOption(); // CreateLabelOption | 
try {
    Label result = apiInstance.issueCreateLabel(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueCreateLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **body** | [**CreateLabelOption**](CreateLabelOption.md)|  | [optional]

### Return type

[**Label**](Label.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueCreateMilestone"></a>
# **issueCreateMilestone**
> Milestone issueCreateMilestone(owner, repo, body)

Create a milestone

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
CreateMilestoneOption body = new CreateMilestoneOption(); // CreateMilestoneOption | 
try {
    Milestone result = apiInstance.issueCreateMilestone(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueCreateMilestone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **body** | [**CreateMilestoneOption**](CreateMilestoneOption.md)|  | [optional]

### Return type

[**Milestone**](Milestone.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueDeleteComment"></a>
# **issueDeleteComment**
> issueDeleteComment(owner, repo, id)

Delete a comment

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer id = 56; // Integer | id of comment to delete
try {
    apiInstance.issueDeleteComment(owner, repo, id);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueDeleteComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Integer**| id of comment to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/html

<a name="issueDeleteCommentDeprecated"></a>
# **issueDeleteCommentDeprecated**
> issueDeleteCommentDeprecated(owner, repo, index, id)

Delete a comment

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | this parameter is ignored
Integer id = 56; // Integer | id of comment to delete
try {
    apiInstance.issueDeleteCommentDeprecated(owner, repo, index, id);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueDeleteCommentDeprecated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| this parameter is ignored |
 **id** | **Integer**| id of comment to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/html

<a name="issueDeleteLabel"></a>
# **issueDeleteLabel**
> issueDeleteLabel(owner, repo, id)

Delete a label

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer id = 56; // Integer | id of the label to delete
try {
    apiInstance.issueDeleteLabel(owner, repo, id);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueDeleteLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Integer**| id of the label to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/html

<a name="issueDeleteMilestone"></a>
# **issueDeleteMilestone**
> issueDeleteMilestone(owner, repo, id)

Delete a milestone

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer id = 56; // Integer | id of the milestone to delete
try {
    apiInstance.issueDeleteMilestone(owner, repo, id);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueDeleteMilestone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Integer**| id of the milestone to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/html

<a name="issueEditComment"></a>
# **issueEditComment**
> Comment issueEditComment(owner, repo, id, body)

Edit a comment

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer id = 56; // Integer | id of the comment to edit
EditIssueCommentOption body = new EditIssueCommentOption(); // EditIssueCommentOption | 
try {
    Comment result = apiInstance.issueEditComment(owner, repo, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueEditComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Integer**| id of the comment to edit |
 **body** | [**EditIssueCommentOption**](EditIssueCommentOption.md)|  | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueEditCommentDeprecated"></a>
# **issueEditCommentDeprecated**
> Comment issueEditCommentDeprecated(owner, repo, index, id, body)

Edit a comment

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | this parameter is ignored
Integer id = 56; // Integer | id of the comment to edit
EditIssueCommentOption body = new EditIssueCommentOption(); // EditIssueCommentOption | 
try {
    Comment result = apiInstance.issueEditCommentDeprecated(owner, repo, index, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueEditCommentDeprecated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| this parameter is ignored |
 **id** | **Integer**| id of the comment to edit |
 **body** | [**EditIssueCommentOption**](EditIssueCommentOption.md)|  | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueEditIssue"></a>
# **issueEditIssue**
> Issue issueEditIssue(owner, repo, index, body)

Edit an issue

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | index of the issue to edit
EditIssueOption body = new EditIssueOption(); // EditIssueOption | 
try {
    Issue result = apiInstance.issueEditIssue(owner, repo, index, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueEditIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| index of the issue to edit |
 **body** | [**EditIssueOption**](EditIssueOption.md)|  | [optional]

### Return type

[**Issue**](Issue.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueEditIssueDeadline"></a>
# **issueEditIssueDeadline**
> IssueDeadline issueEditIssueDeadline(owner, repo, index, body)

Set an issue deadline. If set to null, the deadline is deleted.

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | index of the issue to create or update a deadline on
EditDeadlineOption body = new EditDeadlineOption(); // EditDeadlineOption | 
try {
    IssueDeadline result = apiInstance.issueEditIssueDeadline(owner, repo, index, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueEditIssueDeadline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| index of the issue to create or update a deadline on |
 **body** | [**EditDeadlineOption**](EditDeadlineOption.md)|  | [optional]

### Return type

[**IssueDeadline**](IssueDeadline.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueEditLabel"></a>
# **issueEditLabel**
> Label issueEditLabel(owner, repo, id, body)

Update a label

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer id = 56; // Integer | id of the label to edit
EditLabelOption body = new EditLabelOption(); // EditLabelOption | 
try {
    Label result = apiInstance.issueEditLabel(owner, repo, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueEditLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Integer**| id of the label to edit |
 **body** | [**EditLabelOption**](EditLabelOption.md)|  | [optional]

### Return type

[**Label**](Label.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueEditMilestone"></a>
# **issueEditMilestone**
> Milestone issueEditMilestone(owner, repo, id, body)

Update a milestone

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer id = 56; // Integer | id of the milestone
EditMilestoneOption body = new EditMilestoneOption(); // EditMilestoneOption | 
try {
    Milestone result = apiInstance.issueEditMilestone(owner, repo, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueEditMilestone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Integer**| id of the milestone |
 **body** | [**EditMilestoneOption**](EditMilestoneOption.md)|  | [optional]

### Return type

[**Milestone**](Milestone.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueGetComments"></a>
# **issueGetComments**
> List&lt;Comment&gt; issueGetComments(owner, repo, index, since)

List all comments on an issue

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | index of the issue
String since = "since_example"; // String | if provided, only comments updated since the specified time are returned.
try {
    List<Comment> result = apiInstance.issueGetComments(owner, repo, index, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueGetComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| index of the issue |
 **since** | **String**| if provided, only comments updated since the specified time are returned. | [optional]

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="issueGetIssue"></a>
# **issueGetIssue**
> Issue issueGetIssue(owner, repo, index)

Get an issue

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | index of the issue to get
try {
    Issue result = apiInstance.issueGetIssue(owner, repo, index);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueGetIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| index of the issue to get |

### Return type

[**Issue**](Issue.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="issueGetLabel"></a>
# **issueGetLabel**
> Label issueGetLabel(owner, repo, id)

Get a single label

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer id = 56; // Integer | id of the label to get
try {
    Label result = apiInstance.issueGetLabel(owner, repo, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueGetLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Integer**| id of the label to get |

### Return type

[**Label**](Label.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="issueGetLabels"></a>
# **issueGetLabels**
> List&lt;Label&gt; issueGetLabels(owner, repo, index)

Get an issue&#39;s labels

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | index of the issue
try {
    List<Label> result = apiInstance.issueGetLabels(owner, repo, index);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueGetLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| index of the issue |

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="issueGetMilestone"></a>
# **issueGetMilestone**
> Milestone issueGetMilestone(owner, repo, id)

Get a milestone

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer id = 56; // Integer | id of the milestone
try {
    Milestone result = apiInstance.issueGetMilestone(owner, repo, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueGetMilestone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Integer**| id of the milestone |

### Return type

[**Milestone**](Milestone.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="issueGetMilestonesList"></a>
# **issueGetMilestonesList**
> List&lt;Milestone&gt; issueGetMilestonesList(owner, repo)

Get all of a repository&#39;s milestones

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    List<Milestone> result = apiInstance.issueGetMilestonesList(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueGetMilestonesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

[**List&lt;Milestone&gt;**](Milestone.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="issueGetRepoComments"></a>
# **issueGetRepoComments**
> List&lt;Comment&gt; issueGetRepoComments(owner, repo, since)

List all comments in a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String since = "since_example"; // String | if provided, only comments updated since the provided time are returned.
try {
    List<Comment> result = apiInstance.issueGetRepoComments(owner, repo, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueGetRepoComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **since** | **String**| if provided, only comments updated since the provided time are returned. | [optional]

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="issueListIssues"></a>
# **issueListIssues**
> List&lt;Issue&gt; issueListIssues(owner, repo, state, page, q)

List a repository&#39;s issues

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String state = "state_example"; // String | whether issue is open or closed
Integer page = 56; // Integer | page number of requested issues
String q = "q_example"; // String | search string
try {
    List<Issue> result = apiInstance.issueListIssues(owner, repo, state, page, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueListIssues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **state** | **String**| whether issue is open or closed | [optional]
 **page** | **Integer**| page number of requested issues | [optional]
 **q** | **String**| search string | [optional]

### Return type

[**List&lt;Issue&gt;**](Issue.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="issueListLabels"></a>
# **issueListLabels**
> List&lt;Label&gt; issueListLabels(owner, repo)

Get all of a repository&#39;s labels

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    List<Label> result = apiInstance.issueListLabels(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueListLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="issueRemoveLabel"></a>
# **issueRemoveLabel**
> issueRemoveLabel(owner, repo, index, id)

Remove a label from an issue

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | index of the issue
Integer id = 56; // Integer | id of the label to remove
try {
    apiInstance.issueRemoveLabel(owner, repo, index, id);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueRemoveLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| index of the issue |
 **id** | **Integer**| id of the label to remove |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="issueReplaceLabels"></a>
# **issueReplaceLabels**
> List&lt;Label&gt; issueReplaceLabels(owner, repo, index, body)

Replace an issue&#39;s labels

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer index = 56; // Integer | index of the issue
IssueLabelsOption body = new IssueLabelsOption(); // IssueLabelsOption | 
try {
    List<Label> result = apiInstance.issueReplaceLabels(owner, repo, index, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueReplaceLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Integer**| index of the issue |
 **body** | [**IssueLabelsOption**](IssueLabelsOption.md)|  | [optional]

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="issueTrackedTimes"></a>
# **issueTrackedTimes**
> List&lt;TrackedTime&gt; issueTrackedTimes(owner, repo, id)

List an issue&#39;s tracked times

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.IssueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

IssueApi apiInstance = new IssueApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer id = 56; // Integer | index of the issue
try {
    List<TrackedTime> result = apiInstance.issueTrackedTimes(owner, repo, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueApi#issueTrackedTimes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Integer**| index of the issue |

### Return type

[**List&lt;TrackedTime&gt;**](TrackedTime.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

