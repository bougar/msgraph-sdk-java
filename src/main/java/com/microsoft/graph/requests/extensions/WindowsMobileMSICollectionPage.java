// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsMobileMSI;
import com.microsoft.graph.requests.extensions.IWindowsMobileMSICollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsMobileMSICollectionPage;
import com.microsoft.graph.requests.extensions.WindowsMobileMSICollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Mobile MSICollection Page.
 */
public class WindowsMobileMSICollectionPage extends BaseCollectionPage<WindowsMobileMSI, IWindowsMobileMSICollectionRequestBuilder> implements IWindowsMobileMSICollectionPage {

    /**
     * A collection page for WindowsMobileMSI
     *
     * @param response the serialized WindowsMobileMSICollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsMobileMSICollectionPage(final WindowsMobileMSICollectionResponse response, final IWindowsMobileMSICollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
