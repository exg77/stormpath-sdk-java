/*
 * Copyright 2013 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.tenant;

import com.stormpath.sdk.query.Options;

/**
 * @since 0.8
 */
public interface TenantOptions<T> extends Options {

    T withApplications();

    T withApplications(int limit);

    T withApplications(int limit, int offset);

    T withDirectories();

    T withDirectories(int limit);

    T withDirectories(int limit, int offset);

    /**
     * Ensures that when retrieving a Tenant, the Tenant's {@link Tenant#getCustomData() customData} is also
     * retrieved in the same request. This enhances performance by leveraging a single request to retrieve multiple
     * related resources you know you will use.
     *
     * @return this instance for method chaining.
     * @since 1.0.0
     */
    T withCustomData();
}
