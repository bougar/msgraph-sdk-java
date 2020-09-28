// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.StsPolicy;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IStsPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IStsPolicyCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.StsPolicyCollectionResponse;
import com.microsoft.graph.models.extensions.StsPolicy;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sts Policy Collection With References Page.
 */
public class StsPolicyCollectionWithReferencesPage extends BaseCollectionPage<StsPolicy, IStsPolicyCollectionWithReferencesRequestBuilder> implements IStsPolicyCollectionWithReferencesPage {

    /**
     * A collection page for StsPolicy
     *
     * @param response the serialized StsPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public StsPolicyCollectionWithReferencesPage(final StsPolicyCollectionResponse response, final IStsPolicyCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
