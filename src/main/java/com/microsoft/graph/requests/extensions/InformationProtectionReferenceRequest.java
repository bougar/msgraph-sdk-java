// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InformationProtection;
import com.microsoft.graph.requests.extensions.IThreatAssessmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThreatAssessmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.ThreatAssessmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ThreatAssessmentRequestRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Reference Request.
 */
public class InformationProtectionReferenceRequest extends BaseRequest implements IInformationProtectionReferenceRequest {

    /**
     * The request for the InformationProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InformationProtectionReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InformationProtection.class);
    }

    public void delete(final ICallback<? super InformationProtection> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public InformationProtection delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IInformationProtectionReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (InformationProtectionReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IInformationProtectionReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (InformationProtectionReferenceRequest)this;
    }
    /**
     * Puts the InformationProtection
     *
     * @param srcInformationProtection the InformationProtection reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(InformationProtection srcInformationProtection, final ICallback<? super InformationProtection> callback) {
        send(HttpMethod.PUT, callback, srcInformationProtection);
    }

    /**
     * Puts the InformationProtection
     *
     * @param srcInformationProtection the InformationProtection reference to PUT
     * @return the InformationProtection
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public InformationProtection put(InformationProtection srcInformationProtection) throws ClientException {
        return send(HttpMethod.PUT, srcInformationProtection);
    }
}
