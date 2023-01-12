/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.18.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.api;

import io.gitea.ApiException;
import io.gitea.model.NotificationCount;
import io.gitea.model.NotificationThread;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationApi
 */
@Ignore
public class NotificationApiTest {

    private final NotificationApi api = new NotificationApi();

    
    /**
     * List users&#39;s notification threads
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notifyGetListTest() throws ApiException {
        Boolean all = null;
        List<String> statusTypes = null;
        List<String> subjectType = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer page = null;
        Integer limit = null;
        List<NotificationThread> response = api.notifyGetList(all, statusTypes, subjectType, since, before, page, limit);

        // TODO: test validations
    }
    
    /**
     * List users&#39;s notification threads on a specific repo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notifyGetRepoListTest() throws ApiException {
        String owner = null;
        String repo = null;
        Boolean all = null;
        List<String> statusTypes = null;
        List<String> subjectType = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer page = null;
        Integer limit = null;
        List<NotificationThread> response = api.notifyGetRepoList(owner, repo, all, statusTypes, subjectType, since, before, page, limit);

        // TODO: test validations
    }
    
    /**
     * Get notification thread by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notifyGetThreadTest() throws ApiException {
        String id = null;
        NotificationThread response = api.notifyGetThread(id);

        // TODO: test validations
    }
    
    /**
     * Check if unread notifications exist
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notifyNewAvailableTest() throws ApiException {
        NotificationCount response = api.notifyNewAvailable();

        // TODO: test validations
    }
    
    /**
     * Mark notification threads as read, pinned or unread
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notifyReadListTest() throws ApiException {
        OffsetDateTime lastReadAt = null;
        String all = null;
        List<String> statusTypes = null;
        String toStatus = null;
        List<NotificationThread> response = api.notifyReadList(lastReadAt, all, statusTypes, toStatus);

        // TODO: test validations
    }
    
    /**
     * Mark notification threads as read, pinned or unread on a specific repo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notifyReadRepoListTest() throws ApiException {
        String owner = null;
        String repo = null;
        String all = null;
        List<String> statusTypes = null;
        String toStatus = null;
        OffsetDateTime lastReadAt = null;
        List<NotificationThread> response = api.notifyReadRepoList(owner, repo, all, statusTypes, toStatus, lastReadAt);

        // TODO: test validations
    }
    
    /**
     * Mark notification thread as read by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notifyReadThreadTest() throws ApiException {
        String id = null;
        String toStatus = null;
        NotificationThread response = api.notifyReadThread(id, toStatus);

        // TODO: test validations
    }
    
}
