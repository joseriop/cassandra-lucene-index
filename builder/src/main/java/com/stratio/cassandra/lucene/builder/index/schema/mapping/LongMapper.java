/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.cassandra.lucene.builder.index.schema.mapping;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A {@link Mapper} to map a long field.
 *
 * @author Andres de la Pena {@literal <adelapena@stratio.com>}
 */
public class LongMapper extends SingleColumnMapper<LongMapper> {

    /** The field's index-time boost. */
    @JsonProperty("boost")
    Float boost;

    /**
     * Sets the boost to be used.
     *
     * @param boost the boost
     * @return this with the specified boost
     */
    public LongMapper boost(Float boost) {
        this.boost = boost;
        return this;
    }
}
