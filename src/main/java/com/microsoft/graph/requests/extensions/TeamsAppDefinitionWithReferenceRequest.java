// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Definition With Reference Request.
 */
public class TeamsAppDefinitionWithReferenceRequest extends BaseRequest implements ITeamsAppDefinitionWithReferenceRequest {

    /**
     * The request for the TeamsAppDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppDefinitionWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppDefinition.class);
    }

    public void post(final TeamsAppDefinition newTeamsAppDefinition, final IJsonBackedObject payload, final ICallback<? super TeamsAppDefinition> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public TeamsAppDefinition post(final TeamsAppDefinition newTeamsAppDefinition, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newTeamsAppDefinition;
        }
        return null;
    }

    public void get(final ICallback<? super TeamsAppDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public TeamsAppDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super TeamsAppDefinition> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final TeamsAppDefinition sourceTeamsAppDefinition, final ICallback<? super TeamsAppDefinition> callback) {
		send(HttpMethod.PATCH, callback, sourceTeamsAppDefinition);
	}

	public TeamsAppDefinition patch(final TeamsAppDefinition sourceTeamsAppDefinition) throws ClientException {
		return send(HttpMethod.PATCH, sourceTeamsAppDefinition);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamsAppDefinitionWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ITeamsAppDefinitionWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamsAppDefinitionWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TeamsAppDefinitionWithReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITeamsAppDefinitionWithReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (TeamsAppDefinitionWithReferenceRequest)this;
    }
}
