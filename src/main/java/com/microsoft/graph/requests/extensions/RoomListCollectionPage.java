// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RoomList;
import com.microsoft.graph.requests.extensions.IRoomListCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.RoomListCollectionPage;
import com.microsoft.graph.requests.extensions.RoomListCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Room List Collection Page.
 */
public class RoomListCollectionPage extends BaseCollectionPage<RoomList, IRoomListCollectionRequestBuilder> implements IRoomListCollectionPage {

    /**
     * A collection page for RoomList
     *
     * @param response the serialized RoomListCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RoomListCollectionPage(final RoomListCollectionResponse response, final IRoomListCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
