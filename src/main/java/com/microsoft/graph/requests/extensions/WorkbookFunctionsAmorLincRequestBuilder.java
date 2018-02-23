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
 * The class for the Workbook Functions Amor Linc Request Builder.
 */
public class WorkbookFunctionsAmorLincRequestBuilder extends BaseWorkbookFunctionsAmorLincRequestBuilder implements IWorkbookFunctionsAmorLincRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAmorLinc
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param cost The cost
     * @param datePurchased The datePurchased
     * @param firstPeriod The firstPeriod
     * @param salvage The salvage
     * @param period The period
     * @param rate The rate
     * @param basis The basis
     */
    public WorkbookFunctionsAmorLincRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement cost, final com.google.gson.JsonElement datePurchased, final com.google.gson.JsonElement firstPeriod, final com.google.gson.JsonElement salvage, final com.google.gson.JsonElement period, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions, cost, datePurchased, firstPeriod, salvage, period, rate, basis);
    }
}
