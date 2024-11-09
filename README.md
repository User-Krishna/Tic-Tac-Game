<h1>🎲 Tic Tac Toe Game in Java</h1>
This project brings the classic Tic Tac Toe game to the console, implemented in Java. Designed for two players, it offers a fun way to enjoy the game while exploring Java basics.

<h1>📋 Project Overview</h1>
The game is played on a 3x3 grid where each player (X or O) takes turns to mark a cell. The objective: align three of your symbols in a row, column, or diagonal. If all cells are filled without a winner, the game ends in a draw.

Key Features:
Interactive Player Moves: Prompts each player to enter their move.
Move Validation: Ensures players don’t overwrite each other’s moves.
Game Logic: Checks for winning combinations and draw conditions after each move.
Real-Time Feedback: Displays the updated board and game status.

<h1>🔑 Code Structure and Functionality</h1>
Game Board Initialization: Sets up a 3x3 array with empty cells.
Player Turns: Alternates between 'X' and 'O', updating the board based on player input.
Game Logic:
Win Detection: Checks rows, columns, and diagonals for a win.
Draw Detection: Triggers a draw if all cells are filled with no winner.
Error Handling: Prompts players to try again if they select an occupied cell.
Main Functions:
printBoard: Displays the board’s current state.
haveWon: Determines if the current player has won by matching rows, columns, or diagonals.
isBoardFull: Checks if the board is full to detect a draw.

<h1>🎮 Example Game Play</h1>
## Example Gameplay

```plaintext
-----------
&nbsp; &nbsp; | &nbsp; &nbsp; | &nbsp; &nbsp;  
-----------
&nbsp; &nbsp; | &nbsp; &nbsp; | &nbsp; &nbsp;  
-----------
&nbsp; &nbsp; | &nbsp; &nbsp; | &nbsp; &nbsp;  
-----------

Player X, enter your move (row and column): 0 0

-----------
X | &nbsp; &nbsp; | &nbsp; &nbsp;  
-----------
&nbsp; &nbsp; | &nbsp; &nbsp; | &nbsp; &nbsp;  
-----------
&nbsp; &nbsp; | &nbsp; &nbsp; | &nbsp; &nbsp;  
-----------

Player O, enter your move (row and column): 1 1

-----------
X | &nbsp; &nbsp; | &nbsp; &nbsp;  
-----------
&nbsp; &nbsp; | O | &nbsp; &nbsp;  
-----------
&nbsp; &nbsp; | &nbsp; &nbsp; | &nbsp; &nbsp;  
-----------
continues until there's a winner or the game ends in a draw.
