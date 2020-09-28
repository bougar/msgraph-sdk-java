// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudCommunications;
import com.microsoft.graph.requests.extensions.ICallCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallRequestBuilder;
import com.microsoft.graph.requests.extensions.CallCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CallRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.ICallRecordCollectionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.ICallRecordRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordCollectionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Communications Reference Request.
 */
public class CloudCommunicationsReferenceRequest extends BaseRequest implements ICloudCommunicationsReferenceRequest {

    /**
     * The request for the CloudCommunications
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudCommunicationsReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CloudCommunications.class);
    }

    public void delete(final ICallback<? super CloudCommunications> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public CloudCommunications delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICloudCommunicationsReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CloudCommunicationsReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICloudCommunicationsReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CloudCommunicationsReferenceRequest)this;
    }
    /**
     * Puts the CloudCommunications
     *
     * @param srcCloudCommunications the CloudCommunications reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(CloudCommunications srcCloudCommunications, final ICallback<? super CloudCommunications> callback) {
        send(HttpMethod.PUT, callback, srcCloudCommunications);
    }

    /**
     * Puts the CloudCommunications
     *
     * @param srcCloudCommunications the CloudCommunications reference to PUT
     * @return the CloudCommunications
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public CloudCommunications put(CloudCommunications srcCloudCommunications) throws ClientException {
        return send(HttpMethod.PUT, srcCloudCommunications);
    }
}
