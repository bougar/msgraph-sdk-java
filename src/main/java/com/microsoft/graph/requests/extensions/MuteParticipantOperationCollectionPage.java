// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;
import com.microsoft.graph.requests.extensions.IMuteParticipantOperationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MuteParticipantOperationCollectionPage;
import com.microsoft.graph.requests.extensions.MuteParticipantOperationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mute Participant Operation Collection Page.
 */
public class MuteParticipantOperationCollectionPage extends BaseCollectionPage<MuteParticipantOperation, IMuteParticipantOperationCollectionRequestBuilder> implements IMuteParticipantOperationCollectionPage {

    /**
     * A collection page for MuteParticipantOperation
     *
     * @param response the serialized MuteParticipantOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MuteParticipantOperationCollectionPage(final MuteParticipantOperationCollectionResponse response, final IMuteParticipantOperationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
