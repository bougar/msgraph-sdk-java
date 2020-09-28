// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TargetedManagedAppProtection;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITargetedManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppProtectionCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Protection Collection Request Builder.
 */
public class TargetedManagedAppProtectionCollectionRequestBuilder extends BaseRequestBuilder implements ITargetedManagedAppProtectionCollectionRequestBuilder {

    /**
     * The request builder for this collection of TargetedManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppProtectionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITargetedManagedAppProtectionCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITargetedManagedAppProtectionCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TargetedManagedAppProtectionCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITargetedManagedAppProtectionRequestBuilder byId(final String id) {
        return new TargetedManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the AndroidManagedAppProtection type
     */
    public IAndroidManagedAppProtectionCollectionRequestBuilder castToAndroidManagedAppProtection() {
        return new AndroidManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.androidManagedAppProtection"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the IosManagedAppProtection type
     */
    public IIosManagedAppProtectionCollectionRequestBuilder castToIosManagedAppProtection() {
        return new IosManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.iosManagedAppProtection"), getClient(), null);
    }
}
