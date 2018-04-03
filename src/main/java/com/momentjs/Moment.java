/*
 * Copyright (c)  Hive A.S. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by ozgur, 2018
 */

package com.momentjs;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

import java.util.Date;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@SuppressWarnings("unused")
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Moment {

  public interface HTML5_FMT {

    String DATETIME_LOCAL = "YYYY-MM-DDTHH:mm";            // <input type="datetime-local" />
    String DATETIME_LOCAL_SECONDS = "YYYY-MM-DDTHH:mm:ss";  // <input type="datetime-local" step="1" />
    String DATETIME_LOCAL_MS = "YYYY-MM-DDTHH:mm:ss.SSS";   // <input type="datetime-local" step="0.001" />
    String DATE = "YYYY-MM-DD";                             // <input type="date" />
    String TIME = "HH:mm";                                  // <input type="time" />
    String TIME_SECONDS = "HH:mm:ss";                       // <input type="time" step="1" />
    String TIME_MS = "HH:mm:ss.SSS";                        // <input type="time" step="0.001" />
    String WEEK = "YYYY-[W]WW";                             // <input type="week" />
    String MONTH = "YYYY-MM";                                // <input type="month" />
  }

  @JsOverlay
  public static JavaScriptObject ISO_8601;

  @JsOverlay
  public static JavaScriptObject RFC_2822;

  /*
   * PARSE
   */

  /* Now */

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment();

  /* String */

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(String s);

  /* String + Format */

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(String s, String format);

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(String s, String format, String locale);

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(String s, String format, boolean isStrict);

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(String s, String format, String locale, boolean isStrict);

  /* String + Formats */

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(String s, String[] formats, String locale, boolean isStrict);

  /* Special Formats */

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(String s, JavaScriptObject special_format);

  /* Object */

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(JavaScriptObject object);

  /* Unix Timestamp (milliseconds) */

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(double milliseconds);

  /* Date */

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(Date date);

  /* Array */

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(double[] values);

  /* Moment Clone */

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(Moment moment);

  /* UTC */

  public native Moment utc();

  public native Moment utc(int millis);

  public native Moment utc(int[] millis);

  public native Moment utc(String s);

  public native Moment utc(String value, String format);

  public native Moment utc(String value, String[] formats);

  public native Moment utc(String value, String format, String locale);

  public native Moment utc(String value, String format, boolean isStrict);

  public native Moment utc(String value, String format, String locale, boolean isStrict);

  public native Moment utc(Moment moment);

  /* parseZone */

  public native Moment parseZone();

  public native Moment parseZone(String value);

  public native Moment parseZone(String value, String format);

  public native Moment parseZone(String value, String[] formats);

  public native Moment parseZone(String value, String format, String locale);

  public native Moment parseZone(String value, String format, boolean isStrict);

  public native Moment parseZone(String value, String format, String locale, boolean isStrict);

  /* Validation */

  public native boolean isValid();

  public native int invalidAt();

  /* Creation Data */

  public native CreationData creationData();

  /* Defaults */

  @JsMethod(namespace = JsPackage.GLOBAL)
  public static native Moment moment(int i, String units);

  /*
   * Get + Set
   */

  /* Millisecond */

  public native Moment millisecond(int millisecond);

  public native int millisecond();

  public native Moment milliseconds(int milliseconds);

  public native int milliseconds();

  /* Second */

  public native Moment second(int second);

  public native int second();

  public native Moment seconds(int seconds);

  public native int seconds();

  /* Minute */

  public native Moment minute(int minute);

  public native int minute();

  public native Moment minutes(int minutes);

  public native int minutes();

  /* Hour */

  public native Moment hour(int hour);

  public native int hour();

  public native Moment hours(int hours);

  public native int hours();

  /* Date of Month */

  public native Moment date(int date);

  public native int date();

  public native Moment dates(int dates);

  public native int dates();

  /* Day of Week */

  public native Moment day(int day);

  public native Moment day(String day);

  public native int day();

  public native Moment days(int days);

  public native Moment days(String days);

  public native int days();

  /* Day of Week (Locale Aware) */

  public native Moment weekday(int weekday);

  public native int weekday();

  /* ISO Day of Week */

  public native Moment isoWeekday(int isoWeekday);

  public native Moment isoWeekday(String isoWeekday);

  public native int isoWeekday();

  /* Day of Year */

  public native Moment dayOfYear(int dayOfYear);

  public native int dayOfYear();

  /* Week of Year */

  public native Moment week(int week);

  public native int week();

  public native Moment weeks(int weeks);

  public native int weeks();

  /* Week of Year (ISO) */

  public native Moment isoWeek(int isoWeek);

  public native int isoWeek();

  public native Moment isoWeeks(int isoWeeks);

  public native int isoWeeks();

  /* Month */

  public native Moment month(int day);

  public native Moment month(String day);

  public native int month();

  public native Moment months(int months);

  public native Moment months(String months);

  public native int months();

  /* Quarter */

  public native Moment quarter(int quarter);

  public native int quarter();

  public native Moment quarters(int quarters);

  public native int quarters();

  /* Year */

  public native Moment year(int year);

  public native int year();

  public native Moment years(int years);

  public native int years();

  /* Week Year */

  public native Moment weekYear(int weekYear);

  public native int weekYear();

  /* Week Year (ISO) */

  public native Moment isoWeekYear(int isoWeekYear);

  public native int isoWeekYear();

  /* Weeks In Year */

  public native int isoWeeksInYear();

  /* Get */

  public native int get(String s);

  /* Set */

  public native int set(String s, int i);

  public native int set(JavaScriptObject object);

  /* Maximum */

  @JsMethod(namespace = "moment")
  public static native int max(Moment[] moments);

  @JsMethod(namespace = "moment")
  public static native int min(Moment[] moments);

  /*
   * Manipulate
   */

  /* Add */

  public native Moment add(int amount, String s);

  public native Moment add(Duration duration);

  public native Moment add(JavaScriptObject object);

  /* Subtract */

  public native Moment subtract(int amount, String s);

  public native Moment subtract(Duration duration);

  public native Moment subtract(JavaScriptObject object);

  /* Start of Time */

  public native Moment startOf(String s);

  /* End of Time */

  public native Moment endOf(String s);

  /* Local */

  public native Moment local();

  /* UTC offset */

  public native double utcOffset();

  public native Moment utcOffset(String offset);

  public native Moment utcOffset(String offset, boolean keepExistingTimeOfDay);

  public native Moment utcOffset(double offset);

  public native Moment utcOffset(double offset, boolean keepExistingTimeOfDay);

  /*
   * Display
   */

  /* Format */

  public native Moment fotmat();

  public native Moment fotmat(String s);

  /* Time from now */

  public native String fromNow();

  public native String fromNow(boolean noSuffix);

  /* Time from X */

  public native String from(Moment moment);

  public native String from(Moment moment, boolean noSuffix);

  public native String from(String value);

  public native String from(String value, boolean noSuffix);

  public native String from(int value);

  public native String from(int value, boolean noSuffix);

  public native String from(JsDate value);

  public native String from(JsDate value, boolean noSuffix);

  public native String from(int[] values);

  public native String from(int[] values, boolean noSuffix);

  /* Time to now */

  public native String toNow();

  public native String toNow(boolean noSuffix);

  /* Time to X */

  public native String to(Moment moment);

  public native String to(Moment moment, boolean noSuffix);

  public native String to(String value);

  public native String to(String value, boolean noSuffix);

  public native String to(int value);

  public native String to(int value, boolean noSuffix);

  public native String to(JsDate value);

  public native String to(JsDate value, boolean noSuffix);

  public native String to(int[] values);

  public native String to(int[] values, boolean noSuffix);

  /* Calendar Time */

  public native String calendar();

  public native String calendar(Moment moment);

  public native String calendar(Moment moment, CalendarFormat formats);

  /* Difference */

  public native double diff(Moment moment);

  public native double diff(Moment moment, String s);

  public native double diff(Moment moment, String s, boolean noSuffix);

  public native double diff(String value);

  public native double diff(String value, String s);

  public native double diff(String value, boolean noSuffix);

  public native double diff(int value);

  public native double diff(int value, String s);

  public native double diff(int value, boolean noSuffix);

  public native double diff(JsDate value);

  public native double diff(JsDate value, String s);

  public native double diff(JsDate value, String s, boolean noSuffix);

  public native double diff(int[] values);

  public native double diff(int[] values, String s);

  public native double diff(int[] values, String s, boolean noSuffix);

  /* Unix Timestamp (milliseconds) */

  public native double valueOf();

  /* Unix Timestamp (seconds) */

  public native double unix();

  /* Days in Month */

  public native int daysInMonth();

  /* As Javascript Date */

  public native JsDate toDate();

  /* As Array */

  public native int[] toArray();

  /* As JSON */

  public native String toJSON();

  /* As ISO 8601 String */

  public native String toISOString();

  public native String toISOString(boolean keepOffset);

  /* As Object */

  public native JavaScriptObject toObject();

  /* As String */

  public native String toString();


  /* Inspect */

  public native String inspect();

  /*
   * Query
   */

  /* Is Before */

  public native boolean isBefore(Moment moment);

  public native boolean isBefore(Moment moment, String s);

  public native boolean isBefore(String value);

  public native boolean isBefore(String value, String s);

  public native boolean isBefore(double value);

  public native boolean isBefore(double value, String s);

  public native boolean isBefore(JsDate date);

  public native boolean isBefore(JsDate date, String s);

  public native boolean isBefore(int[] values);

  public native boolean isBefore(int[] values, String s);

  /* Is Same */

  public native boolean isSame(Moment moment);

  public native boolean isSame(Moment moment, String s);

  public native boolean isSame(String value);

  public native boolean isSame(String value, String s);

  public native boolean isSame(double value);

  public native boolean isSame(double value, String s);

  public native boolean isSame(JsDate date);

  public native boolean isSame(JsDate date, String s);

  public native boolean isSame(int[] values);

  public native boolean isSame(int[] values, String s);

  /* Is After */

  public native boolean isAfter(Moment moment);

  public native boolean isAfter(Moment moment, String s);

  public native boolean isAfter(String value);

  public native boolean isAfter(String value, String s);

  public native boolean isAfter(double value);

  public native boolean isAfter(double value, String s);

  public native boolean isAfter(JsDate date);

  public native boolean isAfter(JsDate date, String s);

  public native boolean isAfter(int[] values);

  public native boolean isAfter(int[] values, String s);

  /* Is Same or Before */

  public native boolean isSameOrBefore(Moment moment);

  public native boolean isSameOrBefore(Moment moment, String s);

  public native boolean isSameOrBefore(String value);

  public native boolean isSameOrBefore(String value, String s);

  public native boolean isSameOrBefore(double value);

  public native boolean isSameOrBefore(double value, String s);

  public native boolean isSameOrBefore(JsDate date);

  public native boolean isSameOrBefore(JsDate date, String s);

  public native boolean isSameOrBefore(int[] values);

  public native boolean isSameOrBefore(int[] values, String s);

  /* Is Same or After */

  public native boolean isSameOrAfter(Moment moment);

  public native boolean isSameOrAfter(Moment moment, String s);

  public native boolean isSameOrAfter(String value);

  public native boolean isSameOrAfter(String value, String s);

  public native boolean isSameOrAfter(double value);

  public native boolean isSameOrAfter(double value, String s);

  public native boolean isSameOrAfter(JsDate date);

  public native boolean isSameOrAfter(JsDate date, String s);

  public native boolean isSameOrAfter(int[] values);

  public native boolean isSameOrAfter(int[] values, String s);

  /* Is Between */

  public native boolean isBetween(Moment moment, Moment moment2);

  public native boolean isBetween(Moment moment, Moment moment2, String s);

  public native boolean isBetween(String value, String value2);

  public native boolean isBetween(String value, String value2, String s);

  public native boolean isBetween(double value, double value2);

  public native boolean isBetween(double value, double value2, String s);

  public native boolean isBetween(JsDate date1, JsDate date2);

  public native boolean isBetween(JsDate date1, JsDate date2, String s);

  public native boolean isBetween(int[] values, int[] values2);

  public native boolean isBetween(int[] values, int[] values2, String s);

  /* Is Daylight Saving Time */

  public native boolean isDST();

  /* Is Leap Year */

  public native boolean isLeapYear();

  /* Is a Moment */

  public native boolean isMoment(Object obj);

  /*
   * i18n
   */

  //////

  @JsMethod(namespace = "moment")
  public static native Duration duration(int i, String s);

  /* Is a Duration */

  @JsMethod(namespace = "moment")
  public static native boolean isDuration(Object obj);

}
