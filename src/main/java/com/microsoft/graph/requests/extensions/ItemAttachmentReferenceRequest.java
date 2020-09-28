// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemAttachment;
import com.microsoft.graph.requests.extensions.IOutlookItemRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Attachment Reference Request.
 */
public class ItemAttachmentReferenceRequest extends BaseRequest implements IItemAttachmentReferenceRequest {

    /**
     * The request for the ItemAttachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemAttachmentReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemAttachment.class);
    }

    public void delete(final ICallback<? super ItemAttachment> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ItemAttachment delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IItemAttachmentReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ItemAttachmentReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IItemAttachmentReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ItemAttachmentReferenceRequest)this;
    }
    /**
     * Puts the ItemAttachment
     *
     * @param srcItemAttachment the ItemAttachment reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ItemAttachment srcItemAttachment, final ICallback<? super ItemAttachment> callback) {
        send(HttpMethod.PUT, callback, srcItemAttachment);
    }

    /**
     * Puts the ItemAttachment
     *
     * @param srcItemAttachment the ItemAttachment reference to PUT
     * @return the ItemAttachment
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ItemAttachment put(ItemAttachment srcItemAttachment) throws ClientException {
        return send(HttpMethod.PUT, srcItemAttachment);
    }
}
