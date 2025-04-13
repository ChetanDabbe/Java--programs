import java.util.*;
public class postfix_to_infix
{
    public static String convert(String str)
    {
        Stack<String>st=new Stack<>();
        int i=0;
        int n=str.length();
        while(i<n)
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
                String t3="("+t2+ch+t1+")";
                st.push(t3);
            }
            i++;
        }
        return st.peek();
    }
    public static void main(String args[])
    {
        String str="ab*c+";
        System.out.print(convert(str));
    }
}