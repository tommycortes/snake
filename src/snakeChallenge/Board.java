/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeChallenge;

/**
 *
 * @author tommycortes
 */
public class Board {

    int board[] = new int[2];

    Board(int col, int row) {
        board[0] = col;
        board[1] = row;
    }

    public int boardCol() {
        return board[0];
    }

    public int boardRow() {
        return board[1];
    }
}
