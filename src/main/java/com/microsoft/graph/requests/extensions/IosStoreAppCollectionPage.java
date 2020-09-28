// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosStoreApp;
import com.microsoft.graph.requests.extensions.IIosStoreAppCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.IosStoreAppCollectionPage;
import com.microsoft.graph.requests.extensions.IosStoreAppCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Store App Collection Page.
 */
public class IosStoreAppCollectionPage extends BaseCollectionPage<IosStoreApp, IIosStoreAppCollectionRequestBuilder> implements IIosStoreAppCollectionPage {

    /**
     * A collection page for IosStoreApp
     *
     * @param response the serialized IosStoreAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IosStoreAppCollectionPage(final IosStoreAppCollectionResponse response, final IIosStoreAppCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
