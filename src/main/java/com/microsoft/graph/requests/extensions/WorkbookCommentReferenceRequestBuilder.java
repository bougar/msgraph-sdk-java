
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookComment;
import com.microsoft.graph.requests.extensions.IWorkbookCommentReplyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCommentReplyRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookCommentReplyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookCommentReplyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Comment Reference Request Builder.
 */
public class WorkbookCommentReferenceRequestBuilder extends BaseRequestBuilder implements IWorkbookCommentReferenceRequestBuilder {

    /**
     * The request builder for the WorkbookComment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookCommentReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return The IWorkbookCommentReferenceRequest instance
     */
    public IWorkbookCommentReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookCommentReferenceRequest instance
     */
    public IWorkbookCommentReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookCommentReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}
