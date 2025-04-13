import java.util.*;
public class palindrome
{
    public static void palindrome(int n)
    {
        int rev=0;
        int last_digit;
        int n1=n;
        while(n1!=0)
        {
            last_digit=n1%10;
            rev=(rev*10)+last_digit;
            n1=n1/10;
        }
        if(rev==n)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String args[])
    {
        palindrome(43);
    }
}