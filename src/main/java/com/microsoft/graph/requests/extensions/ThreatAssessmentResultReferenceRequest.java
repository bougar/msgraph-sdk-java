// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ThreatAssessmentResult;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Result Reference Request.
 */
public class ThreatAssessmentResultReferenceRequest extends BaseRequest implements IThreatAssessmentResultReferenceRequest {

    /**
     * The request for the ThreatAssessmentResult
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThreatAssessmentResultReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ThreatAssessmentResult.class);
    }

    public void delete(final ICallback<? super ThreatAssessmentResult> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ThreatAssessmentResult delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IThreatAssessmentResultReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ThreatAssessmentResultReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IThreatAssessmentResultReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ThreatAssessmentResultReferenceRequest)this;
    }
    /**
     * Puts the ThreatAssessmentResult
     *
     * @param srcThreatAssessmentResult the ThreatAssessmentResult reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ThreatAssessmentResult srcThreatAssessmentResult, final ICallback<? super ThreatAssessmentResult> callback) {
        send(HttpMethod.PUT, callback, srcThreatAssessmentResult);
    }

    /**
     * Puts the ThreatAssessmentResult
     *
     * @param srcThreatAssessmentResult the ThreatAssessmentResult reference to PUT
     * @return the ThreatAssessmentResult
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ThreatAssessmentResult put(ThreatAssessmentResult srcThreatAssessmentResult) throws ClientException {
        return send(HttpMethod.PUT, srcThreatAssessmentResult);
    }
}
