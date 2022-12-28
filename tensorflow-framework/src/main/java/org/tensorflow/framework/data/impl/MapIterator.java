/*
 * Copyright 2020 The TensorFlow Authors. All rights reserved.
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
package org.tensorflow.framework.data.impl;

import java.util.List;
import java.util.function.Function;
import org.tensorflow.Operand;
import org.tensorflow.framework.data.DatasetIterator;
import org.tensorflow.framework.data.DatasetOptional;

public class MapIterator extends DatasetIterator {
  private final Function<List<Operand<?>>, List<Operand<?>>> mapper;

  public MapIterator(DatasetIterator source, Function<List<Operand<?>>, List<Operand<?>>> mapper) {
    super(source);
    this.mapper = mapper;
  }

  @Override
  public List<Operand<?>> getNext() {
    return mapper.apply(super.getNext());
  }

  @Override
  public DatasetOptional getNextAsOptional() {
    DatasetOptional optional = super.getNextAsOptional();
    return new MapOptional(optional, mapper);
  }
}
