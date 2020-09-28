// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import java.util.Arrays;
import java.util.EnumSet;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed App Policy With Reference Request Builder.
 */
public interface IManagedAppPolicyWithReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IManagedAppPolicyWithReferenceRequest instance
     */
    IManagedAppPolicyWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IManagedAppPolicyWithReferenceRequest instance
     */
    IManagedAppPolicyWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IManagedAppPolicyReferenceRequestBuilder reference();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the ManagedAppProtection type
     */
    IManagedAppProtectionRequestBuilder castToManagedAppProtection();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the WindowsInformationProtection type
     */
    IWindowsInformationProtectionRequestBuilder castToWindowsInformationProtection();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the ManagedAppConfiguration type
     */
    IManagedAppConfigurationRequestBuilder castToManagedAppConfiguration();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the TargetedManagedAppProtection type
     */
    ITargetedManagedAppProtectionRequestBuilder castToTargetedManagedAppProtection();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the DefaultManagedAppProtection type
     */
    IDefaultManagedAppProtectionRequestBuilder castToDefaultManagedAppProtection();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the AndroidManagedAppProtection type
     */
    IAndroidManagedAppProtectionRequestBuilder castToAndroidManagedAppProtection();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the IosManagedAppProtection type
     */
    IIosManagedAppProtectionRequestBuilder castToIosManagedAppProtection();

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

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the TargetedManagedAppConfiguration type
     */
    ITargetedManagedAppConfigurationRequestBuilder castToTargetedManagedAppConfiguration();

}
