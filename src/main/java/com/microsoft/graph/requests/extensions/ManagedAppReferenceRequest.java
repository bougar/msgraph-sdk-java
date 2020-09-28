// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Reference Request.
 */
public class ManagedAppReferenceRequest extends BaseRequest implements IManagedAppReferenceRequest {

    /**
     * The request for the ManagedApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedApp.class);
    }

    public void delete(final ICallback<? super ManagedApp> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ManagedApp delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedAppReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedAppReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedAppReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedAppReferenceRequest)this;
    }
    /**
     * Puts the ManagedApp
     *
     * @param srcManagedApp the ManagedApp reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagedApp srcManagedApp, final ICallback<? super ManagedApp> callback) {
        send(HttpMethod.PUT, callback, srcManagedApp);
    }

    /**
     * Puts the ManagedApp
     *
     * @param srcManagedApp the ManagedApp reference to PUT
     * @return the ManagedApp
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagedApp put(ManagedApp srcManagedApp) throws ClientException {
        return send(HttpMethod.PUT, srcManagedApp);
    }
}
