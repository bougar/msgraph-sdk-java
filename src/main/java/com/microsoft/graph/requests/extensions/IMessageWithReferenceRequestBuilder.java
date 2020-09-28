// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Message With Reference Request Builder.
 */
public interface IMessageWithReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IMessageWithReferenceRequest instance
     */
    IMessageWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IMessageWithReferenceRequest instance
     */
    IMessageWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IMessageReferenceRequestBuilder reference();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the CalendarSharingMessage type
     */
    ICalendarSharingMessageRequestBuilder castToCalendarSharingMessage();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the EventMessage type
     */
    IEventMessageRequestBuilder castToEventMessage();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the EventMessageRequest type
     */
    IEventMessageRequestRequestBuilder castToEventMessageRequest();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the EventMessageResponse type
     */
    IEventMessageResponseRequestBuilder castToEventMessageResponse();

}
