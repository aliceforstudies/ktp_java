import java.util.Scanner;

public class U3Z2 
{
    public static void main(String args[])
    {
        System.out.println("Vvedite stroku so slovom 'zip': ");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        System.out.println("index 2-go slova zip 'zip': " + findZip(stroka));
    }
    public static int findZip(String stroka)  
    {   
        int index2;
        int index1 = stroka.indexOf("zip");
        if (index1 == -1)
            return index1;
        else
            index2 = stroka.indexOf("zip",index1+1);
        return index2;
    }
    
}