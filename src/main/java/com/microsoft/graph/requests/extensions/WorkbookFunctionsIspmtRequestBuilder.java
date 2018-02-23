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
 * The class for the Workbook Functions Ispmt Request Builder.
 */
public class WorkbookFunctionsIspmtRequestBuilder extends BaseWorkbookFunctionsIspmtRequestBuilder implements IWorkbookFunctionsIspmtRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIspmt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param rate The rate
     * @param per The per
     * @param nper The nper
     * @param pv The pv
     */
    public WorkbookFunctionsIspmtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement per, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv) {
        super(requestUrl, client, requestOptions, rate, per, nper, pv);
    }
}
