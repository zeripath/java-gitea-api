# RepositoryApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCurrentUserRepo**](RepositoryApi.md#createCurrentUserRepo) | **POST** /user/repos | Create a repository
[**createFork**](RepositoryApi.md#createFork) | **POST** /repos/{owner}/{repo}/forks | Fork a repository
[**getBlob**](RepositoryApi.md#getBlob) | **GET** /repos/{owner}/{repo}/git/blobs/{sha} | Gets the blob of a repository.
[**getTag**](RepositoryApi.md#getTag) | **GET** /repos/{owner}/{repo}/git/tags/{sha} | Gets the tag object of an annotated tag (not lightweight tags)
[**getTree**](RepositoryApi.md#getTree) | **GET** /repos/{owner}/{repo}/git/trees/{sha} | Gets the tree of a repository.
[**listForks**](RepositoryApi.md#listForks) | **GET** /repos/{owner}/{repo}/forks | List a repository&#39;s forks
[**repoAddCollaborator**](RepositoryApi.md#repoAddCollaborator) | **PUT** /repos/{owner}/{repo}/collaborators/{collaborator} | Add a collaborator to a repository
[**repoAddTopc**](RepositoryApi.md#repoAddTopc) | **PUT** /repos/{owner}/{repo}/topics/{topic} | Add a topic to a repository
[**repoCheckCollaborator**](RepositoryApi.md#repoCheckCollaborator) | **GET** /repos/{owner}/{repo}/collaborators/{collaborator} | Check if a user is a collaborator of a repository
[**repoCreateBranch**](RepositoryApi.md#repoCreateBranch) | **POST** /repos/{owner}/{repo}/branches | Create a branch
[**repoCreateBranchProtection**](RepositoryApi.md#repoCreateBranchProtection) | **POST** /repos/{owner}/{repo}/branch_protections | Create a branch protections for a repository
[**repoCreateFile**](RepositoryApi.md#repoCreateFile) | **POST** /repos/{owner}/{repo}/contents/{filepath} | Create a file in a repository
[**repoCreateHook**](RepositoryApi.md#repoCreateHook) | **POST** /repos/{owner}/{repo}/hooks | Create a hook
[**repoCreateKey**](RepositoryApi.md#repoCreateKey) | **POST** /repos/{owner}/{repo}/keys | Add a key to a repository
[**repoCreatePullRequest**](RepositoryApi.md#repoCreatePullRequest) | **POST** /repos/{owner}/{repo}/pulls | Create a pull request
[**repoCreatePullReview**](RepositoryApi.md#repoCreatePullReview) | **POST** /repos/{owner}/{repo}/pulls/{index}/reviews | Create a review to an pull request
[**repoCreateRelease**](RepositoryApi.md#repoCreateRelease) | **POST** /repos/{owner}/{repo}/releases | Create a release
[**repoCreateReleaseAttachment**](RepositoryApi.md#repoCreateReleaseAttachment) | **POST** /repos/{owner}/{repo}/releases/{id}/assets | Create a release attachment
[**repoCreateStatus**](RepositoryApi.md#repoCreateStatus) | **POST** /repos/{owner}/{repo}/statuses/{sha} | Create a commit status
[**repoDelete**](RepositoryApi.md#repoDelete) | **DELETE** /repos/{owner}/{repo} | Delete a repository
[**repoDeleteBranch**](RepositoryApi.md#repoDeleteBranch) | **DELETE** /repos/{owner}/{repo}/branches/{branch} | Delete a specific branch from a repository
[**repoDeleteBranchProtection**](RepositoryApi.md#repoDeleteBranchProtection) | **DELETE** /repos/{owner}/{repo}/branch_protections/{name} | Delete a specific branch protection for the repository
[**repoDeleteCollaborator**](RepositoryApi.md#repoDeleteCollaborator) | **DELETE** /repos/{owner}/{repo}/collaborators/{collaborator} | Delete a collaborator from a repository
[**repoDeleteFile**](RepositoryApi.md#repoDeleteFile) | **DELETE** /repos/{owner}/{repo}/contents/{filepath} | Delete a file in a repository
[**repoDeleteGitHook**](RepositoryApi.md#repoDeleteGitHook) | **DELETE** /repos/{owner}/{repo}/hooks/git/{id} | Delete a Git hook in a repository
[**repoDeleteHook**](RepositoryApi.md#repoDeleteHook) | **DELETE** /repos/{owner}/{repo}/hooks/{id} | Delete a hook in a repository
[**repoDeleteKey**](RepositoryApi.md#repoDeleteKey) | **DELETE** /repos/{owner}/{repo}/keys/{id} | Delete a key from a repository
[**repoDeletePullReview**](RepositoryApi.md#repoDeletePullReview) | **DELETE** /repos/{owner}/{repo}/pulls/{index}/reviews/{id} | Delete a specific review from a pull request
[**repoDeleteRelease**](RepositoryApi.md#repoDeleteRelease) | **DELETE** /repos/{owner}/{repo}/releases/{id} | Delete a release
[**repoDeleteReleaseAttachment**](RepositoryApi.md#repoDeleteReleaseAttachment) | **DELETE** /repos/{owner}/{repo}/releases/{id}/assets/{attachment_id} | Delete a release attachment
[**repoDeleteTopic**](RepositoryApi.md#repoDeleteTopic) | **DELETE** /repos/{owner}/{repo}/topics/{topic} | Delete a topic from a repository
[**repoDownloadPullDiff**](RepositoryApi.md#repoDownloadPullDiff) | **GET** /repos/{owner}/{repo}/pulls/{index}.diff | Get a pull request diff
[**repoDownloadPullPatch**](RepositoryApi.md#repoDownloadPullPatch) | **GET** /repos/{owner}/{repo}/pulls/{index}.patch | Get a pull request patch file
[**repoEdit**](RepositoryApi.md#repoEdit) | **PATCH** /repos/{owner}/{repo} | Edit a repository&#39;s properties. Only fields that are set will be changed.
[**repoEditBranchProtection**](RepositoryApi.md#repoEditBranchProtection) | **PATCH** /repos/{owner}/{repo}/branch_protections/{name} | Edit a branch protections for a repository. Only fields that are set will be changed
[**repoEditGitHook**](RepositoryApi.md#repoEditGitHook) | **PATCH** /repos/{owner}/{repo}/hooks/git/{id} | Edit a Git hook in a repository
[**repoEditHook**](RepositoryApi.md#repoEditHook) | **PATCH** /repos/{owner}/{repo}/hooks/{id} | Edit a hook in a repository
[**repoEditPullRequest**](RepositoryApi.md#repoEditPullRequest) | **PATCH** /repos/{owner}/{repo}/pulls/{index} | Update a pull request. If using deadline only the date will be taken into account, and time of day ignored.
[**repoEditRelease**](RepositoryApi.md#repoEditRelease) | **PATCH** /repos/{owner}/{repo}/releases/{id} | Update a release
[**repoEditReleaseAttachment**](RepositoryApi.md#repoEditReleaseAttachment) | **PATCH** /repos/{owner}/{repo}/releases/{id}/assets/{attachment_id} | Edit a release attachment
[**repoGet**](RepositoryApi.md#repoGet) | **GET** /repos/{owner}/{repo} | Get a repository
[**repoGetAllCommits**](RepositoryApi.md#repoGetAllCommits) | **GET** /repos/{owner}/{repo}/commits | Get a list of all commits from a repository
[**repoGetArchive**](RepositoryApi.md#repoGetArchive) | **GET** /repos/{owner}/{repo}/archive/{archive} | Get an archive of a repository
[**repoGetBranch**](RepositoryApi.md#repoGetBranch) | **GET** /repos/{owner}/{repo}/branches/{branch} | Retrieve a specific branch from a repository, including its effective branch protection
[**repoGetBranchProtection**](RepositoryApi.md#repoGetBranchProtection) | **GET** /repos/{owner}/{repo}/branch_protections/{name} | Get a specific branch protection for the repository
[**repoGetByID**](RepositoryApi.md#repoGetByID) | **GET** /repositories/{id} | Get a repository by id
[**repoGetCombinedStatusByRef**](RepositoryApi.md#repoGetCombinedStatusByRef) | **GET** /repos/{owner}/{repo}/commits/{ref}/status | Get a commit&#39;s combined status, by branch/tag/commit reference
[**repoGetContents**](RepositoryApi.md#repoGetContents) | **GET** /repos/{owner}/{repo}/contents/{filepath} | Gets the metadata and contents (if a file) of an entry in a repository, or a list of entries if a dir
[**repoGetContentsList**](RepositoryApi.md#repoGetContentsList) | **GET** /repos/{owner}/{repo}/contents | Gets the metadata of all the entries of the root dir
[**repoGetEditorConfig**](RepositoryApi.md#repoGetEditorConfig) | **GET** /repos/{owner}/{repo}/editorconfig/{filepath} | Get the EditorConfig definitions of a file in a repository
[**repoGetGitHook**](RepositoryApi.md#repoGetGitHook) | **GET** /repos/{owner}/{repo}/hooks/git/{id} | Get a Git hook
[**repoGetHook**](RepositoryApi.md#repoGetHook) | **GET** /repos/{owner}/{repo}/hooks/{id} | Get a hook
[**repoGetIssueTemplates**](RepositoryApi.md#repoGetIssueTemplates) | **GET** /repos/{owner}/{repo}/issue_templates | Get available issue templates for a repository
[**repoGetKey**](RepositoryApi.md#repoGetKey) | **GET** /repos/{owner}/{repo}/keys/{id} | Get a repository&#39;s key by id
[**repoGetLanguages**](RepositoryApi.md#repoGetLanguages) | **GET** /repos/{owner}/{repo}/languages | Get languages and number of bytes of code written
[**repoGetPullRequest**](RepositoryApi.md#repoGetPullRequest) | **GET** /repos/{owner}/{repo}/pulls/{index} | Get a pull request
[**repoGetPullReview**](RepositoryApi.md#repoGetPullReview) | **GET** /repos/{owner}/{repo}/pulls/{index}/reviews/{id} | Get a specific review for a pull request
[**repoGetPullReviewComments**](RepositoryApi.md#repoGetPullReviewComments) | **GET** /repos/{owner}/{repo}/pulls/{index}/reviews/{id}/comments | Get a specific review for a pull request
[**repoGetRawFile**](RepositoryApi.md#repoGetRawFile) | **GET** /repos/{owner}/{repo}/raw/{filepath} | Get a file from a repository
[**repoGetRelease**](RepositoryApi.md#repoGetRelease) | **GET** /repos/{owner}/{repo}/releases/{id} | Get a release
[**repoGetReleaseAttachment**](RepositoryApi.md#repoGetReleaseAttachment) | **GET** /repos/{owner}/{repo}/releases/{id}/assets/{attachment_id} | Get a release attachment
[**repoGetReleaseTag**](RepositoryApi.md#repoGetReleaseTag) | **GET** /repos/{owner}/{repo}/releases/tags/{tag} | Get a release by tag name
[**repoGetSingleCommit**](RepositoryApi.md#repoGetSingleCommit) | **GET** /repos/{owner}/{repo}/git/commits/{sha} | Get a single commit from a repository
[**repoListAllGitRefs**](RepositoryApi.md#repoListAllGitRefs) | **GET** /repos/{owner}/{repo}/git/refs | Get specified ref or filtered repository&#39;s refs
[**repoListBranchProtection**](RepositoryApi.md#repoListBranchProtection) | **GET** /repos/{owner}/{repo}/branch_protections | List branch protections for a repository
[**repoListBranches**](RepositoryApi.md#repoListBranches) | **GET** /repos/{owner}/{repo}/branches | List a repository&#39;s branches
[**repoListCollaborators**](RepositoryApi.md#repoListCollaborators) | **GET** /repos/{owner}/{repo}/collaborators | List a repository&#39;s collaborators
[**repoListGitHooks**](RepositoryApi.md#repoListGitHooks) | **GET** /repos/{owner}/{repo}/hooks/git | List the Git hooks in a repository
[**repoListGitRefs**](RepositoryApi.md#repoListGitRefs) | **GET** /repos/{owner}/{repo}/git/refs/{ref} | Get specified ref or filtered repository&#39;s refs
[**repoListHooks**](RepositoryApi.md#repoListHooks) | **GET** /repos/{owner}/{repo}/hooks | List the hooks in a repository
[**repoListKeys**](RepositoryApi.md#repoListKeys) | **GET** /repos/{owner}/{repo}/keys | List a repository&#39;s keys
[**repoListPullRequests**](RepositoryApi.md#repoListPullRequests) | **GET** /repos/{owner}/{repo}/pulls | List a repo&#39;s pull requests
[**repoListPullReviews**](RepositoryApi.md#repoListPullReviews) | **GET** /repos/{owner}/{repo}/pulls/{index}/reviews | List all reviews for a pull request
[**repoListReleaseAttachments**](RepositoryApi.md#repoListReleaseAttachments) | **GET** /repos/{owner}/{repo}/releases/{id}/assets | List release&#39;s attachments
[**repoListReleases**](RepositoryApi.md#repoListReleases) | **GET** /repos/{owner}/{repo}/releases | List a repo&#39;s releases
[**repoListStargazers**](RepositoryApi.md#repoListStargazers) | **GET** /repos/{owner}/{repo}/stargazers | List a repo&#39;s stargazers
[**repoListStatuses**](RepositoryApi.md#repoListStatuses) | **GET** /repos/{owner}/{repo}/statuses/{sha} | Get a commit&#39;s statuses
[**repoListStatusesByRef**](RepositoryApi.md#repoListStatusesByRef) | **GET** /repos/{owner}/{repo}/commits/{ref}/statuses | Get a commit&#39;s statuses, by branch/tag/commit reference
[**repoListSubscribers**](RepositoryApi.md#repoListSubscribers) | **GET** /repos/{owner}/{repo}/subscribers | List a repo&#39;s watchers
[**repoListTags**](RepositoryApi.md#repoListTags) | **GET** /repos/{owner}/{repo}/tags | List a repository&#39;s tags
[**repoListTopics**](RepositoryApi.md#repoListTopics) | **GET** /repos/{owner}/{repo}/topics | Get list of topics that a repository has
[**repoMergePullRequest**](RepositoryApi.md#repoMergePullRequest) | **POST** /repos/{owner}/{repo}/pulls/{index}/merge | Merge a pull request
[**repoMigrate**](RepositoryApi.md#repoMigrate) | **POST** /repos/migrate | Migrate a remote git repository
[**repoMirrorSync**](RepositoryApi.md#repoMirrorSync) | **POST** /repos/{owner}/{repo}/mirror-sync | Sync a mirrored repository
[**repoPullRequestIsMerged**](RepositoryApi.md#repoPullRequestIsMerged) | **GET** /repos/{owner}/{repo}/pulls/{index}/merge | Check if a pull request has been merged
[**repoSearch**](RepositoryApi.md#repoSearch) | **GET** /repos/search | Search for repositories
[**repoSigningKey**](RepositoryApi.md#repoSigningKey) | **GET** /repos/{owner}/{repo}/signing-key.gpg | Get signing-key.gpg for given repository
[**repoSubmitPullReview**](RepositoryApi.md#repoSubmitPullReview) | **POST** /repos/{owner}/{repo}/pulls/{index}/reviews/{id} | Submit a pending review to an pull request
[**repoTestHook**](RepositoryApi.md#repoTestHook) | **POST** /repos/{owner}/{repo}/hooks/{id}/tests | Test a push webhook
[**repoTrackedTimes**](RepositoryApi.md#repoTrackedTimes) | **GET** /repos/{owner}/{repo}/times | List a repo&#39;s tracked times
[**repoTransfer**](RepositoryApi.md#repoTransfer) | **POST** /repos/{owner}/{repo}/transfer | Transfer a repo ownership
[**repoUpdateFile**](RepositoryApi.md#repoUpdateFile) | **PUT** /repos/{owner}/{repo}/contents/{filepath} | Update a file in a repository
[**repoUpdatePullRequest**](RepositoryApi.md#repoUpdatePullRequest) | **POST** /repos/{owner}/{repo}/pulls/{index}/update | Merge PR&#39;s baseBranch into headBranch
[**repoUpdateTopics**](RepositoryApi.md#repoUpdateTopics) | **PUT** /repos/{owner}/{repo}/topics | Replace list of topics for a repository
[**topicSearch**](RepositoryApi.md#topicSearch) | **GET** /topics/search | search topics via keyword
[**userCurrentCheckSubscription**](RepositoryApi.md#userCurrentCheckSubscription) | **GET** /repos/{owner}/{repo}/subscription | Check if the current user is watching a repo
[**userCurrentDeleteSubscription**](RepositoryApi.md#userCurrentDeleteSubscription) | **DELETE** /repos/{owner}/{repo}/subscription | Unwatch a repo
[**userCurrentPutSubscription**](RepositoryApi.md#userCurrentPutSubscription) | **PUT** /repos/{owner}/{repo}/subscription | Watch a repo
[**userTrackedTimes**](RepositoryApi.md#userTrackedTimes) | **GET** /repos/{owner}/{repo}/times/{user} | List a user&#39;s tracked times in a repo


<a name="createCurrentUserRepo"></a>
# **createCurrentUserRepo**
> Repository createCurrentUserRepo(body)

Create a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
CreateRepoOption body = new CreateRepoOption(); // CreateRepoOption | 
try {
    Repository result = apiInstance.createCurrentUserRepo(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#createCurrentUserRepo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRepoOption**](CreateRepoOption.md)|  | [optional]

### Return type

[**Repository**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFork"></a>
# **createFork**
> Repository createFork(owner, repo, body)

Fork a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo to fork
String repo = "repo_example"; // String | name of the repo to fork
CreateForkOption body = new CreateForkOption(); // CreateForkOption | 
try {
    Repository result = apiInstance.createFork(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#createFork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo to fork |
 **repo** | **String**| name of the repo to fork |
 **body** | [**CreateForkOption**](CreateForkOption.md)|  | [optional]

### Return type

[**Repository**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="getBlob"></a>
# **getBlob**
> GitBlobResponse getBlob(owner, repo, sha)

Gets the blob of a repository.

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String sha = "sha_example"; // String | sha of the commit
try {
    GitBlobResponse result = apiInstance.getBlob(owner, repo, sha);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#getBlob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **sha** | **String**| sha of the commit |

### Return type

[**GitBlobResponse**](GitBlobResponse.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="getTag"></a>
# **getTag**
> AnnotatedTag getTag(owner, repo, sha)

Gets the tag object of an annotated tag (not lightweight tags)

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String sha = "sha_example"; // String | sha of the tag. The Git tags API only supports annotated tag objects, not lightweight tags.
try {
    AnnotatedTag result = apiInstance.getTag(owner, repo, sha);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#getTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **sha** | **String**| sha of the tag. The Git tags API only supports annotated tag objects, not lightweight tags. |

### Return type

[**AnnotatedTag**](AnnotatedTag.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="getTree"></a>
# **getTree**
> GitTreeResponse getTree(owner, repo, sha, recursive, page, perPage)

Gets the tree of a repository.

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String sha = "sha_example"; // String | sha of the commit
Boolean recursive = true; // Boolean | show all directories and files
Integer page = 56; // Integer | page number; the 'truncated' field in the response will be true if there are still more items after this page, false if the last page
Integer perPage = 56; // Integer | number of items per page
try {
    GitTreeResponse result = apiInstance.getTree(owner, repo, sha, recursive, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#getTree");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **sha** | **String**| sha of the commit |
 **recursive** | **Boolean**| show all directories and files | [optional]
 **page** | **Integer**| page number; the &#39;truncated&#39; field in the response will be true if there are still more items after this page, false if the last page | [optional]
 **perPage** | **Integer**| number of items per page | [optional]

### Return type

[**GitTreeResponse**](GitTreeResponse.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="listForks"></a>
# **listForks**
> List&lt;Repository&gt; listForks(owner, repo, page, limit)

List a repository&#39;s forks

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Repository> result = apiInstance.listForks(owner, repo, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#listForks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoAddCollaborator"></a>
# **repoAddCollaborator**
> repoAddCollaborator(owner, repo, collaborator, body)

Add a collaborator to a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String collaborator = "collaborator_example"; // String | username of the collaborator to add
AddCollaboratorOption body = new AddCollaboratorOption(); // AddCollaboratorOption | 
try {
    apiInstance.repoAddCollaborator(owner, repo, collaborator, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoAddCollaborator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **collaborator** | **String**| username of the collaborator to add |
 **body** | [**AddCollaboratorOption**](AddCollaboratorOption.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoAddTopc"></a>
# **repoAddTopc**
> repoAddTopc(owner, repo, topic)

Add a topic to a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String topic = "topic_example"; // String | name of the topic to add
try {
    apiInstance.repoAddTopc(owner, repo, topic);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoAddTopc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **topic** | **String**| name of the topic to add |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoCheckCollaborator"></a>
# **repoCheckCollaborator**
> repoCheckCollaborator(owner, repo, collaborator)

Check if a user is a collaborator of a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String collaborator = "collaborator_example"; // String | username of the collaborator
try {
    apiInstance.repoCheckCollaborator(owner, repo, collaborator);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoCheckCollaborator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **collaborator** | **String**| username of the collaborator |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoCreateBranch"></a>
# **repoCreateBranch**
> Branch repoCreateBranch(owner, repo, body)

Create a branch

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
CreateBranchRepoOption body = new CreateBranchRepoOption(); // CreateBranchRepoOption | 
try {
    Branch result = apiInstance.repoCreateBranch(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoCreateBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **body** | [**CreateBranchRepoOption**](CreateBranchRepoOption.md)|  | [optional]

### Return type

[**Branch**](Branch.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoCreateBranchProtection"></a>
# **repoCreateBranchProtection**
> BranchProtection repoCreateBranchProtection(owner, repo, body)

Create a branch protections for a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
CreateBranchProtectionOption body = new CreateBranchProtectionOption(); // CreateBranchProtectionOption | 
try {
    BranchProtection result = apiInstance.repoCreateBranchProtection(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoCreateBranchProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **body** | [**CreateBranchProtectionOption**](CreateBranchProtectionOption.md)|  | [optional]

### Return type

[**BranchProtection**](BranchProtection.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoCreateFile"></a>
# **repoCreateFile**
> FileResponse repoCreateFile(owner, repo, filepath, body)

Create a file in a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String filepath = "filepath_example"; // String | path of the file to create
CreateFileOptions body = new CreateFileOptions(); // CreateFileOptions | 
try {
    FileResponse result = apiInstance.repoCreateFile(owner, repo, filepath, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoCreateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **filepath** | **String**| path of the file to create |
 **body** | [**CreateFileOptions**](CreateFileOptions.md)|  |

### Return type

[**FileResponse**](FileResponse.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoCreateHook"></a>
# **repoCreateHook**
> Hook repoCreateHook(owner, repo, body)

Create a hook

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
CreateHookOption body = new CreateHookOption(); // CreateHookOption | 
try {
    Hook result = apiInstance.repoCreateHook(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoCreateHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **body** | [**CreateHookOption**](CreateHookOption.md)|  | [optional]

### Return type

[**Hook**](Hook.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoCreateKey"></a>
# **repoCreateKey**
> DeployKey repoCreateKey(owner, repo, body)

Add a key to a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
CreateKeyOption body = new CreateKeyOption(); // CreateKeyOption | 
try {
    DeployKey result = apiInstance.repoCreateKey(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoCreateKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **body** | [**CreateKeyOption**](CreateKeyOption.md)|  | [optional]

### Return type

[**DeployKey**](DeployKey.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoCreatePullRequest"></a>
# **repoCreatePullRequest**
> PullRequest repoCreatePullRequest(owner, repo, body)

Create a pull request

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
CreatePullRequestOption body = new CreatePullRequestOption(); // CreatePullRequestOption | 
try {
    PullRequest result = apiInstance.repoCreatePullRequest(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoCreatePullRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **body** | [**CreatePullRequestOption**](CreatePullRequestOption.md)|  | [optional]

### Return type

[**PullRequest**](PullRequest.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoCreatePullReview"></a>
# **repoCreatePullReview**
> PullReview repoCreatePullReview(owner, repo, index, body)

Create a review to an pull request

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request
CreatePullReviewOptions body = new CreatePullReviewOptions(); // CreatePullReviewOptions | 
try {
    PullReview result = apiInstance.repoCreatePullReview(owner, repo, index, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoCreatePullReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request |
 **body** | [**CreatePullReviewOptions**](CreatePullReviewOptions.md)|  |

### Return type

[**PullReview**](PullReview.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoCreateRelease"></a>
# **repoCreateRelease**
> Release repoCreateRelease(owner, repo, body)

Create a release

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
CreateReleaseOption body = new CreateReleaseOption(); // CreateReleaseOption | 
try {
    Release result = apiInstance.repoCreateRelease(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoCreateRelease");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **body** | [**CreateReleaseOption**](CreateReleaseOption.md)|  | [optional]

### Return type

[**Release**](Release.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoCreateReleaseAttachment"></a>
# **repoCreateReleaseAttachment**
> Attachment repoCreateReleaseAttachment(owner, repo, id, attachment, name)

Create a release attachment

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the release
File attachment = new File("/path/to/file.txt"); // File | attachment to upload
String name = "name_example"; // String | name of the attachment
try {
    Attachment result = apiInstance.repoCreateReleaseAttachment(owner, repo, id, attachment, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoCreateReleaseAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the release |
 **attachment** | **File**| attachment to upload |
 **name** | **String**| name of the attachment | [optional]

### Return type

[**Attachment**](Attachment.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="repoCreateStatus"></a>
# **repoCreateStatus**
> Status repoCreateStatus(owner, repo, sha, body)

Create a commit status

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String sha = "sha_example"; // String | sha of the commit
CreateStatusOption body = new CreateStatusOption(); // CreateStatusOption | 
try {
    Status result = apiInstance.repoCreateStatus(owner, repo, sha, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoCreateStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **sha** | **String**| sha of the commit |
 **body** | [**CreateStatusOption**](CreateStatusOption.md)|  | [optional]

### Return type

[**Status**](Status.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoDelete"></a>
# **repoDelete**
> repoDelete(owner, repo)

Delete a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo to delete
String repo = "repo_example"; // String | name of the repo to delete
try {
    apiInstance.repoDelete(owner, repo);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo to delete |
 **repo** | **String**| name of the repo to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoDeleteBranch"></a>
# **repoDeleteBranch**
> repoDeleteBranch(owner, repo, branch)

Delete a specific branch from a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String branch = "branch_example"; // String | branch to delete
try {
    apiInstance.repoDeleteBranch(owner, repo, branch);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDeleteBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **branch** | **String**| branch to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoDeleteBranchProtection"></a>
# **repoDeleteBranchProtection**
> repoDeleteBranchProtection(owner, repo, name)

Delete a specific branch protection for the repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String name = "name_example"; // String | name of protected branch
try {
    apiInstance.repoDeleteBranchProtection(owner, repo, name);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDeleteBranchProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **name** | **String**| name of protected branch |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoDeleteCollaborator"></a>
# **repoDeleteCollaborator**
> repoDeleteCollaborator(owner, repo, collaborator)

Delete a collaborator from a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String collaborator = "collaborator_example"; // String | username of the collaborator to delete
try {
    apiInstance.repoDeleteCollaborator(owner, repo, collaborator);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDeleteCollaborator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **collaborator** | **String**| username of the collaborator to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoDeleteFile"></a>
# **repoDeleteFile**
> FileDeleteResponse repoDeleteFile(owner, repo, filepath, body)

Delete a file in a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String filepath = "filepath_example"; // String | path of the file to delete
DeleteFileOptions body = new DeleteFileOptions(); // DeleteFileOptions | 
try {
    FileDeleteResponse result = apiInstance.repoDeleteFile(owner, repo, filepath, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDeleteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **filepath** | **String**| path of the file to delete |
 **body** | [**DeleteFileOptions**](DeleteFileOptions.md)|  |

### Return type

[**FileDeleteResponse**](FileDeleteResponse.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoDeleteGitHook"></a>
# **repoDeleteGitHook**
> repoDeleteGitHook(owner, repo, id)

Delete a Git hook in a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String id = "id_example"; // String | id of the hook to get
try {
    apiInstance.repoDeleteGitHook(owner, repo, id);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDeleteGitHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **String**| id of the hook to get |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoDeleteHook"></a>
# **repoDeleteHook**
> repoDeleteHook(owner, repo, id)

Delete a hook in a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the hook to delete
try {
    apiInstance.repoDeleteHook(owner, repo, id);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDeleteHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the hook to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoDeleteKey"></a>
# **repoDeleteKey**
> repoDeleteKey(owner, repo, id)

Delete a key from a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the key to delete
try {
    apiInstance.repoDeleteKey(owner, repo, id);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDeleteKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the key to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/html

<a name="repoDeletePullReview"></a>
# **repoDeletePullReview**
> repoDeletePullReview(owner, repo, index, id)

Delete a specific review from a pull request

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request
Long id = 789L; // Long | id of the review
try {
    apiInstance.repoDeletePullReview(owner, repo, index, id);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDeletePullReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request |
 **id** | **Long**| id of the review |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoDeleteRelease"></a>
# **repoDeleteRelease**
> repoDeleteRelease(owner, repo, id)

Delete a release

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the release to delete
try {
    apiInstance.repoDeleteRelease(owner, repo, id);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDeleteRelease");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the release to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/html

<a name="repoDeleteReleaseAttachment"></a>
# **repoDeleteReleaseAttachment**
> repoDeleteReleaseAttachment(owner, repo, id, attachmentId)

Delete a release attachment

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the release
Long attachmentId = 789L; // Long | id of the attachment to delete
try {
    apiInstance.repoDeleteReleaseAttachment(owner, repo, id, attachmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDeleteReleaseAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the release |
 **attachmentId** | **Long**| id of the attachment to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoDeleteTopic"></a>
# **repoDeleteTopic**
> repoDeleteTopic(owner, repo, topic)

Delete a topic from a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String topic = "topic_example"; // String | name of the topic to delete
try {
    apiInstance.repoDeleteTopic(owner, repo, topic);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDeleteTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **topic** | **String**| name of the topic to delete |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoDownloadPullDiff"></a>
# **repoDownloadPullDiff**
> String repoDownloadPullDiff(owner, repo, index)

Get a pull request diff

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request to get
try {
    String result = apiInstance.repoDownloadPullDiff(owner, repo, index);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDownloadPullDiff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request to get |

### Return type

**String**

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: text/plain

<a name="repoDownloadPullPatch"></a>
# **repoDownloadPullPatch**
> String repoDownloadPullPatch(owner, repo, index)

Get a pull request patch file

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request to get
try {
    String result = apiInstance.repoDownloadPullPatch(owner, repo, index);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoDownloadPullPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request to get |

### Return type

**String**

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: text/plain

<a name="repoEdit"></a>
# **repoEdit**
> Repository repoEdit(owner, repo, body)

Edit a repository&#39;s properties. Only fields that are set will be changed.

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo to edit
String repo = "repo_example"; // String | name of the repo to edit
EditRepoOption body = new EditRepoOption(); // EditRepoOption | Properties of a repo that you can edit
try {
    Repository result = apiInstance.repoEdit(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoEdit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo to edit |
 **repo** | **String**| name of the repo to edit |
 **body** | [**EditRepoOption**](EditRepoOption.md)| Properties of a repo that you can edit | [optional]

### Return type

[**Repository**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoEditBranchProtection"></a>
# **repoEditBranchProtection**
> BranchProtection repoEditBranchProtection(owner, repo, name, body)

Edit a branch protections for a repository. Only fields that are set will be changed

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String name = "name_example"; // String | name of protected branch
EditBranchProtectionOption body = new EditBranchProtectionOption(); // EditBranchProtectionOption | 
try {
    BranchProtection result = apiInstance.repoEditBranchProtection(owner, repo, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoEditBranchProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **name** | **String**| name of protected branch |
 **body** | [**EditBranchProtectionOption**](EditBranchProtectionOption.md)|  | [optional]

### Return type

[**BranchProtection**](BranchProtection.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoEditGitHook"></a>
# **repoEditGitHook**
> GitHook repoEditGitHook(owner, repo, id, body)

Edit a Git hook in a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String id = "id_example"; // String | id of the hook to get
EditGitHookOption body = new EditGitHookOption(); // EditGitHookOption | 
try {
    GitHook result = apiInstance.repoEditGitHook(owner, repo, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoEditGitHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **String**| id of the hook to get |
 **body** | [**EditGitHookOption**](EditGitHookOption.md)|  | [optional]

### Return type

[**GitHook**](GitHook.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoEditHook"></a>
# **repoEditHook**
> Hook repoEditHook(owner, repo, id, body)

Edit a hook in a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | index of the hook
EditHookOption body = new EditHookOption(); // EditHookOption | 
try {
    Hook result = apiInstance.repoEditHook(owner, repo, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoEditHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| index of the hook |
 **body** | [**EditHookOption**](EditHookOption.md)|  | [optional]

### Return type

[**Hook**](Hook.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoEditPullRequest"></a>
# **repoEditPullRequest**
> PullRequest repoEditPullRequest(owner, repo, index, body)

Update a pull request. If using deadline only the date will be taken into account, and time of day ignored.

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request to edit
EditPullRequestOption body = new EditPullRequestOption(); // EditPullRequestOption | 
try {
    PullRequest result = apiInstance.repoEditPullRequest(owner, repo, index, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoEditPullRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request to edit |
 **body** | [**EditPullRequestOption**](EditPullRequestOption.md)|  | [optional]

### Return type

[**PullRequest**](PullRequest.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoEditRelease"></a>
# **repoEditRelease**
> Release repoEditRelease(owner, repo, id, body)

Update a release

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the release to edit
EditReleaseOption body = new EditReleaseOption(); // EditReleaseOption | 
try {
    Release result = apiInstance.repoEditRelease(owner, repo, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoEditRelease");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the release to edit |
 **body** | [**EditReleaseOption**](EditReleaseOption.md)|  | [optional]

### Return type

[**Release**](Release.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoEditReleaseAttachment"></a>
# **repoEditReleaseAttachment**
> Attachment repoEditReleaseAttachment(owner, repo, id, attachmentId, body)

Edit a release attachment

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the release
Long attachmentId = 789L; // Long | id of the attachment to edit
EditAttachmentOptions body = new EditAttachmentOptions(); // EditAttachmentOptions | 
try {
    Attachment result = apiInstance.repoEditReleaseAttachment(owner, repo, id, attachmentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoEditReleaseAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the release |
 **attachmentId** | **Long**| id of the attachment to edit |
 **body** | [**EditAttachmentOptions**](EditAttachmentOptions.md)|  | [optional]

### Return type

[**Attachment**](Attachment.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoGet"></a>
# **repoGet**
> Repository repoGet(owner, repo)

Get a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    Repository result = apiInstance.repoGet(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

[**Repository**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetAllCommits"></a>
# **repoGetAllCommits**
> List&lt;Commit&gt; repoGetAllCommits(owner, repo, sha, page, limit)

Get a list of all commits from a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String sha = "sha_example"; // String | SHA or branch to start listing commits from (usually 'master')
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Commit> result = apiInstance.repoGetAllCommits(owner, repo, sha, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetAllCommits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **sha** | **String**| SHA or branch to start listing commits from (usually &#39;master&#39;) | [optional]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Commit&gt;**](Commit.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetArchive"></a>
# **repoGetArchive**
> repoGetArchive(owner, repo, archive)

Get an archive of a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String archive = "archive_example"; // String | the git reference for download with attached archive format (e.g. master.zip)
try {
    apiInstance.repoGetArchive(owner, repo, archive);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetArchive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **archive** | **String**| the git reference for download with attached archive format (e.g. master.zip) |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetBranch"></a>
# **repoGetBranch**
> Branch repoGetBranch(owner, repo, branch)

Retrieve a specific branch from a repository, including its effective branch protection

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String branch = "branch_example"; // String | branch to get
try {
    Branch result = apiInstance.repoGetBranch(owner, repo, branch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **branch** | **String**| branch to get |

### Return type

[**Branch**](Branch.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetBranchProtection"></a>
# **repoGetBranchProtection**
> BranchProtection repoGetBranchProtection(owner, repo, name)

Get a specific branch protection for the repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String name = "name_example"; // String | name of protected branch
try {
    BranchProtection result = apiInstance.repoGetBranchProtection(owner, repo, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetBranchProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **name** | **String**| name of protected branch |

### Return type

[**BranchProtection**](BranchProtection.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetByID"></a>
# **repoGetByID**
> Repository repoGetByID(id)

Get a repository by id

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
Long id = 789L; // Long | id of the repo to get
try {
    Repository result = apiInstance.repoGetByID(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of the repo to get |

### Return type

[**Repository**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetCombinedStatusByRef"></a>
# **repoGetCombinedStatusByRef**
> CombinedStatus repoGetCombinedStatusByRef(owner, repo, ref, page)

Get a commit&#39;s combined status, by branch/tag/commit reference

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String ref = "ref_example"; // String | name of branch/tag/commit
Integer page = 56; // Integer | page number of results
try {
    CombinedStatus result = apiInstance.repoGetCombinedStatusByRef(owner, repo, ref, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetCombinedStatusByRef");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **ref** | **String**| name of branch/tag/commit |
 **page** | **Integer**| page number of results | [optional]

### Return type

[**CombinedStatus**](CombinedStatus.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetContents"></a>
# **repoGetContents**
> ContentsResponse repoGetContents(owner, repo, filepath, ref)

Gets the metadata and contents (if a file) of an entry in a repository, or a list of entries if a dir

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String filepath = "filepath_example"; // String | path of the dir, file, symlink or submodule in the repo
String ref = "ref_example"; // String | The name of the commit/branch/tag. Default the repository’s default branch (usually master)
try {
    ContentsResponse result = apiInstance.repoGetContents(owner, repo, filepath, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetContents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **filepath** | **String**| path of the dir, file, symlink or submodule in the repo |
 **ref** | **String**| The name of the commit/branch/tag. Default the repository’s default branch (usually master) | [optional]

### Return type

[**ContentsResponse**](ContentsResponse.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetContentsList"></a>
# **repoGetContentsList**
> List&lt;ContentsResponse&gt; repoGetContentsList(owner, repo, ref)

Gets the metadata of all the entries of the root dir

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String ref = "ref_example"; // String | The name of the commit/branch/tag. Default the repository’s default branch (usually master)
try {
    List<ContentsResponse> result = apiInstance.repoGetContentsList(owner, repo, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetContentsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **ref** | **String**| The name of the commit/branch/tag. Default the repository’s default branch (usually master) | [optional]

### Return type

[**List&lt;ContentsResponse&gt;**](ContentsResponse.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetEditorConfig"></a>
# **repoGetEditorConfig**
> repoGetEditorConfig(owner, repo, filepath)

Get the EditorConfig definitions of a file in a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String filepath = "filepath_example"; // String | filepath of file to get
try {
    apiInstance.repoGetEditorConfig(owner, repo, filepath);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetEditorConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **filepath** | **String**| filepath of file to get |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetGitHook"></a>
# **repoGetGitHook**
> GitHook repoGetGitHook(owner, repo, id)

Get a Git hook

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String id = "id_example"; // String | id of the hook to get
try {
    GitHook result = apiInstance.repoGetGitHook(owner, repo, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetGitHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **String**| id of the hook to get |

### Return type

[**GitHook**](GitHook.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetHook"></a>
# **repoGetHook**
> Hook repoGetHook(owner, repo, id)

Get a hook

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the hook to get
try {
    Hook result = apiInstance.repoGetHook(owner, repo, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the hook to get |

### Return type

[**Hook**](Hook.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetIssueTemplates"></a>
# **repoGetIssueTemplates**
> List&lt;IssueTemplate&gt; repoGetIssueTemplates(owner, repo)

Get available issue templates for a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    List<IssueTemplate> result = apiInstance.repoGetIssueTemplates(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetIssueTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

[**List&lt;IssueTemplate&gt;**](IssueTemplate.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetKey"></a>
# **repoGetKey**
> DeployKey repoGetKey(owner, repo, id)

Get a repository&#39;s key by id

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the key to get
try {
    DeployKey result = apiInstance.repoGetKey(owner, repo, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the key to get |

### Return type

[**DeployKey**](DeployKey.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetLanguages"></a>
# **repoGetLanguages**
> Map&lt;String, Long&gt; repoGetLanguages(owner, repo)

Get languages and number of bytes of code written

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    Map<String, Long> result = apiInstance.repoGetLanguages(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetLanguages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

**Map&lt;String, Long&gt;**

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetPullRequest"></a>
# **repoGetPullRequest**
> PullRequest repoGetPullRequest(owner, repo, index)

Get a pull request

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request to get
try {
    PullRequest result = apiInstance.repoGetPullRequest(owner, repo, index);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetPullRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request to get |

### Return type

[**PullRequest**](PullRequest.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetPullReview"></a>
# **repoGetPullReview**
> PullReview repoGetPullReview(owner, repo, index, id)

Get a specific review for a pull request

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request
Long id = 789L; // Long | id of the review
try {
    PullReview result = apiInstance.repoGetPullReview(owner, repo, index, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetPullReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request |
 **id** | **Long**| id of the review |

### Return type

[**PullReview**](PullReview.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetPullReviewComments"></a>
# **repoGetPullReviewComments**
> List&lt;PullReviewComment&gt; repoGetPullReviewComments(owner, repo, index, id)

Get a specific review for a pull request

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request
Long id = 789L; // Long | id of the review
try {
    List<PullReviewComment> result = apiInstance.repoGetPullReviewComments(owner, repo, index, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetPullReviewComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request |
 **id** | **Long**| id of the review |

### Return type

[**List&lt;PullReviewComment&gt;**](PullReviewComment.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetRawFile"></a>
# **repoGetRawFile**
> repoGetRawFile(owner, repo, filepath)

Get a file from a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String filepath = "filepath_example"; // String | filepath of the file to get
try {
    apiInstance.repoGetRawFile(owner, repo, filepath);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetRawFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **filepath** | **String**| filepath of the file to get |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetRelease"></a>
# **repoGetRelease**
> Release repoGetRelease(owner, repo, id)

Get a release

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the release to get
try {
    Release result = apiInstance.repoGetRelease(owner, repo, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetRelease");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the release to get |

### Return type

[**Release**](Release.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetReleaseAttachment"></a>
# **repoGetReleaseAttachment**
> Attachment repoGetReleaseAttachment(owner, repo, id, attachmentId)

Get a release attachment

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the release
Long attachmentId = 789L; // Long | id of the attachment to get
try {
    Attachment result = apiInstance.repoGetReleaseAttachment(owner, repo, id, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetReleaseAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the release |
 **attachmentId** | **Long**| id of the attachment to get |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetReleaseTag"></a>
# **repoGetReleaseTag**
> Release repoGetReleaseTag(owner, repo, tag)

Get a release by tag name

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String tag = "tag_example"; // String | tagname of the release to get
try {
    Release result = apiInstance.repoGetReleaseTag(owner, repo, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetReleaseTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **tag** | **String**| tagname of the release to get |

### Return type

[**Release**](Release.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoGetSingleCommit"></a>
# **repoGetSingleCommit**
> Commit repoGetSingleCommit(owner, repo, sha)

Get a single commit from a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String sha = "sha_example"; // String | a git ref or commit sha
try {
    Commit result = apiInstance.repoGetSingleCommit(owner, repo, sha);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoGetSingleCommit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **sha** | **String**| a git ref or commit sha |

### Return type

[**Commit**](Commit.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListAllGitRefs"></a>
# **repoListAllGitRefs**
> List&lt;Reference&gt; repoListAllGitRefs(owner, repo)

Get specified ref or filtered repository&#39;s refs

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    List<Reference> result = apiInstance.repoListAllGitRefs(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListAllGitRefs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

[**List&lt;Reference&gt;**](Reference.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListBranchProtection"></a>
# **repoListBranchProtection**
> List&lt;BranchProtection&gt; repoListBranchProtection(owner, repo)

List branch protections for a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    List<BranchProtection> result = apiInstance.repoListBranchProtection(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListBranchProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

[**List&lt;BranchProtection&gt;**](BranchProtection.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListBranches"></a>
# **repoListBranches**
> List&lt;Branch&gt; repoListBranches(owner, repo)

List a repository&#39;s branches

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    List<Branch> result = apiInstance.repoListBranches(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListBranches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

[**List&lt;Branch&gt;**](Branch.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListCollaborators"></a>
# **repoListCollaborators**
> List&lt;User&gt; repoListCollaborators(owner, repo, page, limit)

List a repository&#39;s collaborators

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<User> result = apiInstance.repoListCollaborators(owner, repo, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListCollaborators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListGitHooks"></a>
# **repoListGitHooks**
> List&lt;GitHook&gt; repoListGitHooks(owner, repo)

List the Git hooks in a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    List<GitHook> result = apiInstance.repoListGitHooks(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListGitHooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

[**List&lt;GitHook&gt;**](GitHook.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListGitRefs"></a>
# **repoListGitRefs**
> List&lt;Reference&gt; repoListGitRefs(owner, repo, ref)

Get specified ref or filtered repository&#39;s refs

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String ref = "ref_example"; // String | part or full name of the ref
try {
    List<Reference> result = apiInstance.repoListGitRefs(owner, repo, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListGitRefs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **ref** | **String**| part or full name of the ref |

### Return type

[**List&lt;Reference&gt;**](Reference.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListHooks"></a>
# **repoListHooks**
> List&lt;Hook&gt; repoListHooks(owner, repo, page, limit)

List the hooks in a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Hook> result = apiInstance.repoListHooks(owner, repo, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListHooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Hook&gt;**](Hook.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListKeys"></a>
# **repoListKeys**
> List&lt;DeployKey&gt; repoListKeys(owner, repo, keyId, fingerprint, page, limit)

List a repository&#39;s keys

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer keyId = 56; // Integer | the key_id to search for
String fingerprint = "fingerprint_example"; // String | fingerprint of the key
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<DeployKey> result = apiInstance.repoListKeys(owner, repo, keyId, fingerprint, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **keyId** | **Integer**| the key_id to search for | [optional]
 **fingerprint** | **String**| fingerprint of the key | [optional]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;DeployKey&gt;**](DeployKey.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListPullRequests"></a>
# **repoListPullRequests**
> List&lt;PullRequest&gt; repoListPullRequests(owner, repo, state, sort, milestone, labels, page, limit)

List a repo&#39;s pull requests

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String state = "state_example"; // String | State of pull request: open or closed (optional)
String sort = "sort_example"; // String | Type of sort
Long milestone = 789L; // Long | ID of the milestone
List<Long> labels = Arrays.asList(56L); // List<Long> | Label IDs
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<PullRequest> result = apiInstance.repoListPullRequests(owner, repo, state, sort, milestone, labels, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListPullRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **state** | **String**| State of pull request: open or closed (optional) | [optional] [enum: closed, open, all]
 **sort** | **String**| Type of sort | [optional] [enum: oldest, recentupdate, leastupdate, mostcomment, leastcomment, priority]
 **milestone** | **Long**| ID of the milestone | [optional]
 **labels** | [**List&lt;Long&gt;**](Long.md)| Label IDs | [optional]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;PullRequest&gt;**](PullRequest.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListPullReviews"></a>
# **repoListPullReviews**
> List&lt;PullReview&gt; repoListPullReviews(owner, repo, index, page, limit)

List all reviews for a pull request

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<PullReview> result = apiInstance.repoListPullReviews(owner, repo, index, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListPullReviews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;PullReview&gt;**](PullReview.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListReleaseAttachments"></a>
# **repoListReleaseAttachments**
> List&lt;Attachment&gt; repoListReleaseAttachments(owner, repo, id)

List release&#39;s attachments

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the release
try {
    List<Attachment> result = apiInstance.repoListReleaseAttachments(owner, repo, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListReleaseAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the release |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListReleases"></a>
# **repoListReleases**
> List&lt;Release&gt; repoListReleases(owner, repo, perPage, page, limit)

List a repo&#39;s releases

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer perPage = 56; // Integer | page size of results, deprecated - use limit
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Release> result = apiInstance.repoListReleases(owner, repo, perPage, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListReleases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **perPage** | **Integer**| page size of results, deprecated - use limit | [optional]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Release&gt;**](Release.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListStargazers"></a>
# **repoListStargazers**
> List&lt;User&gt; repoListStargazers(owner, repo, page, limit)

List a repo&#39;s stargazers

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<User> result = apiInstance.repoListStargazers(owner, repo, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListStargazers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListStatuses"></a>
# **repoListStatuses**
> List&lt;Status&gt; repoListStatuses(owner, repo, sha, sort, state, page, limit)

Get a commit&#39;s statuses

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String sha = "sha_example"; // String | sha of the commit
String sort = "sort_example"; // String | type of sort
String state = "state_example"; // String | type of state
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Status> result = apiInstance.repoListStatuses(owner, repo, sha, sort, state, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **sha** | **String**| sha of the commit |
 **sort** | **String**| type of sort | [optional] [enum: oldest, recentupdate, leastupdate, leastindex, highestindex]
 **state** | **String**| type of state | [optional] [enum: pending, success, error, failure, warning]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Status&gt;**](Status.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListStatusesByRef"></a>
# **repoListStatusesByRef**
> List&lt;Status&gt; repoListStatusesByRef(owner, repo, ref, sort, state, page, limit)

Get a commit&#39;s statuses, by branch/tag/commit reference

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String ref = "ref_example"; // String | name of branch/tag/commit
String sort = "sort_example"; // String | type of sort
String state = "state_example"; // String | type of state
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<Status> result = apiInstance.repoListStatusesByRef(owner, repo, ref, sort, state, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListStatusesByRef");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **ref** | **String**| name of branch/tag/commit |
 **sort** | **String**| type of sort | [optional] [enum: oldest, recentupdate, leastupdate, leastindex, highestindex]
 **state** | **String**| type of state | [optional] [enum: pending, success, error, failure, warning]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;Status&gt;**](Status.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListSubscribers"></a>
# **repoListSubscribers**
> List&lt;User&gt; repoListSubscribers(owner, repo, page, limit)

List a repo&#39;s watchers

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<User> result = apiInstance.repoListSubscribers(owner, repo, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListSubscribers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListTags"></a>
# **repoListTags**
> List&lt;Tag&gt; repoListTags(owner, repo, page, limit)

List a repository&#39;s tags

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results, default maximum page size is 50
try {
    List<Tag> result = apiInstance.repoListTags(owner, repo, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results, default maximum page size is 50 | [optional]

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoListTopics"></a>
# **repoListTopics**
> TopicName repoListTopics(owner, repo, page, limit)

Get list of topics that a repository has

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    TopicName result = apiInstance.repoListTopics(owner, repo, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoListTopics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**TopicName**](TopicName.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoMergePullRequest"></a>
# **repoMergePullRequest**
> repoMergePullRequest(owner, repo, index, body)

Merge a pull request

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request to merge
MergePullRequestOption body = new MergePullRequestOption(); // MergePullRequestOption | 
try {
    apiInstance.repoMergePullRequest(owner, repo, index, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoMergePullRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request to merge |
 **body** | [**MergePullRequestOption**](MergePullRequestOption.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoMigrate"></a>
# **repoMigrate**
> Repository repoMigrate(body)

Migrate a remote git repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
MigrateRepoOptions body = new MigrateRepoOptions(); // MigrateRepoOptions | 
try {
    Repository result = apiInstance.repoMigrate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoMigrate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MigrateRepoOptions**](MigrateRepoOptions.md)|  | [optional]

### Return type

[**Repository**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoMirrorSync"></a>
# **repoMirrorSync**
> repoMirrorSync(owner, repo)

Sync a mirrored repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo to sync
String repo = "repo_example"; // String | name of the repo to sync
try {
    apiInstance.repoMirrorSync(owner, repo);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoMirrorSync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo to sync |
 **repo** | **String**| name of the repo to sync |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoPullRequestIsMerged"></a>
# **repoPullRequestIsMerged**
> repoPullRequestIsMerged(owner, repo, index)

Check if a pull request has been merged

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request
try {
    apiInstance.repoPullRequestIsMerged(owner, repo, index);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoPullRequestIsMerged");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoSearch"></a>
# **repoSearch**
> SearchResults repoSearch(q, topic, includeDesc, uid, priorityOwnerId, starredBy, _private, isPrivate, template, archived, mode, exclusive, sort, order, page, limit)

Search for repositories

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String q = "q_example"; // String | keyword
Boolean topic = true; // Boolean | Limit search to repositories with keyword as topic
Boolean includeDesc = true; // Boolean | include search of keyword within repository description
Long uid = 789L; // Long | search only for repos that the user with the given id owns or contributes to
Long priorityOwnerId = 789L; // Long | repo owner to prioritize in the results
Long starredBy = 789L; // Long | search only for repos that the user with the given id has starred
Boolean _private = true; // Boolean | include private repositories this user has access to (defaults to true)
Boolean isPrivate = true; // Boolean | show only pubic, private or all repositories (defaults to all)
Boolean template = true; // Boolean | include template repositories this user has access to (defaults to true)
Boolean archived = true; // Boolean | show only archived, non-archived or all repositories (defaults to all)
String mode = "mode_example"; // String | type of repository to search for. Supported values are \"fork\", \"source\", \"mirror\" and \"collaborative\"
Boolean exclusive = true; // Boolean | if `uid` is given, search only for repos that the user owns
String sort = "sort_example"; // String | sort repos by attribute. Supported values are \"alpha\", \"created\", \"updated\", \"size\", and \"id\". Default is \"alpha\"
String order = "order_example"; // String | sort order, either \"asc\" (ascending) or \"desc\" (descending). Default is \"asc\", ignored if \"sort\" is not specified.
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    SearchResults result = apiInstance.repoSearch(q, topic, includeDesc, uid, priorityOwnerId, starredBy, _private, isPrivate, template, archived, mode, exclusive, sort, order, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| keyword | [optional]
 **topic** | **Boolean**| Limit search to repositories with keyword as topic | [optional]
 **includeDesc** | **Boolean**| include search of keyword within repository description | [optional]
 **uid** | **Long**| search only for repos that the user with the given id owns or contributes to | [optional]
 **priorityOwnerId** | **Long**| repo owner to prioritize in the results | [optional]
 **starredBy** | **Long**| search only for repos that the user with the given id has starred | [optional]
 **_private** | **Boolean**| include private repositories this user has access to (defaults to true) | [optional]
 **isPrivate** | **Boolean**| show only pubic, private or all repositories (defaults to all) | [optional]
 **template** | **Boolean**| include template repositories this user has access to (defaults to true) | [optional]
 **archived** | **Boolean**| show only archived, non-archived or all repositories (defaults to all) | [optional]
 **mode** | **String**| type of repository to search for. Supported values are \&quot;fork\&quot;, \&quot;source\&quot;, \&quot;mirror\&quot; and \&quot;collaborative\&quot; | [optional]
 **exclusive** | **Boolean**| if &#x60;uid&#x60; is given, search only for repos that the user owns | [optional]
 **sort** | **String**| sort repos by attribute. Supported values are \&quot;alpha\&quot;, \&quot;created\&quot;, \&quot;updated\&quot;, \&quot;size\&quot;, and \&quot;id\&quot;. Default is \&quot;alpha\&quot; | [optional]
 **order** | **String**| sort order, either \&quot;asc\&quot; (ascending) or \&quot;desc\&quot; (descending). Default is \&quot;asc\&quot;, ignored if \&quot;sort\&quot; is not specified. | [optional]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**SearchResults**](SearchResults.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoSigningKey"></a>
# **repoSigningKey**
> String repoSigningKey(owner, repo)

Get signing-key.gpg for given repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    String result = apiInstance.repoSigningKey(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoSigningKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

**String**

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: text/plain

<a name="repoSubmitPullReview"></a>
# **repoSubmitPullReview**
> PullReview repoSubmitPullReview(owner, repo, index, id, body)

Submit a pending review to an pull request

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request
Long id = 789L; // Long | id of the review
SubmitPullReviewOptions body = new SubmitPullReviewOptions(); // SubmitPullReviewOptions | 
try {
    PullReview result = apiInstance.repoSubmitPullReview(owner, repo, index, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoSubmitPullReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request |
 **id** | **Long**| id of the review |
 **body** | [**SubmitPullReviewOptions**](SubmitPullReviewOptions.md)|  |

### Return type

[**PullReview**](PullReview.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoTestHook"></a>
# **repoTestHook**
> repoTestHook(owner, repo, id)

Test a push webhook

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long id = 789L; // Long | id of the hook to test
try {
    apiInstance.repoTestHook(owner, repo, id);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoTestHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **id** | **Long**| id of the hook to test |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoTrackedTimes"></a>
# **repoTrackedTimes**
> List&lt;TrackedTime&gt; repoTrackedTimes(owner, repo, user, since, before, page, limit)

List a repo&#39;s tracked times

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String user = "user_example"; // String | optional filter by user
OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Only show times updated after the given time. This is a timestamp in RFC 3339 format
OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only show times updated before the given time. This is a timestamp in RFC 3339 format
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<TrackedTime> result = apiInstance.repoTrackedTimes(owner, repo, user, since, before, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoTrackedTimes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **user** | **String**| optional filter by user | [optional]
 **since** | **OffsetDateTime**| Only show times updated after the given time. This is a timestamp in RFC 3339 format | [optional]
 **before** | **OffsetDateTime**| Only show times updated before the given time. This is a timestamp in RFC 3339 format | [optional]
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;TrackedTime&gt;**](TrackedTime.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoTransfer"></a>
# **repoTransfer**
> Repository repoTransfer(owner, repo, body)

Transfer a repo ownership

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo to transfer
String repo = "repo_example"; // String | name of the repo to transfer
TransferRepoOption body = new TransferRepoOption(); // TransferRepoOption | Transfer Options
try {
    Repository result = apiInstance.repoTransfer(owner, repo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo to transfer |
 **repo** | **String**| name of the repo to transfer |
 **body** | [**TransferRepoOption**](TransferRepoOption.md)| Transfer Options |

### Return type

[**Repository**](Repository.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoUpdateFile"></a>
# **repoUpdateFile**
> FileResponse repoUpdateFile(owner, repo, filepath, body)

Update a file in a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String filepath = "filepath_example"; // String | path of the file to update
UpdateFileOptions body = new UpdateFileOptions(); // UpdateFileOptions | 
try {
    FileResponse result = apiInstance.repoUpdateFile(owner, repo, filepath, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoUpdateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **filepath** | **String**| path of the file to update |
 **body** | [**UpdateFileOptions**](UpdateFileOptions.md)|  |

### Return type

[**FileResponse**](FileResponse.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repoUpdatePullRequest"></a>
# **repoUpdatePullRequest**
> repoUpdatePullRequest(owner, repo, index)

Merge PR&#39;s baseBranch into headBranch

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
Long index = 789L; // Long | index of the pull request to get
try {
    apiInstance.repoUpdatePullRequest(owner, repo, index);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoUpdatePullRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **index** | **Long**| index of the pull request to get |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="repoUpdateTopics"></a>
# **repoUpdateTopics**
> repoUpdateTopics(owner, repo, body)

Replace list of topics for a repository

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
RepoTopicOptions body = new RepoTopicOptions(); // RepoTopicOptions | 
try {
    apiInstance.repoUpdateTopics(owner, repo, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#repoUpdateTopics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **body** | [**RepoTopicOptions**](RepoTopicOptions.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="topicSearch"></a>
# **topicSearch**
> List&lt;TopicResponse&gt; topicSearch(q, page, limit)

search topics via keyword

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String q = "q_example"; // String | keywords to search
Integer page = 56; // Integer | page number of results to return (1-based)
Integer limit = 56; // Integer | page size of results
try {
    List<TopicResponse> result = apiInstance.topicSearch(q, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#topicSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| keywords to search |
 **page** | **Integer**| page number of results to return (1-based) | [optional]
 **limit** | **Integer**| page size of results | [optional]

### Return type

[**List&lt;TopicResponse&gt;**](TopicResponse.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="userCurrentCheckSubscription"></a>
# **userCurrentCheckSubscription**
> WatchInfo userCurrentCheckSubscription(owner, repo)

Check if the current user is watching a repo

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    WatchInfo result = apiInstance.userCurrentCheckSubscription(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#userCurrentCheckSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

[**WatchInfo**](WatchInfo.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/html

<a name="userCurrentDeleteSubscription"></a>
# **userCurrentDeleteSubscription**
> userCurrentDeleteSubscription(owner, repo)

Unwatch a repo

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    apiInstance.userCurrentDeleteSubscription(owner, repo);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#userCurrentDeleteSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/html

<a name="userCurrentPutSubscription"></a>
# **userCurrentPutSubscription**
> WatchInfo userCurrentPutSubscription(owner, repo)

Watch a repo

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
try {
    WatchInfo result = apiInstance.userCurrentPutSubscription(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#userCurrentPutSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |

### Return type

[**WatchInfo**](WatchInfo.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/html

<a name="userTrackedTimes"></a>
# **userTrackedTimes**
> List&lt;TrackedTime&gt; userTrackedTimes(owner, repo, user)

List a user&#39;s tracked times in a repo

### Example
```java
// Import classes:
//import io.gitea.ApiClient;
//import io.gitea.ApiException;
//import io.gitea.Configuration;
//import io.gitea.auth.*;
//import io.gitea.api.RepositoryApi;

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

RepositoryApi apiInstance = new RepositoryApi();
String owner = "owner_example"; // String | owner of the repo
String repo = "repo_example"; // String | name of the repo
String user = "user_example"; // String | username of user
try {
    List<TrackedTime> result = apiInstance.userTrackedTimes(owner, repo, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryApi#userTrackedTimes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repo |
 **repo** | **String**| name of the repo |
 **user** | **String**| username of user |

### Return type

[**List&lt;TrackedTime&gt;**](TrackedTime.md)

### Authorization

[AccessToken](../README.md#AccessToken), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [BasicAuth](../README.md#BasicAuth), [SudoHeader](../README.md#SudoHeader), [SudoParam](../README.md#SudoParam), [TOTPHeader](../README.md#TOTPHeader), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

