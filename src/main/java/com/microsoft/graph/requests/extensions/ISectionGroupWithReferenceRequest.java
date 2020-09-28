// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Section Group With Reference Request.
 */
public interface ISectionGroupWithReferenceRequest extends IHttpRequest {

    void post(final SectionGroup newSectionGroup, final IJsonBackedObject payload, final ICallback<? super SectionGroup> callback);

    SectionGroup post(final SectionGroup newSectionGroup, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super SectionGroup> callback);

    SectionGroup get() throws ClientException;

	void delete(final ICallback<? super SectionGroup> callback);

	void delete() throws ClientException;

	void patch(final SectionGroup sourceSectionGroup, final ICallback<? super SectionGroup> callback);

	SectionGroup patch(final SectionGroup sourceSectionGroup) throws ClientException;

    ISectionGroupWithReferenceRequest select(final String value);

    ISectionGroupWithReferenceRequest expand(final String value);

}
