// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnenoteEntityBaseModel;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.OnenoteEntityBaseModel;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Onenote Entity Base Model Reference Request.
 */
public interface IOnenoteEntityBaseModelReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super OnenoteEntityBaseModel> callback);

    OnenoteEntityBaseModel delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOnenoteEntityBaseModelReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOnenoteEntityBaseModelReferenceRequest expand(final String value);

    /**
     * Puts the OnenoteEntityBaseModel
     *
     * @param srcOnenoteEntityBaseModel the OnenoteEntityBaseModel to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(OnenoteEntityBaseModel srcOnenoteEntityBaseModel, final ICallback<? super OnenoteEntityBaseModel> callback);

    /**
     * Puts the OnenoteEntityBaseModel
     *
     * @param srcOnenoteEntityBaseModel the OnenoteEntityBaseModel to PUT
     * @return the OnenoteEntityBaseModel
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    OnenoteEntityBaseModel put(OnenoteEntityBaseModel srcOnenoteEntityBaseModel) throws ClientException;
}
