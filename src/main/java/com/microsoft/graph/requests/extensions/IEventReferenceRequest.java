// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Event Reference Request.
 */
public interface IEventReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super Event> callback);

    Event delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEventReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEventReferenceRequest expand(final String value);

    /**
     * Puts the Event
     *
     * @param srcEvent the Event to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Event srcEvent, final ICallback<? super Event> callback);

    /**
     * Puts the Event
     *
     * @param srcEvent the Event to PUT
     * @return the Event
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Event put(Event srcEvent) throws ClientException;
}
