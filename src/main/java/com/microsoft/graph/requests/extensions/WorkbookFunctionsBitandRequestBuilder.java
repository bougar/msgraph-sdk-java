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
 * The class for the Workbook Functions Bitand Request Builder.
 */
public class WorkbookFunctionsBitandRequestBuilder extends BaseWorkbookFunctionsBitandRequestBuilder implements IWorkbookFunctionsBitandRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBitand
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param number1 The number1
     * @param number2 The number2
     */
    public WorkbookFunctionsBitandRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number1, final com.google.gson.JsonElement number2) {
        super(requestUrl, client, requestOptions, number1, number2);
    }
}
