// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryRoleTemplate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DirectoryRoleTemplate;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Role Template With Reference Request.
 */
public interface IDirectoryRoleTemplateWithReferenceRequest extends IHttpRequest {

    void post(final DirectoryRoleTemplate newDirectoryRoleTemplate, final IJsonBackedObject payload, final ICallback<? super DirectoryRoleTemplate> callback);

    DirectoryRoleTemplate post(final DirectoryRoleTemplate newDirectoryRoleTemplate, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super DirectoryRoleTemplate> callback);

    DirectoryRoleTemplate get() throws ClientException;

	void delete(final ICallback<? super DirectoryRoleTemplate> callback);

	void delete() throws ClientException;

	void patch(final DirectoryRoleTemplate sourceDirectoryRoleTemplate, final ICallback<? super DirectoryRoleTemplate> callback);

	DirectoryRoleTemplate patch(final DirectoryRoleTemplate sourceDirectoryRoleTemplate) throws ClientException;

    IDirectoryRoleTemplateWithReferenceRequest select(final String value);

    IDirectoryRoleTemplateWithReferenceRequest expand(final String value);

}
