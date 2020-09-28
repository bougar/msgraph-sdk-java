// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsAppInstallation;
import com.microsoft.graph.requests.extensions.ITeamsAppRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.TeamsAppInstallation;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams App Installation With Reference Request.
 */
public interface ITeamsAppInstallationWithReferenceRequest extends IHttpRequest {

    void post(final TeamsAppInstallation newTeamsAppInstallation, final IJsonBackedObject payload, final ICallback<? super TeamsAppInstallation> callback);

    TeamsAppInstallation post(final TeamsAppInstallation newTeamsAppInstallation, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super TeamsAppInstallation> callback);

    TeamsAppInstallation get() throws ClientException;

	void delete(final ICallback<? super TeamsAppInstallation> callback);

	void delete() throws ClientException;

	void patch(final TeamsAppInstallation sourceTeamsAppInstallation, final ICallback<? super TeamsAppInstallation> callback);

	TeamsAppInstallation patch(final TeamsAppInstallation sourceTeamsAppInstallation) throws ClientException;

    ITeamsAppInstallationWithReferenceRequest select(final String value);

    ITeamsAppInstallationWithReferenceRequest expand(final String value);

}
