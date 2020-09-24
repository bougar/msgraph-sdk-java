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
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Play Prompt Operation Request.
 */
public class PlayPromptOperationRequest extends BaseRequest implements IPlayPromptOperationRequest {
	
    /**
     * The request for the PlayPromptOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlayPromptOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlayPromptOperation.class);
    }

    /**
     * Gets the PlayPromptOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PlayPromptOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlayPromptOperation from the service
     *
     * @return the PlayPromptOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlayPromptOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PlayPromptOperation> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlayPromptOperation with a source
     *
     * @param sourcePlayPromptOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlayPromptOperation sourcePlayPromptOperation, final ICallback<? super PlayPromptOperation> callback) {
        send(HttpMethod.PATCH, callback, sourcePlayPromptOperation);
    }

    /**
     * Patches this PlayPromptOperation with a source
     *
     * @param sourcePlayPromptOperation the source object with updates
     * @return the updated PlayPromptOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlayPromptOperation patch(final PlayPromptOperation sourcePlayPromptOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlayPromptOperation);
    }

    /**
     * Creates a PlayPromptOperation with a new object
     *
     * @param newPlayPromptOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlayPromptOperation newPlayPromptOperation, final ICallback<? super PlayPromptOperation> callback) {
        send(HttpMethod.POST, callback, newPlayPromptOperation);
    }

    /**
     * Creates a PlayPromptOperation with a new object
     *
     * @param newPlayPromptOperation the new object to create
     * @return the created PlayPromptOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlayPromptOperation post(final PlayPromptOperation newPlayPromptOperation) throws ClientException {
        return send(HttpMethod.POST, newPlayPromptOperation);
    }

    /**
     * Creates a PlayPromptOperation with a new object
     *
     * @param newPlayPromptOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PlayPromptOperation newPlayPromptOperation, final ICallback<? super PlayPromptOperation> callback) {
        send(HttpMethod.PUT, callback, newPlayPromptOperation);
    }

    /**
     * Creates a PlayPromptOperation with a new object
     *
     * @param newPlayPromptOperation the object to create/update
     * @return the created PlayPromptOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlayPromptOperation put(final PlayPromptOperation newPlayPromptOperation) throws ClientException {
        return send(HttpMethod.PUT, newPlayPromptOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlayPromptOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlayPromptOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlayPromptOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlayPromptOperationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IPlayPromptOperationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (PlayPromptOperationRequest)this;
     }

}

