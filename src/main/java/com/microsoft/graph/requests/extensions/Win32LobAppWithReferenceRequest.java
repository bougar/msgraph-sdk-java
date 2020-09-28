// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Win32LobApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App With Reference Request.
 */
public class Win32LobAppWithReferenceRequest extends BaseRequest implements IWin32LobAppWithReferenceRequest {

    /**
     * The request for the Win32LobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Win32LobAppWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Win32LobApp.class);
    }

    public void post(final Win32LobApp newWin32LobApp, final IJsonBackedObject payload, final ICallback<? super Win32LobApp> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public Win32LobApp post(final Win32LobApp newWin32LobApp, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newWin32LobApp;
        }
        return null;
    }

    public void get(final ICallback<? super Win32LobApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public Win32LobApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super Win32LobApp> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final Win32LobApp sourceWin32LobApp, final ICallback<? super Win32LobApp> callback) {
		send(HttpMethod.PATCH, callback, sourceWin32LobApp);
	}

	public Win32LobApp patch(final Win32LobApp sourceWin32LobApp) throws ClientException {
		return send(HttpMethod.PATCH, sourceWin32LobApp);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWin32LobAppWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IWin32LobAppWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWin32LobAppWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (Win32LobAppWithReferenceRequest)this;
    }
}
