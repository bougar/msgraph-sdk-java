// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.MobileAppAssignment;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App With Reference Request.
 */
public interface IMobileAppWithReferenceRequest extends IHttpRequest {

    void post(final MobileApp newMobileApp, final IJsonBackedObject payload, final ICallback<? super MobileApp> callback);

    MobileApp post(final MobileApp newMobileApp, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super MobileApp> callback);

    MobileApp get() throws ClientException;

	void delete(final ICallback<? super MobileApp> callback);

	void delete() throws ClientException;

	void patch(final MobileApp sourceMobileApp, final ICallback<? super MobileApp> callback);

	MobileApp patch(final MobileApp sourceMobileApp) throws ClientException;

    IMobileAppWithReferenceRequest select(final String value);

    IMobileAppWithReferenceRequest expand(final String value);

}
