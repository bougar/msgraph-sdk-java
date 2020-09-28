// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidCompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AndroidCompliancePolicy;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Compliance Policy With Reference Request.
 */
public interface IAndroidCompliancePolicyWithReferenceRequest extends IHttpRequest {

    void post(final AndroidCompliancePolicy newAndroidCompliancePolicy, final IJsonBackedObject payload, final ICallback<? super AndroidCompliancePolicy> callback);

    AndroidCompliancePolicy post(final AndroidCompliancePolicy newAndroidCompliancePolicy, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super AndroidCompliancePolicy> callback);

    AndroidCompliancePolicy get() throws ClientException;

	void delete(final ICallback<? super AndroidCompliancePolicy> callback);

	void delete() throws ClientException;

	void patch(final AndroidCompliancePolicy sourceAndroidCompliancePolicy, final ICallback<? super AndroidCompliancePolicy> callback);

	AndroidCompliancePolicy patch(final AndroidCompliancePolicy sourceAndroidCompliancePolicy) throws ClientException;

    IAndroidCompliancePolicyWithReferenceRequest select(final String value);

    IAndroidCompliancePolicyWithReferenceRequest expand(final String value);

}
