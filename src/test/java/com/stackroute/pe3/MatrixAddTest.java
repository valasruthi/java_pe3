
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAddTest {
    MatrixAdd matrixAdd;

    @Before
    public void setUp() throws Exception {
        this.matrixAdd=new MatrixAdd();
    }

    @After
    public void tearDown() throws Exception {
        matrixAdd=null;
    }
    @Test
    public void givenInputShouldAddTheMatrix(){
            int[][] expected = {{10, 10}, {10, 10}, {10, 10}};
            int a1[][] = {{1, 2}, {3, 4}, {5, 6}};
            int a2[][] = {{9, 8}, {7, 6}, {5, 4}};
            int[][] actual = matrixAdd.checkSum(3,2,a1,a2);

            assertArrayEquals(expected, actual);
        }
       /* @Test
    public void givenInputShouldReturnNull(){
        int a1[][] =matrixAdd.checkSum(3,2,a1);
        int a2[][] =matrixAdd.checkSum();
        assertNull(matrixAdd);
        }*/
    }

