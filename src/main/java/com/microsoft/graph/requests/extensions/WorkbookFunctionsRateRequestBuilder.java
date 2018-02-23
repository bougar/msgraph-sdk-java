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
 * The class for the Workbook Functions Rate Request Builder.
 */
public class WorkbookFunctionsRateRequestBuilder extends BaseWorkbookFunctionsRateRequestBuilder implements IWorkbookFunctionsRateRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRate
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param nper The nper
     * @param pmt The pmt
     * @param pv The pv
     * @param fv The fv
     * @param type The type
     * @param guess The guess
     */
    public WorkbookFunctionsRateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pmt, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv, final com.google.gson.JsonElement type, final com.google.gson.JsonElement guess) {
        super(requestUrl, client, requestOptions, nper, pmt, pv, fv, type, guess);
    }
}
