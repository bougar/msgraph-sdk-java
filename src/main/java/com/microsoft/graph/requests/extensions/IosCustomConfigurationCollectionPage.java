// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosCustomConfiguration;
import com.microsoft.graph.requests.extensions.IIosCustomConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.IosCustomConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.IosCustomConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Custom Configuration Collection Page.
 */
public class IosCustomConfigurationCollectionPage extends BaseCollectionPage<IosCustomConfiguration, IIosCustomConfigurationCollectionRequestBuilder> implements IIosCustomConfigurationCollectionPage {

    /**
     * A collection page for IosCustomConfiguration
     *
     * @param response the serialized IosCustomConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IosCustomConfigurationCollectionPage(final IosCustomConfigurationCollectionResponse response, final IIosCustomConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
