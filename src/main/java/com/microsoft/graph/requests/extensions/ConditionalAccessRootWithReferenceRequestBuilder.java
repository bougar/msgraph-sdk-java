// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConditionalAccessRoot;
import com.microsoft.graph.requests.extensions.INamedLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INamedLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.NamedLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NamedLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Root With Reference Request Builder.
 */
public class ConditionalAccessRootWithReferenceRequestBuilder extends BaseRequestBuilder implements IConditionalAccessRootWithReferenceRequestBuilder {

    /**
     * The request builder for the ConditionalAccessRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConditionalAccessRootWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IConditionalAccessRootWithReferenceRequest instance
     */
    public IConditionalAccessRootWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IConditionalAccessRootWithReferenceRequest instance
     */
    public IConditionalAccessRootWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ConditionalAccessRootWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IConditionalAccessRootReferenceRequestBuilder reference(){
        return new ConditionalAccessRootReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
