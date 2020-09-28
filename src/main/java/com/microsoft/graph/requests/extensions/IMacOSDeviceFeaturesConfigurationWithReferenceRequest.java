// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSDeviceFeaturesConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MacOSDeviceFeaturesConfiguration;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSDevice Features Configuration With Reference Request.
 */
public interface IMacOSDeviceFeaturesConfigurationWithReferenceRequest extends IHttpRequest {

    void post(final MacOSDeviceFeaturesConfiguration newMacOSDeviceFeaturesConfiguration, final IJsonBackedObject payload, final ICallback<? super MacOSDeviceFeaturesConfiguration> callback);

    MacOSDeviceFeaturesConfiguration post(final MacOSDeviceFeaturesConfiguration newMacOSDeviceFeaturesConfiguration, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super MacOSDeviceFeaturesConfiguration> callback);

    MacOSDeviceFeaturesConfiguration get() throws ClientException;

	void delete(final ICallback<? super MacOSDeviceFeaturesConfiguration> callback);

	void delete() throws ClientException;

	void patch(final MacOSDeviceFeaturesConfiguration sourceMacOSDeviceFeaturesConfiguration, final ICallback<? super MacOSDeviceFeaturesConfiguration> callback);

	MacOSDeviceFeaturesConfiguration patch(final MacOSDeviceFeaturesConfiguration sourceMacOSDeviceFeaturesConfiguration) throws ClientException;

    IMacOSDeviceFeaturesConfigurationWithReferenceRequest select(final String value);

    IMacOSDeviceFeaturesConfigurationWithReferenceRequest expand(final String value);

}
