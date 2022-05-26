package TicTacToe;
import java.util.Scanner;
public class TicTacToe {

    static char[] javaCharArray = new char[10];
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
        System.out.println("| " + javaCharArray[1] + " | " + javaCharArray[2] + " | " + javaCharArray[3] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + javaCharArray[4] + " | " + javaCharArray[5] + " | " + javaCharArray[6] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + javaCharArray[7] + " | " + javaCharArray[8] + " | " + javaCharArray[9] + " |");
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
