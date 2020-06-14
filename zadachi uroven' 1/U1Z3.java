import java.util.Scanner;

public class U1Z3
{
    public static void main(String args[])
	{
        System.out.println("Kurochki: ");
        Scanner in = new Scanner(System.in);
        int ku = in.nextInt();
        System.out.println("Korovi: ");
        int ko = in.nextInt();
        System.out.println("Svinki: ");
        int sv = in.nextInt();
        System.out.println("Nogi: " + animals(ku,ko,sv));

    }
    public static int animals(int a, int b, int c)
    /* Подсчет ног */    
    {
        return 2*a + 4*b + 4*c;
    }
}