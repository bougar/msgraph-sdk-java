// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartGridlines;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartGridlinesFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Gridlines With Reference Request Builder.
 */
public class WorkbookChartGridlinesWithReferenceRequestBuilder extends BaseRequestBuilder implements IWorkbookChartGridlinesWithReferenceRequestBuilder {

    /**
     * The request builder for the WorkbookChartGridlines
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartGridlinesWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartGridlinesWithReferenceRequest instance
     */
    public IWorkbookChartGridlinesWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartGridlinesWithReferenceRequest instance
     */
    public IWorkbookChartGridlinesWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookChartGridlinesWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookChartGridlinesReferenceRequestBuilder reference(){
        return new WorkbookChartGridlinesReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
