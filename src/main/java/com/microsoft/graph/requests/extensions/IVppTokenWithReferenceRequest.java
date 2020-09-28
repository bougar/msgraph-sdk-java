// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.VppToken;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.VppToken;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Vpp Token With Reference Request.
 */
public interface IVppTokenWithReferenceRequest extends IHttpRequest {

    void post(final VppToken newVppToken, final IJsonBackedObject payload, final ICallback<? super VppToken> callback);

    VppToken post(final VppToken newVppToken, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super VppToken> callback);

    VppToken get() throws ClientException;

	void delete(final ICallback<? super VppToken> callback);

	void delete() throws ClientException;

	void patch(final VppToken sourceVppToken, final ICallback<? super VppToken> callback);

	VppToken patch(final VppToken sourceVppToken) throws ClientException;

    IVppTokenWithReferenceRequest select(final String value);

    IVppTokenWithReferenceRequest expand(final String value);

}
