// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReferenceAttachment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ReferenceAttachment;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Reference Attachment With Reference Request.
 */
public interface IReferenceAttachmentWithReferenceRequest extends IHttpRequest {

    void post(final ReferenceAttachment newReferenceAttachment, final IJsonBackedObject payload, final ICallback<? super ReferenceAttachment> callback);

    ReferenceAttachment post(final ReferenceAttachment newReferenceAttachment, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super ReferenceAttachment> callback);

    ReferenceAttachment get() throws ClientException;

	void delete(final ICallback<? super ReferenceAttachment> callback);

	void delete() throws ClientException;

	void patch(final ReferenceAttachment sourceReferenceAttachment, final ICallback<? super ReferenceAttachment> callback);

	ReferenceAttachment patch(final ReferenceAttachment sourceReferenceAttachment) throws ClientException;

    IReferenceAttachmentWithReferenceRequest select(final String value);

    IReferenceAttachmentWithReferenceRequest expand(final String value);

}
