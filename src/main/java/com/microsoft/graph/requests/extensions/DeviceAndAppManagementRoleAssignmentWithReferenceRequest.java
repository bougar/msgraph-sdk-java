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
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Role Assignment With Reference Request.
 */
public class DeviceAndAppManagementRoleAssignmentWithReferenceRequest extends BaseRequest implements IDeviceAndAppManagementRoleAssignmentWithReferenceRequest {

    /**
     * The request for the DeviceAndAppManagementRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementRoleAssignmentWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementRoleAssignment.class);
    }

    public void post(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment, final IJsonBackedObject payload, final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public DeviceAndAppManagementRoleAssignment post(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newDeviceAndAppManagementRoleAssignment;
        }
        return null;
    }

    public void get(final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public DeviceAndAppManagementRoleAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final DeviceAndAppManagementRoleAssignment sourceDeviceAndAppManagementRoleAssignment, final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
		send(HttpMethod.PATCH, callback, sourceDeviceAndAppManagementRoleAssignment);
	}

	public DeviceAndAppManagementRoleAssignment patch(final DeviceAndAppManagementRoleAssignment sourceDeviceAndAppManagementRoleAssignment) throws ClientException {
		return send(HttpMethod.PATCH, sourceDeviceAndAppManagementRoleAssignment);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleAssignmentWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDeviceAndAppManagementRoleAssignmentWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleAssignmentWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceAndAppManagementRoleAssignmentWithReferenceRequest)this;
    }
}
