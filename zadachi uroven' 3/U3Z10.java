import java.util.*;

public class U3Z10 
{
    public static void main(String[] args)
    {
        System.out.println(rigthTriangle(5,3,4));
    }
    public static boolean rigthTriangle(int x, int y, int z)
    {
        if ( x < 0 || y < 0 || z < 0 )
            return false;
        return  (x*x+y*y==z*z || x*x==y*y+z*z || x*x+z*z == y*y);
    }
}