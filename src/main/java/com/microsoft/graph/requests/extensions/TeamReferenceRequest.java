// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.generated.ClonableTeamParts;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.requests.extensions.IChannelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChannelRequestBuilder;
import com.microsoft.graph.requests.extensions.ChannelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChannelRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAsyncOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAsyncOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAsyncOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAsyncOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IScheduleRequestBuilder;
import com.microsoft.graph.requests.extensions.ScheduleRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Reference Request.
 */
public class TeamReferenceRequest extends BaseRequest implements ITeamReferenceRequest {

    /**
     * The request for the Team
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Team.class);
    }

    public void delete(final ICallback<? super Team> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public Team delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TeamReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TeamReferenceRequest)this;
    }
    /**
     * Puts the Team
     *
     * @param srcTeam the Team reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Team srcTeam, final ICallback<? super Team> callback) {
        send(HttpMethod.PUT, callback, srcTeam);
    }

    /**
     * Puts the Team
     *
     * @param srcTeam the Team reference to PUT
     * @return the Team
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Team put(Team srcTeam) throws ClientException {
        return send(HttpMethod.PUT, srcTeam);
    }
}
