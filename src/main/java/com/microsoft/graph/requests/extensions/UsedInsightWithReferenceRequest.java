// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UsedInsight;
import com.microsoft.graph.requests.extensions.IEntityRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Used Insight With Reference Request.
 */
public class UsedInsightWithReferenceRequest extends BaseRequest implements IUsedInsightWithReferenceRequest {

    /**
     * The request for the UsedInsight
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UsedInsightWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UsedInsight.class);
    }

    public void post(final UsedInsight newUsedInsight, final IJsonBackedObject payload, final ICallback<? super UsedInsight> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public UsedInsight post(final UsedInsight newUsedInsight, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newUsedInsight;
        }
        return null;
    }

    public void get(final ICallback<? super UsedInsight> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public UsedInsight get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super UsedInsight> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final UsedInsight sourceUsedInsight, final ICallback<? super UsedInsight> callback) {
		send(HttpMethod.PATCH, callback, sourceUsedInsight);
	}

	public UsedInsight patch(final UsedInsight sourceUsedInsight) throws ClientException {
		return send(HttpMethod.PATCH, sourceUsedInsight);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUsedInsightWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IUsedInsightWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUsedInsightWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UsedInsightWithReferenceRequest)this;
    }
}
