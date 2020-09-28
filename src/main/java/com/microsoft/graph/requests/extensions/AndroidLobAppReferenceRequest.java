// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidLobApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Lob App Reference Request.
 */
public class AndroidLobAppReferenceRequest extends BaseRequest implements IAndroidLobAppReferenceRequest {

    /**
     * The request for the AndroidLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidLobAppReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidLobApp.class);
    }

    public void delete(final ICallback<? super AndroidLobApp> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public AndroidLobApp delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidLobAppReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AndroidLobAppReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidLobAppReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AndroidLobAppReferenceRequest)this;
    }
    /**
     * Puts the AndroidLobApp
     *
     * @param srcAndroidLobApp the AndroidLobApp reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(AndroidLobApp srcAndroidLobApp, final ICallback<? super AndroidLobApp> callback) {
        send(HttpMethod.PUT, callback, srcAndroidLobApp);
    }

    /**
     * Puts the AndroidLobApp
     *
     * @param srcAndroidLobApp the AndroidLobApp reference to PUT
     * @return the AndroidLobApp
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public AndroidLobApp put(AndroidLobApp srcAndroidLobApp) throws ClientException {
        return send(HttpMethod.PUT, srcAndroidLobApp);
    }
}
