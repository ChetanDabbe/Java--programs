import java.util.*;
public class sumofdigit
{
    public static int digit(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int last_digit=n%10;
            sum=sum+last_digit;
            n=n/10;
        }
        return sum;
      
    }

    public static void main(String args[])
    {
        int result=digit(123);
        System.out.println(result);
    }
}