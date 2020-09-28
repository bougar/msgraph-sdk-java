// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DomainDnsCnameRecord;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDomainDnsCnameRecordCollectionPage;
import com.microsoft.graph.requests.extensions.DomainDnsCnameRecordCollectionResponse;
import com.microsoft.graph.requests.extensions.IDomainDnsCnameRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsCnameRecordCollectionRequest;
import com.microsoft.graph.requests.extensions.DomainDnsCnameRecordCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Cname Record Collection Request.
 */
public class DomainDnsCnameRecordCollectionRequest extends BaseCollectionRequest<DomainDnsCnameRecordCollectionResponse, IDomainDnsCnameRecordCollectionPage> implements IDomainDnsCnameRecordCollectionRequest {

    /**
     * The request builder for this collection of DomainDnsCnameRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsCnameRecordCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DomainDnsCnameRecordCollectionResponse.class, IDomainDnsCnameRecordCollectionPage.class);
    }

    public void get(final ICallback<? super IDomainDnsCnameRecordCollectionPage> callback) {
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

    public IDomainDnsCnameRecordCollectionPage get() throws ClientException {
        final DomainDnsCnameRecordCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DomainDnsCnameRecord newDomainDnsCnameRecord, final ICallback<? super DomainDnsCnameRecord> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DomainDnsCnameRecordRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDomainDnsCnameRecord, callback);
    }

    public DomainDnsCnameRecord post(final DomainDnsCnameRecord newDomainDnsCnameRecord) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DomainDnsCnameRecordRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDomainDnsCnameRecord);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDomainDnsCnameRecordCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DomainDnsCnameRecordCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDomainDnsCnameRecordCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DomainDnsCnameRecordCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDomainDnsCnameRecordCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DomainDnsCnameRecordCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDomainDnsCnameRecordCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DomainDnsCnameRecordCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDomainDnsCnameRecordCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DomainDnsCnameRecordCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDomainDnsCnameRecordCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DomainDnsCnameRecordCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDomainDnsCnameRecordCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDomainDnsCnameRecordCollectionRequest)this;
    }
    public IDomainDnsCnameRecordCollectionPage buildFromResponse(final DomainDnsCnameRecordCollectionResponse response) {
        final IDomainDnsCnameRecordCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DomainDnsCnameRecordCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DomainDnsCnameRecordCollectionPage page = new DomainDnsCnameRecordCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
