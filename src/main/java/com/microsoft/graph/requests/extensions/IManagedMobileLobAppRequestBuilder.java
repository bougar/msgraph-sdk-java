// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedMobileLobApp;
import com.microsoft.graph.requests.extensions.IMobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Mobile Lob App Request Builder.
 */
public interface IManagedMobileLobAppRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IManagedMobileLobAppRequest instance
     */
    IManagedMobileLobAppRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IManagedMobileLobAppRequest instance
     */
    IManagedMobileLobAppRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IMobileAppAssignmentCollectionRequestBuilder assignments();

    IMobileAppAssignmentRequestBuilder assignments(final String id);

    IMobileAppCategoryCollectionWithReferencesRequestBuilder categories();

    IMobileAppCategoryWithReferenceRequestBuilder categories(final String id);

    IMobileAppContentCollectionRequestBuilder contentVersions();

    IMobileAppContentRequestBuilder contentVersions(final String id);

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the ManagedAndroidLobApp type
     */
    IManagedAndroidLobAppRequestBuilder castToManagedAndroidLobApp();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the ManagedIOSLobApp type
     */
    IManagedIOSLobAppRequestBuilder castToManagedIOSLobApp();

}