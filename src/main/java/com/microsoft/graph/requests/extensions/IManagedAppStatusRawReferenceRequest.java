// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppStatusRaw;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ManagedAppStatusRaw;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed App Status Raw Reference Request.
 */
public interface IManagedAppStatusRawReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super ManagedAppStatusRaw> callback);

    ManagedAppStatusRaw delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedAppStatusRawReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedAppStatusRawReferenceRequest expand(final String value);

    /**
     * Puts the ManagedAppStatusRaw
     *
     * @param srcManagedAppStatusRaw the ManagedAppStatusRaw to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(ManagedAppStatusRaw srcManagedAppStatusRaw, final ICallback<? super ManagedAppStatusRaw> callback);

    /**
     * Puts the ManagedAppStatusRaw
     *
     * @param srcManagedAppStatusRaw the ManagedAppStatusRaw to PUT
     * @return the ManagedAppStatusRaw
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    ManagedAppStatusRaw put(ManagedAppStatusRaw srcManagedAppStatusRaw) throws ClientException;
}
