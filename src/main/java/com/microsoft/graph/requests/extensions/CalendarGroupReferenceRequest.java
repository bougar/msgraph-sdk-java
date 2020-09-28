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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Group Reference Request.
 */
public class CalendarGroupReferenceRequest extends BaseRequest implements ICalendarGroupReferenceRequest {

    /**
     * The request for the CalendarGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarGroupReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CalendarGroup.class);
    }

    public void delete(final ICallback<? super CalendarGroup> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public CalendarGroup delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICalendarGroupReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CalendarGroupReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICalendarGroupReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CalendarGroupReferenceRequest)this;
    }
    /**
     * Puts the CalendarGroup
     *
     * @param srcCalendarGroup the CalendarGroup reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(CalendarGroup srcCalendarGroup, final ICallback<? super CalendarGroup> callback) {
        send(HttpMethod.PUT, callback, srcCalendarGroup);
    }

    /**
     * Puts the CalendarGroup
     *
     * @param srcCalendarGroup the CalendarGroup reference to PUT
     * @return the CalendarGroup
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public CalendarGroup put(CalendarGroup srcCalendarGroup) throws ClientException {
        return send(HttpMethod.PUT, srcCalendarGroup);
    }
}
