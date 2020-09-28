// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ActivityHistoryItem;
import com.microsoft.graph.requests.extensions.IUserActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.UserActivityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity History Item Reference Request.
 */
public class ActivityHistoryItemReferenceRequest extends BaseRequest implements IActivityHistoryItemReferenceRequest {

    /**
     * The request for the ActivityHistoryItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ActivityHistoryItemReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ActivityHistoryItem.class);
    }

    public void delete(final ICallback<? super ActivityHistoryItem> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ActivityHistoryItem delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IActivityHistoryItemReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ActivityHistoryItemReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IActivityHistoryItemReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ActivityHistoryItemReferenceRequest)this;
    }
    /**
     * Puts the ActivityHistoryItem
     *
     * @param srcActivityHistoryItem the ActivityHistoryItem reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ActivityHistoryItem srcActivityHistoryItem, final ICallback<? super ActivityHistoryItem> callback) {
        send(HttpMethod.PUT, callback, srcActivityHistoryItem);
    }

    /**
     * Puts the ActivityHistoryItem
     *
     * @param srcActivityHistoryItem the ActivityHistoryItem reference to PUT
     * @return the ActivityHistoryItem
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ActivityHistoryItem put(ActivityHistoryItem srcActivityHistoryItem) throws ClientException {
        return send(HttpMethod.PUT, srcActivityHistoryItem);
    }
}
