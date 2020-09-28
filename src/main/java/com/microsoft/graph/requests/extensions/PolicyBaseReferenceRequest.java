// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Base Reference Request.
 */
public class PolicyBaseReferenceRequest extends BaseRequest implements IPolicyBaseReferenceRequest {

    /**
     * The request for the PolicyBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicyBaseReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PolicyBase.class);
    }

    public void delete(final ICallback<? super PolicyBase> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public PolicyBase delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPolicyBaseReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PolicyBaseReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPolicyBaseReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PolicyBaseReferenceRequest)this;
    }
    /**
     * Puts the PolicyBase
     *
     * @param srcPolicyBase the PolicyBase reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(PolicyBase srcPolicyBase, final ICallback<? super PolicyBase> callback) {
        send(HttpMethod.PUT, callback, srcPolicyBase);
    }

    /**
     * Puts the PolicyBase
     *
     * @param srcPolicyBase the PolicyBase reference to PUT
     * @return the PolicyBase
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public PolicyBase put(PolicyBase srcPolicyBase) throws ClientException {
        return send(HttpMethod.PUT, srcPolicyBase);
    }
}
