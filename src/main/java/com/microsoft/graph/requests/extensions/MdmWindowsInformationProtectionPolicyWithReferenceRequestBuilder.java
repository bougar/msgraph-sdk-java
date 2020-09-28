// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MdmWindowsInformationProtectionPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mdm Windows Information Protection Policy With Reference Request Builder.
 */
public class MdmWindowsInformationProtectionPolicyWithReferenceRequestBuilder extends BaseRequestBuilder implements IMdmWindowsInformationProtectionPolicyWithReferenceRequestBuilder {

    /**
     * The request builder for the MdmWindowsInformationProtectionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MdmWindowsInformationProtectionPolicyWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IMdmWindowsInformationProtectionPolicyWithReferenceRequest instance
     */
    public IMdmWindowsInformationProtectionPolicyWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IMdmWindowsInformationProtectionPolicyWithReferenceRequest instance
     */
    public IMdmWindowsInformationProtectionPolicyWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new MdmWindowsInformationProtectionPolicyWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMdmWindowsInformationProtectionPolicyReferenceRequestBuilder reference(){
        return new MdmWindowsInformationProtectionPolicyReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
