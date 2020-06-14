import java.util.Scanner;

public class U1Z10 
{
    public static void main(String args[])
	{
        System.out.println("First number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Second number: ");
        int b = in.nextInt();
        System.out.println("Third number: ");
        int c = in.nextInt();
        System.out.println("Uslovie???? " + abcmath(a, b, c));
        
    }
    public static Boolean abcmath(int a, int b, int c) 
    /* А*2 B раз и проверка деления на С */    
    {   
        int Sum = a;
        for (int i=0; i < b; i++)
            Sum = 2 * Sum;
        if (Sum % c == 0)
            return true;
        else
            return false;
    }
}