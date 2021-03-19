/**
 * $Id$
 * 
 * SARL is an general-purpose agent programming language.
 * More details on http://www.sarl.io
 * 
 * Copyright (C) 2014-2020 the original authors or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.sarl.demos.boids;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.util.Objects;
import java.util.UUID;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Event specifying when agent need to be add to infected, in order to draw chart and make stats
 * @author Benjamin Caoduro
 */
@SarlSpecification("0.11")
@SarlElementType(15)
@SuppressWarnings("all")
public class updateChart extends Event {
  public final UUID ID;
  
  public final String action;
  
  public updateChart(final UUID newID, final String newAction) {
    this.ID = newID;
    this.action = newAction;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    updateChart other = (updateChart) obj;
    if (!Objects.equals(this.ID, other.ID))
      return false;
    if (!Objects.equals(this.action, other.action))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Objects.hashCode(this.ID);
    result = prime * result + Objects.hashCode(this.action);
    return result;
  }
  
  /**
   * Returns a String representation of the updateChart event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("ID", this.ID);
    builder.add("action", this.action);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 2187719466L;
}
