// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidLobApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AndroidLobApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Lob App Reference Request.
 */
public interface IAndroidLobAppReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super AndroidLobApp> callback);

    AndroidLobApp delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidLobAppReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidLobAppReferenceRequest expand(final String value);

    /**
     * Puts the AndroidLobApp
     *
     * @param srcAndroidLobApp the AndroidLobApp to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(AndroidLobApp srcAndroidLobApp, final ICallback<? super AndroidLobApp> callback);

    /**
     * Puts the AndroidLobApp
     *
     * @param srcAndroidLobApp the AndroidLobApp to PUT
     * @return the AndroidLobApp
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    AndroidLobApp put(AndroidLobApp srcAndroidLobApp) throws ClientException;
}
