package com.panickapps.response;

import java.text.SimpleDateFormat;

/**
 * Defines a Response date-time format.
 */
public class ResponseDateTimeFormat extends SimpleDateFormat {

    private ResponseDateTimeFormat() {
        super("yyyy-MM-dd HH:mm:ss");
    }

    public static ResponseDateTimeFormat STANDARD = new ResponseDateTimeFormat();

}
