// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentitySecurityDefaultsEnforcementPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Identity Security Defaults Enforcement Policy Collection Request.
 */
public interface IIdentitySecurityDefaultsEnforcementPolicyCollectionRequest extends IHttpRequest {

    void get(final ICallback<? super IIdentitySecurityDefaultsEnforcementPolicyCollectionPage> callback);

    IIdentitySecurityDefaultsEnforcementPolicyCollectionPage get() throws ClientException;

    void post(final IdentitySecurityDefaultsEnforcementPolicy newIdentitySecurityDefaultsEnforcementPolicy, final ICallback<? super IdentitySecurityDefaultsEnforcementPolicy> callback);

    IdentitySecurityDefaultsEnforcementPolicy post(final IdentitySecurityDefaultsEnforcementPolicy newIdentitySecurityDefaultsEnforcementPolicy) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIdentitySecurityDefaultsEnforcementPolicyCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    IIdentitySecurityDefaultsEnforcementPolicyCollectionRequest filter(final String value);

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    IIdentitySecurityDefaultsEnforcementPolicyCollectionRequest orderBy(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIdentitySecurityDefaultsEnforcementPolicyCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IIdentitySecurityDefaultsEnforcementPolicyCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IIdentitySecurityDefaultsEnforcementPolicyCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IIdentitySecurityDefaultsEnforcementPolicyCollectionRequest skipToken(final String skipToken);
}
