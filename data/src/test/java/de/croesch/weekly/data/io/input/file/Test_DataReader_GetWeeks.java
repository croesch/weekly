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

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import static java.time.Month.APRIL;
import static java.time.Month.MARCH;
import static java.time.Month.MAY;
import java.time.format.DateTimeFormatter;

import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import de.croesch.weekly.data.type.period.Week;
import de.croesch.weekly.data.type.task.OnetimeTask;
import de.croesch.weekly.data.type.task.Task;

/**
 * Provides tests for {@link DataReader#getWeeks()}.
 * <p>
 * @author Christian Rösch
 */
public class Test_DataReader_GetWeeks {

  private Path folder;
  private OnetimeTask task1 = new OnetimeTask();

  @Before
  public void setUp() throws IOException {
    folder = Files.createTempDirectory(null);
    task1.setDescription("Auto waschen");
    task1.setDueDate(LocalDate.of(2014, MARCH, 14));
  }

  @Test
  public void should_Be_Empty_If_Directory_Does_Not_Exist() {
    DataReader sut = new DataReader(Paths.get(URI.create("file:/asd")));
    assertThat(sut.getWeeks()).isEmpty();
  }

  @Test
  public void should_Be_Empty_If_SubDirectory_Does_Not_Exist() {
    DataReader sut = new DataReader(folder);
    assertThat(sut.getWeeks()).isEmpty();
  }

  @Test
  public void should_Be_Empty_If_Week_Directory_Is_Empty() throws IOException {
    final Path weekFolder = folder.resolve("weeks");
    Files.createDirectory(weekFolder);

    DataReader sut = new DataReader(folder);
    assertThat(sut.getWeeks()).isEmpty();
  }

  @Test
  public void should_Contain_Weeks_Of_Directory() throws IOException {
    final Week week1 = week(2010, MARCH, 15, task1);
    final Week week2 = week(2012, MAY, 14, task1);
    final Week week3 = week(2014, APRIL, 7, task1);

    final Path weekFolder = folder.resolve("weeks");
    Files.createDirectory(weekFolder);
    write(weekFolder, week1);
    write(weekFolder, week2);
    write(weekFolder, week3);

    DataReader sut = new DataReader(folder);
    assertThat(sut.getWeeks()).containsOnly(week1, week2, week3);
  }

  @Test
  public void should_Sort_Weeks_Chronologically() throws IOException {
    Assertions.fail("TODO");
  }

  private void write(final Path weekFolder, Week week) throws IOException {
    final String fileName = week.getBegin().format(DateTimeFormatter.BASIC_ISO_DATE);
    String fileContent = "";
    Files.write(weekFolder.resolve(fileName), fileContent.getBytes());
  }

  private Week week(int year, Month month, int day, Task... tasks) {
    Week week = new Week();
    week.setDate(year, month, day);
    return week;
  }
}
