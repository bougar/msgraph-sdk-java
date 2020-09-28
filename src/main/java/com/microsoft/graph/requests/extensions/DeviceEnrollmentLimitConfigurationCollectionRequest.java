// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceEnrollmentLimitConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentLimitConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentLimitConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentLimitConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentLimitConfigurationCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentLimitConfigurationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Limit Configuration Collection Request.
 */
public class DeviceEnrollmentLimitConfigurationCollectionRequest extends BaseCollectionRequest<DeviceEnrollmentLimitConfigurationCollectionResponse, IDeviceEnrollmentLimitConfigurationCollectionPage> implements IDeviceEnrollmentLimitConfigurationCollectionRequest {

    /**
     * The request builder for this collection of DeviceEnrollmentLimitConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentLimitConfigurationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceEnrollmentLimitConfigurationCollectionResponse.class, IDeviceEnrollmentLimitConfigurationCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceEnrollmentLimitConfigurationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceEnrollmentLimitConfigurationCollectionPage get() throws ClientException {
        final DeviceEnrollmentLimitConfigurationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration, final ICallback<? super DeviceEnrollmentLimitConfiguration> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceEnrollmentLimitConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceEnrollmentLimitConfiguration, callback);
    }

    public DeviceEnrollmentLimitConfiguration post(final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceEnrollmentLimitConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceEnrollmentLimitConfigurationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceEnrollmentLimitConfigurationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceEnrollmentLimitConfigurationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceEnrollmentLimitConfigurationCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceEnrollmentLimitConfigurationCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceEnrollmentLimitConfigurationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceEnrollmentLimitConfigurationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceEnrollmentLimitConfigurationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceEnrollmentLimitConfigurationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceEnrollmentLimitConfigurationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceEnrollmentLimitConfigurationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceEnrollmentLimitConfigurationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceEnrollmentLimitConfigurationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceEnrollmentLimitConfigurationCollectionRequest)this;
    }
    public IDeviceEnrollmentLimitConfigurationCollectionPage buildFromResponse(final DeviceEnrollmentLimitConfigurationCollectionResponse response) {
        final IDeviceEnrollmentLimitConfigurationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceEnrollmentLimitConfigurationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceEnrollmentLimitConfigurationCollectionPage page = new DeviceEnrollmentLimitConfigurationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
