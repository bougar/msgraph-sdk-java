// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RecordOperation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Record Operation Reference Request.
 */
public class RecordOperationReferenceRequest extends BaseRequest implements IRecordOperationReferenceRequest {

    /**
     * The request for the RecordOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RecordOperationReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RecordOperation.class);
    }

    public void delete(final ICallback<? super RecordOperation> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public RecordOperation delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IRecordOperationReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (RecordOperationReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IRecordOperationReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (RecordOperationReferenceRequest)this;
    }
    /**
     * Puts the RecordOperation
     *
     * @param srcRecordOperation the RecordOperation reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(RecordOperation srcRecordOperation, final ICallback<? super RecordOperation> callback) {
        send(HttpMethod.PUT, callback, srcRecordOperation);
    }

    /**
     * Puts the RecordOperation
     *
     * @param srcRecordOperation the RecordOperation reference to PUT
     * @return the RecordOperation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public RecordOperation put(RecordOperation srcRecordOperation) throws ClientException {
        return send(HttpMethod.PUT, srcRecordOperation);
    }
}
