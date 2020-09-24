// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserActivity;
import com.microsoft.graph.requests.extensions.IActivityHistoryItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityHistoryItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.UserActivity;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Activity Reference Request.
 */
public interface IUserActivityReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super UserActivity> callback);

    UserActivity delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserActivityReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserActivityReferenceRequest expand(final String value);

    /**
     * Puts the UserActivity
     *
     * @param srcUserActivity the UserActivity to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(UserActivity srcUserActivity, final ICallback<? super UserActivity> callback);

    /**
     * Puts the UserActivity
     *
     * @param srcUserActivity the UserActivity to PUT
     * @return the UserActivity
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    UserActivity put(UserActivity srcUserActivity) throws ClientException;
}
