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
import io.gitea.model.AddTimeOption;
import io.gitea.model.Comment;
import io.gitea.model.CreateIssueCommentOption;
import io.gitea.model.CreateIssueOption;
import io.gitea.model.CreateLabelOption;
import io.gitea.model.CreateMilestoneOption;
import io.gitea.model.EditDeadlineOption;
import io.gitea.model.EditIssueCommentOption;
import io.gitea.model.EditIssueOption;
import io.gitea.model.EditLabelOption;
import io.gitea.model.EditMilestoneOption;
import io.gitea.model.EditReactionOption;
import io.gitea.model.Issue;
import io.gitea.model.IssueDeadline;
import io.gitea.model.IssueLabelsOption;
import io.gitea.model.Label;
import io.gitea.model.Milestone;
import org.threeten.bp.OffsetDateTime;
import io.gitea.model.Reaction;
import io.gitea.model.TimelineComment;
import io.gitea.model.TrackedTime;
import io.gitea.model.User;
import io.gitea.model.WatchInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueApi
 */
@Ignore
public class IssueApiTest {

    private final IssueApi api = new IssueApi();

    
    /**
     * Add a label to an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueAddLabelTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        IssueLabelsOption body = null;
        List<Label> response = api.issueAddLabel(owner, repo, index, body);

        // TODO: test validations
    }
    
    /**
     * Subscribe user to issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueAddSubscriptionTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        String user = null;
        api.issueAddSubscription(owner, repo, index, user);

        // TODO: test validations
    }
    
    /**
     * Add tracked time to a issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueAddTimeTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        AddTimeOption body = null;
        TrackedTime response = api.issueAddTime(owner, repo, index, body);

        // TODO: test validations
    }
    
    /**
     * Check if user is subscribed to an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCheckSubscriptionTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        WatchInfo response = api.issueCheckSubscription(owner, repo, index);

        // TODO: test validations
    }
    
    /**
     * Remove all labels from an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueClearLabelsTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        api.issueClearLabels(owner, repo, index);

        // TODO: test validations
    }
    
    /**
     * Add a comment to an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCreateCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        CreateIssueCommentOption body = null;
        Comment response = api.issueCreateComment(owner, repo, index, body);

        // TODO: test validations
    }
    
    /**
     * Create an issue. If using deadline only the date will be taken into account, and time of day ignored.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCreateIssueTest() throws ApiException {
        String owner = null;
        String repo = null;
        CreateIssueOption body = null;
        Issue response = api.issueCreateIssue(owner, repo, body);

        // TODO: test validations
    }
    
    /**
     * Create a label
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCreateLabelTest() throws ApiException {
        String owner = null;
        String repo = null;
        CreateLabelOption body = null;
        Label response = api.issueCreateLabel(owner, repo, body);

        // TODO: test validations
    }
    
    /**
     * Create a milestone
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCreateMilestoneTest() throws ApiException {
        String owner = null;
        String repo = null;
        CreateMilestoneOption body = null;
        Milestone response = api.issueCreateMilestone(owner, repo, body);

        // TODO: test validations
    }
    
    /**
     * Delete an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDeleteTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        api.issueDelete(owner, repo, index);

        // TODO: test validations
    }
    
    /**
     * Delete a comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDeleteCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long id = null;
        api.issueDeleteComment(owner, repo, id);

        // TODO: test validations
    }
    
    /**
     * Delete a comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDeleteCommentDeprecatedTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer index = null;
        Long id = null;
        api.issueDeleteCommentDeprecated(owner, repo, index, id);

        // TODO: test validations
    }
    
    /**
     * Remove a reaction from a comment of an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDeleteCommentReactionTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long id = null;
        EditReactionOption content = null;
        api.issueDeleteCommentReaction(owner, repo, id, content);

        // TODO: test validations
    }
    
    /**
     * Remove a reaction from an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDeleteIssueReactionTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        EditReactionOption content = null;
        api.issueDeleteIssueReaction(owner, repo, index, content);

        // TODO: test validations
    }
    
    /**
     * Delete a label
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDeleteLabelTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long id = null;
        api.issueDeleteLabel(owner, repo, id);

        // TODO: test validations
    }
    
    /**
     * Delete a milestone
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDeleteMilestoneTest() throws ApiException {
        String owner = null;
        String repo = null;
        String id = null;
        api.issueDeleteMilestone(owner, repo, id);

        // TODO: test validations
    }
    
    /**
     * Delete an issue&#39;s existing stopwatch.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDeleteStopWatchTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        api.issueDeleteStopWatch(owner, repo, index);

        // TODO: test validations
    }
    
    /**
     * Unsubscribe user from issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDeleteSubscriptionTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        String user = null;
        api.issueDeleteSubscription(owner, repo, index, user);

        // TODO: test validations
    }
    
    /**
     * Delete specific tracked time
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueDeleteTimeTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        Long id = null;
        api.issueDeleteTime(owner, repo, index, id);

        // TODO: test validations
    }
    
    /**
     * Edit a comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueEditCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long id = null;
        EditIssueCommentOption body = null;
        Comment response = api.issueEditComment(owner, repo, id, body);

        // TODO: test validations
    }
    
    /**
     * Edit a comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueEditCommentDeprecatedTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer index = null;
        Long id = null;
        EditIssueCommentOption body = null;
        Comment response = api.issueEditCommentDeprecated(owner, repo, index, id, body);

        // TODO: test validations
    }
    
    /**
     * Edit an issue. If using deadline only the date will be taken into account, and time of day ignored.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueEditIssueTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        EditIssueOption body = null;
        Issue response = api.issueEditIssue(owner, repo, index, body);

        // TODO: test validations
    }
    
    /**
     * Set an issue deadline. If set to null, the deadline is deleted. If using deadline only the date will be taken into account, and time of day ignored.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueEditIssueDeadlineTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        EditDeadlineOption body = null;
        IssueDeadline response = api.issueEditIssueDeadline(owner, repo, index, body);

        // TODO: test validations
    }
    
    /**
     * Update a label
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueEditLabelTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long id = null;
        EditLabelOption body = null;
        Label response = api.issueEditLabel(owner, repo, id, body);

        // TODO: test validations
    }
    
    /**
     * Update a milestone
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueEditMilestoneTest() throws ApiException {
        String owner = null;
        String repo = null;
        String id = null;
        EditMilestoneOption body = null;
        Milestone response = api.issueEditMilestone(owner, repo, id, body);

        // TODO: test validations
    }
    
    /**
     * Get a comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueGetCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long id = null;
        Comment response = api.issueGetComment(owner, repo, id);

        // TODO: test validations
    }
    
    /**
     * Get a list of reactions from a comment of an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueGetCommentReactionsTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long id = null;
        List<Reaction> response = api.issueGetCommentReactions(owner, repo, id);

        // TODO: test validations
    }
    
    /**
     * List all comments on an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueGetCommentsTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        List<Comment> response = api.issueGetComments(owner, repo, index, since, before);

        // TODO: test validations
    }
    
    /**
     * List all comments and events on an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueGetCommentsAndTimelineTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        OffsetDateTime since = null;
        Integer page = null;
        Integer limit = null;
        OffsetDateTime before = null;
        List<TimelineComment> response = api.issueGetCommentsAndTimeline(owner, repo, index, since, page, limit, before);

        // TODO: test validations
    }
    
    /**
     * Get an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueGetIssueTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        Issue response = api.issueGetIssue(owner, repo, index);

        // TODO: test validations
    }
    
    /**
     * Get a list reactions of an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueGetIssueReactionsTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        Integer page = null;
        Integer limit = null;
        List<Reaction> response = api.issueGetIssueReactions(owner, repo, index, page, limit);

        // TODO: test validations
    }
    
    /**
     * Get a single label
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueGetLabelTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long id = null;
        Label response = api.issueGetLabel(owner, repo, id);

        // TODO: test validations
    }
    
    /**
     * Get an issue&#39;s labels
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueGetLabelsTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        List<Label> response = api.issueGetLabels(owner, repo, index);

        // TODO: test validations
    }
    
    /**
     * Get a milestone
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueGetMilestoneTest() throws ApiException {
        String owner = null;
        String repo = null;
        String id = null;
        Milestone response = api.issueGetMilestone(owner, repo, id);

        // TODO: test validations
    }
    
    /**
     * Get all of a repository&#39;s opened milestones
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueGetMilestonesListTest() throws ApiException {
        String owner = null;
        String repo = null;
        String state = null;
        String name = null;
        Integer page = null;
        Integer limit = null;
        List<Milestone> response = api.issueGetMilestonesList(owner, repo, state, name, page, limit);

        // TODO: test validations
    }
    
    /**
     * List all comments in a repository
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueGetRepoCommentsTest() throws ApiException {
        String owner = null;
        String repo = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer page = null;
        Integer limit = null;
        List<Comment> response = api.issueGetRepoComments(owner, repo, since, before, page, limit);

        // TODO: test validations
    }
    
    /**
     * List a repository&#39;s issues
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueListIssuesTest() throws ApiException {
        String owner = null;
        String repo = null;
        String state = null;
        String labels = null;
        String q = null;
        String type = null;
        String milestones = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        String createdBy = null;
        String assignedBy = null;
        String mentionedBy = null;
        Integer page = null;
        Integer limit = null;
        List<Issue> response = api.issueListIssues(owner, repo, state, labels, q, type, milestones, since, before, createdBy, assignedBy, mentionedBy, page, limit);

        // TODO: test validations
    }
    
    /**
     * Get all of a repository&#39;s labels
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueListLabelsTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer page = null;
        Integer limit = null;
        List<Label> response = api.issueListLabels(owner, repo, page, limit);

        // TODO: test validations
    }
    
    /**
     * Add a reaction to a comment of an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issuePostCommentReactionTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long id = null;
        EditReactionOption content = null;
        Reaction response = api.issuePostCommentReaction(owner, repo, id, content);

        // TODO: test validations
    }
    
    /**
     * Add a reaction to an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issuePostIssueReactionTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        EditReactionOption content = null;
        Reaction response = api.issuePostIssueReaction(owner, repo, index, content);

        // TODO: test validations
    }
    
    /**
     * Remove a label from an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueRemoveLabelTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        Long id = null;
        api.issueRemoveLabel(owner, repo, index, id);

        // TODO: test validations
    }
    
    /**
     * Replace an issue&#39;s labels
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueReplaceLabelsTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        IssueLabelsOption body = null;
        List<Label> response = api.issueReplaceLabels(owner, repo, index, body);

        // TODO: test validations
    }
    
    /**
     * Reset a tracked time of an issue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueResetTimeTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        api.issueResetTime(owner, repo, index);

        // TODO: test validations
    }
    
    /**
     * Search for issues across the repositories that the user has access to
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueSearchIssuesTest() throws ApiException {
        String state = null;
        String labels = null;
        String milestones = null;
        String q = null;
        Long priorityRepoId = null;
        String type = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Boolean assigned = null;
        Boolean created = null;
        Boolean mentioned = null;
        Boolean reviewRequested = null;
        String owner = null;
        String team = null;
        Integer page = null;
        Integer limit = null;
        List<Issue> response = api.issueSearchIssues(state, labels, milestones, q, priorityRepoId, type, since, before, assigned, created, mentioned, reviewRequested, owner, team, page, limit);

        // TODO: test validations
    }
    
    /**
     * Start stopwatch on an issue.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueStartStopWatchTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        api.issueStartStopWatch(owner, repo, index);

        // TODO: test validations
    }
    
    /**
     * Stop an issue&#39;s existing stopwatch.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueStopStopWatchTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        api.issueStopStopWatch(owner, repo, index);

        // TODO: test validations
    }
    
    /**
     * Get users who subscribed on an issue.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueSubscriptionsTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        Integer page = null;
        Integer limit = null;
        List<User> response = api.issueSubscriptions(owner, repo, index, page, limit);

        // TODO: test validations
    }
    
    /**
     * List an issue&#39;s tracked times
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueTrackedTimesTest() throws ApiException {
        String owner = null;
        String repo = null;
        Long index = null;
        String user = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer page = null;
        Integer limit = null;
        List<TrackedTime> response = api.issueTrackedTimes(owner, repo, index, user, since, before, page, limit);

        // TODO: test validations
    }
    
}
