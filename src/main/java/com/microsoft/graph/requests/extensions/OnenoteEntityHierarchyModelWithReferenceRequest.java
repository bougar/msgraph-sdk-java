// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnenoteEntityHierarchyModel;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Entity Hierarchy Model With Reference Request.
 */
public class OnenoteEntityHierarchyModelWithReferenceRequest extends BaseRequest implements IOnenoteEntityHierarchyModelWithReferenceRequest {

    /**
     * The request for the OnenoteEntityHierarchyModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteEntityHierarchyModelWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteEntityHierarchyModel.class);
    }

    public void post(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel, final IJsonBackedObject payload, final ICallback<? super OnenoteEntityHierarchyModel> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public OnenoteEntityHierarchyModel post(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newOnenoteEntityHierarchyModel;
        }
        return null;
    }

    public void get(final ICallback<? super OnenoteEntityHierarchyModel> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public OnenoteEntityHierarchyModel get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super OnenoteEntityHierarchyModel> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final OnenoteEntityHierarchyModel sourceOnenoteEntityHierarchyModel, final ICallback<? super OnenoteEntityHierarchyModel> callback) {
		send(HttpMethod.PATCH, callback, sourceOnenoteEntityHierarchyModel);
	}

	public OnenoteEntityHierarchyModel patch(final OnenoteEntityHierarchyModel sourceOnenoteEntityHierarchyModel) throws ClientException {
		return send(HttpMethod.PATCH, sourceOnenoteEntityHierarchyModel);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOnenoteEntityHierarchyModelWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IOnenoteEntityHierarchyModelWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOnenoteEntityHierarchyModelWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (OnenoteEntityHierarchyModelWithReferenceRequest)this;
    }
}
