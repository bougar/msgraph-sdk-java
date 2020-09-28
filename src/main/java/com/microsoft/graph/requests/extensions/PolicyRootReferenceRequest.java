// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.requests.extensions.IActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityBasedTimeoutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionGrantPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionGrantPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Root Reference Request.
 */
public class PolicyRootReferenceRequest extends BaseRequest implements IPolicyRootReferenceRequest {

    /**
     * The request for the PolicyRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicyRootReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PolicyRoot.class);
    }

    public void delete(final ICallback<? super PolicyRoot> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public PolicyRoot delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPolicyRootReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PolicyRootReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPolicyRootReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PolicyRootReferenceRequest)this;
    }
    /**
     * Puts the PolicyRoot
     *
     * @param srcPolicyRoot the PolicyRoot reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(PolicyRoot srcPolicyRoot, final ICallback<? super PolicyRoot> callback) {
        send(HttpMethod.PUT, callback, srcPolicyRoot);
    }

    /**
     * Puts the PolicyRoot
     *
     * @param srcPolicyRoot the PolicyRoot reference to PUT
     * @return the PolicyRoot
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public PolicyRoot put(PolicyRoot srcPolicyRoot) throws ClientException {
        return send(HttpMethod.PUT, srcPolicyRoot);
    }
}
