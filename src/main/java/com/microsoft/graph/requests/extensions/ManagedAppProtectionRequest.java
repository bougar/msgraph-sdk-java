// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppProtection;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Protection Request.
 */
public class ManagedAppProtectionRequest extends BaseRequest implements IManagedAppProtectionRequest {
	
    /**
     * The request for the ManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedAppProtectionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends ManagedAppProtection> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppProtectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppProtection.class);
    }

    /**
     * Gets the ManagedAppProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ManagedAppProtection> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedAppProtection from the service
     *
     * @return the ManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ManagedAppProtection> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedAppProtection with a source
     *
     * @param sourceManagedAppProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedAppProtection sourceManagedAppProtection, final ICallback<? super ManagedAppProtection> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedAppProtection);
    }

    /**
     * Patches this ManagedAppProtection with a source
     *
     * @param sourceManagedAppProtection the source object with updates
     * @return the updated ManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppProtection patch(final ManagedAppProtection sourceManagedAppProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAppProtection);
    }

    /**
     * Creates a ManagedAppProtection with a new object
     *
     * @param newManagedAppProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedAppProtection newManagedAppProtection, final ICallback<? super ManagedAppProtection> callback) {
        send(HttpMethod.POST, callback, newManagedAppProtection);
    }

    /**
     * Creates a ManagedAppProtection with a new object
     *
     * @param newManagedAppProtection the new object to create
     * @return the created ManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppProtection post(final ManagedAppProtection newManagedAppProtection) throws ClientException {
        return send(HttpMethod.POST, newManagedAppProtection);
    }

    /**
     * Creates a ManagedAppProtection with a new object
     *
     * @param newManagedAppProtection the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagedAppProtection newManagedAppProtection, final ICallback<? super ManagedAppProtection> callback) {
        send(HttpMethod.PUT, callback, newManagedAppProtection);
    }

    /**
     * Creates a ManagedAppProtection with a new object
     *
     * @param newManagedAppProtection the object to create/update
     * @return the created ManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppProtection put(final ManagedAppProtection newManagedAppProtection) throws ClientException {
        return send(HttpMethod.PUT, newManagedAppProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedAppProtectionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedAppProtectionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedAppProtectionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedAppProtectionRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IManagedAppProtectionRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (ManagedAppProtectionRequest)this;
     }

}

