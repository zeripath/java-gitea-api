
# MergePullRequestOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_do** | [**DoEnum**](#DoEnum) |  | 
**mergeCommitID** | **String** |  |  [optional]
**mergeMessageField** | **String** |  |  [optional]
**mergeTitleField** | **String** |  |  [optional]
**deleteBranchAfterMerge** | **Boolean** |  |  [optional]
**forceMerge** | **Boolean** |  |  [optional]
**headCommitId** | **String** |  |  [optional]


<a name="DoEnum"></a>
## Enum: DoEnum
Name | Value
---- | -----
MERGE | &quot;merge&quot;
REBASE | &quot;rebase&quot;
REBASE_MERGE | &quot;rebase-merge&quot;
SQUASH | &quot;squash&quot;
MANUALLY_MERGED | &quot;manually-merged&quot;



