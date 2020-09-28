// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Extension;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Extension With Reference Request.
 */
public interface IExtensionWithReferenceRequest extends IHttpRequest {

    void post(final Extension newExtension, final IJsonBackedObject payload, final ICallback<? super Extension> callback);

    Extension post(final Extension newExtension, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super Extension> callback);

    Extension get() throws ClientException;

	void delete(final ICallback<? super Extension> callback);

	void delete() throws ClientException;

	void patch(final Extension sourceExtension, final ICallback<? super Extension> callback);

	Extension patch(final Extension sourceExtension) throws ClientException;

    IExtensionWithReferenceRequest select(final String value);

    IExtensionWithReferenceRequest expand(final String value);

}
