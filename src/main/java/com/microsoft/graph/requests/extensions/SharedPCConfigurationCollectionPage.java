// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SharedPCConfiguration;
import com.microsoft.graph.requests.extensions.ISharedPCConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SharedPCConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.SharedPCConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared PCConfiguration Collection Page.
 */
public class SharedPCConfigurationCollectionPage extends BaseCollectionPage<SharedPCConfiguration, ISharedPCConfigurationCollectionRequestBuilder> implements ISharedPCConfigurationCollectionPage {

    /**
     * A collection page for SharedPCConfiguration
     *
     * @param response the serialized SharedPCConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SharedPCConfigurationCollectionPage(final SharedPCConfigurationCollectionResponse response, final ISharedPCConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
