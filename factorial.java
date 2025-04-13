import java.util.*;
public class factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=1;
        for(int i=n;i>0;i--)
        {   
            factorial*=i;
        }
        System.out.println(factorial);
    }
}

//alternate solution
//for(int i=1;i<=n;i++)