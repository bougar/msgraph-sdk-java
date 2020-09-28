// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRangeFont;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WorkbookRangeFont;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Font With Reference Request.
 */
public interface IWorkbookRangeFontWithReferenceRequest extends IHttpRequest {

    void post(final WorkbookRangeFont newWorkbookRangeFont, final IJsonBackedObject payload, final ICallback<? super WorkbookRangeFont> callback);

    WorkbookRangeFont post(final WorkbookRangeFont newWorkbookRangeFont, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super WorkbookRangeFont> callback);

    WorkbookRangeFont get() throws ClientException;

	void delete(final ICallback<? super WorkbookRangeFont> callback);

	void delete() throws ClientException;

	void patch(final WorkbookRangeFont sourceWorkbookRangeFont, final ICallback<? super WorkbookRangeFont> callback);

	WorkbookRangeFont patch(final WorkbookRangeFont sourceWorkbookRangeFont) throws ClientException;

    IWorkbookRangeFontWithReferenceRequest select(final String value);

    IWorkbookRangeFontWithReferenceRequest expand(final String value);

}
