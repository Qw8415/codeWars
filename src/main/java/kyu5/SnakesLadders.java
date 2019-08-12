package kyu5;

class SnakesLadders {
    int[] board;
    int[] playersPosition = {0,0};
    int currentPlayer;


    SnakesLadders() {
        board = createBoard();
        currentPlayer = 0;
    }

    String play(int die1, int die2) {
        if (playersPosition[0] == 100 || playersPosition[1] == 100)
            return "Game over!";
        int sumDie = die1 + die2;
        String activePlayer = "Player " + (currentPlayer + 1);
        int activePlayerPosition = move(sumDie, playersPosition[currentPlayer]);
        playersPosition[currentPlayer] = activePlayerPosition;
        if (die1 != die2) {
            currentPlayer = (currentPlayer == 1) ? 0 : 1;
        }
        if (activePlayerPosition == 100) {
            return activePlayer + " Wins!";
        }
        return activePlayer + " is on square " + activePlayerPosition;
    }

    private int move(int sumDie, int playerPosition) {
        if (playerPosition + sumDie > 100) {
            playerPosition = board[100 - (playerPosition + sumDie - 100)];
        } else {
            playerPosition = board[playerPosition + sumDie];
        }
        return playerPosition;
    }

    private int[] createBoard() {
        int[] newBoard = new int[101];
        for (int i = 0; i < newBoard.length; i++) {
            newBoard[i] = i;
        }
        {
            newBoard[2] = 38; newBoard[7] = 14; newBoard[8] = 31;
            newBoard[15] = 26; newBoard[16] = 6;
            newBoard[21] = 42; newBoard[28] = 84;
            newBoard[36] = 44;
            newBoard[46] = 25; newBoard[49] = 11;
            newBoard[51] = 67;
            newBoard[62] = 19; newBoard[64] = 60;
            newBoard[71] = 91; newBoard[74] = 53; newBoard[78] = 98;
            newBoard[87] = 94; newBoard[89] = 68;
            newBoard[92] = 88; newBoard[95] = 75; newBoard[99] = 80;
        }
        return newBoard;
    }
}
