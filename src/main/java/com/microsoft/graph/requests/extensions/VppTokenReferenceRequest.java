// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.VppToken;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpp Token Reference Request.
 */
public class VppTokenReferenceRequest extends BaseRequest implements IVppTokenReferenceRequest {

    /**
     * The request for the VppToken
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public VppTokenReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, VppToken.class);
    }

    public void delete(final ICallback<? super VppToken> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public VppToken delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IVppTokenReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (VppTokenReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IVppTokenReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (VppTokenReferenceRequest)this;
    }
    /**
     * Puts the VppToken
     *
     * @param srcVppToken the VppToken reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(VppToken srcVppToken, final ICallback<? super VppToken> callback) {
        send(HttpMethod.PUT, callback, srcVppToken);
    }

    /**
     * Puts the VppToken
     *
     * @param srcVppToken the VppToken reference to PUT
     * @return the VppToken
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public VppToken put(VppToken srcVppToken) throws ClientException {
        return send(HttpMethod.PUT, srcVppToken);
    }
}
