// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.requests.extensions.IColumnLinkCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnLinkRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnLinkCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnLinkRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type Reference Request.
 */
public class ContentTypeReferenceRequest extends BaseRequest implements IContentTypeReferenceRequest {

    /**
     * The request for the ContentType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContentTypeReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ContentType.class);
    }

    public void delete(final ICallback<? super ContentType> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ContentType delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IContentTypeReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ContentTypeReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IContentTypeReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ContentTypeReferenceRequest)this;
    }
    /**
     * Puts the ContentType
     *
     * @param srcContentType the ContentType reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ContentType srcContentType, final ICallback<? super ContentType> callback) {
        send(HttpMethod.PUT, callback, srcContentType);
    }

    /**
     * Puts the ContentType
     *
     * @param srcContentType the ContentType reference to PUT
     * @return the ContentType
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ContentType put(ContentType srcContentType) throws ClientException {
        return send(HttpMethod.PUT, srcContentType);
    }
}
