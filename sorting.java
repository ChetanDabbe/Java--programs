import java.util.*;
public class sorting
{
    public static void bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Bubble sort: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Selection sort: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertion(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=i;
            int prev=i-1;
            while(prev>=0 && arr[prev]>arr[curr])
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=arr[curr];
        }
        System.out.println("Insertion sort: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void counting(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        
        int j=0;
        for(int i=0;i<count.length-1;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        System.out.println("Counting sort: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }   
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubble(arr);
        selection(arr);
        insertion(arr);
        counting(arr);
    }
}