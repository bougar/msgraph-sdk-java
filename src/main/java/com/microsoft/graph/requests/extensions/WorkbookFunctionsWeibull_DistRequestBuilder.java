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
 * The class for the Workbook Functions Weibull_Dist Request Builder.
 */
public class WorkbookFunctionsWeibull_DistRequestBuilder extends BaseWorkbookFunctionsWeibull_DistRequestBuilder implements IWorkbookFunctionsWeibull_DistRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsWeibull_Dist
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param x The x
     * @param alpha The alpha
     * @param beta The beta
     * @param cumulative The cumulative
     */
    public WorkbookFunctionsWeibull_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement alpha, final com.google.gson.JsonElement beta, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions, x, alpha, beta, cumulative);
    }
}
