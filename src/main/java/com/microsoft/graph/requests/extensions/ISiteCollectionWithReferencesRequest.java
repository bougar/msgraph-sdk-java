// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Collection With References Request.
 */
public interface ISiteCollectionWithReferencesRequest extends IHttpRequest {

    void get(final ICallback<? super ISiteCollectionWithReferencesPage> callback);

    ISiteCollectionWithReferencesPage get() throws ClientException;

    ISiteCollectionWithReferencesRequest expand(final String value);
    
    ISiteCollectionWithReferencesRequest select(final String value);

    ISiteCollectionWithReferencesRequest top(final int value);

}
