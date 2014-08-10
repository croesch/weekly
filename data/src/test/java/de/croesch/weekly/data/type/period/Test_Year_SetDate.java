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
package de.croesch.weekly.data.type.period;

import java.time.LocalDate;
import static java.time.Month.DECEMBER;
import static java.time.Month.JANUARY;

import org.junit.Test;

import static de.croesch.weekly.data.assertions.Assertions.assertThat;

/**
 * Provides tests for {@link Year#setDate(int)}.
 * <p>
 * @author Christian Rösch
 */
public class Test_Year_SetDate {

  @Test
  public void should_Set_Begin_To_First_Day_Of_Year() {
    Year sut = new Year();

    sut.setDate(2014);
    assertThat(sut).hasBegin(LocalDate.of(2014, JANUARY, 1));

    sut.setDate(1974);
    assertThat(sut).hasBegin(LocalDate.of(1974, JANUARY, 1));

    sut.setDate(2000);
    assertThat(sut).hasBegin(LocalDate.of(2000, JANUARY, 1));
  }

  @Test
  public void should_Set_End_To_Last_Day_Of_Year() {
    Year sut = new Year();

    sut.setDate(2014);
    assertThat(sut).hasEnd(LocalDate.of(2014, DECEMBER, 31));

    sut.setDate(2012);
    assertThat(sut).hasEnd(LocalDate.of(2012, DECEMBER, 31));

    sut.setDate(1974);
    assertThat(sut).hasEnd(LocalDate.of(1974, DECEMBER, 31));
  }
}
