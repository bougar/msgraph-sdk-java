// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartFont;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WorkbookChartFont;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Font Reference Request.
 */
public interface IWorkbookChartFontReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super WorkbookChartFont> callback);

    WorkbookChartFont delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartFontReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartFontReferenceRequest expand(final String value);

    /**
     * Puts the WorkbookChartFont
     *
     * @param srcWorkbookChartFont the WorkbookChartFont to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WorkbookChartFont srcWorkbookChartFont, final ICallback<? super WorkbookChartFont> callback);

    /**
     * Puts the WorkbookChartFont
     *
     * @param srcWorkbookChartFont the WorkbookChartFont to PUT
     * @return the WorkbookChartFont
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookChartFont put(WorkbookChartFont srcWorkbookChartFont) throws ClientException;
}
