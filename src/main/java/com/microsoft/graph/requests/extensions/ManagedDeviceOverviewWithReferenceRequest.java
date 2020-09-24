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
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Overview With Reference Request.
 */
public class ManagedDeviceOverviewWithReferenceRequest extends BaseRequest implements IManagedDeviceOverviewWithReferenceRequest {

    /**
     * The request for the ManagedDeviceOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceOverviewWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceOverview.class);
    }

    public void post(final ManagedDeviceOverview newManagedDeviceOverview, final IJsonBackedObject payload, final ICallback<? super ManagedDeviceOverview> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public ManagedDeviceOverview post(final ManagedDeviceOverview newManagedDeviceOverview, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newManagedDeviceOverview;
        }
        return null;
    }

    public void get(final ICallback<? super ManagedDeviceOverview> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public ManagedDeviceOverview get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super ManagedDeviceOverview> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final ManagedDeviceOverview sourceManagedDeviceOverview, final ICallback<? super ManagedDeviceOverview> callback) {
		send(HttpMethod.PATCH, callback, sourceManagedDeviceOverview);
	}

	public ManagedDeviceOverview patch(final ManagedDeviceOverview sourceManagedDeviceOverview) throws ClientException {
		return send(HttpMethod.PATCH, sourceManagedDeviceOverview);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceOverviewWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IManagedDeviceOverviewWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceOverviewWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedDeviceOverviewWithReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IManagedDeviceOverviewWithReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ManagedDeviceOverviewWithReferenceRequest)this;
    }
}
