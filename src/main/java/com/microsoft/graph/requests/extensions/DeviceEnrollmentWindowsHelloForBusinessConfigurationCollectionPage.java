// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceEnrollmentWindowsHelloForBusinessConfiguration;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentWindowsHelloForBusinessConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentWindowsHelloForBusinessConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentWindowsHelloForBusinessConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Windows Hello For Business Configuration Collection Page.
 */
public class DeviceEnrollmentWindowsHelloForBusinessConfigurationCollectionPage extends BaseCollectionPage<DeviceEnrollmentWindowsHelloForBusinessConfiguration, IDeviceEnrollmentWindowsHelloForBusinessConfigurationCollectionRequestBuilder> implements IDeviceEnrollmentWindowsHelloForBusinessConfigurationCollectionPage {

    /**
     * A collection page for DeviceEnrollmentWindowsHelloForBusinessConfiguration
     *
     * @param response the serialized DeviceEnrollmentWindowsHelloForBusinessConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceEnrollmentWindowsHelloForBusinessConfigurationCollectionPage(final DeviceEnrollmentWindowsHelloForBusinessConfigurationCollectionResponse response, final IDeviceEnrollmentWindowsHelloForBusinessConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
