// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupSetting;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.GroupSetting;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Setting Reference Request.
 */
public interface IGroupSettingReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super GroupSetting> callback);

    GroupSetting delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupSettingReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupSettingReferenceRequest expand(final String value);

    /**
     * Puts the GroupSetting
     *
     * @param srcGroupSetting the GroupSetting to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(GroupSetting srcGroupSetting, final ICallback<? super GroupSetting> callback);

    /**
     * Puts the GroupSetting
     *
     * @param srcGroupSetting the GroupSetting to PUT
     * @return the GroupSetting
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    GroupSetting put(GroupSetting srcGroupSetting) throws ClientException;
}
