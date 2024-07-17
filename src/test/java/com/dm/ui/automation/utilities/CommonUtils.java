package com.dm.ui.automation.utilities;

import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.TimeZone;

public class CommonUtils {


    public static void assertFields(String assertionType, String field, String expectedValue, Object actualValue) {

        System.out.println("Expected " + Optional.ofNullable(expectedValue).toString() + ":" + "Actual " + Optional.ofNullable(actualValue).toString());
        switch (assertionType) {
            case "non-null":
                System.out.println("Inside non-null for field : " + field);
                Assert.assertFalse(actualValue.toString().isEmpty(), "Field : " + field + " is empty");
                break;
            case "equals":
                System.out.println("Inside equals for field : " + field);
                Assert.assertEquals(actualValue, expectedValue, "Field : " + field + " value is not as expected.");
                break;
            case "notequals":
                System.out.println("Inside notequals  for field : " + field);
                Assert.assertNotEquals(actualValue, expectedValue, "Field : " + field + " value is not as expected.");
                break;
            case "contains":
                System.out.println("Inside contains  for field : " + field);
                Assert.assertTrue(actualValue.toString().contains(expectedValue), "Field value does not contain expected value");
                break;
            case "null":
                System.out.println("Inside null for field : " + field);
                Assert.assertNull(actualValue, "Field : " + field + " is not null");
                break;
            case "long":
                System.out.println("Inside long  for field : " + field);
                Assert.assertEquals(Long.parseLong(actualValue.toString()), Long.parseLong(expectedValue), "Field : " + field + " value is not as expected.");
                break;
            case "boolean":
                System.out.println("Inside boolean for field : " + field);
                Assert.assertEquals(Boolean.parseBoolean(actualValue.toString()), Boolean.parseBoolean(expectedValue), "Field : " + field + " value is not as expected.");
                break;
            default:
                Assert.fail("Invalid Value Type for assertion");
                break;
        }
    }

    public static String getTimeZoneDate(Date date, String format, String timeZone) {
        if (date == null) return null;
        // create SimpleDateFormat object with input format
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        // default system timezone if passed null or empty
        if (timeZone == null || "".equalsIgnoreCase(timeZone.trim())) {
            timeZone = Calendar.getInstance().getTimeZone().getID();
        }
        // set timezone to SimpleDateFormat
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        // return Date in required format with timezone as String
        return simpleDateFormat.format(date);
    }
}
