// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact Request.
 */
public class OrgContactRequest extends BaseRequest implements IOrgContactRequest {
	
    /**
     * The request for the OrgContact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrgContactRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OrgContact.class);
    }

    /**
     * Gets the OrgContact from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super OrgContact> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OrgContact from the service
     *
     * @return the OrgContact from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OrgContact get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super OrgContact> callback) {
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
     * Patches this OrgContact with a source
     *
     * @param sourceOrgContact the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final OrgContact sourceOrgContact, final ICallback<? super OrgContact> callback) {
        send(HttpMethod.PATCH, callback, sourceOrgContact);
    }

    /**
     * Patches this OrgContact with a source
     *
     * @param sourceOrgContact the source object with updates
     * @return the updated OrgContact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OrgContact patch(final OrgContact sourceOrgContact) throws ClientException {
        return send(HttpMethod.PATCH, sourceOrgContact);
    }

    /**
     * Creates a OrgContact with a new object
     *
     * @param newOrgContact the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final OrgContact newOrgContact, final ICallback<? super OrgContact> callback) {
        send(HttpMethod.POST, callback, newOrgContact);
    }

    /**
     * Creates a OrgContact with a new object
     *
     * @param newOrgContact the new object to create
     * @return the created OrgContact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OrgContact post(final OrgContact newOrgContact) throws ClientException {
        return send(HttpMethod.POST, newOrgContact);
    }

    /**
     * Creates a OrgContact with a new object
     *
     * @param newOrgContact the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final OrgContact newOrgContact, final ICallback<? super OrgContact> callback) {
        send(HttpMethod.PUT, callback, newOrgContact);
    }

    /**
     * Creates a OrgContact with a new object
     *
     * @param newOrgContact the object to create/update
     * @return the created OrgContact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OrgContact put(final OrgContact newOrgContact) throws ClientException {
        return send(HttpMethod.PUT, newOrgContact);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOrgContactRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OrgContactRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOrgContactRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OrgContactRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IOrgContactRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (OrgContactRequest)this;
     }

}

