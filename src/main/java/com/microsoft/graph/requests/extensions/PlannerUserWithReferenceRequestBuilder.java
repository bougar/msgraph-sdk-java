// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerUser;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner User With Reference Request Builder.
 */
public class PlannerUserWithReferenceRequestBuilder extends BaseRequestBuilder implements IPlannerUserWithReferenceRequestBuilder {

    /**
     * The request builder for the PlannerUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerUserWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPlannerUserWithReferenceRequest instance
     */
    public IPlannerUserWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IPlannerUserWithReferenceRequest instance
     */
    public IPlannerUserWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PlannerUserWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPlannerUserReferenceRequestBuilder reference(){
        return new PlannerUserReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
