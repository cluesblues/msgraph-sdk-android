// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User Reference Request.
 */
public class BaseUserReferenceRequest extends BaseRequest implements IBaseUserReferenceRequest {

    /**
     * The request for the User
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseUserReferenceRequest(String requestUrl, IBaseClient client, List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, User.class);
    }

    public void delete(final ICallback<User> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public User delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IUserReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (UserReferenceRequest) this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IUserReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (UserReferenceRequest) this;
    }

    /**
     * Puts the User
     *
     * @param srcUser The User reference to PUT
     * @param callback The callback to be called after success or failure
     */
    public void put(User srcUser, final ICallback<User> callback) {
        send(HttpMethod.PUT, callback, srcUser);
    }

    /**
     * Puts the User
     *
     * @param srcUser The User reference to PUT
     * @return The User
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
    public User put(User srcUser) throws ClientException {
        return send(HttpMethod.PUT, srcUser);
    }
}
