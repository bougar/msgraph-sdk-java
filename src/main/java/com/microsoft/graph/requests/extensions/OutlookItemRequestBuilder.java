// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookItem;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Item Request Builder.
 */
public class OutlookItemRequestBuilder extends BaseRequestBuilder implements IOutlookItemRequestBuilder {

    /**
     * The request builder for the OutlookItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookItemRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IOutlookItemRequest instance
     */
    public IOutlookItemRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOutlookItemRequest instance
     */
    public IOutlookItemRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.OutlookItemRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the Event type
     */
    public IEventRequestBuilder castToEvent() {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.event"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the Contact type
     */
    public IContactRequestBuilder castToContact() {
        return new ContactRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.contact"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the Message type
     */
    public IMessageRequestBuilder castToMessage() {
        return new MessageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.message"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the Post type
     */
    public IPostRequestBuilder castToPost() {
        return new PostRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.post"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the CalendarSharingMessage type
     */
    public ICalendarSharingMessageRequestBuilder castToCalendarSharingMessage() {
        return new CalendarSharingMessageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.calendarSharingMessage"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the EventMessage type
     */
    public IEventMessageRequestBuilder castToEventMessage() {
        return new EventMessageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.eventMessage"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the EventMessageRequest type
     */
    public IEventMessageRequestRequestBuilder castToEventMessageRequest() {
        return new EventMessageRequestRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.eventMessageRequest"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the EventMessageResponse type
     */
    public IEventMessageResponseRequestBuilder castToEventMessageResponse() {
        return new EventMessageResponseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.eventMessageResponse"), getClient(), null);
    }
}
