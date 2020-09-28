// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationRoot;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.EducationRoot;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Root With Reference Request.
 */
public interface IEducationRootWithReferenceRequest extends IHttpRequest {

    void post(final EducationRoot newEducationRoot, final IJsonBackedObject payload, final ICallback<? super EducationRoot> callback);

    EducationRoot post(final EducationRoot newEducationRoot, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super EducationRoot> callback);

    EducationRoot get() throws ClientException;

	void delete(final ICallback<? super EducationRoot> callback);

	void delete() throws ClientException;

	void patch(final EducationRoot sourceEducationRoot, final ICallback<? super EducationRoot> callback);

	EducationRoot patch(final EducationRoot sourceEducationRoot) throws ClientException;

    IEducationRootWithReferenceRequest select(final String value);

    IEducationRootWithReferenceRequest expand(final String value);

}
