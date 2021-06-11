package com.cbt.utilities;

import java.sql.SQLOutput;

public class StringUtility {

    public static void verifyEquals(String expected, String actual) {

        System.out.println(expected.equals(actual) ? "PASS" : "FAIL");
    }
}
