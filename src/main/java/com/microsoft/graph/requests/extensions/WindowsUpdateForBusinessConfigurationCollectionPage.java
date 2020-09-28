// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsUpdateForBusinessConfiguration;
import com.microsoft.graph.requests.extensions.IWindowsUpdateForBusinessConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsUpdateForBusinessConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsUpdateForBusinessConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update For Business Configuration Collection Page.
 */
public class WindowsUpdateForBusinessConfigurationCollectionPage extends BaseCollectionPage<WindowsUpdateForBusinessConfiguration, IWindowsUpdateForBusinessConfigurationCollectionRequestBuilder> implements IWindowsUpdateForBusinessConfigurationCollectionPage {

    /**
     * A collection page for WindowsUpdateForBusinessConfiguration
     *
     * @param response the serialized WindowsUpdateForBusinessConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsUpdateForBusinessConfigurationCollectionPage(final WindowsUpdateForBusinessConfigurationCollectionResponse response, final IWindowsUpdateForBusinessConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
