/*
 * Copyright (c)  Hive A.S. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by ozgur, 2018
 */

package com.momentjs;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class CalendarFormat {

  @JsProperty
  public String lastday;

  @JsProperty
  public String sameDay;

  @JsProperty
  public String nextDay;

  @JsProperty
  public String lastWeek;

  @JsProperty
  public String nextWeek;

  @JsProperty
  public String sameElse;

  public CalendarFormat() {
  }

}