// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComplianceDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DeviceComplianceDeviceStatus;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Device Status With Reference Request.
 */
public interface IDeviceComplianceDeviceStatusWithReferenceRequest extends IHttpRequest {

    void post(final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus, final IJsonBackedObject payload, final ICallback<? super DeviceComplianceDeviceStatus> callback);

    DeviceComplianceDeviceStatus post(final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super DeviceComplianceDeviceStatus> callback);

    DeviceComplianceDeviceStatus get() throws ClientException;

	void delete(final ICallback<? super DeviceComplianceDeviceStatus> callback);

	void delete() throws ClientException;

	void patch(final DeviceComplianceDeviceStatus sourceDeviceComplianceDeviceStatus, final ICallback<? super DeviceComplianceDeviceStatus> callback);

	DeviceComplianceDeviceStatus patch(final DeviceComplianceDeviceStatus sourceDeviceComplianceDeviceStatus) throws ClientException;

    IDeviceComplianceDeviceStatusWithReferenceRequest select(final String value);

    IDeviceComplianceDeviceStatusWithReferenceRequest expand(final String value);

}
