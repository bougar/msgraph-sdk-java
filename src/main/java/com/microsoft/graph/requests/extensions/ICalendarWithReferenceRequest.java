// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.ScheduleInformation;
import com.microsoft.graph.models.generated.CalendarRoleType;
import com.microsoft.graph.requests.extensions.ICalendarPermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Calendar With Reference Request.
 */
public interface ICalendarWithReferenceRequest extends IHttpRequest {

    void post(final Calendar newCalendar, final IJsonBackedObject payload, final ICallback<? super Calendar> callback);

    Calendar post(final Calendar newCalendar, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super Calendar> callback);

    Calendar get() throws ClientException;

	void delete(final ICallback<? super Calendar> callback);

	void delete() throws ClientException;

	void patch(final Calendar sourceCalendar, final ICallback<? super Calendar> callback);

	Calendar patch(final Calendar sourceCalendar) throws ClientException;

    ICalendarWithReferenceRequest select(final String value);

    ICalendarWithReferenceRequest expand(final String value);

}
