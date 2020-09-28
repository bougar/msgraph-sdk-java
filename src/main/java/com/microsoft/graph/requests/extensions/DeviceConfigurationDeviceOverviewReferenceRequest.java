// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceOverview;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Device Overview Reference Request.
 */
public class DeviceConfigurationDeviceOverviewReferenceRequest extends BaseRequest implements IDeviceConfigurationDeviceOverviewReferenceRequest {

    /**
     * The request for the DeviceConfigurationDeviceOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationDeviceOverviewReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationDeviceOverview.class);
    }

    public void delete(final ICallback<? super DeviceConfigurationDeviceOverview> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public DeviceConfigurationDeviceOverview delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceConfigurationDeviceOverviewReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceConfigurationDeviceOverviewReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceConfigurationDeviceOverviewReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceConfigurationDeviceOverviewReferenceRequest)this;
    }
    /**
     * Puts the DeviceConfigurationDeviceOverview
     *
     * @param srcDeviceConfigurationDeviceOverview the DeviceConfigurationDeviceOverview reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(DeviceConfigurationDeviceOverview srcDeviceConfigurationDeviceOverview, final ICallback<? super DeviceConfigurationDeviceOverview> callback) {
        send(HttpMethod.PUT, callback, srcDeviceConfigurationDeviceOverview);
    }

    /**
     * Puts the DeviceConfigurationDeviceOverview
     *
     * @param srcDeviceConfigurationDeviceOverview the DeviceConfigurationDeviceOverview reference to PUT
     * @return the DeviceConfigurationDeviceOverview
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DeviceConfigurationDeviceOverview put(DeviceConfigurationDeviceOverview srcDeviceConfigurationDeviceOverview) throws ClientException {
        return send(HttpMethod.PUT, srcDeviceConfigurationDeviceOverview);
    }
}
