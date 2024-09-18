# TicTacToe

## Overview

The `TicTacToe` class implements a simple command-line Tic-Tac-Toe game for two players. It allows players to choose their symbol, make moves on a 3x3 board, and check for a win condition.

## Class Definition

### `TicTacToe`

- **Attributes:**
  - `private final char[][] board`: A 3x3 character array representing the game board.
  - `private char charValue`: The current player's symbol ('X' or 'O').
  - `private int movement`: Counts the number of moves made.
  - `private boolean isWin`: Indicates whether the game has been won.

- **Constructor:**
  - `public TicTacToe()`: Initializes the board and sets default values.

- **Methods:**
  - `private void initializeBoard()`: Sets up the board with characters '1' through '9'.
  - `public void firstChoice(int choice)`: Sets the current player's symbol based on their choice.
  - `public void move(char boardNum)`: Updates the board with the current player's move.
  - `public char gameSymbol()`: Switches the current player's symbol.
  - `public boolean winCheck()`: Checks if there is a winner.
  - `public boolean checkRows()`: Checks for a winning row.
  - `private boolean checkColumns()`: Checks for a winning column.
  - `private boolean checkDiagonals()`: Checks for a winning diagonal.
  - `public int getMovement()`: Returns the number of moves made.
  - `public void drawBoard()`: Prints the board to the console.
