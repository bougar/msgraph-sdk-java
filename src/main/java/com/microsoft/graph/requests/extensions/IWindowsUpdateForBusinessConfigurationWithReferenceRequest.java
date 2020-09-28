// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsUpdateForBusinessConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WindowsUpdateForBusinessConfiguration;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Update For Business Configuration With Reference Request.
 */
public interface IWindowsUpdateForBusinessConfigurationWithReferenceRequest extends IHttpRequest {

    void post(final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration, final IJsonBackedObject payload, final ICallback<? super WindowsUpdateForBusinessConfiguration> callback);

    WindowsUpdateForBusinessConfiguration post(final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super WindowsUpdateForBusinessConfiguration> callback);

    WindowsUpdateForBusinessConfiguration get() throws ClientException;

	void delete(final ICallback<? super WindowsUpdateForBusinessConfiguration> callback);

	void delete() throws ClientException;

	void patch(final WindowsUpdateForBusinessConfiguration sourceWindowsUpdateForBusinessConfiguration, final ICallback<? super WindowsUpdateForBusinessConfiguration> callback);

	WindowsUpdateForBusinessConfiguration patch(final WindowsUpdateForBusinessConfiguration sourceWindowsUpdateForBusinessConfiguration) throws ClientException;

    IWindowsUpdateForBusinessConfigurationWithReferenceRequest select(final String value);

    IWindowsUpdateForBusinessConfigurationWithReferenceRequest expand(final String value);

}
