// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharedInsight;
import com.microsoft.graph.requests.extensions.IEntityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.SharedInsight;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Shared Insight With Reference Request.
 */
public interface ISharedInsightWithReferenceRequest extends IHttpRequest {

    void post(final SharedInsight newSharedInsight, final IJsonBackedObject payload, final ICallback<? super SharedInsight> callback);

    SharedInsight post(final SharedInsight newSharedInsight, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super SharedInsight> callback);

    SharedInsight get() throws ClientException;

	void delete(final ICallback<? super SharedInsight> callback);

	void delete() throws ClientException;

	void patch(final SharedInsight sourceSharedInsight, final ICallback<? super SharedInsight> callback);

	SharedInsight patch(final SharedInsight sourceSharedInsight) throws ClientException;

    ISharedInsightWithReferenceRequest select(final String value);

    ISharedInsightWithReferenceRequest expand(final String value);

}
