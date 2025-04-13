import java.util.*;
public class primenumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean is_prime=true;
        if(n==2)
        {
            System.out.println("prime number");
        }
        else
        {
            for(int i=2;i<Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    is_prime=false;
                   
                }
            }
                
            if(is_prime==true)
            {
                System.out.println("n is prime");
            }
            else
            {
                System.out.println("n is not prime");
            }
        }
    } 
}
