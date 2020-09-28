// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChatMessageHostedContent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Hosted Content Reference Request.
 */
public class ChatMessageHostedContentReferenceRequest extends BaseRequest implements IChatMessageHostedContentReferenceRequest {

    /**
     * The request for the ChatMessageHostedContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatMessageHostedContentReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChatMessageHostedContent.class);
    }

    public void delete(final ICallback<? super ChatMessageHostedContent> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ChatMessageHostedContent delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IChatMessageHostedContentReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ChatMessageHostedContentReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IChatMessageHostedContentReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ChatMessageHostedContentReferenceRequest)this;
    }
    /**
     * Puts the ChatMessageHostedContent
     *
     * @param srcChatMessageHostedContent the ChatMessageHostedContent reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ChatMessageHostedContent srcChatMessageHostedContent, final ICallback<? super ChatMessageHostedContent> callback) {
        send(HttpMethod.PUT, callback, srcChatMessageHostedContent);
    }

    /**
     * Puts the ChatMessageHostedContent
     *
     * @param srcChatMessageHostedContent the ChatMessageHostedContent reference to PUT
     * @return the ChatMessageHostedContent
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ChatMessageHostedContent put(ChatMessageHostedContent srcChatMessageHostedContent) throws ClientException {
        return send(HttpMethod.PUT, srcChatMessageHostedContent);
    }
}
