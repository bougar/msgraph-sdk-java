// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharedDriveItem;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.SharedDriveItem;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Shared Drive Item With Reference Request.
 */
public interface ISharedDriveItemWithReferenceRequest extends IHttpRequest {

    void post(final SharedDriveItem newSharedDriveItem, final IJsonBackedObject payload, final ICallback<? super SharedDriveItem> callback);

    SharedDriveItem post(final SharedDriveItem newSharedDriveItem, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super SharedDriveItem> callback);

    SharedDriveItem get() throws ClientException;

	void delete(final ICallback<? super SharedDriveItem> callback);

	void delete() throws ClientException;

	void patch(final SharedDriveItem sourceSharedDriveItem, final ICallback<? super SharedDriveItem> callback);

	SharedDriveItem patch(final SharedDriveItem sourceSharedDriveItem) throws ClientException;

    ISharedDriveItemWithReferenceRequest select(final String value);

    ISharedDriveItemWithReferenceRequest expand(final String value);

}
