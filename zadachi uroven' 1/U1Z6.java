import java.io.*;

public class U1Z6 
{
    public static void main(String args[]) throws IOException{
        System.out.println("Symbol: ");
        int x = System.in.read();
        char letter = (char) x;
        System.out.println("ASCII number:" + ctoa(letter));
    }
    public static int ctoa(char letter) 
    /** Возврат ascii */    
    {   
        return (int) letter;
    }
}