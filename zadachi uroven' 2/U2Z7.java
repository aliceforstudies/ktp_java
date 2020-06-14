import java.util.Scanner;

public class U2Z7 
{
    public static void main(String args[])
	{
        System.out.println("Index: ");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        System.out.println("Pochtovii index? " + isValid(stroka));
    }

    public static boolean isValid(String stroka) 
    {   
        char c = 32;
        boolean flag = true;
        if (stroka.length() <= 5)
        {
            for (int i = 0; i < stroka.length(); i++) 
            {
                if(stroka.charAt(i) >= '0' && stroka.charAt(i) <= '9')
                {
                    if (stroka.charAt(i) != c)
                    {
                      flag = true;
                    }
                    else 
                    {
                        return false;
                    }
                }
                else 
                {
                    return false;
                }
            }
        }
        else 
        {
            return false;
        }
        return flag;
    }
}