// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ThumbnailSet;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Thumbnail Set Reference Request.
 */
public class ThumbnailSetReferenceRequest extends BaseRequest implements IThumbnailSetReferenceRequest {

    /**
     * The request for the ThumbnailSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThumbnailSetReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ThumbnailSet.class);
    }

    public void delete(final ICallback<? super ThumbnailSet> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ThumbnailSet delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IThumbnailSetReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ThumbnailSetReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IThumbnailSetReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ThumbnailSetReferenceRequest)this;
    }
    /**
     * Puts the ThumbnailSet
     *
     * @param srcThumbnailSet the ThumbnailSet reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ThumbnailSet srcThumbnailSet, final ICallback<? super ThumbnailSet> callback) {
        send(HttpMethod.PUT, callback, srcThumbnailSet);
    }

    /**
     * Puts the ThumbnailSet
     *
     * @param srcThumbnailSet the ThumbnailSet reference to PUT
     * @return the ThumbnailSet
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ThumbnailSet put(ThumbnailSet srcThumbnailSet) throws ClientException {
        return send(HttpMethod.PUT, srcThumbnailSet);
    }
}
