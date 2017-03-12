package com.pm.commons.examples;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by PawelM on 2017-03-12.
 */
public class LangTestClass {

    @Test
    public void test_arrayUtils() {
        long[] myArray = {3, 1, 6, 9, 2};
        long searchVal = 9;
        assertTrue(ArrayUtils.contains(myArray, searchVal));
    }

    //https://examples.javacodegeeks.com/core-java/apache/commons/lang3/stringutils/org-apache-commons-lang3-stringutils-example/
    @Test
    public void test_stringUtils() {
        long[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String joinedString = StringUtils.join(numbers, ',');
        assertEquals("0,1,2,3,4,5,6,7,8,9", joinedString);

        String str = "It is Java Code Geeks";
        String[] stringArray = StringUtils.split(str," ");
        assertEquals(5, stringArray.length);
        assertEquals("It", stringArray[0]);
        assertEquals("is", stringArray[1]);
        assertEquals("Java", stringArray[2]);
        assertEquals("Code", stringArray[3]);
        assertEquals("Geeks", stringArray[4]);
    }
}
