// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidGeneralDeviceConfiguration;
import com.microsoft.graph.requests.extensions.IAndroidGeneralDeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidGeneralDeviceConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidGeneralDeviceConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android General Device Configuration Collection Page.
 */
public class AndroidGeneralDeviceConfigurationCollectionPage extends BaseCollectionPage<AndroidGeneralDeviceConfiguration, IAndroidGeneralDeviceConfigurationCollectionRequestBuilder> implements IAndroidGeneralDeviceConfigurationCollectionPage {

    /**
     * A collection page for AndroidGeneralDeviceConfiguration
     *
     * @param response the serialized AndroidGeneralDeviceConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AndroidGeneralDeviceConfigurationCollectionPage(final AndroidGeneralDeviceConfigurationCollectionResponse response, final IAndroidGeneralDeviceConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
