// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosLobApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.IosLobApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Lob App With Reference Request.
 */
public interface IIosLobAppWithReferenceRequest extends IHttpRequest {

    void post(final IosLobApp newIosLobApp, final IJsonBackedObject payload, final ICallback<? super IosLobApp> callback);

    IosLobApp post(final IosLobApp newIosLobApp, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super IosLobApp> callback);

    IosLobApp get() throws ClientException;

	void delete(final ICallback<? super IosLobApp> callback);

	void delete() throws ClientException;

	void patch(final IosLobApp sourceIosLobApp, final ICallback<? super IosLobApp> callback);

	IosLobApp patch(final IosLobApp sourceIosLobApp) throws ClientException;

    IIosLobAppWithReferenceRequest select(final String value);

    IIosLobAppWithReferenceRequest expand(final String value);

}
