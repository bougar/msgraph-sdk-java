// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileThreatDefenseConnector;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MobileThreatDefenseConnector;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile Threat Defense Connector Reference Request.
 */
public interface IMobileThreatDefenseConnectorReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super MobileThreatDefenseConnector> callback);

    MobileThreatDefenseConnector delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileThreatDefenseConnectorReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileThreatDefenseConnectorReferenceRequest expand(final String value);

    /**
     * Puts the MobileThreatDefenseConnector
     *
     * @param srcMobileThreatDefenseConnector the MobileThreatDefenseConnector to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(MobileThreatDefenseConnector srcMobileThreatDefenseConnector, final ICallback<? super MobileThreatDefenseConnector> callback);

    /**
     * Puts the MobileThreatDefenseConnector
     *
     * @param srcMobileThreatDefenseConnector the MobileThreatDefenseConnector to PUT
     * @return the MobileThreatDefenseConnector
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    MobileThreatDefenseConnector put(MobileThreatDefenseConnector srcMobileThreatDefenseConnector) throws ClientException;
}
