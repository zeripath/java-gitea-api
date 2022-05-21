
# Team

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canCreateOrgRepo** | **Boolean** |  |  [optional]
**description** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**includesAllRepositories** | **Boolean** |  |  [optional]
**name** | **String** |  |  [optional]
**organization** | [**Organization**](Organization.md) |  |  [optional]
**permission** | [**PermissionEnum**](#PermissionEnum) |  |  [optional]
**units** | **List&lt;String&gt;** |  |  [optional]
**unitsMap** | **Map&lt;String, String&gt;** |  |  [optional]


<a name="PermissionEnum"></a>
## Enum: PermissionEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
READ | &quot;read&quot;
WRITE | &quot;write&quot;
ADMIN | &quot;admin&quot;
OWNER | &quot;owner&quot;



