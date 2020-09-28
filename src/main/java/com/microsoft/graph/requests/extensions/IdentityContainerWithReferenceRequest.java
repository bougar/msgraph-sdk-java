// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityContainer;
import com.microsoft.graph.requests.extensions.IConditionalAccessRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessRootRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Container With Reference Request.
 */
public class IdentityContainerWithReferenceRequest extends BaseRequest implements IIdentityContainerWithReferenceRequest {

    /**
     * The request for the IdentityContainer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityContainerWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityContainer.class);
    }

    public void post(final IdentityContainer newIdentityContainer, final IJsonBackedObject payload, final ICallback<? super IdentityContainer> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public IdentityContainer post(final IdentityContainer newIdentityContainer, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newIdentityContainer;
        }
        return null;
    }

    public void get(final ICallback<? super IdentityContainer> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public IdentityContainer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super IdentityContainer> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final IdentityContainer sourceIdentityContainer, final ICallback<? super IdentityContainer> callback) {
		send(HttpMethod.PATCH, callback, sourceIdentityContainer);
	}

	public IdentityContainer patch(final IdentityContainer sourceIdentityContainer) throws ClientException {
		return send(HttpMethod.PATCH, sourceIdentityContainer);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IIdentityContainerWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IIdentityContainerWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IIdentityContainerWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IdentityContainerWithReferenceRequest)this;
    }
}
