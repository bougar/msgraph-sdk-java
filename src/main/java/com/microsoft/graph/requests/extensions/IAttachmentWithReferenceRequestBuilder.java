// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.models.extensions.AttachmentItem;
import com.microsoft.graph.models.extensions.UploadSession;
import java.util.Arrays;
import java.util.EnumSet;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Attachment With Reference Request Builder.
 */
public interface IAttachmentWithReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAttachmentWithReferenceRequest instance
     */
    IAttachmentWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAttachmentWithReferenceRequest instance
     */
    IAttachmentWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IAttachmentReferenceRequestBuilder reference();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the FileAttachment type
     */
    IFileAttachmentRequestBuilder castToFileAttachment();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the ItemAttachment type
     */
    IItemAttachmentRequestBuilder castToItemAttachment();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the ReferenceAttachment type
     */
    IReferenceAttachmentRequestBuilder castToReferenceAttachment();

}
