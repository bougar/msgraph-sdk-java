// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IdentitySecurityDefaultsEnforcementPolicy;
import com.microsoft.graph.requests.extensions.IIdentitySecurityDefaultsEnforcementPolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.IdentitySecurityDefaultsEnforcementPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.IdentitySecurityDefaultsEnforcementPolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Security Defaults Enforcement Policy Collection Page.
 */
public class IdentitySecurityDefaultsEnforcementPolicyCollectionPage extends BaseCollectionPage<IdentitySecurityDefaultsEnforcementPolicy, IIdentitySecurityDefaultsEnforcementPolicyCollectionRequestBuilder> implements IIdentitySecurityDefaultsEnforcementPolicyCollectionPage {

    /**
     * A collection page for IdentitySecurityDefaultsEnforcementPolicy
     *
     * @param response the serialized IdentitySecurityDefaultsEnforcementPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IdentitySecurityDefaultsEnforcementPolicyCollectionPage(final IdentitySecurityDefaultsEnforcementPolicyCollectionResponse response, final IIdentitySecurityDefaultsEnforcementPolicyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
