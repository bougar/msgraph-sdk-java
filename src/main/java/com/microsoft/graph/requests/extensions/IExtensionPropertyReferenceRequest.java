// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ExtensionProperty;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Extension Property Reference Request.
 */
public interface IExtensionPropertyReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super ExtensionProperty> callback);

    ExtensionProperty delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IExtensionPropertyReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IExtensionPropertyReferenceRequest expand(final String value);

    /**
     * Puts the ExtensionProperty
     *
     * @param srcExtensionProperty the ExtensionProperty to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(ExtensionProperty srcExtensionProperty, final ICallback<? super ExtensionProperty> callback);

    /**
     * Puts the ExtensionProperty
     *
     * @param srcExtensionProperty the ExtensionProperty to PUT
     * @return the ExtensionProperty
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    ExtensionProperty put(ExtensionProperty srcExtensionProperty) throws ClientException;
}
