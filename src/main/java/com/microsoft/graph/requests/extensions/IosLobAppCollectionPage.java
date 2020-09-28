// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosLobApp;
import com.microsoft.graph.requests.extensions.IIosLobAppCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.IosLobAppCollectionPage;
import com.microsoft.graph.requests.extensions.IosLobAppCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Collection Page.
 */
public class IosLobAppCollectionPage extends BaseCollectionPage<IosLobApp, IIosLobAppCollectionRequestBuilder> implements IIosLobAppCollectionPage {

    /**
     * A collection page for IosLobApp
     *
     * @param response the serialized IosLobAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IosLobAppCollectionPage(final IosLobAppCollectionResponse response, final IIosLobAppCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
