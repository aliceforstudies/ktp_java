import java.util.Scanner;

public class U2Z5
{
    public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Chislo: ");
        String number = in.nextLine();
        System.out.println("Chislo znakov posle zapyatoi: " + getDecimalPlaces(number));
    }
    public static int getDecimalPlaces(String number) 
    
    {   
        double x = Double.valueOf(number);
        
        if (x % 1 == 0)
            return 0;
        else
            return number.split("\\.")[1].length();
    } 
}