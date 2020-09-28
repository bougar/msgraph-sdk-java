// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxis;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisTitleRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisTitleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Reference Request.
 */
public class WorkbookChartAxisReferenceRequest extends BaseRequest implements IWorkbookChartAxisReferenceRequest {

    /**
     * The request for the WorkbookChartAxis
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartAxis.class);
    }

    public void delete(final ICallback<? super WorkbookChartAxis> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public WorkbookChartAxis delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookChartAxisReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookChartAxisReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookChartAxisReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookChartAxisReferenceRequest)this;
    }
    /**
     * Puts the WorkbookChartAxis
     *
     * @param srcWorkbookChartAxis the WorkbookChartAxis reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookChartAxis srcWorkbookChartAxis, final ICallback<? super WorkbookChartAxis> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookChartAxis);
    }

    /**
     * Puts the WorkbookChartAxis
     *
     * @param srcWorkbookChartAxis the WorkbookChartAxis reference to PUT
     * @return the WorkbookChartAxis
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookChartAxis put(WorkbookChartAxis srcWorkbookChartAxis) throws ClientException {
        return send(HttpMethod.PUT, srcWorkbookChartAxis);
    }
}
