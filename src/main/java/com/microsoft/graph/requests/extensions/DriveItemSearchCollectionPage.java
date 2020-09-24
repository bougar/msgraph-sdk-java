// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDriveItemSearchCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemSearchCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemSearchCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Search Collection Page.
 */
public class DriveItemSearchCollectionPage extends BaseCollectionPage<DriveItem, IDriveItemSearchCollectionRequestBuilder> implements IDriveItemSearchCollectionPage {

    /**
     * A collection page for DriveItem.
     *
     * @param response The serialized DriveItemSearchCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DriveItemSearchCollectionPage(final DriveItemSearchCollectionResponse response, final IDriveItemSearchCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
