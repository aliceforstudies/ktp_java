import java.util.Scanner;

public class U1Z9 
{
    public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        int[] mas;
        System.out.println("Kol-vo elementov massiva: ");
        int n = in.nextInt();
        if (n == 0)
            mas = new int[0];
        else
        {   System.out.println("Massiv: ");
            mas = new int[n];
            for (int i = 0; i < mas.length; i++) 
                mas[i] = in.nextInt();
        }
        System.out.println(sumOfCubes(mas));
    }
    public static int sumOfCubes(int mas[]) 
    /** Возведение массива в 3 степень поэлементно */    
    {   
        int Sum = 0;

        for (int i = 0; i < mas.length; i++)
            Sum += Math.pow(mas[i],3);
        return Sum;
    }
}
