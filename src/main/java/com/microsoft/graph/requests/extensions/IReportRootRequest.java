// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ReportRoot;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Request.
 */
public interface IReportRootRequest extends IHttpRequest {

    /**
     * Gets the ReportRoot from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ReportRoot> callback);

    /**
     * Gets the ReportRoot from the service
     *
     * @return the ReportRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ReportRoot get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ReportRoot> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ReportRoot with a source
     *
     * @param sourceReportRoot the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ReportRoot sourceReportRoot, final ICallback<? super ReportRoot> callback);

    /**
     * Patches this ReportRoot with a source
     *
     * @param sourceReportRoot the source object with updates
     * @return the updated ReportRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ReportRoot patch(final ReportRoot sourceReportRoot) throws ClientException;

    /**
     * Posts a ReportRoot with a new object
     *
     * @param newReportRoot the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ReportRoot newReportRoot, final ICallback<? super ReportRoot> callback);

    /**
     * Posts a ReportRoot with a new object
     *
     * @param newReportRoot the new object to create
     * @return the created ReportRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ReportRoot post(final ReportRoot newReportRoot) throws ClientException;

    /**
     * Posts a ReportRoot with a new object
     *
     * @param newReportRoot the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ReportRoot newReportRoot, final ICallback<? super ReportRoot> callback);

    /**
     * Posts a ReportRoot with a new object
     *
     * @param newReportRoot the object to create/update
     * @return the created ReportRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ReportRoot put(final ReportRoot newReportRoot) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IReportRootRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IReportRootRequest expand(final String value);

}

