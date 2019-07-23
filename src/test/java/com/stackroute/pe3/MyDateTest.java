
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyDateTest {
    MyDate myDate;

    @Before
    public void setUp() throws Exception {
        this.myDate=new MyDate();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenDateShouldReturnFirstDate(){
        boolean expectedValue=true;
        boolean actualValue=myDate.startDate();
        assertEquals(actualValue,expectedValue);

    }
    public void givenDateShouldReturnLastDate(){
        boolean expectedValue=true;
        boolean actualValue=myDate.endDate();
        assertEquals(actualValue,expectedValue);

    }

}
