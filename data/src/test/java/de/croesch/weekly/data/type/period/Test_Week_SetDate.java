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
import static java.time.Month.APRIL;
import static java.time.Month.FEBRUARY;
import static java.time.Month.MARCH;

import org.junit.Test;

import static de.croesch.weekly.data.assertions.Assertions.assertThat;

/**
 * Provides tests for {@link Week#setDate(int, java.time.Month, int) }.
 * <p>
 * @author Christian Rösch
 */
public class Test_Week_SetDate {

  @Test
  public void should_Set_Begin_To_First_Day_Of_Week() {
    Week sut = new Week();

    sut.setDate(2012, MARCH, 1);
    assertThat(sut).hasBegin(LocalDate.of(2012, FEBRUARY, 27));
    sut.setDate(2012, MARCH, 2);
    assertThat(sut).hasBegin(LocalDate.of(2012, FEBRUARY, 27));
    sut.setDate(2012, MARCH, 3);
    assertThat(sut).hasBegin(LocalDate.of(2012, FEBRUARY, 27));
    sut.setDate(2012, MARCH, 4);
    assertThat(sut).hasBegin(LocalDate.of(2012, FEBRUARY, 27));
    sut.setDate(2012, MARCH, 5);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 5));
    sut.setDate(2012, MARCH, 6);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 5));
    sut.setDate(2012, MARCH, 7);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 5));
    sut.setDate(2012, MARCH, 8);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 5));
    sut.setDate(2012, MARCH, 9);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 5));
    sut.setDate(2012, MARCH, 10);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 5));
    sut.setDate(2012, MARCH, 11);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 5));
    sut.setDate(2012, MARCH, 12);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 12));
    sut.setDate(2012, MARCH, 13);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 12));
    sut.setDate(2012, MARCH, 14);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 12));
    sut.setDate(2012, MARCH, 15);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 12));
    sut.setDate(2012, MARCH, 16);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 12));
    sut.setDate(2012, MARCH, 17);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 12));
    sut.setDate(2012, MARCH, 18);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 12));
    sut.setDate(2012, MARCH, 19);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 19));
    sut.setDate(2012, MARCH, 20);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 19));
    sut.setDate(2012, MARCH, 21);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 19));
    sut.setDate(2012, MARCH, 22);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 19));
    sut.setDate(2012, MARCH, 23);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 19));
    sut.setDate(2012, MARCH, 24);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 19));
    sut.setDate(2012, MARCH, 25);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 19));
    sut.setDate(2012, MARCH, 26);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 26));
    sut.setDate(2012, MARCH, 27);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 26));
    sut.setDate(2012, MARCH, 28);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 26));
    sut.setDate(2012, MARCH, 29);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 26));
    sut.setDate(2012, MARCH, 30);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 26));
    sut.setDate(2012, MARCH, 31);
    assertThat(sut).hasBegin(LocalDate.of(2012, MARCH, 26));
  }

  @Test
  public void should_Set_End_To_Last_Day_Of_Week() {
    Week sut = new Week();

    sut.setDate(2012, MARCH, 1);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 4));
    sut.setDate(2012, MARCH, 2);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 4));
    sut.setDate(2012, MARCH, 3);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 4));
    sut.setDate(2012, MARCH, 4);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 4));
    sut.setDate(2012, MARCH, 5);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 11));
    sut.setDate(2012, MARCH, 6);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 11));
    sut.setDate(2012, MARCH, 7);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 11));
    sut.setDate(2012, MARCH, 8);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 11));
    sut.setDate(2012, MARCH, 9);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 11));
    sut.setDate(2012, MARCH, 10);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 11));
    sut.setDate(2012, MARCH, 11);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 11));
    sut.setDate(2012, MARCH, 12);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 18));
    sut.setDate(2012, MARCH, 13);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 18));
    sut.setDate(2012, MARCH, 14);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 18));
    sut.setDate(2012, MARCH, 15);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 18));
    sut.setDate(2012, MARCH, 16);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 18));
    sut.setDate(2012, MARCH, 17);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 18));
    sut.setDate(2012, MARCH, 18);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 18));
    sut.setDate(2012, MARCH, 19);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 25));
    sut.setDate(2012, MARCH, 20);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 25));
    sut.setDate(2012, MARCH, 21);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 25));
    sut.setDate(2012, MARCH, 22);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 25));
    sut.setDate(2012, MARCH, 23);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 25));
    sut.setDate(2012, MARCH, 24);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 25));
    sut.setDate(2012, MARCH, 25);
    assertThat(sut).hasEnd(LocalDate.of(2012, MARCH, 25));
    sut.setDate(2012, MARCH, 26);
    assertThat(sut).hasEnd(LocalDate.of(2012, APRIL, 1));
    sut.setDate(2012, MARCH, 27);
    assertThat(sut).hasEnd(LocalDate.of(2012, APRIL, 1));
    sut.setDate(2012, MARCH, 28);
    assertThat(sut).hasEnd(LocalDate.of(2012, APRIL, 1));
    sut.setDate(2012, MARCH, 29);
    assertThat(sut).hasEnd(LocalDate.of(2012, APRIL, 1));
    sut.setDate(2012, MARCH, 30);
    assertThat(sut).hasEnd(LocalDate.of(2012, APRIL, 1));
    sut.setDate(2012, MARCH, 31);
    assertThat(sut).hasEnd(LocalDate.of(2012, APRIL, 1));
  }
}
