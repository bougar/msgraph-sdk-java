// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Directory;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory With Reference Request Builder.
 */
public class DirectoryWithReferenceRequestBuilder extends BaseRequestBuilder implements IDirectoryWithReferenceRequestBuilder {

    /**
     * The request builder for the Directory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDirectoryWithReferenceRequest instance
     */
    public IDirectoryWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IDirectoryWithReferenceRequest instance
     */
    public IDirectoryWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DirectoryWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDirectoryReferenceRequestBuilder reference(){
        return new DirectoryReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
