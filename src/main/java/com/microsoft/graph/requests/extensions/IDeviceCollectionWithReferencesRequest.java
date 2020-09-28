// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Collection With References Request.
 */
public interface IDeviceCollectionWithReferencesRequest extends IHttpRequest {

    void get(final ICallback<? super IDeviceCollectionWithReferencesPage> callback);

    IDeviceCollectionWithReferencesPage get() throws ClientException;

    IDeviceCollectionWithReferencesRequest expand(final String value);
    
    IDeviceCollectionWithReferencesRequest select(final String value);

    IDeviceCollectionWithReferencesRequest top(final int value);

}
