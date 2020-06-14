import java.util.Scanner;

public class U1Z2 
{
    public static void main(String args[])
	{
        System.out.println("Osnovanie: ");
        Scanner in = new Scanner(System.in);
        int s1 = in.nextInt();
        System.out.println("Visota: ");
        int s2 = in.nextInt();
        System.out.println("Ploschad': " + triArea(s1,s2));

    }
    public static double triArea(int s1, int s2) 
    /* Вычисление площади */    
    {
        return 0.5 * s1 * s2;
    }
}