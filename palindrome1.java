import java.util.*;
public class palindrome1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean is_palindrome=false;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))
            {
                is_palindrome=true;
            }
        }
        if(is_palindrome==true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("No palindorme");
        }
    }
}