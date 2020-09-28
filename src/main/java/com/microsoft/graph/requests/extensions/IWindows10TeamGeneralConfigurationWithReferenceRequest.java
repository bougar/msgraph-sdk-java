// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10TeamGeneralConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Windows10TeamGeneralConfiguration;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows10Team General Configuration With Reference Request.
 */
public interface IWindows10TeamGeneralConfigurationWithReferenceRequest extends IHttpRequest {

    void post(final Windows10TeamGeneralConfiguration newWindows10TeamGeneralConfiguration, final IJsonBackedObject payload, final ICallback<? super Windows10TeamGeneralConfiguration> callback);

    Windows10TeamGeneralConfiguration post(final Windows10TeamGeneralConfiguration newWindows10TeamGeneralConfiguration, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super Windows10TeamGeneralConfiguration> callback);

    Windows10TeamGeneralConfiguration get() throws ClientException;

	void delete(final ICallback<? super Windows10TeamGeneralConfiguration> callback);

	void delete() throws ClientException;

	void patch(final Windows10TeamGeneralConfiguration sourceWindows10TeamGeneralConfiguration, final ICallback<? super Windows10TeamGeneralConfiguration> callback);

	Windows10TeamGeneralConfiguration patch(final Windows10TeamGeneralConfiguration sourceWindows10TeamGeneralConfiguration) throws ClientException;

    IWindows10TeamGeneralConfigurationWithReferenceRequest select(final String value);

    IWindows10TeamGeneralConfigurationWithReferenceRequest expand(final String value);

}
