// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailAssessmentRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IMailAssessmentRequestCollectionPage;
import com.microsoft.graph.requests.extensions.MailAssessmentRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.IMailAssessmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMailAssessmentRequestCollectionRequest;
import com.microsoft.graph.requests.extensions.MailAssessmentRequestCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Assessment Request Collection Request.
 */
public class MailAssessmentRequestCollectionRequest extends BaseCollectionRequest<MailAssessmentRequestCollectionResponse, IMailAssessmentRequestCollectionPage> implements IMailAssessmentRequestCollectionRequest {

    /**
     * The request builder for this collection of MailAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MailAssessmentRequestCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MailAssessmentRequestCollectionResponse.class, IMailAssessmentRequestCollectionPage.class);
    }

    public void get(final ICallback<? super IMailAssessmentRequestCollectionPage> callback) {
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

    public IMailAssessmentRequestCollectionPage get() throws ClientException {
        final MailAssessmentRequestCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MailAssessmentRequest newMailAssessmentRequest, final ICallback<? super MailAssessmentRequest> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MailAssessmentRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMailAssessmentRequest, callback);
    }

    public MailAssessmentRequest post(final MailAssessmentRequest newMailAssessmentRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MailAssessmentRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMailAssessmentRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMailAssessmentRequestCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MailAssessmentRequestCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IMailAssessmentRequestCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (MailAssessmentRequestCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IMailAssessmentRequestCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (MailAssessmentRequestCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMailAssessmentRequestCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MailAssessmentRequestCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMailAssessmentRequestCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (MailAssessmentRequestCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IMailAssessmentRequestCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (MailAssessmentRequestCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IMailAssessmentRequestCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IMailAssessmentRequestCollectionRequest)this;
    }
    public IMailAssessmentRequestCollectionPage buildFromResponse(final MailAssessmentRequestCollectionResponse response) {
        final IMailAssessmentRequestCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MailAssessmentRequestCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MailAssessmentRequestCollectionPage page = new MailAssessmentRequestCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
