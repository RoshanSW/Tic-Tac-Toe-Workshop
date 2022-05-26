package TicTacToe;
import java.util.Scanner;
public class TicTacToe {

    char[] javaCharArray = new char[10];
    static char player1;
    static char player2;
    static Scanner scan = new Scanner(System.in);

    void arrayInitialize()
    {
        for(int i =1 ; i < javaCharArray.length; i++)
        {
            javaCharArray[i] = ' ';
        }
    }

    public static void playerChoice()
    {
        System.out.println("Enter Player 1 choice (X / O) :");
        char choice=scan.next().toUpperCase().charAt(0);
        if(choice == 'X')
        {
            player1 = choice;
            player2 = 'O';
        }
        else if(choice == 'O')
        {
            player1 = choice;
            player2 = 'X';
        }
        else
        {
            System.out.println("Wrong Choice Entered.");
            playerChoice();
        }
    }


    public static void showBoard()
    {
        System.out.println(" ------------------------------ ");
        System.out.println("| " + boardArray[1] + " | " + boardArray[2] + " | " + boardArray[3] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + boardArray[4] + " | " + boardArray[5] + " | " + boardArray[6] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + boardArray[7] + " | " + boardArray[8] + " | " + boardArray[9] + " |");
        System.out.println(" ------------------------------  ");
    }

    public static void main(String args[])
    {
        TicTacToe t = new TicTacToe();
        t.arrayInitialize();
        playerChoice();
        showBoard();
    }
}
