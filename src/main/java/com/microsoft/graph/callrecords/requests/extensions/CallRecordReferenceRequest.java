// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.callrecords.models.extensions.CallRecord;
import com.microsoft.graph.callrecords.requests.extensions.ISessionCollectionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.ISessionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.SessionCollectionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.SessionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Reference Request.
 */
public class CallRecordReferenceRequest extends BaseRequest implements ICallRecordReferenceRequest {

    /**
     * The request for the CallRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRecordReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CallRecord.class);
    }

    public void delete(final ICallback<? super CallRecord> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public CallRecord delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICallRecordReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CallRecordReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICallRecordReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CallRecordReferenceRequest)this;
    }
    /**
     * Puts the CallRecord
     *
     * @param srcCallRecord the CallRecord reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(CallRecord srcCallRecord, final ICallback<? super CallRecord> callback) {
        send(HttpMethod.PUT, callback, srcCallRecord);
    }

    /**
     * Puts the CallRecord
     *
     * @param srcCallRecord the CallRecord reference to PUT
     * @return the CallRecord
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public CallRecord put(CallRecord srcCallRecord) throws ClientException {
        return send(HttpMethod.PUT, srcCallRecord);
    }
}
