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
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAsyncOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAsyncOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IScheduleRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Team Reference Request.
 */
public interface ITeamReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super Team> callback);

    Team delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamReferenceRequest expand(final String value);

    /**
     * Puts the Team
     *
     * @param srcTeam the Team to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Team srcTeam, final ICallback<? super Team> callback);

    /**
     * Puts the Team
     *
     * @param srcTeam the Team to PUT
     * @return the Team
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Team put(Team srcTeam) throws ClientException;
}
