// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidWorkProfileCustomConfiguration;
import com.microsoft.graph.requests.extensions.IAndroidWorkProfileCustomConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidWorkProfileCustomConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidWorkProfileCustomConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Custom Configuration Collection Page.
 */
public class AndroidWorkProfileCustomConfigurationCollectionPage extends BaseCollectionPage<AndroidWorkProfileCustomConfiguration, IAndroidWorkProfileCustomConfigurationCollectionRequestBuilder> implements IAndroidWorkProfileCustomConfigurationCollectionPage {

    /**
     * A collection page for AndroidWorkProfileCustomConfiguration
     *
     * @param response the serialized AndroidWorkProfileCustomConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AndroidWorkProfileCustomConfigurationCollectionPage(final AndroidWorkProfileCustomConfigurationCollectionResponse response, final IAndroidWorkProfileCustomConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
