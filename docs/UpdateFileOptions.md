
# UpdateFileOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**Identity**](Identity.md) |  |  [optional]
**branch** | **String** | branch (optional) to base this file from. if not given, the default branch is used |  [optional]
**committer** | [**Identity**](Identity.md) |  |  [optional]
**content** | **String** | content must be base64 encoded | 
**fromPath** | **String** | from_path (optional) is the path of the original file which will be moved/renamed to the path in the URL |  [optional]
**message** | **String** | message (optional) for the commit of this file. if not supplied, a default message will be used |  [optional]
**newBranch** | **String** | new_branch (optional) will make a new branch from &#x60;branch&#x60; before creating the file |  [optional]
**sha** | **String** | sha is the SHA for the file that already exists | 



