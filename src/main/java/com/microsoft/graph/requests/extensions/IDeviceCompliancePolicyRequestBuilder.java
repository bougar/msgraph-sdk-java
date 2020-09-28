// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Policy Request Builder.
 */
public interface IDeviceCompliancePolicyRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceCompliancePolicyRequest instance
     */
    IDeviceCompliancePolicyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceCompliancePolicyRequest instance
     */
    IDeviceCompliancePolicyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceCompliancePolicyAssignmentCollectionRequestBuilder assignments();

    IDeviceCompliancePolicyAssignmentRequestBuilder assignments(final String id);

    ISettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries();

    ISettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(final String id);

    IDeviceComplianceDeviceStatusCollectionRequestBuilder deviceStatuses();

    IDeviceComplianceDeviceStatusRequestBuilder deviceStatuses(final String id);

    /**
     * Gets the request builder for DeviceComplianceDeviceOverview
     *
     * @return the IDeviceComplianceDeviceOverviewRequestBuilder instance
     */
    IDeviceComplianceDeviceOverviewRequestBuilder deviceStatusOverview();

    IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder scheduledActionsForRule();

    IDeviceComplianceScheduledActionForRuleRequestBuilder scheduledActionsForRule(final String id);

    IDeviceComplianceUserStatusCollectionRequestBuilder userStatuses();

    IDeviceComplianceUserStatusRequestBuilder userStatuses(final String id);

    /**
     * Gets the request builder for DeviceComplianceUserOverview
     *
     * @return the IDeviceComplianceUserOverviewRequestBuilder instance
     */
    IDeviceComplianceUserOverviewRequestBuilder userStatusOverview();

    IDeviceCompliancePolicyAssignCollectionRequestBuilder assign(final java.util.List<DeviceCompliancePolicyAssignment> assignments);
    IDeviceCompliancePolicyScheduleActionsForRulesRequestBuilder scheduleActionsForRules(final java.util.List<DeviceComplianceScheduledActionForRule> deviceComplianceScheduledActionForRules);

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the AndroidCompliancePolicy type
     */
    IAndroidCompliancePolicyRequestBuilder castToAndroidCompliancePolicy();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the AndroidWorkProfileCompliancePolicy type
     */
    IAndroidWorkProfileCompliancePolicyRequestBuilder castToAndroidWorkProfileCompliancePolicy();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the IosCompliancePolicy type
     */
    IIosCompliancePolicyRequestBuilder castToIosCompliancePolicy();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the MacOSCompliancePolicy type
     */
    IMacOSCompliancePolicyRequestBuilder castToMacOSCompliancePolicy();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the Windows10CompliancePolicy type
     */
    IWindows10CompliancePolicyRequestBuilder castToWindows10CompliancePolicy();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the Windows10MobileCompliancePolicy type
     */
    IWindows10MobileCompliancePolicyRequestBuilder castToWindows10MobileCompliancePolicy();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the Windows81CompliancePolicy type
     */
    IWindows81CompliancePolicyRequestBuilder castToWindows81CompliancePolicy();

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the WindowsPhone81CompliancePolicy type
     */
    IWindowsPhone81CompliancePolicyRequestBuilder castToWindowsPhone81CompliancePolicy();

}