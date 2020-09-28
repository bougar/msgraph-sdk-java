// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtection;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Information Protection Request Builder.
 */
public interface IWindowsInformationProtectionRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsInformationProtectionRequest instance
     */
    IWindowsInformationProtectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWindowsInformationProtectionRequest instance
     */
    IWindowsInformationProtectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments();

    ITargetedManagedAppPolicyAssignmentRequestBuilder assignments(final String id);

    IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder exemptAppLockerFiles();

    IWindowsInformationProtectionAppLockerFileRequestBuilder exemptAppLockerFiles(final String id);

    IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder protectedAppLockerFiles();

    IWindowsInformationProtectionAppLockerFileRequestBuilder protectedAppLockerFiles(final String id);
    IWindowsInformationProtectionAssignRequestBuilder assign(final java.util.List<TargetedManagedAppPolicyAssignment> assignments);

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the MdmWindowsInformationProtectionPolicy type
     */
    IMdmWindowsInformationProtectionPolicyRequestBuilder castToMdmWindowsInformationProtectionPolicy();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the WindowsInformationProtectionPolicy type
     */
    IWindowsInformationProtectionPolicyRequestBuilder castToWindowsInformationProtectionPolicy();

}