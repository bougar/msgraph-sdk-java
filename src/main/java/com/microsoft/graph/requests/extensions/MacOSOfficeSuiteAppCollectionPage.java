// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSOfficeSuiteApp;
import com.microsoft.graph.requests.extensions.IMacOSOfficeSuiteAppCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MacOSOfficeSuiteAppCollectionPage;
import com.microsoft.graph.requests.extensions.MacOSOfficeSuiteAppCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSOffice Suite App Collection Page.
 */
public class MacOSOfficeSuiteAppCollectionPage extends BaseCollectionPage<MacOSOfficeSuiteApp, IMacOSOfficeSuiteAppCollectionRequestBuilder> implements IMacOSOfficeSuiteAppCollectionPage {

    /**
     * A collection page for MacOSOfficeSuiteApp
     *
     * @param response the serialized MacOSOfficeSuiteAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MacOSOfficeSuiteAppCollectionPage(final MacOSOfficeSuiteAppCollectionResponse response, final IMacOSOfficeSuiteAppCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
