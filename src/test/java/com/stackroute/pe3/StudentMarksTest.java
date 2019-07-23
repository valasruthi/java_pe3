
package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
     StudentMarks studentMarks;
    @org.junit.After
    public void tearDown() throws Exception {
        studentMarks=null;
    }

    @Test
    public void check() {
        String expected = "All marks are correct";
        int array[] = {62, 23, 34};
        String actual = studentMarks.check(array, 3);

        assertEquals("Following is of studentmarks class", expected, actual);
    }

    @Test
    public void checkFailure() {
        String expected = "Error";
        int array[] = {62, 23, 134};
        String actual = studentMarks.check(array, 3);

        assertEquals("Following is of studentmarks class", expected, actual);
    }

}
