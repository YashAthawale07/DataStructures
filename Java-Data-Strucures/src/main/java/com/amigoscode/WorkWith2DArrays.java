package com.amigoscode;
import java.util.Arrays;
public class WorkWith2DArrays {
    public static void main(String[] args) {
        char[][] board=new char[3][3];

        char[][] boardTwo=new char[][]{
                new char[]{'0','-','-'},
                new char[]{'0','-','-'},
                new char[]{'0','-','-'}
        };
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]='-';
            }


        }
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
