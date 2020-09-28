// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ManagedAppConfiguration;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed App Configuration With Reference Request.
 */
public interface IManagedAppConfigurationWithReferenceRequest extends IHttpRequest {

    void post(final ManagedAppConfiguration newManagedAppConfiguration, final IJsonBackedObject payload, final ICallback<? super ManagedAppConfiguration> callback);

    ManagedAppConfiguration post(final ManagedAppConfiguration newManagedAppConfiguration, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super ManagedAppConfiguration> callback);

    ManagedAppConfiguration get() throws ClientException;

	void delete(final ICallback<? super ManagedAppConfiguration> callback);

	void delete() throws ClientException;

	void patch(final ManagedAppConfiguration sourceManagedAppConfiguration, final ICallback<? super ManagedAppConfiguration> callback);

	ManagedAppConfiguration patch(final ManagedAppConfiguration sourceManagedAppConfiguration) throws ClientException;

    IManagedAppConfigurationWithReferenceRequest select(final String value);

    IManagedAppConfigurationWithReferenceRequest expand(final String value);

}
