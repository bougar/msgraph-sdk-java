// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtection;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtectionOptions;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Protection With Reference Request.
 */
public class WorkbookWorksheetProtectionWithReferenceRequest extends BaseRequest implements IWorkbookWorksheetProtectionWithReferenceRequest {

    /**
     * The request for the WorkbookWorksheetProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetProtectionWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookWorksheetProtection.class);
    }

    public void post(final WorkbookWorksheetProtection newWorkbookWorksheetProtection, final IJsonBackedObject payload, final ICallback<? super WorkbookWorksheetProtection> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public WorkbookWorksheetProtection post(final WorkbookWorksheetProtection newWorkbookWorksheetProtection, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newWorkbookWorksheetProtection;
        }
        return null;
    }

    public void get(final ICallback<? super WorkbookWorksheetProtection> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public WorkbookWorksheetProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super WorkbookWorksheetProtection> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection, final ICallback<? super WorkbookWorksheetProtection> callback) {
		send(HttpMethod.PATCH, callback, sourceWorkbookWorksheetProtection);
	}

	public WorkbookWorksheetProtection patch(final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection) throws ClientException {
		return send(HttpMethod.PATCH, sourceWorkbookWorksheetProtection);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookWorksheetProtectionWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IWorkbookWorksheetProtectionWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookWorksheetProtectionWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookWorksheetProtectionWithReferenceRequest)this;
    }
}
