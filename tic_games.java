import java.util.Scanner;
public class tic_games {
    public static  void main(String[] args) {
        //create an array of character 3*3 for tic_tac_toe
        char[][] board = new char[3][3];
        //initially array contains null character so that I am using space in all rows and column so  that later I will add O and X
        for (int row = 0; row < board.length; row++) {//this loop iterate(traverse) each row and column inside Board
            for (int col = 0; col < board[row].length; col++) {//this rows works as ,at a particular row it traversed the no. column
                board[row][col] = ' ';//placing space in each row and column
            }
        }
        //initialize a character that used by gamers while playing game for tic_tac_toe
        char player = 'X';
        //initially I am initialized false to game_over so that game will continue until all the box is filled
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        //condition will work until game_over will be false(it means all the box are fill)
        while (!gameOver) {
            printBoard(board);
            //ask user to enter the rows or column values
            System.out.println("Player " + player + " Enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            //check whether the box is empty or not,if it is empty then add the user input to that box
            if (board[row][col] == ' ') {
                board[row][col] = player;///placed the element
                /* I am calling a function called haveWon so that it  will check either rows,column,diagonal is matched or not
                 and that function are initialized to gameOver*/
                gameOver = haveWon(board, player);
                //this condition check whether the game is end or not
                if (gameOver) {
                    //if game is over then it displays that the game is won by the player
                    System.out.println("Player " + player + " has won: ");
                } else {
                    /*if(player=='X'){
                        player='O';
                    }else{
                        player='X';
                    }*/
                    //if game is not over then player is switch to "O" otherwise "X"
                    player = (player == 'X') ? 'O' : 'X';

                }

            } else {
                System.out.println("Invalid Move...Try Again!!!!");
            }
            /*this condition checked whether the game was won or not and ,if it was not won and  board is full
            then display that game is draw and break the condition*/
            if(!haveWon(board, player) && isBoardFull(board)){
                System.out.println("Game Draw !!!");
                break;
            }
        }
        ///I am calling a function so that it displays the board
        printBoard(board);
    }
// this function mainly checked either the column,rows and diagonal is matched or not
    public static boolean haveWon(char[][] board, char player) {
        //check for rows and if it matched then return true
        for (int row = 0; row < board.length; row++) {
            /*(0 0,0 1,0 2),(1 0,1 1,1 2) and(2 0,2 1,2 2) condition will work on these values only,and
            if it matched then it returns true that means row is matched*/
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        //check for column and if it matched then return true
        for (int col = 0; col < board.length; col++) {
              /*(0 0,1 0,2 0),(0 1,1 1,2 1) and(0 2,1 2,2 2) condition will work on these values only,and
            if it matched then it returns true that means column is matched*/
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        //check for diagonal and if it matched then return true

        /* this condition will check for the combination which are :(0 0,1 1, 2 2) */
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        /* this condition will check for the combination which are :(0 2,1 1, 2 0) */
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
    /////condition if no one win the game then it must display that the game is ended
    public static boolean isBoardFull(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                //if every box is filled and no rows,column,diagonal is matched then it returns game is draw
                if(board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printBoard(char[][] board) {
        ///this printf draw a dash like layer above a box
       System.out.println("-----------");
        for (int row = 0; row < board.length; row++) {

            for (int col = 0; col < board[row].length; col++) {
                //it will print 3 three box so that we are adding O and X
                System.out.print(board[row][col] + " | ");
            }
            //this printf works so that the control goes to new line
            System.out.println();
            //again I am using printf so that the lower layer is going to close
         System.out.println("-----------");
        }

    }
}