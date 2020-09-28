// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartLegendFormat;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartFontRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartFontRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Legend Format Reference Request.
 */
public class WorkbookChartLegendFormatReferenceRequest extends BaseRequest implements IWorkbookChartLegendFormatReferenceRequest {

    /**
     * The request for the WorkbookChartLegendFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartLegendFormatReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartLegendFormat.class);
    }

    public void delete(final ICallback<? super WorkbookChartLegendFormat> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public WorkbookChartLegendFormat delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookChartLegendFormatReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookChartLegendFormatReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookChartLegendFormatReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookChartLegendFormatReferenceRequest)this;
    }
    /**
     * Puts the WorkbookChartLegendFormat
     *
     * @param srcWorkbookChartLegendFormat the WorkbookChartLegendFormat reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookChartLegendFormat srcWorkbookChartLegendFormat, final ICallback<? super WorkbookChartLegendFormat> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookChartLegendFormat);
    }

    /**
     * Puts the WorkbookChartLegendFormat
     *
     * @param srcWorkbookChartLegendFormat the WorkbookChartLegendFormat reference to PUT
     * @return the WorkbookChartLegendFormat
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookChartLegendFormat put(WorkbookChartLegendFormat srcWorkbookChartLegendFormat) throws ClientException {
        return send(HttpMethod.PUT, srcWorkbookChartLegendFormat);
    }
}
