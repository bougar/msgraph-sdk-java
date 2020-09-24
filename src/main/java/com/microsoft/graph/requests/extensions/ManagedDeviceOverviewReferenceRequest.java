// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceOverview;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Overview Reference Request.
 */
public class ManagedDeviceOverviewReferenceRequest extends BaseRequest implements IManagedDeviceOverviewReferenceRequest {

    /**
     * The request for the ManagedDeviceOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceOverviewReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceOverview.class);
    }

    public void delete(final ICallback<? super ManagedDeviceOverview> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ManagedDeviceOverview delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceOverviewReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedDeviceOverviewReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceOverviewReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedDeviceOverviewReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IManagedDeviceOverviewReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ManagedDeviceOverviewReferenceRequest)this;
    }
    /**
     * Puts the ManagedDeviceOverview
     *
     * @param srcManagedDeviceOverview the ManagedDeviceOverview reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagedDeviceOverview srcManagedDeviceOverview, final ICallback<? super ManagedDeviceOverview> callback) {
        send(HttpMethod.PUT, callback, srcManagedDeviceOverview);
    }

    /**
     * Puts the ManagedDeviceOverview
     *
     * @param srcManagedDeviceOverview the ManagedDeviceOverview reference to PUT
     * @return the ManagedDeviceOverview
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagedDeviceOverview put(ManagedDeviceOverview srcManagedDeviceOverview) throws ClientException {
        return send(HttpMethod.PUT, srcManagedDeviceOverview);
    }
}
