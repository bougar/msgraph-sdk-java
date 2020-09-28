// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserInstallStateSummary;
import com.microsoft.graph.requests.extensions.IDeviceInstallStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceInstallStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceInstallStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceInstallStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Install State Summary Reference Request.
 */
public class UserInstallStateSummaryReferenceRequest extends BaseRequest implements IUserInstallStateSummaryReferenceRequest {

    /**
     * The request for the UserInstallStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserInstallStateSummaryReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserInstallStateSummary.class);
    }

    public void delete(final ICallback<? super UserInstallStateSummary> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public UserInstallStateSummary delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserInstallStateSummaryReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserInstallStateSummaryReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserInstallStateSummaryReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserInstallStateSummaryReferenceRequest)this;
    }
    /**
     * Puts the UserInstallStateSummary
     *
     * @param srcUserInstallStateSummary the UserInstallStateSummary reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(UserInstallStateSummary srcUserInstallStateSummary, final ICallback<? super UserInstallStateSummary> callback) {
        send(HttpMethod.PUT, callback, srcUserInstallStateSummary);
    }

    /**
     * Puts the UserInstallStateSummary
     *
     * @param srcUserInstallStateSummary the UserInstallStateSummary reference to PUT
     * @return the UserInstallStateSummary
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public UserInstallStateSummary put(UserInstallStateSummary srcUserInstallStateSummary) throws ClientException {
        return send(HttpMethod.PUT, srcUserInstallStateSummary);
    }
}
