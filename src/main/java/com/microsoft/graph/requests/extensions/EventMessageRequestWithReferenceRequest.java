// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EventMessageRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Request With Reference Request.
 */
public class EventMessageRequestWithReferenceRequest extends BaseRequest implements IEventMessageRequestWithReferenceRequest {

    /**
     * The request for the EventMessageRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventMessageRequestWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EventMessageRequest.class);
    }

    public void post(final EventMessageRequest newEventMessageRequest, final IJsonBackedObject payload, final ICallback<? super EventMessageRequest> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public EventMessageRequest post(final EventMessageRequest newEventMessageRequest, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newEventMessageRequest;
        }
        return null;
    }

    public void get(final ICallback<? super EventMessageRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public EventMessageRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super EventMessageRequest> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final EventMessageRequest sourceEventMessageRequest, final ICallback<? super EventMessageRequest> callback) {
		send(HttpMethod.PATCH, callback, sourceEventMessageRequest);
	}

	public EventMessageRequest patch(final EventMessageRequest sourceEventMessageRequest) throws ClientException {
		return send(HttpMethod.PATCH, sourceEventMessageRequest);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEventMessageRequestWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IEventMessageRequestWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEventMessageRequestWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EventMessageRequestWithReferenceRequest)this;
    }
}
