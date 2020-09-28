// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosUpdateDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Update Device Status With Reference Request.
 */
public class IosUpdateDeviceStatusWithReferenceRequest extends BaseRequest implements IIosUpdateDeviceStatusWithReferenceRequest {

    /**
     * The request for the IosUpdateDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosUpdateDeviceStatusWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosUpdateDeviceStatus.class);
    }

    public void post(final IosUpdateDeviceStatus newIosUpdateDeviceStatus, final IJsonBackedObject payload, final ICallback<? super IosUpdateDeviceStatus> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public IosUpdateDeviceStatus post(final IosUpdateDeviceStatus newIosUpdateDeviceStatus, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newIosUpdateDeviceStatus;
        }
        return null;
    }

    public void get(final ICallback<? super IosUpdateDeviceStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public IosUpdateDeviceStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super IosUpdateDeviceStatus> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final IosUpdateDeviceStatus sourceIosUpdateDeviceStatus, final ICallback<? super IosUpdateDeviceStatus> callback) {
		send(HttpMethod.PATCH, callback, sourceIosUpdateDeviceStatus);
	}

	public IosUpdateDeviceStatus patch(final IosUpdateDeviceStatus sourceIosUpdateDeviceStatus) throws ClientException {
		return send(HttpMethod.PATCH, sourceIosUpdateDeviceStatus);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IIosUpdateDeviceStatusWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IIosUpdateDeviceStatusWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IIosUpdateDeviceStatusWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IosUpdateDeviceStatusWithReferenceRequest)this;
    }
}
