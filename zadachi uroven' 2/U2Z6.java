import java.util.Scanner;

public class U2Z6
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Chislo: ");
        int n = in.nextInt();
        System.out.println("Fibonacci: " + Fibonacci(n));
    }
    public static int Fibonacci(int n) 
    {
        if (n == 1 || n == 2)
            return 1;
        else
        {
            int x = 1;
            int y = 1;
	        for (int i = 0; i < n; i++)
	        {
		        x += y;
		        y = x - y;
	        }
	        return y;
        }
         
    }
}
