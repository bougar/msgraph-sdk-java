// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookApplication;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WorkbookApplication;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Application With Reference Request.
 */
public interface IWorkbookApplicationWithReferenceRequest extends IHttpRequest {

    void post(final WorkbookApplication newWorkbookApplication, final IJsonBackedObject payload, final ICallback<? super WorkbookApplication> callback);

    WorkbookApplication post(final WorkbookApplication newWorkbookApplication, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super WorkbookApplication> callback);

    WorkbookApplication get() throws ClientException;

	void delete(final ICallback<? super WorkbookApplication> callback);

	void delete() throws ClientException;

	void patch(final WorkbookApplication sourceWorkbookApplication, final ICallback<? super WorkbookApplication> callback);

	WorkbookApplication patch(final WorkbookApplication sourceWorkbookApplication) throws ClientException;

    IWorkbookApplicationWithReferenceRequest select(final String value);

    IWorkbookApplicationWithReferenceRequest expand(final String value);

}
