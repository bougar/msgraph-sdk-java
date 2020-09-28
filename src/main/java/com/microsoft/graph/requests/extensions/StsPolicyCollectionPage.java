// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.StsPolicy;
import com.microsoft.graph.requests.extensions.IStsPolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.StsPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.StsPolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sts Policy Collection Page.
 */
public class StsPolicyCollectionPage extends BaseCollectionPage<StsPolicy, IStsPolicyCollectionRequestBuilder> implements IStsPolicyCollectionPage {

    /**
     * A collection page for StsPolicy
     *
     * @param response the serialized StsPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public StsPolicyCollectionPage(final StsPolicyCollectionResponse response, final IStsPolicyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
