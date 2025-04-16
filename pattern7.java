import java.util.*;

public class pattern7{
    public static void main(String[] args)
    {
        int m=5;
        int n=5;
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            n--;
            System.out.print("\n");
        }
    }
}