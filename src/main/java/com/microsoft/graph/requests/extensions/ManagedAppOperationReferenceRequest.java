// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppOperation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Operation Reference Request.
 */
public class ManagedAppOperationReferenceRequest extends BaseRequest implements IManagedAppOperationReferenceRequest {

    /**
     * The request for the ManagedAppOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppOperationReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppOperation.class);
    }

    public void delete(final ICallback<? super ManagedAppOperation> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ManagedAppOperation delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedAppOperationReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedAppOperationReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedAppOperationReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedAppOperationReferenceRequest)this;
    }
    /**
     * Puts the ManagedAppOperation
     *
     * @param srcManagedAppOperation the ManagedAppOperation reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagedAppOperation srcManagedAppOperation, final ICallback<? super ManagedAppOperation> callback) {
        send(HttpMethod.PUT, callback, srcManagedAppOperation);
    }

    /**
     * Puts the ManagedAppOperation
     *
     * @param srcManagedAppOperation the ManagedAppOperation reference to PUT
     * @return the ManagedAppOperation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagedAppOperation put(ManagedAppOperation srcManagedAppOperation) throws ClientException {
        return send(HttpMethod.PUT, srcManagedAppOperation);
    }
}
