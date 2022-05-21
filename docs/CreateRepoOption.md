
# CreateRepoOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoInit** | **Boolean** | Whether the repository should be auto-initialized? |  [optional]
**defaultBranch** | **String** | DefaultBranch of the repository (used when initializes and in template) |  [optional]
**description** | **String** | Description of the repository to create |  [optional]
**gitignores** | **String** | Gitignores to use |  [optional]
**issueLabels** | **String** | Label-Set to use |  [optional]
**license** | **String** | License to use |  [optional]
**name** | **String** | Name of the repository to create | 
**_private** | **Boolean** | Whether the repository is private |  [optional]
**readme** | **String** | Readme of the repository to create |  [optional]
**template** | **Boolean** | Whether the repository is template |  [optional]
**trustModel** | [**TrustModelEnum**](#TrustModelEnum) | TrustModel of the repository |  [optional]


<a name="TrustModelEnum"></a>
## Enum: TrustModelEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
COLLABORATOR | &quot;collaborator&quot;
COMMITTER | &quot;committer&quot;
COLLABORATORCOMMITTER | &quot;collaboratorcommitter&quot;



