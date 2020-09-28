// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.LicenseDetails;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the License Details With Reference Request.
 */
public class LicenseDetailsWithReferenceRequest extends BaseRequest implements ILicenseDetailsWithReferenceRequest {

    /**
     * The request for the LicenseDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LicenseDetailsWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LicenseDetails.class);
    }

    public void post(final LicenseDetails newLicenseDetails, final IJsonBackedObject payload, final ICallback<? super LicenseDetails> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public LicenseDetails post(final LicenseDetails newLicenseDetails, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newLicenseDetails;
        }
        return null;
    }

    public void get(final ICallback<? super LicenseDetails> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public LicenseDetails get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super LicenseDetails> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final LicenseDetails sourceLicenseDetails, final ICallback<? super LicenseDetails> callback) {
		send(HttpMethod.PATCH, callback, sourceLicenseDetails);
	}

	public LicenseDetails patch(final LicenseDetails sourceLicenseDetails) throws ClientException {
		return send(HttpMethod.PATCH, sourceLicenseDetails);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ILicenseDetailsWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ILicenseDetailsWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ILicenseDetailsWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (LicenseDetailsWithReferenceRequest)this;
    }
}
