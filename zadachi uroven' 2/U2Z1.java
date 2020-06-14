import java.util.Scanner;

public class U2Z1
{
    public static void main(String args[])
    {
        System.out.println("String: ");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        System.out.println("Povtori: ");
        int n = in.nextInt();
        System.out.println("Result stroka: " + repeat(stroka,n));
    }
    public static String repeat(String stroka, int n)  
    {   
        String rez = ""; 
        int k = 0;
        for (int i = 0; i < stroka.length(); i++)
        {
            while (k < n)
            {
                rez += stroka.charAt(i);
                k++;
            }
            k = 0;  
        }
        return rez;
    }
}
