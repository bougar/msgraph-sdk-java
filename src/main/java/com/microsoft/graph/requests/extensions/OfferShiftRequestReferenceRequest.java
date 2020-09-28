// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfferShiftRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Offer Shift Request Reference Request.
 */
public class OfferShiftRequestReferenceRequest extends BaseRequest implements IOfferShiftRequestReferenceRequest {

    /**
     * The request for the OfferShiftRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OfferShiftRequestReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OfferShiftRequest.class);
    }

    public void delete(final ICallback<? super OfferShiftRequest> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public OfferShiftRequest delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOfferShiftRequestReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (OfferShiftRequestReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOfferShiftRequestReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (OfferShiftRequestReferenceRequest)this;
    }
    /**
     * Puts the OfferShiftRequest
     *
     * @param srcOfferShiftRequest the OfferShiftRequest reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(OfferShiftRequest srcOfferShiftRequest, final ICallback<? super OfferShiftRequest> callback) {
        send(HttpMethod.PUT, callback, srcOfferShiftRequest);
    }

    /**
     * Puts the OfferShiftRequest
     *
     * @param srcOfferShiftRequest the OfferShiftRequest reference to PUT
     * @return the OfferShiftRequest
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public OfferShiftRequest put(OfferShiftRequest srcOfferShiftRequest) throws ClientException {
        return send(HttpMethod.PUT, srcOfferShiftRequest);
    }
}
