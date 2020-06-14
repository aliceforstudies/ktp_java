import java.util.Scanner;

public class U2Z3
{
    public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Kol-vo elementov massiva: ");
        int n = in.nextInt();
        int[] mas = new int[n]; 
        System.out.println("Massiv: ");
        for (int i = 0; i < mas.length; i++) 
            mas[i] = in.nextInt();
        System.out.println("Srednee - int? " + isAvgWhole(mas));
    }
    public static Boolean isAvgWhole(int mas[]) 
    {   
        Boolean flag = false;
        int Sum = 0;
    
        for (int i = 0; i < mas.length; i++)
        {
            Sum += mas[i];
        }
        if (Sum % mas.length == 0)
            flag = true;
            
        return flag;
    }
}