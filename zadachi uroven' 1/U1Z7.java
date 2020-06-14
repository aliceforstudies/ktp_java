import java.util.Scanner;

public class U1Z7
{
    public static void main(String args[])
	{
        System.out.println("Chislo: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Summa: " = addUpTo(number));
        
    }
    public static int addUpTo(int number) 
    /* Подсчет необх. суммы в соотв. с условием задачи */    
    {   
        int Sum = 0;
        for (int i = 0; i <= number; i++)
            Sum += i;
        return Sum;
    }
}