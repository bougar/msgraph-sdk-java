// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Trending;
import com.microsoft.graph.requests.extensions.IEntityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Trending;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Trending Reference Request.
 */
public interface ITrendingReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super Trending> callback);

    Trending delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITrendingReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITrendingReferenceRequest expand(final String value);

    /**
     * Puts the Trending
     *
     * @param srcTrending the Trending to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Trending srcTrending, final ICallback<? super Trending> callback);

    /**
     * Puts the Trending
     *
     * @param srcTrending the Trending to PUT
     * @return the Trending
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Trending put(Trending srcTrending) throws ClientException;
}
