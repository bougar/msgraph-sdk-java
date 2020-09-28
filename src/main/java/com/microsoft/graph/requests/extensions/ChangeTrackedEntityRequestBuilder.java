// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChangeTrackedEntity;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Change Tracked Entity Request Builder.
 */
public class ChangeTrackedEntityRequestBuilder extends BaseRequestBuilder implements IChangeTrackedEntityRequestBuilder {

    /**
     * The request builder for the ChangeTrackedEntity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChangeTrackedEntityRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IChangeTrackedEntityRequest instance
     */
    public IChangeTrackedEntityRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IChangeTrackedEntityRequest instance
     */
    public IChangeTrackedEntityRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ChangeTrackedEntityRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the ShiftPreferences type
     */
    public IShiftPreferencesRequestBuilder castToShiftPreferences() {
        return new ShiftPreferencesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.shiftPreferences"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the WorkforceIntegration type
     */
    public IWorkforceIntegrationRequestBuilder castToWorkforceIntegration() {
        return new WorkforceIntegrationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.workforceIntegration"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the ScheduleChangeRequest type
     */
    public IScheduleChangeRequestRequestBuilder castToScheduleChangeRequest() {
        return new ScheduleChangeRequestRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.scheduleChangeRequest"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the OpenShift type
     */
    public IOpenShiftRequestBuilder castToOpenShift() {
        return new OpenShiftRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.openShift"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the SchedulingGroup type
     */
    public ISchedulingGroupRequestBuilder castToSchedulingGroup() {
        return new SchedulingGroupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.schedulingGroup"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the Shift type
     */
    public IShiftRequestBuilder castToShift() {
        return new ShiftRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.shift"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the TimeOffReason type
     */
    public ITimeOffReasonRequestBuilder castToTimeOffReason() {
        return new TimeOffReasonRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.timeOffReason"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the TimeOff type
     */
    public ITimeOffRequestBuilder castToTimeOff() {
        return new TimeOffRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.timeOff"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the OfferShiftRequest type
     */
    public IOfferShiftRequestRequestBuilder castToOfferShiftRequest() {
        return new OfferShiftRequestRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.offerShiftRequest"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the OpenShiftChangeRequest type
     */
    public IOpenShiftChangeRequestRequestBuilder castToOpenShiftChangeRequest() {
        return new OpenShiftChangeRequestRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.openShiftChangeRequest"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the TimeOffRequest type
     */
    public ITimeOffRequestRequestBuilder castToTimeOffRequest() {
        return new TimeOffRequestRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.timeOffRequest"), getClient(), null);
    }

    /**
     * Performs an OData cast on the entity
     *
     * @return the entity cast to the SwapShiftsChangeRequest type
     */
    public ISwapShiftsChangeRequestRequestBuilder castToSwapShiftsChangeRequest() {
        return new SwapShiftsChangeRequestRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.swapShiftsChangeRequest"), getClient(), null);
    }
}
