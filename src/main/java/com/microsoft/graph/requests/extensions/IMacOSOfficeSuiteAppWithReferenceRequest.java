// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSOfficeSuiteApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MacOSOfficeSuiteApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSOffice Suite App With Reference Request.
 */
public interface IMacOSOfficeSuiteAppWithReferenceRequest extends IHttpRequest {

    void post(final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp, final IJsonBackedObject payload, final ICallback<? super MacOSOfficeSuiteApp> callback);

    MacOSOfficeSuiteApp post(final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super MacOSOfficeSuiteApp> callback);

    MacOSOfficeSuiteApp get() throws ClientException;

	void delete(final ICallback<? super MacOSOfficeSuiteApp> callback);

	void delete() throws ClientException;

	void patch(final MacOSOfficeSuiteApp sourceMacOSOfficeSuiteApp, final ICallback<? super MacOSOfficeSuiteApp> callback);

	MacOSOfficeSuiteApp patch(final MacOSOfficeSuiteApp sourceMacOSOfficeSuiteApp) throws ClientException;

    IMacOSOfficeSuiteAppWithReferenceRequest select(final String value);

    IMacOSOfficeSuiteAppWithReferenceRequest expand(final String value);

}
