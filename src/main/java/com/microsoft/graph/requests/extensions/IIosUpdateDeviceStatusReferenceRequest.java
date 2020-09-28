// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosUpdateDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.IosUpdateDeviceStatus;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Update Device Status Reference Request.
 */
public interface IIosUpdateDeviceStatusReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super IosUpdateDeviceStatus> callback);

    IosUpdateDeviceStatus delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIosUpdateDeviceStatusReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIosUpdateDeviceStatusReferenceRequest expand(final String value);

    /**
     * Puts the IosUpdateDeviceStatus
     *
     * @param srcIosUpdateDeviceStatus the IosUpdateDeviceStatus to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(IosUpdateDeviceStatus srcIosUpdateDeviceStatus, final ICallback<? super IosUpdateDeviceStatus> callback);

    /**
     * Puts the IosUpdateDeviceStatus
     *
     * @param srcIosUpdateDeviceStatus the IosUpdateDeviceStatus to PUT
     * @return the IosUpdateDeviceStatus
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    IosUpdateDeviceStatus put(IosUpdateDeviceStatus srcIosUpdateDeviceStatus) throws ClientException;
}
