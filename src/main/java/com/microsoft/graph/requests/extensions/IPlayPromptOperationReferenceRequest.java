// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlayPromptOperation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.PlayPromptOperation;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Play Prompt Operation Reference Request.
 */
public interface IPlayPromptOperationReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super PlayPromptOperation> callback);

    PlayPromptOperation delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlayPromptOperationReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlayPromptOperationReferenceRequest expand(final String value);

    /**
     * Puts the PlayPromptOperation
     *
     * @param srcPlayPromptOperation the PlayPromptOperation to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(PlayPromptOperation srcPlayPromptOperation, final ICallback<? super PlayPromptOperation> callback);

    /**
     * Puts the PlayPromptOperation
     *
     * @param srcPlayPromptOperation the PlayPromptOperation to PUT
     * @return the PlayPromptOperation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    PlayPromptOperation put(PlayPromptOperation srcPlayPromptOperation) throws ClientException;
}
