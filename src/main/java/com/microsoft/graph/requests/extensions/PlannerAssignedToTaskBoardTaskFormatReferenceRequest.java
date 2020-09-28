// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerAssignedToTaskBoardTaskFormat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Assigned To Task Board Task Format Reference Request.
 */
public class PlannerAssignedToTaskBoardTaskFormatReferenceRequest extends BaseRequest implements IPlannerAssignedToTaskBoardTaskFormatReferenceRequest {

    /**
     * The request for the PlannerAssignedToTaskBoardTaskFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerAssignedToTaskBoardTaskFormatReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerAssignedToTaskBoardTaskFormat.class);
    }

    public void delete(final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public PlannerAssignedToTaskBoardTaskFormat delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPlannerAssignedToTaskBoardTaskFormatReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PlannerAssignedToTaskBoardTaskFormatReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPlannerAssignedToTaskBoardTaskFormatReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PlannerAssignedToTaskBoardTaskFormatReferenceRequest)this;
    }
    /**
     * Puts the PlannerAssignedToTaskBoardTaskFormat
     *
     * @param srcPlannerAssignedToTaskBoardTaskFormat the PlannerAssignedToTaskBoardTaskFormat reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(PlannerAssignedToTaskBoardTaskFormat srcPlannerAssignedToTaskBoardTaskFormat, final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback) {
        send(HttpMethod.PUT, callback, srcPlannerAssignedToTaskBoardTaskFormat);
    }

    /**
     * Puts the PlannerAssignedToTaskBoardTaskFormat
     *
     * @param srcPlannerAssignedToTaskBoardTaskFormat the PlannerAssignedToTaskBoardTaskFormat reference to PUT
     * @return the PlannerAssignedToTaskBoardTaskFormat
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public PlannerAssignedToTaskBoardTaskFormat put(PlannerAssignedToTaskBoardTaskFormat srcPlannerAssignedToTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.PUT, srcPlannerAssignedToTaskBoardTaskFormat);
    }
}
