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
import com.microsoft.graph.requests.extensions.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Request Builder.
 */
public class MessageRequestBuilder extends BaseRequestBuilder implements IMessageRequestBuilder {

    /**
     * The request builder for the Message
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MessageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IMessageRequest instance
     */
    public IMessageRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IMessageRequest instance
     */
    public IMessageRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.MessageRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAttachmentCollectionRequestBuilder attachments() {
        return new AttachmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("attachments"), getClient(), null);
    }

    public IAttachmentRequestBuilder attachments(final String id) {
        return new AttachmentRequestBuilder(getRequestUrlWithAdditionalSegment("attachments") + "/" + id, getClient(), null);
    }
    public IExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public IExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    public IMultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties() {
        return new MultiValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties"), getClient(), null);
    }

    public IMultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id) {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties") + "/" + id, getClient(), null);
    }
    public ISingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties() {
        return new SingleValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties"), getClient(), null);
    }

    public ISingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id) {
        return new SingleValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties") + "/" + id, getClient(), null);
    }

    public IMessageCopyRequestBuilder copy(final String destinationId) {
        return new MessageCopyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copy"), getClient(), null, destinationId);
    }

    public IMessageMoveRequestBuilder move(final String destinationId) {
        return new MessageMoveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.move"), getClient(), null, destinationId);
    }

    public IMessageCreateForwardRequestBuilder createForward(final java.util.List<Recipient> toRecipients, final Message message, final String comment) {
        return new MessageCreateForwardRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createForward"), getClient(), null, toRecipients, message, comment);
    }

    public IMessageCreateReplyRequestBuilder createReply(final Message message, final String comment) {
        return new MessageCreateReplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createReply"), getClient(), null, message, comment);
    }

    public IMessageCreateReplyAllRequestBuilder createReplyAll(final Message message, final String comment) {
        return new MessageCreateReplyAllRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createReplyAll"), getClient(), null, message, comment);
    }

    public IMessageForwardRequestBuilder forward(final java.util.List<Recipient> toRecipients, final Message message, final String comment) {
        return new MessageForwardRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.forward"), getClient(), null, toRecipients, message, comment);
    }

    public IMessageReplyRequestBuilder reply(final Message message, final String comment) {
        return new MessageReplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reply"), getClient(), null, message, comment);
    }

    public IMessageReplyAllRequestBuilder replyAll(final Message message, final String comment) {
        return new MessageReplyAllRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.replyAll"), getClient(), null, message, comment);
    }

    public IMessageSendRequestBuilder send() {
        return new MessageSendRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.send"), getClient(), null);
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
