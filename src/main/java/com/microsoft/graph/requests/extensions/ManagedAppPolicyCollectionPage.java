// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Policy Collection Page.
 */
public class ManagedAppPolicyCollectionPage extends BaseCollectionPage<ManagedAppPolicy, IManagedAppPolicyCollectionRequestBuilder> implements IManagedAppPolicyCollectionPage {

    /**
     * A collection page for ManagedAppPolicy
     *
     * @param response the serialized ManagedAppPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedAppPolicyCollectionPage(final ManagedAppPolicyCollectionResponse response, final IManagedAppPolicyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
