# TicTacToeGame
A Java-based Tic-Tac-Toe game featuring Object-Oriented Programming (OOP) principles, support for Human vs. AI play, and automatic win/draw detection.

# Java Tic-Tac-Toe (OOP)

A clean, console-based implementation of the classic Tic-Tac-Toe game built with Java. This project demonstrates core **Object-Oriented Programming** concepts like Inheritance, Abstraction, and Encapsulation.

## 🚀 Features
* **Play Styles:** Human vs. Human or Human vs. AI.
* **Randomized AI:** A built-in AI player that makes moves using automated logic.
* **Validation:** Prevents players from picking occupied cells or entering out-of-bounds coordinates.
* **Win/Draw Logic:** Automatically detects Row, Column, and Diagonal wins, as well as "Board Full" draw scenarios.



## 🛠️ Technical Highlights
* **Abstract Classes:** Used a `Player` base class to define common behavior for both `HumanPlayer` and `AIPlayer`.
* **Static Methods:** Utility functions in the `TicTacToe` class for board management and win checking.
* **Game Loop:** A robust `while(true)` loop that handles turn-switching and game state monitoring.

## 🎮 How to Play
1. The game starts with a 3x3 grid indexed from **0 to 2**.
2. When prompted, enter two numbers: the **Row** index and the **Column** index (e.g., `0 1`).
3. The game will display the board after every move.
4. The first player to get three marks in a row wins!

## 🔧 Setup
1. Clone the repository:
   ```bash
   git clone [https://github.com/your-username/your-repo-name.git](https://github.com/your-username/your-repo-name.git)
