// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailAssessmentRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MailAssessmentRequest;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mail Assessment Request With Reference Request.
 */
public interface IMailAssessmentRequestWithReferenceRequest extends IHttpRequest {

    void post(final MailAssessmentRequest newMailAssessmentRequest, final IJsonBackedObject payload, final ICallback<? super MailAssessmentRequest> callback);

    MailAssessmentRequest post(final MailAssessmentRequest newMailAssessmentRequest, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super MailAssessmentRequest> callback);

    MailAssessmentRequest get() throws ClientException;

	void delete(final ICallback<? super MailAssessmentRequest> callback);

	void delete() throws ClientException;

	void patch(final MailAssessmentRequest sourceMailAssessmentRequest, final ICallback<? super MailAssessmentRequest> callback);

	MailAssessmentRequest patch(final MailAssessmentRequest sourceMailAssessmentRequest) throws ClientException;

    IMailAssessmentRequestWithReferenceRequest select(final String value);

    IMailAssessmentRequestWithReferenceRequest expand(final String value);

}
