// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MicrosoftStoreForBusinessApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MicrosoftStoreForBusinessApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Microsoft Store For Business App With Reference Request.
 */
public interface IMicrosoftStoreForBusinessAppWithReferenceRequest extends IHttpRequest {

    void post(final MicrosoftStoreForBusinessApp newMicrosoftStoreForBusinessApp, final IJsonBackedObject payload, final ICallback<? super MicrosoftStoreForBusinessApp> callback);

    MicrosoftStoreForBusinessApp post(final MicrosoftStoreForBusinessApp newMicrosoftStoreForBusinessApp, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super MicrosoftStoreForBusinessApp> callback);

    MicrosoftStoreForBusinessApp get() throws ClientException;

	void delete(final ICallback<? super MicrosoftStoreForBusinessApp> callback);

	void delete() throws ClientException;

	void patch(final MicrosoftStoreForBusinessApp sourceMicrosoftStoreForBusinessApp, final ICallback<? super MicrosoftStoreForBusinessApp> callback);

	MicrosoftStoreForBusinessApp patch(final MicrosoftStoreForBusinessApp sourceMicrosoftStoreForBusinessApp) throws ClientException;

    IMicrosoftStoreForBusinessAppWithReferenceRequest select(final String value);

    IMicrosoftStoreForBusinessAppWithReferenceRequest expand(final String value);

}
