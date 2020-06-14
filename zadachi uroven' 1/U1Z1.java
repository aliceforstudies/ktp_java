import java.util.Scanner;

public class U1Z1 
{
    public static void main(String args[])
	{
        System.out.println("First number: ");
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        System.out.println("Second number: ");
        int a2 = in.nextInt();
        System.out.println("Remainder: " + remainder(a1,a2));
    }
    public static int remainder(int a, int b) 
    /* Возврат отстатка */    
    {
        return a % b;
    }
}
