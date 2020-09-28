// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleAssignment;
import com.microsoft.graph.requests.extensions.IRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Assignment With Reference Request Builder.
 */
public class RoleAssignmentWithReferenceRequestBuilder extends BaseRequestBuilder implements IRoleAssignmentWithReferenceRequestBuilder {

    /**
     * The request builder for the RoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleAssignmentWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IRoleAssignmentWithReferenceRequest instance
     */
    public IRoleAssignmentWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IRoleAssignmentWithReferenceRequest instance
     */
    public IRoleAssignmentWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new RoleAssignmentWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IRoleAssignmentReferenceRequestBuilder reference(){
        return new RoleAssignmentReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the DeviceAndAppManagementRoleAssignment type
     */
    public IDeviceAndAppManagementRoleAssignmentRequestBuilder castToDeviceAndAppManagementRoleAssignment() {
        return new DeviceAndAppManagementRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deviceAndAppManagementRoleAssignment"), getClient(), null);
    }

}
