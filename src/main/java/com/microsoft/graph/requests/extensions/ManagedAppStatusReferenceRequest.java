// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Status Reference Request.
 */
public class ManagedAppStatusReferenceRequest extends BaseRequest implements IManagedAppStatusReferenceRequest {

    /**
     * The request for the ManagedAppStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppStatusReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppStatus.class);
    }

    public void delete(final ICallback<? super ManagedAppStatus> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ManagedAppStatus delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedAppStatusReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedAppStatusReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedAppStatusReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedAppStatusReferenceRequest)this;
    }
    /**
     * Puts the ManagedAppStatus
     *
     * @param srcManagedAppStatus the ManagedAppStatus reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagedAppStatus srcManagedAppStatus, final ICallback<? super ManagedAppStatus> callback) {
        send(HttpMethod.PUT, callback, srcManagedAppStatus);
    }

    /**
     * Puts the ManagedAppStatus
     *
     * @param srcManagedAppStatus the ManagedAppStatus reference to PUT
     * @return the ManagedAppStatus
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagedAppStatus put(ManagedAppStatus srcManagedAppStatus) throws ClientException {
        return send(HttpMethod.PUT, srcManagedAppStatus);
    }
}
