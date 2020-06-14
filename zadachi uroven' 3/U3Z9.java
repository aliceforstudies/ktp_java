import java.util.Scanner;

public class U3Z9 
{
    public static void main(String args[])
    {
        System.out.println("Chislo: ");
        Scanner in = new Scanner(System.in);
        int chislo = in.nextInt();

        System.out.println("Prostoe chislo: ");
        if (nextPrimes(chislo))
            System.out.println(chislo);
        else
        {
            while (!nextPrimes(chislo))
            {
                chislo += 1;
            }
            System.out.println(chislo);
        }
        
    }
    public static Boolean nextPrimes(int chislo) 
    {
        for (int i = 2; i < chislo; i++)
        {
            if ((chislo%i == 0) && (chislo != i))
            {
                return false;              
            }
        }
        return true;
    }
}