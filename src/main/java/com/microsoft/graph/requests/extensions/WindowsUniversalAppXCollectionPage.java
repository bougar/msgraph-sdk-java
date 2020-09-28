// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsUniversalAppX;
import com.microsoft.graph.requests.extensions.IWindowsUniversalAppXCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsUniversalAppXCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsUniversalAppXCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Universal App XCollection Page.
 */
public class WindowsUniversalAppXCollectionPage extends BaseCollectionPage<WindowsUniversalAppX, IWindowsUniversalAppXCollectionRequestBuilder> implements IWindowsUniversalAppXCollectionPage {

    /**
     * A collection page for WindowsUniversalAppX
     *
     * @param response the serialized WindowsUniversalAppXCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsUniversalAppXCollectionPage(final WindowsUniversalAppXCollectionResponse response, final IWindowsUniversalAppXCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
