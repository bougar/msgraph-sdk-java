// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookApplication;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WorkbookApplication;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Application Reference Request.
 */
public interface IWorkbookApplicationReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super WorkbookApplication> callback);

    WorkbookApplication delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookApplicationReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookApplicationReferenceRequest expand(final String value);

    /**
     * Puts the WorkbookApplication
     *
     * @param srcWorkbookApplication the WorkbookApplication to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WorkbookApplication srcWorkbookApplication, final ICallback<? super WorkbookApplication> callback);

    /**
     * Puts the WorkbookApplication
     *
     * @param srcWorkbookApplication the WorkbookApplication to PUT
     * @return the WorkbookApplication
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookApplication put(WorkbookApplication srcWorkbookApplication) throws ClientException;
}
