
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.requests.extensions.IAlertCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAlertRequestBuilder;
import com.microsoft.graph.requests.extensions.AlertCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AlertRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreControlProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreControlProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Reference Request Builder.
 */
public class SecurityReferenceRequestBuilder extends BaseRequestBuilder implements ISecurityReferenceRequestBuilder {

    /**
     * The request builder for the Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return The ISecurityReferenceRequest instance
     */
    public ISecurityReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISecurityReferenceRequest instance
     */
    public ISecurityReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SecurityReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}
