package TicTacToe;

public class TicTacToe {

    char[] javaCharArray = new char[10];

    void arrayInitialize()
    {

        for(int i =1 ; i < javaCharArray.length; i++)
        {
            javaCharArray[i] = ' ';
        }

    }

    public static void main(String args[])
    {
        TicTacToe t = new TicTacToe();
        t.arrayInitialize();
    }
}
