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

/**
 *
 * @author Christian Rösch
 */
public class Week extends Period {

  public void setDate(int year, java.time.Month month, int day) {
    LocalDate date = LocalDate.of(year, month, day);
    setBegin(date.minusDays(date.getDayOfWeek().getValue() - 1));
    setEnd(getBegin().plusDays(6));
  }
}
