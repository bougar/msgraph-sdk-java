// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Collection With References Request Builder.
 */
public class ManagedAppRegistrationCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements IManagedAppRegistrationCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IManagedAppRegistrationCollectionWithReferencesRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IManagedAppRegistrationCollectionWithReferencesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ManagedAppRegistrationCollectionWithReferencesRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagedAppRegistrationWithReferenceRequestBuilder byId(final String id) {
        return new ManagedAppRegistrationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IManagedAppRegistrationCollectionReferenceRequestBuilder references(){
        return new ManagedAppRegistrationCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the AndroidManagedAppRegistration type
     */
    public IAndroidManagedAppRegistrationCollectionRequestBuilder castToAndroidManagedAppRegistration() {
        return new AndroidManagedAppRegistrationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.androidManagedAppRegistration"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the IosManagedAppRegistration type
     */
    public IIosManagedAppRegistrationCollectionRequestBuilder castToIosManagedAppRegistration() {
        return new IosManagedAppRegistrationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.iosManagedAppRegistration"), getClient(), null);
    }
}
