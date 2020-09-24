// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.ListRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Request.
 */
public class DriveRequest extends BaseRequest implements IDriveRequest {
	
    /**
     * The request for the Drive
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Drive.class);
    }

    /**
     * Gets the Drive from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Drive> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Drive from the service
     *
     * @return the Drive from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Drive get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Drive> callback) {
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
     * Patches this Drive with a source
     *
     * @param sourceDrive the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Drive sourceDrive, final ICallback<? super Drive> callback) {
        send(HttpMethod.PATCH, callback, sourceDrive);
    }

    /**
     * Patches this Drive with a source
     *
     * @param sourceDrive the source object with updates
     * @return the updated Drive
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Drive patch(final Drive sourceDrive) throws ClientException {
        return send(HttpMethod.PATCH, sourceDrive);
    }

    /**
     * Creates a Drive with a new object
     *
     * @param newDrive the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Drive newDrive, final ICallback<? super Drive> callback) {
        send(HttpMethod.POST, callback, newDrive);
    }

    /**
     * Creates a Drive with a new object
     *
     * @param newDrive the new object to create
     * @return the created Drive
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Drive post(final Drive newDrive) throws ClientException {
        return send(HttpMethod.POST, newDrive);
    }

    /**
     * Creates a Drive with a new object
     *
     * @param newDrive the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Drive newDrive, final ICallback<? super Drive> callback) {
        send(HttpMethod.PUT, callback, newDrive);
    }

    /**
     * Creates a Drive with a new object
     *
     * @param newDrive the object to create/update
     * @return the created Drive
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Drive put(final Drive newDrive) throws ClientException {
        return send(HttpMethod.PUT, newDrive);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDriveRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DriveRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDriveRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DriveRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IDriveRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (DriveRequest)this;
     }

}

