// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DomainDnsCnameRecord;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DomainDnsCnameRecord;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Domain Dns Cname Record Reference Request.
 */
public interface IDomainDnsCnameRecordReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super DomainDnsCnameRecord> callback);

    DomainDnsCnameRecord delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDomainDnsCnameRecordReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDomainDnsCnameRecordReferenceRequest expand(final String value);

    /**
     * Puts the DomainDnsCnameRecord
     *
     * @param srcDomainDnsCnameRecord the DomainDnsCnameRecord to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(DomainDnsCnameRecord srcDomainDnsCnameRecord, final ICallback<? super DomainDnsCnameRecord> callback);

    /**
     * Puts the DomainDnsCnameRecord
     *
     * @param srcDomainDnsCnameRecord the DomainDnsCnameRecord to PUT
     * @return the DomainDnsCnameRecord
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    DomainDnsCnameRecord put(DomainDnsCnameRecord srcDomainDnsCnameRecord) throws ClientException;
}
