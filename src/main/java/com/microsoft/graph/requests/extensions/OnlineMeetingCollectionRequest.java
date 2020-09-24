// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudCommunications;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.microsoft.graph.models.extensions.ChatInfo;
import com.microsoft.graph.models.extensions.MeetingParticipants;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCollectionPage;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionResponse;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCollectionRequest;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting Collection Request.
 */
public class OnlineMeetingCollectionRequest extends BaseCollectionRequest<OnlineMeetingCollectionResponse, IOnlineMeetingCollectionPage> implements IOnlineMeetingCollectionRequest {

    /**
     * The request builder for this collection of OnlineMeeting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnlineMeetingCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnlineMeetingCollectionResponse.class, IOnlineMeetingCollectionPage.class);
    }

    public void get(final ICallback<? super IOnlineMeetingCollectionPage> callback) {
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

    public IOnlineMeetingCollectionPage get() throws ClientException {
        final OnlineMeetingCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final OnlineMeeting newOnlineMeeting, final ICallback<? super OnlineMeeting> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OnlineMeetingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOnlineMeeting, callback);
    }

    public OnlineMeeting post(final OnlineMeeting newOnlineMeeting) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OnlineMeetingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOnlineMeeting);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOnlineMeetingCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (OnlineMeetingCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IOnlineMeetingCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (OnlineMeetingCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOnlineMeetingCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (OnlineMeetingCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOnlineMeetingCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (OnlineMeetingCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IOnlineMeetingCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (OnlineMeetingCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IOnlineMeetingCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IOnlineMeetingCollectionRequest)this;
    }
    public IOnlineMeetingCollectionPage buildFromResponse(final OnlineMeetingCollectionResponse response) {
        final IOnlineMeetingCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OnlineMeetingCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OnlineMeetingCollectionPage page = new OnlineMeetingCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
