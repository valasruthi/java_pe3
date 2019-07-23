
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;

    @Before
    public void setUp() throws Exception {
        this.chessBoard=new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        chessBoard=null;
    }
    @Test
    public void givenStringShouldReturnChessBoard(){
        String[][] expected={{"WW","BB","WW","BB","WW","BB","WW","BB"},
                {"BB","WW","BB","WW","BB","WW","BB","WW"},
                {"WW","BB","WW","BB","WW","BB","WW","BB"},
                {"BB","WW","BB","WW","BB","WW","BB","WW"},
                {"WW","BB","WW","BB","WW","BB","WW","BB"},
                {"BB","WW","BB","WW","BB","WW","BB","WW"},
                {"WW","BB","WW","BB","WW","BB","WW","BB"},
                {"BB","WW","BB","WW","BB","WW","BB","WW"},
             };
        String[][] actual=chessBoard.display(8,8);
        assertArrayEquals("chessboard data",actual,expected);
    }
    @Test
    public void givenStringShouldReturnNotAsAChessBoard(){
        String[][] expected={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"}};
        String[][] actual=chessBoard.display(8,8);
        assertArrayEquals("not as a actual chessboard",actual,expected);
    }

}