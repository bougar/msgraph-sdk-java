// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CalendarGroup;
import com.microsoft.graph.requests.extensions.ICalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Group With Reference Request.
 */
public class CalendarGroupWithReferenceRequest extends BaseRequest implements ICalendarGroupWithReferenceRequest {

    /**
     * The request for the CalendarGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarGroupWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CalendarGroup.class);
    }

    public void post(final CalendarGroup newCalendarGroup, final IJsonBackedObject payload, final ICallback<? super CalendarGroup> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public CalendarGroup post(final CalendarGroup newCalendarGroup, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newCalendarGroup;
        }
        return null;
    }

    public void get(final ICallback<? super CalendarGroup> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public CalendarGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super CalendarGroup> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final CalendarGroup sourceCalendarGroup, final ICallback<? super CalendarGroup> callback) {
		send(HttpMethod.PATCH, callback, sourceCalendarGroup);
	}

	public CalendarGroup patch(final CalendarGroup sourceCalendarGroup) throws ClientException {
		return send(HttpMethod.PATCH, sourceCalendarGroup);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICalendarGroupWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ICalendarGroupWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICalendarGroupWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CalendarGroupWithReferenceRequest)this;
    }
}
