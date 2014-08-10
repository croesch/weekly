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
package de.croesch.weekly.data.io.input.file;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import de.croesch.weekly.data.io.input.DataReaderIF;
import de.croesch.weekly.data.type.period.Month;
import de.croesch.weekly.data.type.period.Week;
import de.croesch.weekly.data.type.period.Year;

/**
 *
 * @author Christian Rösch
 */
public class DataReader implements DataReaderIF {

  public DataReader(Path path) {
  }

  @Override
  public List<Week> getWeeks() {
    return new ArrayList<>();
  }

  @Override
  public List<Month> getMonths() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Year> getYears() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

}
