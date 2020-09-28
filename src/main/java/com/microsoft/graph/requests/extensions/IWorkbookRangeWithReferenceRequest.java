// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeSortRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range With Reference Request.
 */
public interface IWorkbookRangeWithReferenceRequest extends IHttpRequest {

    void post(final WorkbookRange newWorkbookRange, final IJsonBackedObject payload, final ICallback<? super WorkbookRange> callback);

    WorkbookRange post(final WorkbookRange newWorkbookRange, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super WorkbookRange> callback);

    WorkbookRange get() throws ClientException;

	void delete(final ICallback<? super WorkbookRange> callback);

	void delete() throws ClientException;

	void patch(final WorkbookRange sourceWorkbookRange, final ICallback<? super WorkbookRange> callback);

	WorkbookRange patch(final WorkbookRange sourceWorkbookRange) throws ClientException;

    IWorkbookRangeWithReferenceRequest select(final String value);

    IWorkbookRangeWithReferenceRequest expand(final String value);

}
