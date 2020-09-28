// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Configuration With Reference Request.
 */
public interface IDeviceConfigurationWithReferenceRequest extends IHttpRequest {

    void post(final DeviceConfiguration newDeviceConfiguration, final IJsonBackedObject payload, final ICallback<? super DeviceConfiguration> callback);

    DeviceConfiguration post(final DeviceConfiguration newDeviceConfiguration, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super DeviceConfiguration> callback);

    DeviceConfiguration get() throws ClientException;

	void delete(final ICallback<? super DeviceConfiguration> callback);

	void delete() throws ClientException;

	void patch(final DeviceConfiguration sourceDeviceConfiguration, final ICallback<? super DeviceConfiguration> callback);

	DeviceConfiguration patch(final DeviceConfiguration sourceDeviceConfiguration) throws ClientException;

    IDeviceConfigurationWithReferenceRequest select(final String value);

    IDeviceConfigurationWithReferenceRequest expand(final String value);

}
