// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartTitleFormat;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartFontRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WorkbookChartTitleFormat;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Title Format Reference Request.
 */
public interface IWorkbookChartTitleFormatReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super WorkbookChartTitleFormat> callback);

    WorkbookChartTitleFormat delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartTitleFormatReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartTitleFormatReferenceRequest expand(final String value);

    /**
     * Puts the WorkbookChartTitleFormat
     *
     * @param srcWorkbookChartTitleFormat the WorkbookChartTitleFormat to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WorkbookChartTitleFormat srcWorkbookChartTitleFormat, final ICallback<? super WorkbookChartTitleFormat> callback);

    /**
     * Puts the WorkbookChartTitleFormat
     *
     * @param srcWorkbookChartTitleFormat the WorkbookChartTitleFormat to PUT
     * @return the WorkbookChartTitleFormat
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookChartTitleFormat put(WorkbookChartTitleFormat srcWorkbookChartTitleFormat) throws ClientException;
}
