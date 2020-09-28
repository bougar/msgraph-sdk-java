// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ManagedApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed App With Reference Request.
 */
public interface IManagedAppWithReferenceRequest extends IHttpRequest {

    void post(final ManagedApp newManagedApp, final IJsonBackedObject payload, final ICallback<? super ManagedApp> callback);

    ManagedApp post(final ManagedApp newManagedApp, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super ManagedApp> callback);

    ManagedApp get() throws ClientException;

	void delete(final ICallback<? super ManagedApp> callback);

	void delete() throws ClientException;

	void patch(final ManagedApp sourceManagedApp, final ICallback<? super ManagedApp> callback);

	ManagedApp patch(final ManagedApp sourceManagedApp) throws ClientException;

    IManagedAppWithReferenceRequest select(final String value);

    IManagedAppWithReferenceRequest expand(final String value);

}
