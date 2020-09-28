// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRangeFill;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Fill Reference Request.
 */
public class WorkbookRangeFillReferenceRequest extends BaseRequest implements IWorkbookRangeFillReferenceRequest {

    /**
     * The request for the WorkbookRangeFill
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeFillReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeFill.class);
    }

    public void delete(final ICallback<? super WorkbookRangeFill> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public WorkbookRangeFill delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookRangeFillReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookRangeFillReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookRangeFillReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookRangeFillReferenceRequest)this;
    }
    /**
     * Puts the WorkbookRangeFill
     *
     * @param srcWorkbookRangeFill the WorkbookRangeFill reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookRangeFill srcWorkbookRangeFill, final ICallback<? super WorkbookRangeFill> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookRangeFill);
    }

    /**
     * Puts the WorkbookRangeFill
     *
     * @param srcWorkbookRangeFill the WorkbookRangeFill reference to PUT
     * @return the WorkbookRangeFill
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookRangeFill put(WorkbookRangeFill srcWorkbookRangeFill) throws ClientException {
        return send(HttpMethod.PUT, srcWorkbookRangeFill);
    }
}
