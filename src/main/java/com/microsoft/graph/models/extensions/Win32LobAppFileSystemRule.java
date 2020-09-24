// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Win32LobAppFileSystemOperationType;
import com.microsoft.graph.models.generated.Win32LobAppRuleOperator;
import com.microsoft.graph.models.extensions.Win32LobAppRule;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App File System Rule.
 */
public class Win32LobAppFileSystemRule extends Win32LobAppRule implements IJsonBackedObject {


    /**
     * The Check32Bit On64System.
     * A value indicating whether to expand environment variables in the 32-bit context on 64-bit systems.
     */
    @SerializedName("check32BitOn64System")
    @Expose
    public Boolean check32BitOn64System;

    /**
     * The Comparison Value.
     * The file or folder comparison value.
     */
    @SerializedName("comparisonValue")
    @Expose
    public String comparisonValue;

    /**
     * The File Or Folder Name.
     * The file or folder name to look up.
     */
    @SerializedName("fileOrFolderName")
    @Expose
    public String fileOrFolderName;

    /**
     * The Operation Type.
     * The file system operation type. Possible values are: notConfigured, exists, modifiedDate, createdDate, version, sizeInMB.
     */
    @SerializedName("operationType")
    @Expose
    public Win32LobAppFileSystemOperationType operationType;

    /**
     * The Operator.
     * The operator for file or folder detection. Possible values are: notConfigured, equal, notEqual, greaterThan, greaterThanOrEqual, lessThan, lessThanOrEqual.
     */
    @SerializedName("operator")
    @Expose
    public Win32LobAppRuleOperator operator;

    /**
     * The Path.
     * The file or folder path to look up.
     */
    @SerializedName("path")
    @Expose
    public String path;


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

    }
}
