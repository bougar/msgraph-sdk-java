// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppProtection;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppProtectionCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Protection Collection Request Builder.
 */
public class ManagedAppProtectionCollectionRequestBuilder extends BaseRequestBuilder implements IManagedAppProtectionCollectionRequestBuilder {

    /**
     * The request builder for this collection of ManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppProtectionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IManagedAppProtectionCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IManagedAppProtectionCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ManagedAppProtectionCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagedAppProtectionRequestBuilder byId(final String id) {
        return new ManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the TargetedManagedAppProtection type
     */
    public ITargetedManagedAppProtectionCollectionRequestBuilder castToTargetedManagedAppProtection() {
        return new TargetedManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.targetedManagedAppProtection"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the DefaultManagedAppProtection type
     */
    public IDefaultManagedAppProtectionCollectionRequestBuilder castToDefaultManagedAppProtection() {
        return new DefaultManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.defaultManagedAppProtection"), getClient(), null);
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
