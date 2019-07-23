package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels;
    @Before
    public void setUp() throws Exception {
        this.removeVowels=new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        removeVowels=null;
    }
    @Test
    public void givenValuesShouldRemoveVowels() {
        String[] expected = {"nd", "ntd Stts", "Grmny", "gypt", "czchslvk"};
        String[] str = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] actual = removeVowels.remVow(str);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void givenValuesShouldReturnNull() {
        String[] expected = null;
        String[] str = {"my"};
        String[] actual = removeVowels.remVow(str);
        assertArrayEquals(expected, actual);
    }
}