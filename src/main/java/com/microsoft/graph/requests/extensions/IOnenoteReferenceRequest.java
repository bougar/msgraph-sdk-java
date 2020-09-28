// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.requests.extensions.INotebookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenotePageRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Onenote Reference Request.
 */
public interface IOnenoteReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super Onenote> callback);

    Onenote delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOnenoteReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOnenoteReferenceRequest expand(final String value);

    /**
     * Puts the Onenote
     *
     * @param srcOnenote the Onenote to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Onenote srcOnenote, final ICallback<? super Onenote> callback);

    /**
     * Puts the Onenote
     *
     * @param srcOnenote the Onenote to PUT
     * @return the Onenote
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Onenote put(Onenote srcOnenote) throws ClientException;
}
