# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.gitea</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.gitea:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.gitea.*;
import io.gitea.auth.*;
import io.gitea.model.*;
import io.gitea.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
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

        AdminApi apiInstance = new AdminApi();
        String username = "username_example"; // String | username of the user that will own the created organization
        try {
            Organization result = apiInstance.adminCreateOrg(username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminCreateOrg");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**adminCreateOrg**](docs/AdminApi.md#adminCreateOrg) | **POST** /admin/users/{username}/orgs | Create an organization
*AdminApi* | [**adminCreatePublicKey**](docs/AdminApi.md#adminCreatePublicKey) | **POST** /admin/users/{username}/keys | Add a public key on behalf of a user
*AdminApi* | [**adminCreateRepo**](docs/AdminApi.md#adminCreateRepo) | **POST** /admin/users/{username}/repos | Create a repository on behalf a user
*AdminApi* | [**adminCreateUser**](docs/AdminApi.md#adminCreateUser) | **POST** /admin/users | Create a user
*AdminApi* | [**adminDeleteUser**](docs/AdminApi.md#adminDeleteUser) | **DELETE** /admin/users/{username} | Delete a user
*AdminApi* | [**adminDeleteUserPublicKey**](docs/AdminApi.md#adminDeleteUserPublicKey) | **DELETE** /admin/users/{username}/keys/{id} | Delete a user&#39;s public key
*AdminApi* | [**adminEditUser**](docs/AdminApi.md#adminEditUser) | **PATCH** /admin/users/{username} | Edit an existing user
*IssueApi* | [**issueAddLabel**](docs/IssueApi.md#issueAddLabel) | **POST** /repos/{owner}/{repo}/issues/{index}/labels | Add a label to an issue
*IssueApi* | [**issueAddTime**](docs/IssueApi.md#issueAddTime) | **POST** /repos/{owner}/{repo}/issues/{id}/times | Add a tracked time to a issue
*IssueApi* | [**issueClearLabels**](docs/IssueApi.md#issueClearLabels) | **DELETE** /repos/{owner}/{repo}/issues/{index}/labels | Remove all labels from an issue
*IssueApi* | [**issueCreateComment**](docs/IssueApi.md#issueCreateComment) | **POST** /repos/{owner}/{repo}/issues/{index}/comments | Add a comment to an issue
*IssueApi* | [**issueCreateIssue**](docs/IssueApi.md#issueCreateIssue) | **POST** /repos/{owner}/{repo}/issues | Create an issue
*IssueApi* | [**issueCreateLabel**](docs/IssueApi.md#issueCreateLabel) | **POST** /repos/{owner}/{repo}/labels | Create a label
*IssueApi* | [**issueCreateMilestone**](docs/IssueApi.md#issueCreateMilestone) | **POST** /repos/{owner}/{repo}/milestones | Create a milestone
*IssueApi* | [**issueDeleteComment**](docs/IssueApi.md#issueDeleteComment) | **DELETE** /repos/{owner}/{repo}/issues/comments/{id} | Delete a comment
*IssueApi* | [**issueDeleteCommentDeprecated**](docs/IssueApi.md#issueDeleteCommentDeprecated) | **DELETE** /repos/{owner}/{repo}/issues/{index}/comments/{id} | Delete a comment
*IssueApi* | [**issueDeleteLabel**](docs/IssueApi.md#issueDeleteLabel) | **DELETE** /repos/{owner}/{repo}/labels/{id} | Delete a label
*IssueApi* | [**issueDeleteMilestone**](docs/IssueApi.md#issueDeleteMilestone) | **DELETE** /repos/{owner}/{repo}/milestones/{id} | Delete a milestone
*IssueApi* | [**issueEditComment**](docs/IssueApi.md#issueEditComment) | **PATCH** /repos/{owner}/{repo}/issues/comments/{id} | Edit a comment
*IssueApi* | [**issueEditCommentDeprecated**](docs/IssueApi.md#issueEditCommentDeprecated) | **PATCH** /repos/{owner}/{repo}/issues/{index}/comments/{id} | Edit a comment
*IssueApi* | [**issueEditIssue**](docs/IssueApi.md#issueEditIssue) | **PATCH** /repos/{owner}/{repo}/issues/{index} | Edit an issue
*IssueApi* | [**issueEditIssueDeadline**](docs/IssueApi.md#issueEditIssueDeadline) | **POST** /repos/{owner}/{repo}/issues/{index}/deadline | Set an issue deadline. If set to null, the deadline is deleted.
*IssueApi* | [**issueEditLabel**](docs/IssueApi.md#issueEditLabel) | **PATCH** /repos/{owner}/{repo}/labels/{id} | Update a label
*IssueApi* | [**issueEditMilestone**](docs/IssueApi.md#issueEditMilestone) | **PATCH** /repos/{owner}/{repo}/milestones/{id} | Update a milestone
*IssueApi* | [**issueGetComments**](docs/IssueApi.md#issueGetComments) | **GET** /repos/{owner}/{repo}/issues/{index}/comments | List all comments on an issue
*IssueApi* | [**issueGetIssue**](docs/IssueApi.md#issueGetIssue) | **GET** /repos/{owner}/{repo}/issues/{index} | Get an issue
*IssueApi* | [**issueGetLabel**](docs/IssueApi.md#issueGetLabel) | **GET** /repos/{owner}/{repo}/labels/{id} | Get a single label
*IssueApi* | [**issueGetLabels**](docs/IssueApi.md#issueGetLabels) | **GET** /repos/{owner}/{repo}/issues/{index}/labels | Get an issue&#39;s labels
*IssueApi* | [**issueGetMilestone**](docs/IssueApi.md#issueGetMilestone) | **GET** /repos/{owner}/{repo}/milestones/{id} | Get a milestone
*IssueApi* | [**issueGetMilestonesList**](docs/IssueApi.md#issueGetMilestonesList) | **GET** /repos/{owner}/{repo}/milestones | Get all of a repository&#39;s milestones
*IssueApi* | [**issueGetRepoComments**](docs/IssueApi.md#issueGetRepoComments) | **GET** /repos/{owner}/{repo}/issues/comments | List all comments in a repository
*IssueApi* | [**issueListIssues**](docs/IssueApi.md#issueListIssues) | **GET** /repos/{owner}/{repo}/issues | List a repository&#39;s issues
*IssueApi* | [**issueListLabels**](docs/IssueApi.md#issueListLabels) | **GET** /repos/{owner}/{repo}/labels | Get all of a repository&#39;s labels
*IssueApi* | [**issueRemoveLabel**](docs/IssueApi.md#issueRemoveLabel) | **DELETE** /repos/{owner}/{repo}/issues/{index}/labels/{id} | Remove a label from an issue
*IssueApi* | [**issueReplaceLabels**](docs/IssueApi.md#issueReplaceLabels) | **PUT** /repos/{owner}/{repo}/issues/{index}/labels | Replace an issue&#39;s labels
*IssueApi* | [**issueTrackedTimes**](docs/IssueApi.md#issueTrackedTimes) | **GET** /repos/{owner}/{repo}/issues/{id}/times | List an issue&#39;s tracked times
*MiscellaneousApi* | [**getVersion**](docs/MiscellaneousApi.md#getVersion) | **GET** /version | Returns the version of the Gitea application
*MiscellaneousApi* | [**renderMarkdown**](docs/MiscellaneousApi.md#renderMarkdown) | **POST** /markdown | Render a markdown document as HTML
*MiscellaneousApi* | [**renderMarkdownRaw**](docs/MiscellaneousApi.md#renderMarkdownRaw) | **POST** /markdown/raw | Render raw markdown as HTML
*OrganizationApi* | [**createOrgRepo**](docs/OrganizationApi.md#createOrgRepo) | **POST** /org/{org}/repos | Create a repository in an organization
*OrganizationApi* | [**orgAddTeamMember**](docs/OrganizationApi.md#orgAddTeamMember) | **PUT** /teams/{id}/members/{username} | Add a team member
*OrganizationApi* | [**orgAddTeamRepository**](docs/OrganizationApi.md#orgAddTeamRepository) | **PUT** /teams/{id}/repos/{org}/{repo} | Add a repository to a team
*OrganizationApi* | [**orgConcealMember**](docs/OrganizationApi.md#orgConcealMember) | **DELETE** /orgs/{org}/public_members/{username} | Conceal a user&#39;s membership
*OrganizationApi* | [**orgCreateHook**](docs/OrganizationApi.md#orgCreateHook) | **POST** /orgs/{org}/hooks/ | Create a hook
*OrganizationApi* | [**orgCreateTeam**](docs/OrganizationApi.md#orgCreateTeam) | **POST** /orgs/{org}/teams | Create a team
*OrganizationApi* | [**orgDeleteHook**](docs/OrganizationApi.md#orgDeleteHook) | **DELETE** /orgs/{org}/hooks/{id} | Delete a hook
*OrganizationApi* | [**orgDeleteMember**](docs/OrganizationApi.md#orgDeleteMember) | **DELETE** /orgs/{org}/members/{username} | Remove a member from an organization
*OrganizationApi* | [**orgDeleteTeam**](docs/OrganizationApi.md#orgDeleteTeam) | **DELETE** /teams/{id} | Delete a team
*OrganizationApi* | [**orgEdit**](docs/OrganizationApi.md#orgEdit) | **PATCH** /orgs/{org} | Edit an organization
*OrganizationApi* | [**orgEditHook**](docs/OrganizationApi.md#orgEditHook) | **PATCH** /orgs/{org}/hooks/{id} | Update a hook
*OrganizationApi* | [**orgEditTeam**](docs/OrganizationApi.md#orgEditTeam) | **PATCH** /teams/{id} | Edit a team
*OrganizationApi* | [**orgGet**](docs/OrganizationApi.md#orgGet) | **GET** /orgs/{org} | Get an organization
*OrganizationApi* | [**orgGetHook**](docs/OrganizationApi.md#orgGetHook) | **GET** /orgs/{org}/hooks/{id} | Get a hook
*OrganizationApi* | [**orgGetTeam**](docs/OrganizationApi.md#orgGetTeam) | **GET** /teams/{id} | Get a team
*OrganizationApi* | [**orgIsMember**](docs/OrganizationApi.md#orgIsMember) | **GET** /orgs/{org}/members/{username} | Check if a user is a member of an organization
*OrganizationApi* | [**orgIsPublicMember**](docs/OrganizationApi.md#orgIsPublicMember) | **GET** /orgs/{org}/public_members/{username} | Check if a user is a public member of an organization
*OrganizationApi* | [**orgListCurrentUserOrgs**](docs/OrganizationApi.md#orgListCurrentUserOrgs) | **GET** /user/orgs | List the current user&#39;s organizations
*OrganizationApi* | [**orgListHooks**](docs/OrganizationApi.md#orgListHooks) | **GET** /orgs/{org}/hooks | List an organization&#39;s webhooks
*OrganizationApi* | [**orgListMembers**](docs/OrganizationApi.md#orgListMembers) | **GET** /orgs/{org}/members | List an organization&#39;s members
*OrganizationApi* | [**orgListPublicMembers**](docs/OrganizationApi.md#orgListPublicMembers) | **GET** /orgs/{org}/public_members | List an organization&#39;s public members
*OrganizationApi* | [**orgListRepos**](docs/OrganizationApi.md#orgListRepos) | **GET** /orgs/{org}/repos | List an organization&#39;s repos
*OrganizationApi* | [**orgListTeamMembers**](docs/OrganizationApi.md#orgListTeamMembers) | **GET** /teams/{id}/members | List a team&#39;s members
*OrganizationApi* | [**orgListTeamRepos**](docs/OrganizationApi.md#orgListTeamRepos) | **GET** /teams/{id}/repos | List a team&#39;s repos
*OrganizationApi* | [**orgListTeams**](docs/OrganizationApi.md#orgListTeams) | **GET** /orgs/{org}/teams | List an organization&#39;s teams
*OrganizationApi* | [**orgListUserOrgs**](docs/OrganizationApi.md#orgListUserOrgs) | **GET** /user/{username}/orgs | List a user&#39;s organizations
*OrganizationApi* | [**orgPublicizeMember**](docs/OrganizationApi.md#orgPublicizeMember) | **PUT** /orgs/{org}/public_members/{username} | Publicize a user&#39;s membership
*OrganizationApi* | [**orgRemoveTeamMember**](docs/OrganizationApi.md#orgRemoveTeamMember) | **DELETE** /teams/{id}/members/{username} | Remove a team member
*OrganizationApi* | [**orgRemoveTeamRepository**](docs/OrganizationApi.md#orgRemoveTeamRepository) | **DELETE** /teams/{id}/repos/{org}/{repo} | Remove a repository from a team
*RepositoryApi* | [**createCurrentUserRepo**](docs/RepositoryApi.md#createCurrentUserRepo) | **POST** /user/repos | Create a repository
*RepositoryApi* | [**createFork**](docs/RepositoryApi.md#createFork) | **POST** /repos/{owner}/{repo}/forks | Fork a repository
*RepositoryApi* | [**listForks**](docs/RepositoryApi.md#listForks) | **GET** /repos/{owner}/{repo}/forks | List a repository&#39;s forks
*RepositoryApi* | [**repoAddCollaborator**](docs/RepositoryApi.md#repoAddCollaborator) | **PUT** /repos/{owner}/{repo}/collaborators/{collaborator} | Add a collaborator to a repository
*RepositoryApi* | [**repoCheckCollaborator**](docs/RepositoryApi.md#repoCheckCollaborator) | **GET** /repos/{owner}/{repo}/collaborators/{collaborator} | Check if a user is a collaborator of a repository
*RepositoryApi* | [**repoCreateHook**](docs/RepositoryApi.md#repoCreateHook) | **POST** /repos/{owner}/{repo}/hooks | Create a hook
*RepositoryApi* | [**repoCreateKey**](docs/RepositoryApi.md#repoCreateKey) | **POST** /repos/{owner}/{repo}/keys | Add a key to a repository
*RepositoryApi* | [**repoCreatePullRequest**](docs/RepositoryApi.md#repoCreatePullRequest) | **POST** /repos/{owner}/{repo}/pulls | Create a pull request
*RepositoryApi* | [**repoCreateRelease**](docs/RepositoryApi.md#repoCreateRelease) | **POST** /repos/{owner}/{repo}/releases | Create a release
*RepositoryApi* | [**repoCreateReleaseAttachment**](docs/RepositoryApi.md#repoCreateReleaseAttachment) | **POST** /repos/{owner}/{repo}/releases/{id}/assets | Create a release attachment
*RepositoryApi* | [**repoCreateStatus**](docs/RepositoryApi.md#repoCreateStatus) | **POST** /repos/{owner}/{repo}/statuses/{sha} | Create a commit status
*RepositoryApi* | [**repoDelete**](docs/RepositoryApi.md#repoDelete) | **DELETE** /repos/{owner}/{repo} | Delete a repository
*RepositoryApi* | [**repoDeleteCollaborator**](docs/RepositoryApi.md#repoDeleteCollaborator) | **DELETE** /repos/{owner}/{repo}/collaborators/{collaborator} | Delete a collaborator from a repository
*RepositoryApi* | [**repoDeleteHook**](docs/RepositoryApi.md#repoDeleteHook) | **DELETE** /repos/{owner}/{repo}/hooks/{id} | Delete a hook in a repository
*RepositoryApi* | [**repoDeleteKey**](docs/RepositoryApi.md#repoDeleteKey) | **DELETE** /repos/{owner}/{repo}/keys/{id} | Delete a key from a repository
*RepositoryApi* | [**repoDeleteRelease**](docs/RepositoryApi.md#repoDeleteRelease) | **DELETE** /repos/{owner}/{repo}/releases/{id} | Delete a release
*RepositoryApi* | [**repoDeleteReleaseAttachment**](docs/RepositoryApi.md#repoDeleteReleaseAttachment) | **DELETE** /repos/{owner}/{repo}/releases/{id}/assets/{attachment_id} | Delete a release attachment
*RepositoryApi* | [**repoEditHook**](docs/RepositoryApi.md#repoEditHook) | **PATCH** /repos/{owner}/{repo}/hooks/{id} | Edit a hook in a repository
*RepositoryApi* | [**repoEditPullRequest**](docs/RepositoryApi.md#repoEditPullRequest) | **PATCH** /repos/{owner}/{repo}/pulls/{index} | Update a pull request
*RepositoryApi* | [**repoEditRelease**](docs/RepositoryApi.md#repoEditRelease) | **PATCH** /repos/{owner}/{repo}/releases/{id} | Update a release
*RepositoryApi* | [**repoEditReleaseAttachment**](docs/RepositoryApi.md#repoEditReleaseAttachment) | **PATCH** /repos/{owner}/{repo}/releases/{id}/assets/{attachment_id} | Edit a release attachment
*RepositoryApi* | [**repoGet**](docs/RepositoryApi.md#repoGet) | **GET** /repos/{owner}/{repo} | Get a repository
*RepositoryApi* | [**repoGetArchive**](docs/RepositoryApi.md#repoGetArchive) | **GET** /repos/{owner}/{repo}/archive/{archive} | Get an archive of a repository
*RepositoryApi* | [**repoGetBranch**](docs/RepositoryApi.md#repoGetBranch) | **GET** /repos/{owner}/{repo}/branches/{branch} | List a repository&#39;s branches
*RepositoryApi* | [**repoGetByID**](docs/RepositoryApi.md#repoGetByID) | **GET** /repositories/{id} | Get a repository by id
*RepositoryApi* | [**repoGetCombinedStatusByRef**](docs/RepositoryApi.md#repoGetCombinedStatusByRef) | **GET** /repos/{owner}/{repo}/commits/{ref}/statuses | Get a commit&#39;s combined status, by branch/tag/commit reference
*RepositoryApi* | [**repoGetEditorConfig**](docs/RepositoryApi.md#repoGetEditorConfig) | **GET** /repos/{owner}/{repo}/editorconfig/{filepath} | Get the EditorConfig definitions of a file in a repository
*RepositoryApi* | [**repoGetHook**](docs/RepositoryApi.md#repoGetHook) | **GET** /repos/{owner}/{repo}/hooks/{id} | Get a hook
*RepositoryApi* | [**repoGetKey**](docs/RepositoryApi.md#repoGetKey) | **GET** /repos/{owner}/{repo}/keys/{id} | Get a repository&#39;s key by id
*RepositoryApi* | [**repoGetPullRequest**](docs/RepositoryApi.md#repoGetPullRequest) | **GET** /repos/{owner}/{repo}/pulls/{index} | Get a pull request
*RepositoryApi* | [**repoGetRawFile**](docs/RepositoryApi.md#repoGetRawFile) | **GET** /repos/{owner}/{repo}/raw/{filepath} | Get a file from a repository
*RepositoryApi* | [**repoGetRelease**](docs/RepositoryApi.md#repoGetRelease) | **GET** /repos/{owner}/{repo}/releases/{id} | Get a release
*RepositoryApi* | [**repoGetReleaseAttachment**](docs/RepositoryApi.md#repoGetReleaseAttachment) | **GET** /repos/{owner}/{repo}/releases/{id}/assets/{attachment_id} | Get a release attachment
*RepositoryApi* | [**repoListBranches**](docs/RepositoryApi.md#repoListBranches) | **GET** /repos/{owner}/{repo}/branches | List a repository&#39;s branches
*RepositoryApi* | [**repoListCollaborators**](docs/RepositoryApi.md#repoListCollaborators) | **GET** /repos/{owner}/{repo}/collaborators | List a repository&#39;s collaborators
*RepositoryApi* | [**repoListHooks**](docs/RepositoryApi.md#repoListHooks) | **GET** /repos/{owner}/{repo}/hooks | List the hooks in a repository
*RepositoryApi* | [**repoListKeys**](docs/RepositoryApi.md#repoListKeys) | **GET** /repos/{owner}/{repo}/keys | List a repository&#39;s keys
*RepositoryApi* | [**repoListPullRequests**](docs/RepositoryApi.md#repoListPullRequests) | **GET** /repos/{owner}/{repo}/pulls | List a repo&#39;s pull requests
*RepositoryApi* | [**repoListReleaseAttachments**](docs/RepositoryApi.md#repoListReleaseAttachments) | **GET** /repos/{owner}/{repo}/releases/{id}/assets | List release&#39;s attachments
*RepositoryApi* | [**repoListReleases**](docs/RepositoryApi.md#repoListReleases) | **GET** /repos/{owner}/{repo}/releases | List a repo&#39;s releases
*RepositoryApi* | [**repoListStargazers**](docs/RepositoryApi.md#repoListStargazers) | **GET** /repos/{owner}/{repo}/stargazers | List a repo&#39;s stargazers
*RepositoryApi* | [**repoListStatuses**](docs/RepositoryApi.md#repoListStatuses) | **GET** /repos/{owner}/{repo}/statuses/{sha} | Get a commit&#39;s statuses
*RepositoryApi* | [**repoListSubscribers**](docs/RepositoryApi.md#repoListSubscribers) | **GET** /repos/{owner}/{repo}/subscribers | List a repo&#39;s watchers
*RepositoryApi* | [**repoMergePullRequest**](docs/RepositoryApi.md#repoMergePullRequest) | **POST** /repos/{owner}/{repo}/pulls/{index}/merge | Merge a pull request
*RepositoryApi* | [**repoMigrate**](docs/RepositoryApi.md#repoMigrate) | **POST** /repos/migrate | Migrate a remote git repository
*RepositoryApi* | [**repoMirrorSync**](docs/RepositoryApi.md#repoMirrorSync) | **POST** /repos/{owner}/{repo}/mirror-sync | Sync a mirrored repository
*RepositoryApi* | [**repoPullRequestIsMerged**](docs/RepositoryApi.md#repoPullRequestIsMerged) | **GET** /repos/{owner}/{repo}/pulls/{index}/merge | Check if a pull request has been merged
*RepositoryApi* | [**repoSearch**](docs/RepositoryApi.md#repoSearch) | **GET** /repos/search | Search for repositories
*RepositoryApi* | [**repoTestHook**](docs/RepositoryApi.md#repoTestHook) | **POST** /repos/{owner}/{repo}/hooks/{id}/tests | Test a push webhook
*RepositoryApi* | [**repoTrackedTimes**](docs/RepositoryApi.md#repoTrackedTimes) | **GET** /repos/{owner}/{repo}/times | List a repo&#39;s tracked times
*RepositoryApi* | [**topicSearch**](docs/RepositoryApi.md#topicSearch) | **GET** /topics/search | search topics via keyword
*RepositoryApi* | [**userCurrentCheckSubscription**](docs/RepositoryApi.md#userCurrentCheckSubscription) | **GET** /repos/{owner}/{repo}/subscription | Check if the current user is watching a repo
*RepositoryApi* | [**userCurrentDeleteSubscription**](docs/RepositoryApi.md#userCurrentDeleteSubscription) | **DELETE** /repos/{owner}/{repo}/subscription | Unwatch a repo
*RepositoryApi* | [**userCurrentPutSubscription**](docs/RepositoryApi.md#userCurrentPutSubscription) | **PUT** /repos/{owner}/{repo}/subscription | Watch a repo
*UserApi* | [**createCurrentUserRepo**](docs/UserApi.md#createCurrentUserRepo) | **POST** /user/repos | Create a repository
*UserApi* | [**userAddEmail**](docs/UserApi.md#userAddEmail) | **POST** /user/emails | Add email addresses
*UserApi* | [**userCheckFollowing**](docs/UserApi.md#userCheckFollowing) | **GET** /users/{follower}/following/{followee} | Check if one user is following another user
*UserApi* | [**userCreateToken**](docs/UserApi.md#userCreateToken) | **POST** /users/{username}/tokens | Create an access token
*UserApi* | [**userCurrentCheckFollowing**](docs/UserApi.md#userCurrentCheckFollowing) | **GET** /user/following/{username} | Check whether a user is followed by the authenticated user
*UserApi* | [**userCurrentCheckStarring**](docs/UserApi.md#userCurrentCheckStarring) | **GET** /user/starred/{owner}/{repo} | Whether the authenticated is starring the repo
*UserApi* | [**userCurrentDeleteFollow**](docs/UserApi.md#userCurrentDeleteFollow) | **DELETE** /user/following/{username} | Unfollow a user
*UserApi* | [**userCurrentDeleteGPGKey**](docs/UserApi.md#userCurrentDeleteGPGKey) | **DELETE** /user/gpg_keys/{id} | Remove a GPG key
*UserApi* | [**userCurrentDeleteKey**](docs/UserApi.md#userCurrentDeleteKey) | **DELETE** /user/keys/{id} | Delete a public key
*UserApi* | [**userCurrentDeleteStar**](docs/UserApi.md#userCurrentDeleteStar) | **DELETE** /user/starred/{owner}/{repo} | Unstar the given repo
*UserApi* | [**userCurrentGetGPGKey**](docs/UserApi.md#userCurrentGetGPGKey) | **GET** /user/gpg_keys/{id} | Get a GPG key
*UserApi* | [**userCurrentGetKey**](docs/UserApi.md#userCurrentGetKey) | **GET** /user/keys/{id} | Get a public key
*UserApi* | [**userCurrentListFollowers**](docs/UserApi.md#userCurrentListFollowers) | **GET** /user/followers | List the authenticated user&#39;s followers
*UserApi* | [**userCurrentListFollowing**](docs/UserApi.md#userCurrentListFollowing) | **GET** /user/following | List the users that the authenticated user is following
*UserApi* | [**userCurrentListGPGKeys**](docs/UserApi.md#userCurrentListGPGKeys) | **GET** /user/gpg_keys | List the authenticated user&#39;s GPG keys
*UserApi* | [**userCurrentListKeys**](docs/UserApi.md#userCurrentListKeys) | **GET** /user/keys | List the authenticated user&#39;s public keys
*UserApi* | [**userCurrentListRepos**](docs/UserApi.md#userCurrentListRepos) | **GET** /user/repos | List the repos that the authenticated user owns or has access to
*UserApi* | [**userCurrentListStarred**](docs/UserApi.md#userCurrentListStarred) | **GET** /user/starred | The repos that the authenticated user has starred
*UserApi* | [**userCurrentListSubscriptions**](docs/UserApi.md#userCurrentListSubscriptions) | **GET** /user/subscriptions | List repositories watched by the authenticated user
*UserApi* | [**userCurrentPostGPGKey**](docs/UserApi.md#userCurrentPostGPGKey) | **POST** /user/gpg_keys | Create a GPG key
*UserApi* | [**userCurrentPostKey**](docs/UserApi.md#userCurrentPostKey) | **POST** /user/keys | Create a public key
*UserApi* | [**userCurrentPutFollow**](docs/UserApi.md#userCurrentPutFollow) | **PUT** /user/following/{username} | Follow a user
*UserApi* | [**userCurrentPutStar**](docs/UserApi.md#userCurrentPutStar) | **PUT** /user/starred/{owner}/{repo} | Star the given repo
*UserApi* | [**userCurrentTrackedTimes**](docs/UserApi.md#userCurrentTrackedTimes) | **GET** /user/times | List the current user&#39;s tracked times
*UserApi* | [**userDeleteAccessToken**](docs/UserApi.md#userDeleteAccessToken) | **DELETE** /users/{username}/tokens/{token} | delete an access token
*UserApi* | [**userDeleteEmail**](docs/UserApi.md#userDeleteEmail) | **DELETE** /user/emails | Delete email addresses
*UserApi* | [**userGet**](docs/UserApi.md#userGet) | **GET** /users/{username} | Get a user
*UserApi* | [**userGetCurrent**](docs/UserApi.md#userGetCurrent) | **GET** /user | Get the authenticated user
*UserApi* | [**userGetTokens**](docs/UserApi.md#userGetTokens) | **GET** /users/{username}/tokens | List the authenticated user&#39;s access tokens
*UserApi* | [**userListEmails**](docs/UserApi.md#userListEmails) | **GET** /user/emails | List the authenticated user&#39;s email addresses
*UserApi* | [**userListFollowers**](docs/UserApi.md#userListFollowers) | **GET** /users/{username}/followers | List the given user&#39;s followers
*UserApi* | [**userListFollowing**](docs/UserApi.md#userListFollowing) | **GET** /users/{username}/following | List the users that the given user is following
*UserApi* | [**userListGPGKeys**](docs/UserApi.md#userListGPGKeys) | **GET** /users/{username}/gpg_keys | List the given user&#39;s GPG keys
*UserApi* | [**userListKeys**](docs/UserApi.md#userListKeys) | **GET** /users/{username}/keys | List the given user&#39;s public keys
*UserApi* | [**userListRepos**](docs/UserApi.md#userListRepos) | **GET** /users/{username}/repos | List the repos owned by the given user
*UserApi* | [**userListStarred**](docs/UserApi.md#userListStarred) | **GET** /users/{username}/starred | The repos that the given user has starred
*UserApi* | [**userListSubscriptions**](docs/UserApi.md#userListSubscriptions) | **GET** /users/{username}/subscriptions | List the repositories watched by a user
*UserApi* | [**userSearch**](docs/UserApi.md#userSearch) | **GET** /users/search | Search for users
*UserApi* | [**userTrackedTimes**](docs/UserApi.md#userTrackedTimes) | **GET** /repos/{owner}/{repo}/times/{user} | List a user&#39;s tracked times in a repo


## Documentation for Models

 - [AddCollaboratorOption](docs/AddCollaboratorOption.md)
 - [AddTimeOption](docs/AddTimeOption.md)
 - [Attachment](docs/Attachment.md)
 - [Branch](docs/Branch.md)
 - [Comment](docs/Comment.md)
 - [CreateEmailOption](docs/CreateEmailOption.md)
 - [CreateForkOption](docs/CreateForkOption.md)
 - [CreateGPGKeyOption](docs/CreateGPGKeyOption.md)
 - [CreateHookOption](docs/CreateHookOption.md)
 - [CreateIssueCommentOption](docs/CreateIssueCommentOption.md)
 - [CreateIssueOption](docs/CreateIssueOption.md)
 - [CreateKeyOption](docs/CreateKeyOption.md)
 - [CreateLabelOption](docs/CreateLabelOption.md)
 - [CreateMilestoneOption](docs/CreateMilestoneOption.md)
 - [CreateOrgOption](docs/CreateOrgOption.md)
 - [CreatePullRequestOption](docs/CreatePullRequestOption.md)
 - [CreateReleaseOption](docs/CreateReleaseOption.md)
 - [CreateRepoOption](docs/CreateRepoOption.md)
 - [CreateStatusOption](docs/CreateStatusOption.md)
 - [CreateTeamOption](docs/CreateTeamOption.md)
 - [CreateUserOption](docs/CreateUserOption.md)
 - [DeleteEmailOption](docs/DeleteEmailOption.md)
 - [DeployKey](docs/DeployKey.md)
 - [EditAttachmentOptions](docs/EditAttachmentOptions.md)
 - [EditDeadlineOption](docs/EditDeadlineOption.md)
 - [EditHookOption](docs/EditHookOption.md)
 - [EditIssueCommentOption](docs/EditIssueCommentOption.md)
 - [EditIssueOption](docs/EditIssueOption.md)
 - [EditLabelOption](docs/EditLabelOption.md)
 - [EditMilestoneOption](docs/EditMilestoneOption.md)
 - [EditOrgOption](docs/EditOrgOption.md)
 - [EditPullRequestOption](docs/EditPullRequestOption.md)
 - [EditReleaseOption](docs/EditReleaseOption.md)
 - [EditTeamOption](docs/EditTeamOption.md)
 - [EditUserOption](docs/EditUserOption.md)
 - [Email](docs/Email.md)
 - [GPGKey](docs/GPGKey.md)
 - [GPGKeyEmail](docs/GPGKeyEmail.md)
 - [Issue](docs/Issue.md)
 - [IssueDeadline](docs/IssueDeadline.md)
 - [IssueLabelsOption](docs/IssueLabelsOption.md)
 - [Label](docs/Label.md)
 - [MarkdownOption](docs/MarkdownOption.md)
 - [MigrateRepoForm](docs/MigrateRepoForm.md)
 - [Milestone](docs/Milestone.md)
 - [Organization](docs/Organization.md)
 - [PRBranchInfo](docs/PRBranchInfo.md)
 - [PayloadCommit](docs/PayloadCommit.md)
 - [PayloadCommitVerification](docs/PayloadCommitVerification.md)
 - [PayloadUser](docs/PayloadUser.md)
 - [Permission](docs/Permission.md)
 - [PublicKey](docs/PublicKey.md)
 - [PullRequest](docs/PullRequest.md)
 - [PullRequestMeta](docs/PullRequestMeta.md)
 - [Release](docs/Release.md)
 - [Repository](docs/Repository.md)
 - [SearchResults](docs/SearchResults.md)
 - [ServerVersion](docs/ServerVersion.md)
 - [Status](docs/Status.md)
 - [Team](docs/Team.md)
 - [TrackedTime](docs/TrackedTime.md)
 - [User](docs/User.md)
 - [WatchInfo](docs/WatchInfo.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### AccessToken

- **Type**: API key
- **API key parameter name**: access_token
- **Location**: URL query string

### AuthorizationHeaderToken

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### BasicAuth

- **Type**: HTTP basic authentication

### Token

- **Type**: API key
- **API key parameter name**: token
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



