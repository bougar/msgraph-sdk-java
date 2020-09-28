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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration User Overview Reference Request.
 */
public class DeviceConfigurationUserOverviewReferenceRequest extends BaseRequest implements IDeviceConfigurationUserOverviewReferenceRequest {

    /**
     * The request for the DeviceConfigurationUserOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationUserOverviewReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationUserOverview.class);
    }

    public void delete(final ICallback<? super DeviceConfigurationUserOverview> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public DeviceConfigurationUserOverview delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceConfigurationUserOverviewReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceConfigurationUserOverviewReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceConfigurationUserOverviewReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceConfigurationUserOverviewReferenceRequest)this;
    }
    /**
     * Puts the DeviceConfigurationUserOverview
     *
     * @param srcDeviceConfigurationUserOverview the DeviceConfigurationUserOverview reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(DeviceConfigurationUserOverview srcDeviceConfigurationUserOverview, final ICallback<? super DeviceConfigurationUserOverview> callback) {
        send(HttpMethod.PUT, callback, srcDeviceConfigurationUserOverview);
    }

    /**
     * Puts the DeviceConfigurationUserOverview
     *
     * @param srcDeviceConfigurationUserOverview the DeviceConfigurationUserOverview reference to PUT
     * @return the DeviceConfigurationUserOverview
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DeviceConfigurationUserOverview put(DeviceConfigurationUserOverview srcDeviceConfigurationUserOverview) throws ClientException {
        return send(HttpMethod.PUT, srcDeviceConfigurationUserOverview);
    }
}
