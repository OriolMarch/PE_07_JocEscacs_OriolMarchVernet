import java.util.Scanner;

public class PE_07_OriolMarchVernet {

    String whitePlayer;
    String blackPlayer;

    // Constants
    static final int SIZE = 8;
    static final char EMPTY = '.';

    // Game state
    char[][] board = new char[SIZE][SIZE];
    int currentPlayer; // 0 = white, 1 = black

    // History
    int moveCount;
    String[] history = new String[150];

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PE_07_OriolMarchVernet p = new PE_07_OriolMarchVernet();
        p.mainGame();
    }

    // 8x8 board
    // Pieces: king, queen, rook, bishop, knight, pawn
    // Current player starts as white

    public void mainGame() {
        startGame();
        showBoard();

        while (true) {

            // Ask move from current player
            // Validate move
            // Update board
            // Check checkmate
            // Change current player

            moveCount++;
        }
    }

    public void startGame() {
        initBoard();
        placeInitialPieces();
        currentPlayer = 0; // 0 = white, 1 = black
        moveCount = 0;
    }

    public void initBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                board[row][col] = EMPTY;
            }
        }
    }

    public void placeInitialPieces() {
        // Black pieces on rows 0 and 1
        board[0][0] = 'r'; board[0][1] = 'n'; board[0][2] = 'b'; board[0][3] = 'q';
        board[0][4] = 'k'; board[0][5] = 'b'; board[0][6] = 'n'; board[0][7] = 'r';

        for (int col = 0; col < SIZE; col++) {
            board[1][col] = 'p';
        }

        // White pieces on rows 7 and 6
        board[7][0] = 'R'; board[7][1] = 'N'; board[7][2] = 'B'; board[7][3] = 'Q';
        board[7][4] = 'K'; board[7][5] = 'B'; board[7][6] = 'N'; board[7][7] = 'R';

        for (int col = 0; col < SIZE; col++) {
            board[6][col] = 'P';
        }
    }

    public void showBoard() {
        System.out.println();
        System.out.println(" a b c d e f g h");

        for (int row = 0; row < SIZE; row++) {
            System.out.print(8 - row + " ");

            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println(" " + (8 - row));
        }

        System.out.println(" a b c d e f g h");
    }

    public void showHelp() {
        System.out.println("---------- HELP ----------");
        System.out.println("move e2 e4   -> moves a piece from e2 to e4");
        System.out.println("help         -> shows this help");
        System.out.println("resign       -> ends the game");
        System.out.println("Chess rules  -> Google it");
        System.out.println("--------------------------");
    }

    public void askPlayers() {
        whitePlayer = askName("White player name: ");
        blackPlayer = askName("Black player name: ");
    }

    public String askName(String msg) {
        String name;
        while (true) {
            System.out.print(msg);
            name = sc.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty.");
            } else if (isNumber(name)) {
                System.out.println("Name cannot be a number.");
            } else {
                return name;
            }
        }
    }

    public boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public String askMove() {
    System.out.print("Move (e2 e4 / resign): ");
    return sc.nextLine().trim();
}

public boolean isResign(String s) {
    return s.equalsIgnoreCase("resign");
}
}
