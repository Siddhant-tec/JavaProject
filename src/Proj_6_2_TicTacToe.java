import java.util.Scanner;

public class Proj_6_2_TicTacToe {
    public static void main(String[] args) {
        int[][] board = new int[3][3];
        fillBoard(board);
        printBoard(board);
        checkWinner(board);
    }

    public static void fillBoard(int[][] board) {
        Scanner s = new Scanner(System.in);
        //int input = s.nextInt();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = s.nextInt();

            }

        }
    }

    public static void printBoard(int[][] board) {
        for (int[] Arr : board) {
            for (int num : Arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void checkWinner(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[0][j]);
                    break;
                }
            }
        }
    }

