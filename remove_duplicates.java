import java.util.*;
public class remove_duplicates
{
    public static void remove(String str,StringBuilder str1,int index,boolean map[])
    {
       if(index==str.length())
       {
            System.out.println(str1);
            return;
       }
       char curr_char=str.charAt(index);
       if(map[curr_char-'a']==true)
       {
            remove(str,str1,index+1,map);
       }
       else
       {
            map[curr_char-'a']=true;
            remove(str,str1.append(curr_char),index+1,map);
       }

    }
    public static void main(String args[])
    {
        String str="apnnacollegee";
        StringBuilder str1=new StringBuilder();
        int index=0;
        remove(str,str1,index,new boolean[26]);
    }
}