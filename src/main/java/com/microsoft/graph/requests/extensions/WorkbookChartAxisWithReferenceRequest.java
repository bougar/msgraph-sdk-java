// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxis;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisTitleRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisTitleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis With Reference Request.
 */
public class WorkbookChartAxisWithReferenceRequest extends BaseRequest implements IWorkbookChartAxisWithReferenceRequest {

    /**
     * The request for the WorkbookChartAxis
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartAxis.class);
    }

    public void post(final WorkbookChartAxis newWorkbookChartAxis, final IJsonBackedObject payload, final ICallback<? super WorkbookChartAxis> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public WorkbookChartAxis post(final WorkbookChartAxis newWorkbookChartAxis, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newWorkbookChartAxis;
        }
        return null;
    }

    public void get(final ICallback<? super WorkbookChartAxis> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public WorkbookChartAxis get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super WorkbookChartAxis> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final WorkbookChartAxis sourceWorkbookChartAxis, final ICallback<? super WorkbookChartAxis> callback) {
		send(HttpMethod.PATCH, callback, sourceWorkbookChartAxis);
	}

	public WorkbookChartAxis patch(final WorkbookChartAxis sourceWorkbookChartAxis) throws ClientException {
		return send(HttpMethod.PATCH, sourceWorkbookChartAxis);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookChartAxisWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IWorkbookChartAxisWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookChartAxisWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookChartAxisWithReferenceRequest)this;
    }
}
