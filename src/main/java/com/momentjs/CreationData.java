/*
 * Copyright (c)  Hive A.S. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by ozgur, 2018
 */

package com.momentjs;

import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class CreationData {

  @JsProperty
  public String input;

  @JsProperty
  public String format;

  @JsProperty
  public JavaScriptObject locale;

  @JsProperty
  public boolean isUTC;

  @JsProperty
  public boolean strict;

  public CreationData() {
  }

}