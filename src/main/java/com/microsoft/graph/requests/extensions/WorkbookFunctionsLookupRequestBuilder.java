// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Lookup Request Builder.
 */
public class WorkbookFunctionsLookupRequestBuilder extends BaseWorkbookFunctionsLookupRequestBuilder implements IWorkbookFunctionsLookupRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsLookup
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param lookupValue The lookupValue
     * @param lookupVector The lookupVector
     * @param resultVector The resultVector
     */
    public WorkbookFunctionsLookupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement lookupVector, final com.google.gson.JsonElement resultVector) {
        super(requestUrl, client, requestOptions, lookupValue, lookupVector, resultVector);
    }
}
