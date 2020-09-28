// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.Report;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root With Reference Request.
 */
public interface IReportRootWithReferenceRequest extends IHttpRequest {

    void post(final ReportRoot newReportRoot, final IJsonBackedObject payload, final ICallback<? super ReportRoot> callback);

    ReportRoot post(final ReportRoot newReportRoot, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super ReportRoot> callback);

    ReportRoot get() throws ClientException;

	void delete(final ICallback<? super ReportRoot> callback);

	void delete() throws ClientException;

	void patch(final ReportRoot sourceReportRoot, final ICallback<? super ReportRoot> callback);

	ReportRoot patch(final ReportRoot sourceReportRoot) throws ClientException;

    IReportRootWithReferenceRequest select(final String value);

    IReportRootWithReferenceRequest expand(final String value);

}
