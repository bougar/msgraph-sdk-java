// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileLobApp;
import com.microsoft.graph.requests.extensions.IMobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile Lob App With Reference Request Builder.
 */
public interface IMobileLobAppWithReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IMobileLobAppWithReferenceRequest instance
     */
    IMobileLobAppWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IMobileLobAppWithReferenceRequest instance
     */
    IMobileLobAppWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IMobileLobAppReferenceRequestBuilder reference();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the AndroidLobApp type
     */
    IAndroidLobAppRequestBuilder castToAndroidLobApp();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the IosLobApp type
     */
    IIosLobAppRequestBuilder castToIosLobApp();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the Win32LobApp type
     */
    IWin32LobAppRequestBuilder castToWin32LobApp();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the WindowsMobileMSI type
     */
    IWindowsMobileMSIRequestBuilder castToWindowsMobileMSI();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the WindowsUniversalAppX type
     */
    IWindowsUniversalAppXRequestBuilder castToWindowsUniversalAppX();

}
