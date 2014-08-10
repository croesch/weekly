/*
 * Copyright (C) 2014 Christian Rösch
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.croesch.weekly.data.type.task;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 * Provides tests for {@link RepetitiveTask#getDescription()}.
 * <p>
 * @author Christian Rösch
 */
public class Test_RepetitiveTask_GetDescription {

  @Test
  public void should_Return_Set_Description() {
    final RepetitiveTask sut = new RepetitiveTask();
    sut.setDescription("describe it");
    assertThat(sut.getDescription()).isEqualTo("describe it");
  }

  @Test
  public void should_Be_Null_Initially() {
    final RepetitiveTask sut = new RepetitiveTask();
    assertThat(sut.getDescription()).isNull();
  }
}
