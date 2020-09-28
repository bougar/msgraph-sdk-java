// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SubscribeToToneOperation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISubscribeToToneOperationCollectionPage;
import com.microsoft.graph.requests.extensions.SubscribeToToneOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.ISubscribeToToneOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribeToToneOperationCollectionRequest;
import com.microsoft.graph.requests.extensions.SubscribeToToneOperationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscribe To Tone Operation Collection Request.
 */
public class SubscribeToToneOperationCollectionRequest extends BaseCollectionRequest<SubscribeToToneOperationCollectionResponse, ISubscribeToToneOperationCollectionPage> implements ISubscribeToToneOperationCollectionRequest {

    /**
     * The request builder for this collection of SubscribeToToneOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SubscribeToToneOperationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SubscribeToToneOperationCollectionResponse.class, ISubscribeToToneOperationCollectionPage.class);
    }

    public void get(final ICallback<? super ISubscribeToToneOperationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ISubscribeToToneOperationCollectionPage get() throws ClientException {
        final SubscribeToToneOperationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SubscribeToToneOperation newSubscribeToToneOperation, final ICallback<? super SubscribeToToneOperation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SubscribeToToneOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSubscribeToToneOperation, callback);
    }

    public SubscribeToToneOperation post(final SubscribeToToneOperation newSubscribeToToneOperation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SubscribeToToneOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSubscribeToToneOperation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISubscribeToToneOperationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SubscribeToToneOperationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ISubscribeToToneOperationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (SubscribeToToneOperationCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ISubscribeToToneOperationCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (SubscribeToToneOperationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISubscribeToToneOperationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SubscribeToToneOperationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISubscribeToToneOperationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SubscribeToToneOperationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ISubscribeToToneOperationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (SubscribeToToneOperationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ISubscribeToToneOperationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ISubscribeToToneOperationCollectionRequest)this;
    }
    public ISubscribeToToneOperationCollectionPage buildFromResponse(final SubscribeToToneOperationCollectionResponse response) {
        final ISubscribeToToneOperationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SubscribeToToneOperationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SubscribeToToneOperationCollectionPage page = new SubscribeToToneOperationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
