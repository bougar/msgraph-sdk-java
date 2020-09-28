// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Role Assignment Reference Request.
 */
public class DeviceAndAppManagementRoleAssignmentReferenceRequest extends BaseRequest implements IDeviceAndAppManagementRoleAssignmentReferenceRequest {

    /**
     * The request for the DeviceAndAppManagementRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementRoleAssignmentReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementRoleAssignment.class);
    }

    public void delete(final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public DeviceAndAppManagementRoleAssignment delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleAssignmentReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceAndAppManagementRoleAssignmentReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleAssignmentReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceAndAppManagementRoleAssignmentReferenceRequest)this;
    }
    /**
     * Puts the DeviceAndAppManagementRoleAssignment
     *
     * @param srcDeviceAndAppManagementRoleAssignment the DeviceAndAppManagementRoleAssignment reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(DeviceAndAppManagementRoleAssignment srcDeviceAndAppManagementRoleAssignment, final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
        send(HttpMethod.PUT, callback, srcDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Puts the DeviceAndAppManagementRoleAssignment
     *
     * @param srcDeviceAndAppManagementRoleAssignment the DeviceAndAppManagementRoleAssignment reference to PUT
     * @return the DeviceAndAppManagementRoleAssignment
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DeviceAndAppManagementRoleAssignment put(DeviceAndAppManagementRoleAssignment srcDeviceAndAppManagementRoleAssignment) throws ClientException {
        return send(HttpMethod.PUT, srcDeviceAndAppManagementRoleAssignment);
    }
}
