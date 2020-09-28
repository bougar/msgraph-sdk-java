// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Profile Photo With Reference Request.
 */
public class ProfilePhotoWithReferenceRequest extends BaseRequest implements IProfilePhotoWithReferenceRequest {

    /**
     * The request for the ProfilePhoto
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProfilePhotoWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ProfilePhoto.class);
    }

    public void post(final ProfilePhoto newProfilePhoto, final IJsonBackedObject payload, final ICallback<? super ProfilePhoto> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public ProfilePhoto post(final ProfilePhoto newProfilePhoto, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newProfilePhoto;
        }
        return null;
    }

    public void get(final ICallback<? super ProfilePhoto> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public ProfilePhoto get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super ProfilePhoto> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final ProfilePhoto sourceProfilePhoto, final ICallback<? super ProfilePhoto> callback) {
		send(HttpMethod.PATCH, callback, sourceProfilePhoto);
	}

	public ProfilePhoto patch(final ProfilePhoto sourceProfilePhoto) throws ClientException {
		return send(HttpMethod.PATCH, sourceProfilePhoto);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IProfilePhotoWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IProfilePhotoWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IProfilePhotoWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ProfilePhotoWithReferenceRequest)this;
    }
}
