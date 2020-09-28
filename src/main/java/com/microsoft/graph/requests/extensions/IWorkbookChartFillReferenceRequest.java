// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartFill;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WorkbookChartFill;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Fill Reference Request.
 */
public interface IWorkbookChartFillReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super WorkbookChartFill> callback);

    WorkbookChartFill delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartFillReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartFillReferenceRequest expand(final String value);

    /**
     * Puts the WorkbookChartFill
     *
     * @param srcWorkbookChartFill the WorkbookChartFill to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WorkbookChartFill srcWorkbookChartFill, final ICallback<? super WorkbookChartFill> callback);

    /**
     * Puts the WorkbookChartFill
     *
     * @param srcWorkbookChartFill the WorkbookChartFill to PUT
     * @return the WorkbookChartFill
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookChartFill put(WorkbookChartFill srcWorkbookChartFill) throws ClientException;
}
