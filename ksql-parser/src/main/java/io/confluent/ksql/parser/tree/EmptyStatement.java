/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License; you may not use this file
 * except in compliance with the License.  You may obtain a copy of the License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.ksql.parser.tree;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.Objects;
import java.util.Optional;

public class EmptyStatement extends Statement {

  public EmptyStatement() {
    this(Optional.empty());
  }

  public EmptyStatement(final NodeLocation location) {
    this(Optional.of(location));
  }

  private EmptyStatement(final Optional<NodeLocation> location) {
    super(location);
  }

  @Override
  public <R, C> R accept(final AstVisitor<R, C> visitor, final C context) {
    return null;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this);
  }

  @Override
  public boolean equals(final Object obj) {
    return obj instanceof EmptyStatement;
  }

  @Override
  public String toString() {
    return toStringHelper(this).toString();
  }
}