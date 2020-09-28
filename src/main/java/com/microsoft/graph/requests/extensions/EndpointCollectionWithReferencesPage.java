// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Endpoint;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.EndpointCollectionResponse;
import com.microsoft.graph.models.extensions.Endpoint;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Endpoint Collection With References Page.
 */
public class EndpointCollectionWithReferencesPage extends BaseCollectionPage<Endpoint, IEndpointCollectionWithReferencesRequestBuilder> implements IEndpointCollectionWithReferencesPage {

    /**
     * A collection page for Endpoint
     *
     * @param response the serialized EndpointCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EndpointCollectionWithReferencesPage(final EndpointCollectionResponse response, final IEndpointCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
