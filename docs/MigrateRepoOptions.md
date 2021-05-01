
# MigrateRepoOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authPassword** | **String** |  |  [optional]
**authToken** | **String** |  |  [optional]
**authUsername** | **String** |  |  [optional]
**cloneAddr** | **String** |  | 
**description** | **String** |  |  [optional]
**issues** | **Boolean** |  |  [optional]
**labels** | **Boolean** |  |  [optional]
**lfs** | **Boolean** |  |  [optional]
**lfsEndpoint** | **String** |  |  [optional]
**milestones** | **Boolean** |  |  [optional]
**mirror** | **Boolean** |  |  [optional]
**mirrorInterval** | **String** |  |  [optional]
**_private** | **Boolean** |  |  [optional]
**pullRequests** | **Boolean** |  |  [optional]
**releases** | **Boolean** |  |  [optional]
**repoName** | **String** |  | 
**repoOwner** | **String** | Name of User or Organisation who will own Repo after migration |  [optional]
**service** | [**ServiceEnum**](#ServiceEnum) |  |  [optional]
**uid** | **Long** | deprecated (only for backwards compatibility) |  [optional]
**wiki** | **Boolean** |  |  [optional]


<a name="ServiceEnum"></a>
## Enum: ServiceEnum
Name | Value
---- | -----
GIT | &quot;git&quot;
GITHUB | &quot;github&quot;
GITEA | &quot;gitea&quot;
GITLAB | &quot;gitlab&quot;



