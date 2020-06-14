public class U4Z3
{
    public static void main(String[] args)
    {
        System.out.println(toSnakeCase("wordUroki"));
        System.out.println(toCamelCase("word_uroki"));
    }
    public static String toCamelCase(String str) 
    {
        String []arr = str.split("_");
        String new_str = arr[0];

        for(int i=1;i<arr.length;i++) 
        {
            new_str+=(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1));
        }	
        return new_str;
    }
    public static String toSnakeCase(String s) {
        return s.replaceAll("([A-Z])", "_$0").toLowerCase();
    }
}