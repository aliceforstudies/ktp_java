import java.util.Scanner;

public class U1Z8
{
    public static void main(String args[])
	{
        System.out.println("1st treugolnik side: ");
        Scanner in = new Scanner(System.in);
        int s1 = in.nextInt();
        System.out.println("2nd treugolnik side: ");
        int s2 = in.nextInt();
        System.out.println("Длина 3 стороны: " + nextEdge(s1,s2));
    }
    public static int nextEdge(int a, int b) 
    /* Максимальнеое значение 3 стороны (целое) */    
    {   
        return a + b - 1;
    }
}