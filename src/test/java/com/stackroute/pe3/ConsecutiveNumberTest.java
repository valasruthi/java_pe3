
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumberTest {
    ConsecutiveNumber consecutiveNumber;

    @Before
    public void setUp() throws Exception {
        this.consecutiveNumber = new ConsecutiveNumber();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveNumber = null;
    }

    @Test
    public void checkNon() {
        boolean expected = false;

        boolean actual = consecutiveNumber.checkConsecutive("98,96,95,94,93");

        assertEquals(expected, actual);
    }

    @Test
    public void checkConsOne() {
        boolean expected = true;
        boolean actual = consecutiveNumber.checkConsecutive("54,53,52,51,50,49,48");

        assertEquals(expected, actual);
    }

    @Test
    public void checknonConsTwo() {
        boolean expected = false;
        boolean actual = consecutiveNumber.checkConsecutive("1,2,3,4,5,6,6");

        assertEquals(expected, actual);
    }


}
