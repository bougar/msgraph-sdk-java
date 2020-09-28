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

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Base With Reference Request Builder.
 */
public class PolicyBaseWithReferenceRequestBuilder extends BaseRequestBuilder implements IPolicyBaseWithReferenceRequestBuilder {

    /**
     * The request builder for the PolicyBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicyBaseWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPolicyBaseWithReferenceRequest instance
     */
    public IPolicyBaseWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IPolicyBaseWithReferenceRequest instance
     */
    public IPolicyBaseWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PolicyBaseWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPolicyBaseReferenceRequestBuilder reference(){
        return new PolicyBaseReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the StsPolicy type
     */
    public IStsPolicyRequestBuilder castToStsPolicy() {
        return new StsPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stsPolicy"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the PermissionGrantPolicy type
     */
    public IPermissionGrantPolicyRequestBuilder castToPermissionGrantPolicy() {
        return new PermissionGrantPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.permissionGrantPolicy"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the IdentitySecurityDefaultsEnforcementPolicy type
     */
    public IIdentitySecurityDefaultsEnforcementPolicyRequestBuilder castToIdentitySecurityDefaultsEnforcementPolicy() {
        return new IdentitySecurityDefaultsEnforcementPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.identitySecurityDefaultsEnforcementPolicy"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the HomeRealmDiscoveryPolicy type
     */
    public IHomeRealmDiscoveryPolicyRequestBuilder castToHomeRealmDiscoveryPolicy() {
        return new HomeRealmDiscoveryPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.homeRealmDiscoveryPolicy"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the TokenIssuancePolicy type
     */
    public ITokenIssuancePolicyRequestBuilder castToTokenIssuancePolicy() {
        return new TokenIssuancePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tokenIssuancePolicy"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the TokenLifetimePolicy type
     */
    public ITokenLifetimePolicyRequestBuilder castToTokenLifetimePolicy() {
        return new TokenLifetimePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tokenLifetimePolicy"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the ActivityBasedTimeoutPolicy type
     */
    public IActivityBasedTimeoutPolicyRequestBuilder castToActivityBasedTimeoutPolicy() {
        return new ActivityBasedTimeoutPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.activityBasedTimeoutPolicy"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the ClaimsMappingPolicy type
     */
    public IClaimsMappingPolicyRequestBuilder castToClaimsMappingPolicy() {
        return new ClaimsMappingPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.claimsMappingPolicy"), getClient(), null);
    }

}
