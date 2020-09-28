// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ThreatAssessmentRequest;
import com.microsoft.graph.requests.extensions.IThreatAssessmentResultCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThreatAssessmentResultRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ThreatAssessmentRequest;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Threat Assessment Request Reference Request.
 */
public interface IThreatAssessmentRequestReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super ThreatAssessmentRequest> callback);

    ThreatAssessmentRequest delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IThreatAssessmentRequestReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IThreatAssessmentRequestReferenceRequest expand(final String value);

    /**
     * Puts the ThreatAssessmentRequest
     *
     * @param srcThreatAssessmentRequest the ThreatAssessmentRequest to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(ThreatAssessmentRequest srcThreatAssessmentRequest, final ICallback<? super ThreatAssessmentRequest> callback);

    /**
     * Puts the ThreatAssessmentRequest
     *
     * @param srcThreatAssessmentRequest the ThreatAssessmentRequest to PUT
     * @return the ThreatAssessmentRequest
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    ThreatAssessmentRequest put(ThreatAssessmentRequest srcThreatAssessmentRequest) throws ClientException;
}
