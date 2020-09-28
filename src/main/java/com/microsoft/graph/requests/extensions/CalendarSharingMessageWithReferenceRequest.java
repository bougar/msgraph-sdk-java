// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CalendarSharingMessage;
import com.microsoft.graph.models.extensions.Calendar;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Sharing Message With Reference Request.
 */
public class CalendarSharingMessageWithReferenceRequest extends BaseRequest implements ICalendarSharingMessageWithReferenceRequest {

    /**
     * The request for the CalendarSharingMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarSharingMessageWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CalendarSharingMessage.class);
    }

    public void post(final CalendarSharingMessage newCalendarSharingMessage, final IJsonBackedObject payload, final ICallback<? super CalendarSharingMessage> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public CalendarSharingMessage post(final CalendarSharingMessage newCalendarSharingMessage, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newCalendarSharingMessage;
        }
        return null;
    }

    public void get(final ICallback<? super CalendarSharingMessage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public CalendarSharingMessage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super CalendarSharingMessage> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final CalendarSharingMessage sourceCalendarSharingMessage, final ICallback<? super CalendarSharingMessage> callback) {
		send(HttpMethod.PATCH, callback, sourceCalendarSharingMessage);
	}

	public CalendarSharingMessage patch(final CalendarSharingMessage sourceCalendarSharingMessage) throws ClientException {
		return send(HttpMethod.PATCH, sourceCalendarSharingMessage);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICalendarSharingMessageWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ICalendarSharingMessageWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICalendarSharingMessageWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CalendarSharingMessageWithReferenceRequest)this;
    }
}
