// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentitySecurityDefaultsEnforcementPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IIdentitySecurityDefaultsEnforcementPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentitySecurityDefaultsEnforcementPolicyCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Security Defaults Enforcement Policy Collection Request Builder.
 */
public class IdentitySecurityDefaultsEnforcementPolicyCollectionRequestBuilder extends BaseRequestBuilder implements IIdentitySecurityDefaultsEnforcementPolicyCollectionRequestBuilder {

    /**
     * The request builder for this collection of IdentitySecurityDefaultsEnforcementPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentitySecurityDefaultsEnforcementPolicyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IIdentitySecurityDefaultsEnforcementPolicyCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IIdentitySecurityDefaultsEnforcementPolicyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new IdentitySecurityDefaultsEnforcementPolicyCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IIdentitySecurityDefaultsEnforcementPolicyRequestBuilder byId(final String id) {
        return new IdentitySecurityDefaultsEnforcementPolicyRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
