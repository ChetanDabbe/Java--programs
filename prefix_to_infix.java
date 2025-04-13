import java.util.*;
public class prefix_to_infix
{
    public static String convert(String str)
    {
        Stack<String>st=new Stack<>();
        int n=str.length();
        int i=n-1;
        while(i>=0)
        {
            char ch=str.charAt(i);
            if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')|| (ch>'0' && ch<='9') )
            {
                st.push(Character.toString(ch));
            }
            else
            {
                String t1=st.pop();
                String t2=st.pop();
                String t3="("+t1+ch+t2+")";
                st.push(t3);
            }
            i--;
        }
        return st.peek();
    }
    public static void main(String args[])
    {
        String str="*-A/BC-/AKL";
        System.out.print(convert(str));
    }
}