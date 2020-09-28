// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Conversation;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Reference Request.
 */
public class ConversationReferenceRequest extends BaseRequest implements IConversationReferenceRequest {

    /**
     * The request for the Conversation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConversationReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Conversation.class);
    }

    public void delete(final ICallback<? super Conversation> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public Conversation delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IConversationReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ConversationReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IConversationReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ConversationReferenceRequest)this;
    }
    /**
     * Puts the Conversation
     *
     * @param srcConversation the Conversation reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Conversation srcConversation, final ICallback<? super Conversation> callback) {
        send(HttpMethod.PUT, callback, srcConversation);
    }

    /**
     * Puts the Conversation
     *
     * @param srcConversation the Conversation reference to PUT
     * @return the Conversation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Conversation put(Conversation srcConversation) throws ClientException {
        return send(HttpMethod.PUT, srcConversation);
    }
}
