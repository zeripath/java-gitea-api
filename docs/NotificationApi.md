# NotificationApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notifyGetList**](NotificationApi.md#notifyGetList) | **GET** /notifications | List users&#39;s notification threads
[**notifyGetRepoList**](NotificationApi.md#notifyGetRepoList) | **GET** /repos/{owner}/{repo}/notifications | List users&#39;s notification threads on a specific repo
[**notifyGetThread**](NotificationApi.md#notifyGetThread) | **GET** /notifications/threads/{id} | Get notification thread by ID
[**notifyNewAvailable**](NotificationApi.md#notifyNewAvailable) | **GET** /notifications/new | Check if unread notifications exist
[**notifyReadList**](NotificationApi.md#notifyReadList) | **PUT** /notifications | Mark notification threads as read, pinned or unread
[**notifyReadRepoList**](NotificationApi.md#notifyReadRepoList) | **PUT** /repos/{owner}/{repo}/notifications | Mark notification threads as read, pinned or unread on a specific repo
[**notifyReadThread**](NotificationApi.md#notifyReadThread) | **PATCH** /notifications/threads/{id} | Mark notification thread as read by ID


<a name="notifyGetList"></a>
# **notifyGetList**
> List&lt;NotificationThread&gt; notifyGetList(all, statusTypes, subjectType, since, before, page, limit)

List users&#39;s notification threads

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.NotificationApi;

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

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

NotificationApi apiInstance = new NotificationApi();
Boolean all = true; // Boolean | If true, show notifications marked as read. Default value is false
List<String> statusTypes = Arrays.asList("statusTypes_example"); // List<String> | Show notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread & pinned.
List<String> subjectType = Arrays.asList("subjectType_example"); // List<String> | filter notifications by subject type
OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Only show notifications updated after the given time. This is a timestamp in RFC 3339 format
OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only show notifications updated before the given time. This is a timestamp in RFC 3339 format
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<NotificationThread> result = apiInstance.notifyGetList(all, statusTypes, subjectType, since, before, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notifyGetList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **all** | **Boolean**| If true, show notifications marked as read. Default value is false | [optional]
 **statusTypes** | [**List&lt;String&gt;**](String.md)| Show notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread &amp; pinned. | [optional]
 **subjectType** | [**List&lt;String&gt;**](String.md)| filter notifications by subject type | [optional] [enum: issue, pull, commit, repository]
 **since** | **OffsetDateTime**| Only show notifications updated after the given time. This is a timestamp in RFC 3339 format | [optional]
 **before** | **OffsetDateTime**| Only show notifications updated before the given time. This is a timestamp in RFC 3339 format | [optional]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;NotificationThread&gt;**](NotificationThread.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notifyGetRepoList"></a>
# **notifyGetRepoList**
> List&lt;NotificationThread&gt; notifyGetRepoList(owner, repo, all, statusTypes, subjectType, since, before, page, limit)

List users&#39;s notification threads on a specific repo

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.NotificationApi;

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

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

NotificationApi apiInstance = new NotificationApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Boolean all = true; // Boolean | If true, show notifications marked as read. Default value is false
List<String> statusTypes = Arrays.asList("statusTypes_example"); // List<String> | Show notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread & pinned
List<String> subjectType = Arrays.asList("subjectType_example"); // List<String> | filter notifications by subject type
OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Only show notifications updated after the given time. This is a timestamp in RFC 3339 format
OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only show notifications updated before the given time. This is a timestamp in RFC 3339 format
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<NotificationThread> result = apiInstance.notifyGetRepoList(owner, repo, all, statusTypes, subjectType, since, before, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notifyGetRepoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **all** | **Boolean**| If true, show notifications marked as read. Default value is false | [optional]
 **statusTypes** | [**List&lt;String&gt;**](String.md)| Show notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread &amp; pinned | [optional]
 **subjectType** | [**List&lt;String&gt;**](String.md)| filter notifications by subject type | [optional] [enum: issue, pull, commit, repository]
 **since** | **OffsetDateTime**| Only show notifications updated after the given time. This is a timestamp in RFC 3339 format | [optional]
 **before** | **OffsetDateTime**| Only show notifications updated before the given time. This is a timestamp in RFC 3339 format | [optional]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;NotificationThread&gt;**](NotificationThread.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notifyGetThread"></a>
# **notifyGetThread**
> NotificationThread notifyGetThread(id)

Get notification thread by ID

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.NotificationApi;

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

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

NotificationApi apiInstance = new NotificationApi();
String id = "id_example"; // String | id of notification thread
try {
    NotificationThread result = apiInstance.notifyGetThread(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notifyGetThread");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of notification thread |

### Return type

[**NotificationThread**](NotificationThread.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notifyNewAvailable"></a>
# **notifyNewAvailable**
> NotificationCount notifyNewAvailable()

Check if unread notifications exist

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.NotificationApi;

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

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

NotificationApi apiInstance = new NotificationApi();
try {
    NotificationCount result = apiInstance.notifyNewAvailable();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notifyNewAvailable");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NotificationCount**](NotificationCount.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/html

<a name="notifyReadList"></a>
# **notifyReadList**
> notifyReadList(lastReadAt, all, statusTypes, toStatus)

Mark notification threads as read, pinned or unread

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.NotificationApi;

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

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

NotificationApi apiInstance = new NotificationApi();
OffsetDateTime lastReadAt = OffsetDateTime.now(); // OffsetDateTime | Describes the last point that notifications were checked. Anything updated since this time will not be updated.
String all = "all_example"; // String | If true, mark all notifications on this repo. Default value is false
List<String> statusTypes = Arrays.asList("statusTypes_example"); // List<String> | Mark notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread.
String toStatus = "toStatus_example"; // String | Status to mark notifications as, Defaults to read.
try {
    apiInstance.notifyReadList(lastReadAt, all, statusTypes, toStatus);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notifyReadList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lastReadAt** | **OffsetDateTime**| Describes the last point that notifications were checked. Anything updated since this time will not be updated. | [optional]
 **all** | **String**| If true, mark all notifications on this repo. Default value is false | [optional]
 **statusTypes** | [**List&lt;String&gt;**](String.md)| Mark notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread. | [optional]
 **toStatus** | **String**| Status to mark notifications as, Defaults to read. | [optional]

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notifyReadRepoList"></a>
# **notifyReadRepoList**
> notifyReadRepoList(owner, repo, all, statusTypes, toStatus, lastReadAt)

Mark notification threads as read, pinned or unread on a specific repo

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.NotificationApi;

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

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

NotificationApi apiInstance = new NotificationApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String all = "all_example"; // String | If true, mark all notifications on this repo. Default value is false
List<String> statusTypes = Arrays.asList("statusTypes_example"); // List<String> | Mark notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread.
String toStatus = "toStatus_example"; // String | Status to mark notifications as. Defaults to read.
OffsetDateTime lastReadAt = OffsetDateTime.now(); // OffsetDateTime | Describes the last point that notifications were checked. Anything updated since this time will not be updated.
try {
    apiInstance.notifyReadRepoList(owner, repo, all, statusTypes, toStatus, lastReadAt);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notifyReadRepoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **all** | **String**| If true, mark all notifications on this repo. Default value is false | [optional]
 **statusTypes** | [**List&lt;String&gt;**](String.md)| Mark notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread. | [optional]
 **toStatus** | **String**| Status to mark notifications as. Defaults to read. | [optional]
 **lastReadAt** | **OffsetDateTime**| Describes the last point that notifications were checked. Anything updated since this time will not be updated. | [optional]

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notifyReadThread"></a>
# **notifyReadThread**
> notifyReadThread(id, toStatus)

Mark notification thread as read by ID

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.NotificationApi;

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

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

NotificationApi apiInstance = new NotificationApi();
String id = "id_example"; // String | id of notification thread
String toStatus = "read"; // String | Status to mark notifications as
try {
    apiInstance.notifyReadThread(id, toStatus);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notifyReadThread");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of notification thread |
 **toStatus** | **String**| Status to mark notifications as | [optional] [default to read]

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

