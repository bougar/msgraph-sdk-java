// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AuditLogRoot;
import com.microsoft.graph.requests.extensions.IDirectoryAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedSignInRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedSignInRequestBuilder;
import com.microsoft.graph.requests.extensions.ISignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISignInRequestBuilder;
import com.microsoft.graph.requests.extensions.SignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SignInRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Log Root With Reference Request.
 */
public class AuditLogRootWithReferenceRequest extends BaseRequest implements IAuditLogRootWithReferenceRequest {

    /**
     * The request for the AuditLogRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuditLogRootWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuditLogRoot.class);
    }

    public void post(final AuditLogRoot newAuditLogRoot, final IJsonBackedObject payload, final ICallback<? super AuditLogRoot> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public AuditLogRoot post(final AuditLogRoot newAuditLogRoot, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newAuditLogRoot;
        }
        return null;
    }

    public void get(final ICallback<? super AuditLogRoot> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public AuditLogRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super AuditLogRoot> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final AuditLogRoot sourceAuditLogRoot, final ICallback<? super AuditLogRoot> callback) {
		send(HttpMethod.PATCH, callback, sourceAuditLogRoot);
	}

	public AuditLogRoot patch(final AuditLogRoot sourceAuditLogRoot) throws ClientException {
		return send(HttpMethod.PATCH, sourceAuditLogRoot);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAuditLogRootWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IAuditLogRootWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAuditLogRootWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AuditLogRootWithReferenceRequest)this;
    }
}
