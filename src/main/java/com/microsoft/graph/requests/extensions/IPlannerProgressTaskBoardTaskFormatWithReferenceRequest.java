// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerProgressTaskBoardTaskFormat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.PlannerProgressTaskBoardTaskFormat;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Progress Task Board Task Format With Reference Request.
 */
public interface IPlannerProgressTaskBoardTaskFormatWithReferenceRequest extends IHttpRequest {

    void post(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat, final IJsonBackedObject payload, final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback);

    PlannerProgressTaskBoardTaskFormat post(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback);

    PlannerProgressTaskBoardTaskFormat get() throws ClientException;

	void delete(final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback);

	void delete() throws ClientException;

	void patch(final PlannerProgressTaskBoardTaskFormat sourcePlannerProgressTaskBoardTaskFormat, final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback);

	PlannerProgressTaskBoardTaskFormat patch(final PlannerProgressTaskBoardTaskFormat sourcePlannerProgressTaskBoardTaskFormat) throws ClientException;

    IPlannerProgressTaskBoardTaskFormatWithReferenceRequest select(final String value);

    IPlannerProgressTaskBoardTaskFormatWithReferenceRequest expand(final String value);

}
