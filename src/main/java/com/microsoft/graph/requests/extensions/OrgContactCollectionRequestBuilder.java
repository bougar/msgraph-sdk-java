// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactCollectionRequest;
import com.microsoft.graph.requests.extensions.IOrgContactDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact Collection Request Builder.
 */
public class OrgContactCollectionRequestBuilder extends BaseRequestBuilder implements IOrgContactCollectionRequestBuilder {

    /**
     * The request builder for this collection of OrgContact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrgContactCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IOrgContactCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IOrgContactCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new OrgContactCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOrgContactRequestBuilder byId(final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IOrgContactDeltaCollectionRequestBuilder delta() {
        return new OrgContactDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

	public IOrgContactDeltaCollectionRequestBuilder delta(final String deltaLink) {
        return new OrgContactDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}
