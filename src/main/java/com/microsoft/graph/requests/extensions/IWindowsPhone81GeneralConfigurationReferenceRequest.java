// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81GeneralConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WindowsPhone81GeneralConfiguration;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Phone81General Configuration Reference Request.
 */
public interface IWindowsPhone81GeneralConfigurationReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super WindowsPhone81GeneralConfiguration> callback);

    WindowsPhone81GeneralConfiguration delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsPhone81GeneralConfigurationReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsPhone81GeneralConfigurationReferenceRequest expand(final String value);

    /**
     * Puts the WindowsPhone81GeneralConfiguration
     *
     * @param srcWindowsPhone81GeneralConfiguration the WindowsPhone81GeneralConfiguration to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WindowsPhone81GeneralConfiguration srcWindowsPhone81GeneralConfiguration, final ICallback<? super WindowsPhone81GeneralConfiguration> callback);

    /**
     * Puts the WindowsPhone81GeneralConfiguration
     *
     * @param srcWindowsPhone81GeneralConfiguration the WindowsPhone81GeneralConfiguration to PUT
     * @return the WindowsPhone81GeneralConfiguration
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WindowsPhone81GeneralConfiguration put(WindowsPhone81GeneralConfiguration srcWindowsPhone81GeneralConfiguration) throws ClientException;
}
