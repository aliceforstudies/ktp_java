import java.util.Scanner;

public class U2Z4
{
    public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Kol-vo elementov: ");
        int n = in.nextInt();
        int[] mas = new int[n]; 
        int[] rezmas = new int[n];

        System.out.println("Massiv: ");
        for (int i = 0; i < mas.length; i++) 
            mas[i] = in.nextInt();

        System.out.println("Rezmas: ");
        rezmas = cumulativeSum(mas);
        for (int i = 0; i < rezmas.length; i++)
        {
            if (i != rezmas.length - 1)
                System.out.print(rezmas[i] + ", ");
            else
                System.out.print(rezmas[i]);
        }
    }
    public static int[] cumulativeSum(int mas[]) 
    {   
        int j = 0;
        int[] rez_mas = new int[mas.length];
        rez_mas[0] = mas[0]; 

        for (int i = 1; i < mas.length; i++)
        {
            rez_mas[i] = rez_mas[j] + mas[i];
            j++;
        }
        return rez_mas;
    }
}