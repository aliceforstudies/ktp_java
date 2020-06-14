import java.util.Scanner;

public class U1Z4 
{
    public static void main(String args[])
	{
        
        System.out.println("Probability: ");
        Scanner in = new Scanner(System.in);
        double prob = Double. parseDouble(in.nextLine());
        System.out.println("Summa viigrisha: ");
        int prize = in.nextInt();
        System.out.println("Stavka: ");
        int pay = in.nextInt();
        System.out.println("Стоит ли играть? " + profitableGamble(prob,prize,pay));
    }
    public static boolean profitableGamble(double prob, int prize, int pay) 
    /* Игра выгодна?? */    
    {   
        if ((prob * prize - pay) > 0) { 
            return true;
        }
        else{
            return false;
        }
            
    }
}