// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Role Definition With Reference Request.
 */
public class DeviceAndAppManagementRoleDefinitionWithReferenceRequest extends BaseRequest implements IDeviceAndAppManagementRoleDefinitionWithReferenceRequest {

    /**
     * The request for the DeviceAndAppManagementRoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementRoleDefinitionWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementRoleDefinition.class);
    }

    public void post(final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition, final IJsonBackedObject payload, final ICallback<? super DeviceAndAppManagementRoleDefinition> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public DeviceAndAppManagementRoleDefinition post(final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newDeviceAndAppManagementRoleDefinition;
        }
        return null;
    }

    public void get(final ICallback<? super DeviceAndAppManagementRoleDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public DeviceAndAppManagementRoleDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super DeviceAndAppManagementRoleDefinition> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final DeviceAndAppManagementRoleDefinition sourceDeviceAndAppManagementRoleDefinition, final ICallback<? super DeviceAndAppManagementRoleDefinition> callback) {
		send(HttpMethod.PATCH, callback, sourceDeviceAndAppManagementRoleDefinition);
	}

	public DeviceAndAppManagementRoleDefinition patch(final DeviceAndAppManagementRoleDefinition sourceDeviceAndAppManagementRoleDefinition) throws ClientException {
		return send(HttpMethod.PATCH, sourceDeviceAndAppManagementRoleDefinition);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleDefinitionWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDeviceAndAppManagementRoleDefinitionWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleDefinitionWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceAndAppManagementRoleDefinitionWithReferenceRequest)this;
    }
}
