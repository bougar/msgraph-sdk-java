// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ActivityBasedTimeoutPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityBasedTimeoutPolicyCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionResponse;
import com.microsoft.graph.models.extensions.ActivityBasedTimeoutPolicy;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity Based Timeout Policy Collection With References Page.
 */
public class ActivityBasedTimeoutPolicyCollectionWithReferencesPage extends BaseCollectionPage<ActivityBasedTimeoutPolicy, IActivityBasedTimeoutPolicyCollectionWithReferencesRequestBuilder> implements IActivityBasedTimeoutPolicyCollectionWithReferencesPage {

    /**
     * A collection page for ActivityBasedTimeoutPolicy
     *
     * @param response the serialized ActivityBasedTimeoutPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ActivityBasedTimeoutPolicyCollectionWithReferencesPage(final ActivityBasedTimeoutPolicyCollectionResponse response, final IActivityBasedTimeoutPolicyCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
