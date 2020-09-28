// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfigurationUserOverview;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration User Overview With Reference Request.
 */
public class DeviceConfigurationUserOverviewWithReferenceRequest extends BaseRequest implements IDeviceConfigurationUserOverviewWithReferenceRequest {

    /**
     * The request for the DeviceConfigurationUserOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationUserOverviewWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationUserOverview.class);
    }

    public void post(final DeviceConfigurationUserOverview newDeviceConfigurationUserOverview, final IJsonBackedObject payload, final ICallback<? super DeviceConfigurationUserOverview> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public DeviceConfigurationUserOverview post(final DeviceConfigurationUserOverview newDeviceConfigurationUserOverview, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newDeviceConfigurationUserOverview;
        }
        return null;
    }

    public void get(final ICallback<? super DeviceConfigurationUserOverview> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public DeviceConfigurationUserOverview get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super DeviceConfigurationUserOverview> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final DeviceConfigurationUserOverview sourceDeviceConfigurationUserOverview, final ICallback<? super DeviceConfigurationUserOverview> callback) {
		send(HttpMethod.PATCH, callback, sourceDeviceConfigurationUserOverview);
	}

	public DeviceConfigurationUserOverview patch(final DeviceConfigurationUserOverview sourceDeviceConfigurationUserOverview) throws ClientException {
		return send(HttpMethod.PATCH, sourceDeviceConfigurationUserOverview);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceConfigurationUserOverviewWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDeviceConfigurationUserOverviewWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceConfigurationUserOverviewWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceConfigurationUserOverviewWithReferenceRequest)this;
    }
}
