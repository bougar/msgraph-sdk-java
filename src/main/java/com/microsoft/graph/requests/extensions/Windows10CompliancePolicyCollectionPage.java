// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows10CompliancePolicy;
import com.microsoft.graph.requests.extensions.IWindows10CompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.Windows10CompliancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.Windows10CompliancePolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Compliance Policy Collection Page.
 */
public class Windows10CompliancePolicyCollectionPage extends BaseCollectionPage<Windows10CompliancePolicy, IWindows10CompliancePolicyCollectionRequestBuilder> implements IWindows10CompliancePolicyCollectionPage {

    /**
     * A collection page for Windows10CompliancePolicy
     *
     * @param response the serialized Windows10CompliancePolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public Windows10CompliancePolicyCollectionPage(final Windows10CompliancePolicyCollectionResponse response, final IWindows10CompliancePolicyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
