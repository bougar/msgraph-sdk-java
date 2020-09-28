// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsUpdateForBusinessConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update For Business Configuration With Reference Request.
 */
public class WindowsUpdateForBusinessConfigurationWithReferenceRequest extends BaseRequest implements IWindowsUpdateForBusinessConfigurationWithReferenceRequest {

    /**
     * The request for the WindowsUpdateForBusinessConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsUpdateForBusinessConfigurationWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsUpdateForBusinessConfiguration.class);
    }

    public void post(final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration, final IJsonBackedObject payload, final ICallback<? super WindowsUpdateForBusinessConfiguration> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public WindowsUpdateForBusinessConfiguration post(final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newWindowsUpdateForBusinessConfiguration;
        }
        return null;
    }

    public void get(final ICallback<? super WindowsUpdateForBusinessConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public WindowsUpdateForBusinessConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super WindowsUpdateForBusinessConfiguration> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final WindowsUpdateForBusinessConfiguration sourceWindowsUpdateForBusinessConfiguration, final ICallback<? super WindowsUpdateForBusinessConfiguration> callback) {
		send(HttpMethod.PATCH, callback, sourceWindowsUpdateForBusinessConfiguration);
	}

	public WindowsUpdateForBusinessConfiguration patch(final WindowsUpdateForBusinessConfiguration sourceWindowsUpdateForBusinessConfiguration) throws ClientException {
		return send(HttpMethod.PATCH, sourceWindowsUpdateForBusinessConfiguration);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsUpdateForBusinessConfigurationWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IWindowsUpdateForBusinessConfigurationWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsUpdateForBusinessConfigurationWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsUpdateForBusinessConfigurationWithReferenceRequest)this;
    }
}
