import java.util.Scanner;

public class U2Z2 
{
    public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Kol-vp elementov: ");
        int n = in.nextInt();
        int[] mas = new int[n]; 
        System.out.println("Massiv: ");
        for (int i = 0; i < mas.length; i++) 
            mas[i] = in.nextInt();
        System.out.println("MAX - MIN = " + differenceMaxMin(mas));
    }
    public static int differenceMaxMin(int mas[]) 
    {   
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] < min)
                min = mas[i];
            if (mas[i] > max)
                max = mas[i];
        }
        return max - min;
    }
}