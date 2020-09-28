// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DomainDnsUnavailableRecord;
import com.microsoft.graph.requests.extensions.IDomainDnsUnavailableRecordCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DomainDnsUnavailableRecordCollectionPage;
import com.microsoft.graph.requests.extensions.DomainDnsUnavailableRecordCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Unavailable Record Collection Page.
 */
public class DomainDnsUnavailableRecordCollectionPage extends BaseCollectionPage<DomainDnsUnavailableRecord, IDomainDnsUnavailableRecordCollectionRequestBuilder> implements IDomainDnsUnavailableRecordCollectionPage {

    /**
     * A collection page for DomainDnsUnavailableRecord
     *
     * @param response the serialized DomainDnsUnavailableRecordCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DomainDnsUnavailableRecordCollectionPage(final DomainDnsUnavailableRecordCollectionResponse response, final IDomainDnsUnavailableRecordCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
