import java.util.*;

public class pattern4
{
    public static void main(String[] args)
    {
        int m=4;
        int n=4;

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");

            }
            n--;
            System.out.print("\n");
        }
    }
}