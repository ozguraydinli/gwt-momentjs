# gwt-momentjs

A GWT wrapper for [Moment.js v2.22.0](https://momentjs.com/) using JsInterop.

<br>

Add the moment js file to your jsp.
```html
<script type="text/javascript" src="moment.min.js"></script>
or
<script type="text/javascript" src="moment-with-locales.min.js"></script>
```
<br>

Add the gwt-momentjs to your *.gwt.xml module file.
```xml
<inherits name='com.momentjs.Momentjs'/>
```
<br>

```java
Moment moment = Moment.moment();
moment.format();
moment.format("dddd");

Moment.duration(2,"days").humanize();


Moment a = Moment.moment(new double[]{2008, 9});
Moment b = Moment.moment(new double[]{2007, 0});

a.diff(b, "days");

```
