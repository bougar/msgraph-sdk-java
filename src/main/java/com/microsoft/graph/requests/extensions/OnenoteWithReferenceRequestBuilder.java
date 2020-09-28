// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.requests.extensions.INotebookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.NotebookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenotePageRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenotePageRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote With Reference Request Builder.
 */
public class OnenoteWithReferenceRequestBuilder extends BaseRequestBuilder implements IOnenoteWithReferenceRequestBuilder {

    /**
     * The request builder for the Onenote
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IOnenoteWithReferenceRequest instance
     */
    public IOnenoteWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IOnenoteWithReferenceRequest instance
     */
    public IOnenoteWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new OnenoteWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOnenoteReferenceRequestBuilder reference(){
        return new OnenoteReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
