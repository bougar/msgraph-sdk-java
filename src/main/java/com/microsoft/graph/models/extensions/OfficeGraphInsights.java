// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.SharedInsight;
import com.microsoft.graph.models.extensions.Trending;
import com.microsoft.graph.models.extensions.UsedInsight;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.SharedInsightCollectionPage;
import com.microsoft.graph.requests.extensions.TrendingCollectionPage;
import com.microsoft.graph.requests.extensions.UsedInsightCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Graph Insights.
 */
public class OfficeGraphInsights extends Entity implements IJsonBackedObject {


    /**
     * The Shared.
     * Calculated relationship identifying documents shared with or by the user. This includes URLs, file attachments, and reference attachments to OneDrive for Business and SharePoint files found in Outlook messages and meetings. This also includes URLs and reference attachments to Teams conversations. Ordered by recency of share.
     */
    @SerializedName("shared")
    @Expose
    public SharedInsightCollectionPage shared;

    /**
     * The Trending.
     * Calculated relationship identifying documents trending around a user. Trending documents are calculated based on activity of the user's closest network of people and include files stored in OneDrive for Business and SharePoint. Trending insights help the user to discover potentially useful content that the user has access to, but has never viewed before.
     */
    @SerializedName("trending")
    @Expose
    public TrendingCollectionPage trending;

    /**
     * The Used.
     * Calculated relationship identifying the latest documents viewed or modified by a user, including OneDrive for Business and SharePoint documents, ranked by recency of use.
     */
    @SerializedName("used")
    @Expose
    public UsedInsightCollectionPage used;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("shared")) {
            shared = serializer.deserializeObject(json.get("shared").toString(), SharedInsightCollectionPage.class);
        }

        if (json.has("trending")) {
            trending = serializer.deserializeObject(json.get("trending").toString(), TrendingCollectionPage.class);
        }

        if (json.has("used")) {
            used = serializer.deserializeObject(json.get("used").toString(), UsedInsightCollectionPage.class);
        }
    }
}
