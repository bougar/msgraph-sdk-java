// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BaseItemVersion;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Item Version With Reference Request Builder.
 */
public class BaseItemVersionWithReferenceRequestBuilder extends BaseRequestBuilder implements IBaseItemVersionWithReferenceRequestBuilder {

    /**
     * The request builder for the BaseItemVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseItemVersionWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IBaseItemVersionWithReferenceRequest instance
     */
    public IBaseItemVersionWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IBaseItemVersionWithReferenceRequest instance
     */
    public IBaseItemVersionWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new BaseItemVersionWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IBaseItemVersionReferenceRequestBuilder reference(){
        return new BaseItemVersionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the DriveItemVersion type
     */
    public IDriveItemVersionRequestBuilder castToDriveItemVersion() {
        return new DriveItemVersionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.driveItemVersion"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the ListItemVersion type
     */
    public IListItemVersionRequestBuilder castToListItemVersion() {
        return new ListItemVersionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.listItemVersion"), getClient(), null);
    }

}
