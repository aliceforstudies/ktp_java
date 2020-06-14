import java.util.Scanner;

public class U2Z9 
{
    public static void main(String args[])
	{
        
        System.out.println("Slovo: ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        System.out.println("Suffix ili prefix: ");
        String word2 = in.nextLine();

        System.out.println(" ");
        if (word2.charAt(0) == '-')
        {
            System.out.println(isSuffix(word,word2));
        }
        else
            System.out.println(isPrefix(word,word2));
        
    }
    public static boolean isSuffix(String word, String suf) {
        suf = suf.replace("-", "");
        int raz = word.length() - suf.length();
        if (isEqual(suf, word.substring(raz))) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isPrefix(String word, String pref) {
        pref = pref.replace("-", "");
        if (isEqual(pref, word.substring(0,pref.length()))) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isEqual(String w1, String w2) {
        if (w1.length() == w2.length()) {
            for (int i = 0; i < w1.length(); i++){
                if (w1.charAt(i) != w2.charAt(i)){
                    return false;
                }               
            }
            return true;
        }
        else {
            return false;
        }
    }
}