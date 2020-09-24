// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Reference Request.
 */
public class EducationClassReferenceRequest extends BaseRequest implements IEducationClassReferenceRequest {

    /**
     * The request for the EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationClassReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationClass.class);
    }

    public void delete(final ICallback<? super EducationClass> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public EducationClass delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationClassReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationClassReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationClassReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationClassReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IEducationClassReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (EducationClassReferenceRequest)this;
    }
    /**
     * Puts the EducationClass
     *
     * @param srcEducationClass the EducationClass reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(EducationClass srcEducationClass, final ICallback<? super EducationClass> callback) {
        send(HttpMethod.PUT, callback, srcEducationClass);
    }

    /**
     * Puts the EducationClass
     *
     * @param srcEducationClass the EducationClass reference to PUT
     * @return the EducationClass
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public EducationClass put(EducationClass srcEducationClass) throws ClientException {
        return send(HttpMethod.PUT, srcEducationClass);
    }
}
