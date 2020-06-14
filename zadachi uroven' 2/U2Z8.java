import java.util.Scanner;

public class U2Z8 
{
    public static void main(String args[])
	{
        System.out.println("Pervoe slovo: ");
        Scanner in = new Scanner(System.in);
        String word1 = in.nextLine();
        System.out.println("Vtoroe slovo: ");
        String word2 = in.nextLine();
        System.out.println("Strannaya para?" + isStrangePair(word1,word2));
    }
    public static boolean isStrangePair(String a, String b)
    {   
        if ((a.charAt(0) == b.charAt(b.length()-1)) && (a.charAt(a.length()-1) == b.charAt(0))) {
            return true;
        }
        return false;
    }
}