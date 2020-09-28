// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SettingStateDeviceSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.SettingStateDeviceSummary;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Setting State Device Summary With Reference Request.
 */
public interface ISettingStateDeviceSummaryWithReferenceRequest extends IHttpRequest {

    void post(final SettingStateDeviceSummary newSettingStateDeviceSummary, final IJsonBackedObject payload, final ICallback<? super SettingStateDeviceSummary> callback);

    SettingStateDeviceSummary post(final SettingStateDeviceSummary newSettingStateDeviceSummary, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super SettingStateDeviceSummary> callback);

    SettingStateDeviceSummary get() throws ClientException;

	void delete(final ICallback<? super SettingStateDeviceSummary> callback);

	void delete() throws ClientException;

	void patch(final SettingStateDeviceSummary sourceSettingStateDeviceSummary, final ICallback<? super SettingStateDeviceSummary> callback);

	SettingStateDeviceSummary patch(final SettingStateDeviceSummary sourceSettingStateDeviceSummary) throws ClientException;

    ISettingStateDeviceSummaryWithReferenceRequest select(final String value);

    ISettingStateDeviceSummaryWithReferenceRequest expand(final String value);

}
