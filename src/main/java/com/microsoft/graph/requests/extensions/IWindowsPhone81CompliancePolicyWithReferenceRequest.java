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

import com.microsoft.graph.models.extensions.WindowsPhone81CompliancePolicy;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Phone81Compliance Policy With Reference Request.
 */
public interface IWindowsPhone81CompliancePolicyWithReferenceRequest extends IHttpRequest {

    void post(final WindowsPhone81CompliancePolicy newWindowsPhone81CompliancePolicy, final IJsonBackedObject payload, final ICallback<? super WindowsPhone81CompliancePolicy> callback);

    WindowsPhone81CompliancePolicy post(final WindowsPhone81CompliancePolicy newWindowsPhone81CompliancePolicy, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super WindowsPhone81CompliancePolicy> callback);

    WindowsPhone81CompliancePolicy get() throws ClientException;

	void delete(final ICallback<? super WindowsPhone81CompliancePolicy> callback);

	void delete() throws ClientException;

	void patch(final WindowsPhone81CompliancePolicy sourceWindowsPhone81CompliancePolicy, final ICallback<? super WindowsPhone81CompliancePolicy> callback);

	WindowsPhone81CompliancePolicy patch(final WindowsPhone81CompliancePolicy sourceWindowsPhone81CompliancePolicy) throws ClientException;

    IWindowsPhone81CompliancePolicyWithReferenceRequest select(final String value);

    IWindowsPhone81CompliancePolicyWithReferenceRequest expand(final String value);

}
