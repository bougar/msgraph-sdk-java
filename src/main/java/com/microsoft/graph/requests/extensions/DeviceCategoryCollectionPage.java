// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceCategory;
import com.microsoft.graph.requests.extensions.IDeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Category Collection Page.
 */
public class DeviceCategoryCollectionPage extends BaseCollectionPage<DeviceCategory, IDeviceCategoryCollectionRequestBuilder> implements IDeviceCategoryCollectionPage {

    /**
     * A collection page for DeviceCategory
     *
     * @param response the serialized DeviceCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceCategoryCollectionPage(final DeviceCategoryCollectionResponse response, final IDeviceCategoryCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
