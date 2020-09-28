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
import com.microsoft.graph.requests.extensions.IOpenShiftChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOpenShiftChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IOpenShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOpenShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchedulingGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchedulingGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.ISwapShiftsChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISwapShiftsChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffReasonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffReasonRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Schedule With Reference Request.
 */
public interface IScheduleWithReferenceRequest extends IHttpRequest {

    void post(final Schedule newSchedule, final IJsonBackedObject payload, final ICallback<? super Schedule> callback);

    Schedule post(final Schedule newSchedule, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super Schedule> callback);

    Schedule get() throws ClientException;

	void delete(final ICallback<? super Schedule> callback);

	void delete() throws ClientException;

	void patch(final Schedule sourceSchedule, final ICallback<? super Schedule> callback);

	Schedule patch(final Schedule sourceSchedule) throws ClientException;

    IScheduleWithReferenceRequest select(final String value);

    IScheduleWithReferenceRequest expand(final String value);

}
