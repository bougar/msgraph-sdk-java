// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtection;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtectionOptions;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WorkbookWorksheetProtection;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Worksheet Protection With Reference Request.
 */
public interface IWorkbookWorksheetProtectionWithReferenceRequest extends IHttpRequest {

    void post(final WorkbookWorksheetProtection newWorkbookWorksheetProtection, final IJsonBackedObject payload, final ICallback<? super WorkbookWorksheetProtection> callback);

    WorkbookWorksheetProtection post(final WorkbookWorksheetProtection newWorkbookWorksheetProtection, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super WorkbookWorksheetProtection> callback);

    WorkbookWorksheetProtection get() throws ClientException;

	void delete(final ICallback<? super WorkbookWorksheetProtection> callback);

	void delete() throws ClientException;

	void patch(final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection, final ICallback<? super WorkbookWorksheetProtection> callback);

	WorkbookWorksheetProtection patch(final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection) throws ClientException;

    IWorkbookWorksheetProtectionWithReferenceRequest select(final String value);

    IWorkbookWorksheetProtectionWithReferenceRequest expand(final String value);

}
