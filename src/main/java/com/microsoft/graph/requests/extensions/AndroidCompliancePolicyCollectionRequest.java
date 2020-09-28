// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidCompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAndroidCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidCompliancePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.IAndroidCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidCompliancePolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.AndroidCompliancePolicyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Compliance Policy Collection Request.
 */
public class AndroidCompliancePolicyCollectionRequest extends BaseCollectionRequest<AndroidCompliancePolicyCollectionResponse, IAndroidCompliancePolicyCollectionPage> implements IAndroidCompliancePolicyCollectionRequest {

    /**
     * The request builder for this collection of AndroidCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidCompliancePolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidCompliancePolicyCollectionResponse.class, IAndroidCompliancePolicyCollectionPage.class);
    }

    public void get(final ICallback<? super IAndroidCompliancePolicyCollectionPage> callback) {
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

    public IAndroidCompliancePolicyCollectionPage get() throws ClientException {
        final AndroidCompliancePolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AndroidCompliancePolicy newAndroidCompliancePolicy, final ICallback<? super AndroidCompliancePolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AndroidCompliancePolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAndroidCompliancePolicy, callback);
    }

    public AndroidCompliancePolicy post(final AndroidCompliancePolicy newAndroidCompliancePolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AndroidCompliancePolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAndroidCompliancePolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidCompliancePolicyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AndroidCompliancePolicyCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAndroidCompliancePolicyCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (AndroidCompliancePolicyCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IAndroidCompliancePolicyCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (AndroidCompliancePolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidCompliancePolicyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AndroidCompliancePolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAndroidCompliancePolicyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AndroidCompliancePolicyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAndroidCompliancePolicyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AndroidCompliancePolicyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAndroidCompliancePolicyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAndroidCompliancePolicyCollectionRequest)this;
    }
    public IAndroidCompliancePolicyCollectionPage buildFromResponse(final AndroidCompliancePolicyCollectionResponse response) {
        final IAndroidCompliancePolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AndroidCompliancePolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AndroidCompliancePolicyCollectionPage page = new AndroidCompliancePolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
