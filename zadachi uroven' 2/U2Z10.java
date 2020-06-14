import java.util.Scanner;

public class U2Z10 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Shag: ");
        int n = in.nextInt();
        System.out.println("Kol-vo polei: " boxSeq(n));
    }
    public static int boxSeq(int n) 
    {
        if (n % 2 == 0)
            return n;
        else    
            return n + 2;
    }
}


