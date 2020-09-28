// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Person;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Reference Request.
 */
public class PersonReferenceRequest extends BaseRequest implements IPersonReferenceRequest {

    /**
     * The request for the Person
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Person.class);
    }

    public void delete(final ICallback<? super Person> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public Person delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPersonReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PersonReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPersonReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PersonReferenceRequest)this;
    }
    /**
     * Puts the Person
     *
     * @param srcPerson the Person reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Person srcPerson, final ICallback<? super Person> callback) {
        send(HttpMethod.PUT, callback, srcPerson);
    }

    /**
     * Puts the Person
     *
     * @param srcPerson the Person reference to PUT
     * @return the Person
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Person put(Person srcPerson) throws ClientException {
        return send(HttpMethod.PUT, srcPerson);
    }
}
