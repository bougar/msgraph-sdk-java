// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedIOSStoreApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ManagedIOSStoreApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed IOSStore App With Reference Request.
 */
public interface IManagedIOSStoreAppWithReferenceRequest extends IHttpRequest {

    void post(final ManagedIOSStoreApp newManagedIOSStoreApp, final IJsonBackedObject payload, final ICallback<? super ManagedIOSStoreApp> callback);

    ManagedIOSStoreApp post(final ManagedIOSStoreApp newManagedIOSStoreApp, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super ManagedIOSStoreApp> callback);

    ManagedIOSStoreApp get() throws ClientException;

	void delete(final ICallback<? super ManagedIOSStoreApp> callback);

	void delete() throws ClientException;

	void patch(final ManagedIOSStoreApp sourceManagedIOSStoreApp, final ICallback<? super ManagedIOSStoreApp> callback);

	ManagedIOSStoreApp patch(final ManagedIOSStoreApp sourceManagedIOSStoreApp) throws ClientException;

    IManagedIOSStoreAppWithReferenceRequest select(final String value);

    IManagedIOSStoreAppWithReferenceRequest expand(final String value);

}
