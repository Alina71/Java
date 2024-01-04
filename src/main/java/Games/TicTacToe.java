package Games;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board={{' ',' ',' '},
                        {' ',' ',' '},
                        {' ',' ',' '}};
        System.out.println(board[0][0]+ "|"+ board[0][1]+ "|"+ board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0]+ "|"+ board[1][1]+ "|"+ board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0]+ "|"+ board[2][1]+ "|"+ board[2][2]);


        Scanner scanner=new Scanner(System.in);
        System.out.println("Where would you like to play? (1-9)");
        String userInput=scanner.nextLine();
        System.out.println(userInput);
        switch(userInput){
            case "1":
                board[0][0]='x';
                break;

        }
    }
}
