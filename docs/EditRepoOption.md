
# EditRepoOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowMergeCommits** | **Boolean** | either &#x60;true&#x60; to allow merging pull requests with a merge commit, or &#x60;false&#x60; to prevent merging pull requests with merge commits. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;. |  [optional]
**allowRebase** | **Boolean** | either &#x60;true&#x60; to allow rebase-merging pull requests, or &#x60;false&#x60; to prevent rebase-merging. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;. |  [optional]
**allowRebaseExplicit** | **Boolean** | either &#x60;true&#x60; to allow rebase with explicit merge commits (--no-ff), or &#x60;false&#x60; to prevent rebase with explicit merge commits. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;. |  [optional]
**allowSquashMerge** | **Boolean** | either &#x60;true&#x60; to allow squash-merging pull requests, or &#x60;false&#x60; to prevent squash-merging. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;. |  [optional]
**archived** | **Boolean** | set to &#x60;true&#x60; to archive this repository. |  [optional]
**defaultBranch** | **String** | sets the default branch for this repository. |  [optional]
**description** | **String** | a short description of the repository. |  [optional]
**externalTracker** | [**ExternalTracker**](ExternalTracker.md) |  |  [optional]
**externalWiki** | [**ExternalWiki**](ExternalWiki.md) |  |  [optional]
**hasIssues** | **Boolean** | either &#x60;true&#x60; to enable issues for this repository or &#x60;false&#x60; to disable them. |  [optional]
**hasProjects** | **Boolean** | either &#x60;true&#x60; to enable project unit, or &#x60;false&#x60; to disable them. |  [optional]
**hasPullRequests** | **Boolean** | either &#x60;true&#x60; to allow pull requests, or &#x60;false&#x60; to prevent pull request. |  [optional]
**hasWiki** | **Boolean** | either &#x60;true&#x60; to enable the wiki for this repository or &#x60;false&#x60; to disable it. |  [optional]
**ignoreWhitespaceConflicts** | **Boolean** | either &#x60;true&#x60; to ignore whitespace for conflicts, or &#x60;false&#x60; to not ignore whitespace. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;. |  [optional]
**internalTracker** | [**InternalTracker**](InternalTracker.md) |  |  [optional]
**name** | **String** | name of the repository |  [optional]
**_private** | **Boolean** | either &#x60;true&#x60; to make the repository private or &#x60;false&#x60; to make it public. Note: you will get a 422 error if the organization restricts changing repository visibility to organization owners and a non-owner tries to change the value of private. |  [optional]
**template** | **Boolean** | either &#x60;true&#x60; to make this repository a template or &#x60;false&#x60; to make it a normal repository |  [optional]
**website** | **String** | a URL with more information about the repository. |  [optional]



