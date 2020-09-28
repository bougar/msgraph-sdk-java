// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.requests.extensions.IOfferShiftRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOfferShiftRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.OfferShiftRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OfferShiftRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IOpenShiftChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOpenShiftChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IOpenShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOpenShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchedulingGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchedulingGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.SchedulingGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchedulingGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.ShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.ISwapShiftsChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISwapShiftsChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffReasonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffReasonRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffReasonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffReasonRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Reference Request.
 */
public class ScheduleReferenceRequest extends BaseRequest implements IScheduleReferenceRequest {

    /**
     * The request for the Schedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ScheduleReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Schedule.class);
    }

    public void delete(final ICallback<? super Schedule> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public Schedule delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IScheduleReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ScheduleReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IScheduleReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ScheduleReferenceRequest)this;
    }
    /**
     * Puts the Schedule
     *
     * @param srcSchedule the Schedule reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Schedule srcSchedule, final ICallback<? super Schedule> callback) {
        send(HttpMethod.PUT, callback, srcSchedule);
    }

    /**
     * Puts the Schedule
     *
     * @param srcSchedule the Schedule reference to PUT
     * @return the Schedule
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Schedule put(Schedule srcSchedule) throws ClientException {
        return send(HttpMethod.PUT, srcSchedule);
    }
}
