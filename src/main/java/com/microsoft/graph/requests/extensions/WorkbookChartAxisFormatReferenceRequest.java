// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxisFormat;
import com.microsoft.graph.requests.extensions.IWorkbookChartFontRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartFontRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Format Reference Request.
 */
public class WorkbookChartAxisFormatReferenceRequest extends BaseRequest implements IWorkbookChartAxisFormatReferenceRequest {

    /**
     * The request for the WorkbookChartAxisFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisFormatReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartAxisFormat.class);
    }

    public void delete(final ICallback<? super WorkbookChartAxisFormat> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public WorkbookChartAxisFormat delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookChartAxisFormatReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookChartAxisFormatReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookChartAxisFormatReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookChartAxisFormatReferenceRequest)this;
    }
    /**
     * Puts the WorkbookChartAxisFormat
     *
     * @param srcWorkbookChartAxisFormat the WorkbookChartAxisFormat reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookChartAxisFormat srcWorkbookChartAxisFormat, final ICallback<? super WorkbookChartAxisFormat> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookChartAxisFormat);
    }

    /**
     * Puts the WorkbookChartAxisFormat
     *
     * @param srcWorkbookChartAxisFormat the WorkbookChartAxisFormat reference to PUT
     * @return the WorkbookChartAxisFormat
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookChartAxisFormat put(WorkbookChartAxisFormat srcWorkbookChartAxisFormat) throws ClientException {
        return send(HttpMethod.PUT, srcWorkbookChartAxisFormat);
    }
}
