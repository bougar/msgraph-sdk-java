// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookCommentReply;
import com.microsoft.graph.requests.extensions.IWorkbookCommentReplyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookCommentReplyCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookCommentReplyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Comment Reply Collection Page.
 */
public class WorkbookCommentReplyCollectionPage extends BaseCollectionPage<WorkbookCommentReply, IWorkbookCommentReplyCollectionRequestBuilder> implements IWorkbookCommentReplyCollectionPage {

    /**
     * A collection page for WorkbookCommentReply
     *
     * @param response the serialized WorkbookCommentReplyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookCommentReplyCollectionPage(final WorkbookCommentReplyCollectionResponse response, final IWorkbookCommentReplyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
