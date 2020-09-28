// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSCustomConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MacOSCustomConfiguration;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSCustom Configuration Reference Request.
 */
public interface IMacOSCustomConfigurationReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super MacOSCustomConfiguration> callback);

    MacOSCustomConfiguration delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSCustomConfigurationReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSCustomConfigurationReferenceRequest expand(final String value);

    /**
     * Puts the MacOSCustomConfiguration
     *
     * @param srcMacOSCustomConfiguration the MacOSCustomConfiguration to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(MacOSCustomConfiguration srcMacOSCustomConfiguration, final ICallback<? super MacOSCustomConfiguration> callback);

    /**
     * Puts the MacOSCustomConfiguration
     *
     * @param srcMacOSCustomConfiguration the MacOSCustomConfiguration to PUT
     * @return the MacOSCustomConfiguration
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    MacOSCustomConfiguration put(MacOSCustomConfiguration srcMacOSCustomConfiguration) throws ClientException;
}
