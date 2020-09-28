// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.requests.extensions.ILocalizedNotificationMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILocalizedNotificationMessageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Notification Message Template Reference Request.
 */
public interface INotificationMessageTemplateReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super NotificationMessageTemplate> callback);

    NotificationMessageTemplate delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    INotificationMessageTemplateReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    INotificationMessageTemplateReferenceRequest expand(final String value);

    /**
     * Puts the NotificationMessageTemplate
     *
     * @param srcNotificationMessageTemplate the NotificationMessageTemplate to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(NotificationMessageTemplate srcNotificationMessageTemplate, final ICallback<? super NotificationMessageTemplate> callback);

    /**
     * Puts the NotificationMessageTemplate
     *
     * @param srcNotificationMessageTemplate the NotificationMessageTemplate to PUT
     * @return the NotificationMessageTemplate
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    NotificationMessageTemplate put(NotificationMessageTemplate srcNotificationMessageTemplate) throws ClientException;
}
