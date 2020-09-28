// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosDeviceFeaturesConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.IosDeviceFeaturesConfiguration;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Device Features Configuration With Reference Request.
 */
public interface IIosDeviceFeaturesConfigurationWithReferenceRequest extends IHttpRequest {

    void post(final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration, final IJsonBackedObject payload, final ICallback<? super IosDeviceFeaturesConfiguration> callback);

    IosDeviceFeaturesConfiguration post(final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super IosDeviceFeaturesConfiguration> callback);

    IosDeviceFeaturesConfiguration get() throws ClientException;

	void delete(final ICallback<? super IosDeviceFeaturesConfiguration> callback);

	void delete() throws ClientException;

	void patch(final IosDeviceFeaturesConfiguration sourceIosDeviceFeaturesConfiguration, final ICallback<? super IosDeviceFeaturesConfiguration> callback);

	IosDeviceFeaturesConfiguration patch(final IosDeviceFeaturesConfiguration sourceIosDeviceFeaturesConfiguration) throws ClientException;

    IIosDeviceFeaturesConfigurationWithReferenceRequest select(final String value);

    IIosDeviceFeaturesConfigurationWithReferenceRequest expand(final String value);

}
