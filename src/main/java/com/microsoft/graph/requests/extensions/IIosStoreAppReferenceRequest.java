// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosStoreApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.IosStoreApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Store App Reference Request.
 */
public interface IIosStoreAppReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super IosStoreApp> callback);

    IosStoreApp delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIosStoreAppReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIosStoreAppReferenceRequest expand(final String value);

    /**
     * Puts the IosStoreApp
     *
     * @param srcIosStoreApp the IosStoreApp to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(IosStoreApp srcIosStoreApp, final ICallback<? super IosStoreApp> callback);

    /**
     * Puts the IosStoreApp
     *
     * @param srcIosStoreApp the IosStoreApp to PUT
     * @return the IosStoreApp
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    IosStoreApp put(IosStoreApp srcIosStoreApp) throws ClientException;
}
