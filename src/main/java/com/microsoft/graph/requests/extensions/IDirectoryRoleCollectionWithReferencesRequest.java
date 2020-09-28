// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryRole;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Role Collection With References Request.
 */
public interface IDirectoryRoleCollectionWithReferencesRequest extends IHttpRequest {

    void get(final ICallback<? super IDirectoryRoleCollectionWithReferencesPage> callback);

    IDirectoryRoleCollectionWithReferencesPage get() throws ClientException;

    IDirectoryRoleCollectionWithReferencesRequest expand(final String value);
    
    IDirectoryRoleCollectionWithReferencesRequest select(final String value);

    IDirectoryRoleCollectionWithReferencesRequest top(final int value);

}
