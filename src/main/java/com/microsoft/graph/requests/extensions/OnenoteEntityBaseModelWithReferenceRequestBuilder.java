// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnenoteEntityBaseModel;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Entity Base Model With Reference Request Builder.
 */
public class OnenoteEntityBaseModelWithReferenceRequestBuilder extends BaseRequestBuilder implements IOnenoteEntityBaseModelWithReferenceRequestBuilder {

    /**
     * The request builder for the OnenoteEntityBaseModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteEntityBaseModelWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IOnenoteEntityBaseModelWithReferenceRequest instance
     */
    public IOnenoteEntityBaseModelWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IOnenoteEntityBaseModelWithReferenceRequest instance
     */
    public IOnenoteEntityBaseModelWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new OnenoteEntityBaseModelWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOnenoteEntityBaseModelReferenceRequestBuilder reference(){
        return new OnenoteEntityBaseModelReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the OnenoteEntitySchemaObjectModel type
     */
    public IOnenoteEntitySchemaObjectModelRequestBuilder castToOnenoteEntitySchemaObjectModel() {
        return new OnenoteEntitySchemaObjectModelRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.onenoteEntitySchemaObjectModel"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the OnenoteResource type
     */
    public IOnenoteResourceRequestBuilder castToOnenoteResource() {
        return new OnenoteResourceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.onenoteResource"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the OnenoteEntityHierarchyModel type
     */
    public IOnenoteEntityHierarchyModelRequestBuilder castToOnenoteEntityHierarchyModel() {
        return new OnenoteEntityHierarchyModelRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.onenoteEntityHierarchyModel"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the OnenotePage type
     */
    public IOnenotePageRequestBuilder castToOnenotePage() {
        return new OnenotePageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.onenotePage"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the Notebook type
     */
    public INotebookRequestBuilder castToNotebook() {
        return new NotebookRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.notebook"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the SectionGroup type
     */
    public ISectionGroupRequestBuilder castToSectionGroup() {
        return new SectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sectionGroup"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the OnenoteSection type
     */
    public IOnenoteSectionRequestBuilder castToOnenoteSection() {
        return new OnenoteSectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.onenoteSection"), getClient(), null);
    }

}
