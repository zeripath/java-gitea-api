
# ContentsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**FileLinksResponse**](FileLinksResponse.md) |  |  [optional]
**content** | **String** | &#x60;content&#x60; is populated when &#x60;type&#x60; is &#x60;file&#x60;, otherwise null |  [optional]
**downloadUrl** | **String** |  |  [optional]
**encoding** | **String** | &#x60;encoding&#x60; is populated when &#x60;type&#x60; is &#x60;file&#x60;, otherwise null |  [optional]
**gitUrl** | **String** |  |  [optional]
**htmlUrl** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**path** | **String** |  |  [optional]
**sha** | **String** |  |  [optional]
**size** | **Long** |  |  [optional]
**submoduleGitUrl** | **String** | &#x60;submodule_git_url&#x60; is populated when &#x60;type&#x60; is &#x60;submodule&#x60;, otherwise null |  [optional]
**target** | **String** | &#x60;target&#x60; is populated when &#x60;type&#x60; is &#x60;symlink&#x60;, otherwise null |  [optional]
**type** | **String** | &#x60;type&#x60; will be &#x60;file&#x60;, &#x60;dir&#x60;, &#x60;symlink&#x60;, or &#x60;submodule&#x60; |  [optional]
**url** | **String** |  |  [optional]



