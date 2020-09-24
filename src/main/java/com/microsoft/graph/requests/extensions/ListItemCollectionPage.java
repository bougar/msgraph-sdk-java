// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ListItem;
import com.microsoft.graph.requests.extensions.IListItemCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ListItemCollectionPage;
import com.microsoft.graph.requests.extensions.ListItemCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Collection Page.
 */
public class ListItemCollectionPage extends BaseCollectionPage<ListItem, IListItemCollectionRequestBuilder> implements IListItemCollectionPage {

    /**
     * A collection page for ListItem
     *
     * @param response the serialized ListItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ListItemCollectionPage(final ListItemCollectionResponse response, final IListItemCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
