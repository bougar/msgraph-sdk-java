// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsUniversalAppX;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Universal App XWith Reference Request Builder.
 */
public class WindowsUniversalAppXWithReferenceRequestBuilder extends BaseRequestBuilder implements IWindowsUniversalAppXWithReferenceRequestBuilder {

    /**
     * The request builder for the WindowsUniversalAppX
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsUniversalAppXWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsUniversalAppXWithReferenceRequest instance
     */
    public IWindowsUniversalAppXWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IWindowsUniversalAppXWithReferenceRequest instance
     */
    public IWindowsUniversalAppXWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WindowsUniversalAppXWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWindowsUniversalAppXReferenceRequestBuilder reference(){
        return new WindowsUniversalAppXReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
