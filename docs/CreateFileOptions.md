
# CreateFileOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**Identity**](Identity.md) |  |  [optional]
**branch** | **String** | branch (optional) to base this file from. if not given, the default branch is used |  [optional]
**committer** | [**Identity**](Identity.md) |  |  [optional]
**content** | **String** | content must be base64 encoded | 
**dates** | [**CommitDateOptions**](CommitDateOptions.md) |  |  [optional]
**message** | **String** | message (optional) for the commit of this file. if not supplied, a default message will be used |  [optional]
**newBranch** | **String** | new_branch (optional) will make a new branch from &#x60;branch&#x60; before creating the file |  [optional]
**signoff** | **Boolean** | Add a Signed-off-by trailer by the committer at the end of the commit log message. |  [optional]



