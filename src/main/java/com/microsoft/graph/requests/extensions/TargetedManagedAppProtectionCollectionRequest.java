// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TargetedManagedAppProtection;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppProtectionCollectionPage;
import com.microsoft.graph.requests.extensions.TargetedManagedAppProtectionCollectionResponse;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppProtectionCollectionRequest;
import com.microsoft.graph.requests.extensions.TargetedManagedAppProtectionCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Protection Collection Request.
 */
public class TargetedManagedAppProtectionCollectionRequest extends BaseCollectionRequest<TargetedManagedAppProtectionCollectionResponse, ITargetedManagedAppProtectionCollectionPage> implements ITargetedManagedAppProtectionCollectionRequest {

    /**
     * The request builder for this collection of TargetedManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppProtectionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TargetedManagedAppProtectionCollectionResponse.class, ITargetedManagedAppProtectionCollectionPage.class);
    }

    public void get(final ICallback<? super ITargetedManagedAppProtectionCollectionPage> callback) {
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

    public ITargetedManagedAppProtectionCollectionPage get() throws ClientException {
        final TargetedManagedAppProtectionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TargetedManagedAppProtection newTargetedManagedAppProtection, final ICallback<? super TargetedManagedAppProtection> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TargetedManagedAppProtectionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTargetedManagedAppProtection, callback);
    }

    public TargetedManagedAppProtection post(final TargetedManagedAppProtection newTargetedManagedAppProtection) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TargetedManagedAppProtectionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTargetedManagedAppProtection);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITargetedManagedAppProtectionCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TargetedManagedAppProtectionCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITargetedManagedAppProtectionCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (TargetedManagedAppProtectionCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ITargetedManagedAppProtectionCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (TargetedManagedAppProtectionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITargetedManagedAppProtectionCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TargetedManagedAppProtectionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITargetedManagedAppProtectionCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TargetedManagedAppProtectionCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ITargetedManagedAppProtectionCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (TargetedManagedAppProtectionCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ITargetedManagedAppProtectionCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ITargetedManagedAppProtectionCollectionRequest)this;
    }
    public ITargetedManagedAppProtectionCollectionPage buildFromResponse(final TargetedManagedAppProtectionCollectionResponse response) {
        final ITargetedManagedAppProtectionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TargetedManagedAppProtectionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TargetedManagedAppProtectionCollectionPage page = new TargetedManagedAppProtectionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
