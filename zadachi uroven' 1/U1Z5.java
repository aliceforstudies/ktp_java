import java.util.Scanner;
public class U1Z5 
{
    public static void main(String args[])
	{
        
        System.out.println("1st number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("2nd number: ");
        int a = in.nextInt();
        System.out.println("3rd number: ");
        int b = in.nextInt();
        System.out.println(operation(n, a, b));
    }
    public static String operation(int n, int a, int b) 
    /* n = a?b*/    
    {   
        if ((n - a) == b)
            return "added";
        else if (a - b == n) 
            return "subtracted";
        else if (a * b == n)
            return "prodact";  
        else if (a / b == n)
            return "division";
        else 
            return "none";
    }
}