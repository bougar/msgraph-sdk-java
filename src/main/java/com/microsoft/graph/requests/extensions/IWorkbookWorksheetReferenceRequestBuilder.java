// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.IWorkbookChartCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookPivotTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookPivotTableRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetProtectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WorkbookWorksheet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Worksheet Reference Request Builder.
 */
public interface IWorkbookWorksheetReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookWorksheetReferenceRequest instance
     */
    IWorkbookWorksheetReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookWorksheetReferenceRequest instance
     */
    IWorkbookWorksheetReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
