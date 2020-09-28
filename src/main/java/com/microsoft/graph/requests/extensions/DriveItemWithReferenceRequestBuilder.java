// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.models.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.models.extensions.Permission;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.ItemPreviewInfo;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThumbnailSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThumbnailSetRequestBuilder;
import com.microsoft.graph.requests.extensions.ThumbnailSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ThumbnailSetRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item With Reference Request Builder.
 */
public class DriveItemWithReferenceRequestBuilder extends BaseRequestBuilder implements IDriveItemWithReferenceRequestBuilder {

    /**
     * The request builder for the DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDriveItemWithReferenceRequest instance
     */
    public IDriveItemWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IDriveItemWithReferenceRequest instance
     */
    public IDriveItemWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DriveItemWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDriveItemReferenceRequestBuilder reference(){
        return new DriveItemReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
