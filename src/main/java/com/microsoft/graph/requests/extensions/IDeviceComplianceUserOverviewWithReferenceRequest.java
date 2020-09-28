// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComplianceUserOverview;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DeviceComplianceUserOverview;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance User Overview With Reference Request.
 */
public interface IDeviceComplianceUserOverviewWithReferenceRequest extends IHttpRequest {

    void post(final DeviceComplianceUserOverview newDeviceComplianceUserOverview, final IJsonBackedObject payload, final ICallback<? super DeviceComplianceUserOverview> callback);

    DeviceComplianceUserOverview post(final DeviceComplianceUserOverview newDeviceComplianceUserOverview, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super DeviceComplianceUserOverview> callback);

    DeviceComplianceUserOverview get() throws ClientException;

	void delete(final ICallback<? super DeviceComplianceUserOverview> callback);

	void delete() throws ClientException;

	void patch(final DeviceComplianceUserOverview sourceDeviceComplianceUserOverview, final ICallback<? super DeviceComplianceUserOverview> callback);

	DeviceComplianceUserOverview patch(final DeviceComplianceUserOverview sourceDeviceComplianceUserOverview) throws ClientException;

    IDeviceComplianceUserOverviewWithReferenceRequest select(final String value);

    IDeviceComplianceUserOverviewWithReferenceRequest expand(final String value);

}
