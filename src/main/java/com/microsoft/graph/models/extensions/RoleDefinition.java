// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.RolePermission;
import com.microsoft.graph.models.extensions.RoleAssignment;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.RoleAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Definition.
 */
public class RoleDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * Description of the Role definition.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * Display Name of the Role definition.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Built In.
     * Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
     */
    @SerializedName("isBuiltIn")
    @Expose
    public Boolean isBuiltIn;

    /**
     * The Role Permissions.
     * List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.
     */
    @SerializedName("rolePermissions")
    @Expose
    public java.util.List<RolePermission> rolePermissions;

    /**
     * The Role Assignments.
     * List of Role assignments for this role definition.
     */
    @SerializedName("roleAssignments")
    @Expose
    public RoleAssignmentCollectionPage roleAssignments;


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


        if (json.has("roleAssignments")) {
            roleAssignments = serializer.deserializeObject(json.get("roleAssignments").toString(), RoleAssignmentCollectionPage.class);
        }
    }
}
