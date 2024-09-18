package src.java.main;

public class TicTacToe {
    private final char[][] board = new char[3][3];
    private char charValue;
    private int movement;
    private boolean isWin;

    public TicTacToe() {
        initializeBoard();
        movement = 0;
        isWin = false;
    }

    private void initializeBoard() {
        char charValue = '1';
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = charValue++;
            }
        }
    }

    public void firstChoice(int choice) {
        if (choice == 0) {
            charValue = 'O';
        } else if (choice == 1) {
            charValue = 'X';
        } else {
            System.out.println("Incorrect choice! Try again.");
            System.exit(0);
        }
    }

    public void move(char boardNum) {
        if (boardNum > '9'|| boardNum < '1') {
            System.out.println("Incorrect number");
            System.exit(0);
        }

        if (movement == 0) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == boardNum) {
                        board[i][j] = charValue;
                    }
                }
            }
        } else {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == boardNum) {
                        board[i][j] = gameSymbol();
                    }
                }
            }
        }
        movement++;
    }

    public char gameSymbol() {
        charValue = (charValue == 'O') ? 'X' : 'O';
        return charValue;
    }


    public boolean winCheck() {
        if(checkRows() || checkColumns() || checkDiagonals()) {
            System.out.println("Congratulations! You win!");
            isWin = true;
        }
        return isWin;
    }

    public boolean checkRows() {
        for (char[] chars : board) {
            if (chars[0] == chars[1] && chars[1] == chars[2]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        return (board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0]);
    }

    public int getMovement() {
        return movement;
    }

    public void drawBoard() {
        System.out.println("  ___ ___ ___");
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(" | " + aChar);
            }
            System.out.println(" |");
            System.out.print("  ___ ___ ___");
            System.out.println();
        }
    }
}