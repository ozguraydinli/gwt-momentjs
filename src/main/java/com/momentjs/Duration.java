/*
 * Copyright (c)  Hive A.S. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by ozgur, 2018
 */

package com.momentjs;

import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Duration {

  /* Clone */

  public native Duration clone();

  /* Humanize */

  public native String humanize();

  public native String humanize(boolean suffix);

  /* Milliseconds */

  public native int milliseconds();

  public native int asMilliseconds();

  /* Seconds */

  public native int seconds();

  public native int asSeconds();

  /* Minutes */

  public native int minutes();

  public native int asMinutes();

  /* Hours */

  public native int hours();

  public native int asHours();

  /* Days */

  public native int days();

  public native int asDays();

  /* Weeks */

  public native int weeks();

  public native int asWeeks();

  /* Months */

  public native int months();

  public native int asMonths();

  /* Years */

  public native int years();

  public native int asYears();

  /* Add Time */

  public native Duration add(int amount, String key);

  public native Duration add(int amount);

  public native Duration add(Duration duration);

  public native Duration add(JavaScriptObject object);

  /* Subtract Time */

  public native Duration substract(int amount, String key);

  public native Duration substract(int amount);

  public native Duration substract(Duration duration);

  public native Duration substract(JavaScriptObject object);

  /* As Unit of Time */

  public native Duration as(String unit);

  /* Get Unit of Time */

  public native Duration get(String unit);

  /* As JSON */

  public native String toJSON();

  /* As ISO 8601 String */

  public native String toISOString();

  /* Locale */

  public native Duration locale();

  public native Duration locale(String s);

}
