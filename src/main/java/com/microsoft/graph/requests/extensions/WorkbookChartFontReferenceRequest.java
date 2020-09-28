// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartFont;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Font Reference Request.
 */
public class WorkbookChartFontReferenceRequest extends BaseRequest implements IWorkbookChartFontReferenceRequest {

    /**
     * The request for the WorkbookChartFont
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartFontReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartFont.class);
    }

    public void delete(final ICallback<? super WorkbookChartFont> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public WorkbookChartFont delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookChartFontReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookChartFontReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookChartFontReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookChartFontReferenceRequest)this;
    }
    /**
     * Puts the WorkbookChartFont
     *
     * @param srcWorkbookChartFont the WorkbookChartFont reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookChartFont srcWorkbookChartFont, final ICallback<? super WorkbookChartFont> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookChartFont);
    }

    /**
     * Puts the WorkbookChartFont
     *
     * @param srcWorkbookChartFont the WorkbookChartFont reference to PUT
     * @return the WorkbookChartFont
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookChartFont put(WorkbookChartFont srcWorkbookChartFont) throws ClientException {
        return send(HttpMethod.PUT, srcWorkbookChartFont);
    }
}
