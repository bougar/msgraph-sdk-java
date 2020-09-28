// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CommsOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Comms Operation Request Builder.
 */
public class CommsOperationRequestBuilder extends BaseRequestBuilder implements ICommsOperationRequestBuilder {

    /**
     * The request builder for the CommsOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CommsOperationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ICommsOperationRequest instance
     */
    public ICommsOperationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ICommsOperationRequest instance
     */
    public ICommsOperationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.CommsOperationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the CancelMediaProcessingOperation type
     */
    public ICancelMediaProcessingOperationRequestBuilder castToCancelMediaProcessingOperation() {
        return new CancelMediaProcessingOperationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cancelMediaProcessingOperation"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the InviteParticipantsOperation type
     */
    public IInviteParticipantsOperationRequestBuilder castToInviteParticipantsOperation() {
        return new InviteParticipantsOperationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.inviteParticipantsOperation"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the MuteParticipantOperation type
     */
    public IMuteParticipantOperationRequestBuilder castToMuteParticipantOperation() {
        return new MuteParticipantOperationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.muteParticipantOperation"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the PlayPromptOperation type
     */
    public IPlayPromptOperationRequestBuilder castToPlayPromptOperation() {
        return new PlayPromptOperationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.playPromptOperation"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the RecordOperation type
     */
    public IRecordOperationRequestBuilder castToRecordOperation() {
        return new RecordOperationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.recordOperation"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the SubscribeToToneOperation type
     */
    public ISubscribeToToneOperationRequestBuilder castToSubscribeToToneOperation() {
        return new SubscribeToToneOperationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.subscribeToToneOperation"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the UnmuteParticipantOperation type
     */
    public IUnmuteParticipantOperationRequestBuilder castToUnmuteParticipantOperation() {
        return new UnmuteParticipantOperationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unmuteParticipantOperation"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the UpdateRecordingStatusOperation type
     */
    public IUpdateRecordingStatusOperationRequestBuilder castToUpdateRecordingStatusOperation() {
        return new UpdateRecordingStatusOperationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateRecordingStatusOperation"), getClient(), null);
    }
}
