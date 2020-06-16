import java.util.*;

public class U5Z5
{
    public static void main(String[] args) 
    {
    	String[] str = {"toe", "ocelot", "maniac"};
        System.out.println(Arrays.toString(sameVowelGroup(str)));
    }
    public static String[] sameVowelGroup(String[] str){
        List<String> list = new ArrayList<String>();
        list.add(str[0]);
        String vowel="aeiyou";

        for(int i=1;i<str.length;i++)
        {
            boolean flag=true;
            for(char c: vowel.toCharArray())
            {
                if (str[0].contains(String.valueOf(c))!=str[i].contains(String.valueOf(c))) 
                    flag=false;
            }
            if (flag) 
                list.add(str[i]);
        }
        return list.toArray(new String[list.size()]);
    }
}