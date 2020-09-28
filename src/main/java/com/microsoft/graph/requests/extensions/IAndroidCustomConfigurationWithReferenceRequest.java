// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidCustomConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AndroidCustomConfiguration;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Custom Configuration With Reference Request.
 */
public interface IAndroidCustomConfigurationWithReferenceRequest extends IHttpRequest {

    void post(final AndroidCustomConfiguration newAndroidCustomConfiguration, final IJsonBackedObject payload, final ICallback<? super AndroidCustomConfiguration> callback);

    AndroidCustomConfiguration post(final AndroidCustomConfiguration newAndroidCustomConfiguration, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super AndroidCustomConfiguration> callback);

    AndroidCustomConfiguration get() throws ClientException;

	void delete(final ICallback<? super AndroidCustomConfiguration> callback);

	void delete() throws ClientException;

	void patch(final AndroidCustomConfiguration sourceAndroidCustomConfiguration, final ICallback<? super AndroidCustomConfiguration> callback);

	AndroidCustomConfiguration patch(final AndroidCustomConfiguration sourceAndroidCustomConfiguration) throws ClientException;

    IAndroidCustomConfigurationWithReferenceRequest select(final String value);

    IAndroidCustomConfigurationWithReferenceRequest expand(final String value);

}
