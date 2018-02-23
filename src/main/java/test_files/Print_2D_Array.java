/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_files;

/**
 *
 * @author Menja
 */
public class Print_2D_Array {

    public static void main(String[] args) {
        testPrint();
    }

    
    public static void testPrint(){

        int a[][] = new int[9][9];
        int rowCount = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
                if (rowCount == 9) {
                    System.out.println("");
                    rowCount = 0;
                }
                rowCount ++;
            }
        }
    }
    
    
    
    public static void toD() {
        //Variables
        int[][] board = new int[9][9];

        //Load board with values
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = row + column;
            }
        }

        //Print board with values
        for (int row = 0; row < board.length; row++) {
            for (int column = 1; column < board[row].length; column++) {
                System.out.println(board[row][column] + "\t");
            }
        }
    }
}
