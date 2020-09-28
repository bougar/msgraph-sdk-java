// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81CompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWindowsPhone81CompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsPhone81CompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsPhone81CompliancePolicyCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Compliance Policy Collection Request Builder.
 */
public class WindowsPhone81CompliancePolicyCollectionRequestBuilder extends BaseRequestBuilder implements IWindowsPhone81CompliancePolicyCollectionRequestBuilder {

    /**
     * The request builder for this collection of WindowsPhone81CompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81CompliancePolicyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWindowsPhone81CompliancePolicyCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWindowsPhone81CompliancePolicyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WindowsPhone81CompliancePolicyCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWindowsPhone81CompliancePolicyRequestBuilder byId(final String id) {
        return new WindowsPhone81CompliancePolicyRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
