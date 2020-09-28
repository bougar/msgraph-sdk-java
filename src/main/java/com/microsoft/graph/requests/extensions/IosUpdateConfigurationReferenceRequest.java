// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosUpdateConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Update Configuration Reference Request.
 */
public class IosUpdateConfigurationReferenceRequest extends BaseRequest implements IIosUpdateConfigurationReferenceRequest {

    /**
     * The request for the IosUpdateConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosUpdateConfigurationReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosUpdateConfiguration.class);
    }

    public void delete(final ICallback<? super IosUpdateConfiguration> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public IosUpdateConfiguration delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IIosUpdateConfigurationReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IosUpdateConfigurationReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IIosUpdateConfigurationReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IosUpdateConfigurationReferenceRequest)this;
    }
    /**
     * Puts the IosUpdateConfiguration
     *
     * @param srcIosUpdateConfiguration the IosUpdateConfiguration reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(IosUpdateConfiguration srcIosUpdateConfiguration, final ICallback<? super IosUpdateConfiguration> callback) {
        send(HttpMethod.PUT, callback, srcIosUpdateConfiguration);
    }

    /**
     * Puts the IosUpdateConfiguration
     *
     * @param srcIosUpdateConfiguration the IosUpdateConfiguration reference to PUT
     * @return the IosUpdateConfiguration
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public IosUpdateConfiguration put(IosUpdateConfiguration srcIosUpdateConfiguration) throws ClientException {
        return send(HttpMethod.PUT, srcIosUpdateConfiguration);
    }
}
