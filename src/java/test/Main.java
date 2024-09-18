package src.java.test;

import src.java.main.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the TicTacToe game!");
        ticTacToe.drawBoard();

        System.out.println("Player1 choose \"X\" or \"O\"");
        System.out.println("Enter 0 if you choose \"O\" and 1 if \"X\"");
        System.out.print("Enter: ");
        ticTacToe.firstChoice(in.nextInt());

        while (ticTacToe.getMovement() < 9) {
            ticTacToe.drawBoard();
            System.out.println("Enter board number: ");
            ticTacToe.move(in.next().charAt(0));

            if (ticTacToe.winCheck()) {
                ticTacToe.drawBoard();
                break;
            }
        }

        if (ticTacToe.getMovement() == 9 && !ticTacToe.winCheck()) {
            System.out.println("It's a tie! You can start again.");
        }
    }
}