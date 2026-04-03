package day15;
import java.util.*;

public class nQueen {

    public boolean isSafe(int row, int col, char[][] board){

        // check left side only
        for(int j = 0; j < col; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // upper-left diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // lower-left diagonal
        for(int i = row, j = col; i < board.length && j >= 0; i++, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board ,List<List<String>> allBoards){

        List<String> newBoard = new ArrayList<>();

        for(char[] r : board){   //  enhanced for loop
            StringBuilder row = new StringBuilder();  //  no '+=' warning

            for(char cell : r){
                if(cell == 'Q') row.append('Q');
                else row.append('.');
            }

            newBoard.add(row.toString());
        }

        allBoards.add(newBoard);
    }

    public void helper(char[][] board ,List<List<String>> allBoards, int col){

        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }

        for(int row = 0; row < board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    public List<List<String>> solveNQueen(int n){

        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board) {   // enhanced for loop
            Arrays.fill(row, '.');
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    //  FIX: add main method (removes "never used" warning)
    public static void main(String[] args) {
        nQueen obj = new nQueen();
        List<List<String>> result = obj.solveNQueen(4);

        for(List<String> board : result){
            for(String row : board){
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
