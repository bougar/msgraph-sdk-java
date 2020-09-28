// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10EnterpriseModernAppManagementConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWindows10EnterpriseModernAppManagementConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindows10EnterpriseModernAppManagementConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindows10EnterpriseModernAppManagementConfigurationCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Enterprise Modern App Management Configuration Collection Request Builder.
 */
public class Windows10EnterpriseModernAppManagementConfigurationCollectionRequestBuilder extends BaseRequestBuilder implements IWindows10EnterpriseModernAppManagementConfigurationCollectionRequestBuilder {

    /**
     * The request builder for this collection of Windows10EnterpriseModernAppManagementConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10EnterpriseModernAppManagementConfigurationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWindows10EnterpriseModernAppManagementConfigurationCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWindows10EnterpriseModernAppManagementConfigurationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new Windows10EnterpriseModernAppManagementConfigurationCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWindows10EnterpriseModernAppManagementConfigurationRequestBuilder byId(final String id) {
        return new Windows10EnterpriseModernAppManagementConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
