// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartTitle;
import com.microsoft.graph.requests.extensions.IWorkbookChartTitleFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WorkbookChartTitle;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Title With Reference Request.
 */
public interface IWorkbookChartTitleWithReferenceRequest extends IHttpRequest {

    void post(final WorkbookChartTitle newWorkbookChartTitle, final IJsonBackedObject payload, final ICallback<? super WorkbookChartTitle> callback);

    WorkbookChartTitle post(final WorkbookChartTitle newWorkbookChartTitle, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super WorkbookChartTitle> callback);

    WorkbookChartTitle get() throws ClientException;

	void delete(final ICallback<? super WorkbookChartTitle> callback);

	void delete() throws ClientException;

	void patch(final WorkbookChartTitle sourceWorkbookChartTitle, final ICallback<? super WorkbookChartTitle> callback);

	WorkbookChartTitle patch(final WorkbookChartTitle sourceWorkbookChartTitle) throws ClientException;

    IWorkbookChartTitleWithReferenceRequest select(final String value);

    IWorkbookChartTitleWithReferenceRequest expand(final String value);

}
