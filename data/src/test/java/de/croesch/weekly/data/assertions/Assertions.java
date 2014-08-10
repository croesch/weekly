package de.croesch.weekly.data.assertions;

import de.croesch.weekly.data.type.period.Month;
import de.croesch.weekly.data.type.period.MonthAssert;
import de.croesch.weekly.data.type.period.Week;
import de.croesch.weekly.data.type.period.WeekAssert;
import de.croesch.weekly.data.type.period.Year;
import de.croesch.weekly.data.type.period.YearAssert;
import de.croesch.weekly.data.type.task.OnetimeTask;
import de.croesch.weekly.data.type.task.OnetimeTaskAssert;
import de.croesch.weekly.data.type.task.RepetitiveTask;
import de.croesch.weekly.data.type.task.RepetitiveTaskAssert;

/**
 * Entry point for assertion of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
public class Assertions extends org.assertj.core.api.Assertions {

  /**
   * Creates a new instance of <code>{@link MonthAssert}</code>.
   * <p>
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static MonthAssert assertThat(Month actual) {
    return new MonthAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link WeekAssert}</code>.
   * <p>
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static WeekAssert assertThat(Week actual) {
    return new WeekAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link YearAssert}</code>.
   * <p>
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static YearAssert assertThat(Year actual) {
    return new YearAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link OnetimeTaskAssert}</code>.
   * <p>
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static OnetimeTaskAssert assertThat(OnetimeTask actual) {
    return new OnetimeTaskAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link RepetitiveTaskAssert}</code>.
   * <p>
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static RepetitiveTaskAssert assertThat(RepetitiveTask actual) {
    return new RepetitiveTaskAssert(actual);
  }

  /**
   * Creates a new <code>{@link Assertions}</code>.
   */
  protected Assertions() {
    // empty
  }
}
