// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DomainDnsSrvRecord;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Srv Record Reference Request.
 */
public class DomainDnsSrvRecordReferenceRequest extends BaseRequest implements IDomainDnsSrvRecordReferenceRequest {

    /**
     * The request for the DomainDnsSrvRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsSrvRecordReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DomainDnsSrvRecord.class);
    }

    public void delete(final ICallback<? super DomainDnsSrvRecord> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public DomainDnsSrvRecord delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDomainDnsSrvRecordReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DomainDnsSrvRecordReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDomainDnsSrvRecordReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DomainDnsSrvRecordReferenceRequest)this;
    }
    /**
     * Puts the DomainDnsSrvRecord
     *
     * @param srcDomainDnsSrvRecord the DomainDnsSrvRecord reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(DomainDnsSrvRecord srcDomainDnsSrvRecord, final ICallback<? super DomainDnsSrvRecord> callback) {
        send(HttpMethod.PUT, callback, srcDomainDnsSrvRecord);
    }

    /**
     * Puts the DomainDnsSrvRecord
     *
     * @param srcDomainDnsSrvRecord the DomainDnsSrvRecord reference to PUT
     * @return the DomainDnsSrvRecord
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DomainDnsSrvRecord put(DomainDnsSrvRecord srcDomainDnsSrvRecord) throws ClientException {
        return send(HttpMethod.PUT, srcDomainDnsSrvRecord);
    }
}
