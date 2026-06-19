import java.util.*;
public class MinimumOfArray
{
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of the array:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.print("Enter the elements of the array:");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int min=arr[n-1];
            for(int i=n-2;i>=0;i--)
            {
                if(arr[i]<min)
                {
                    min=arr[i];
                }
            }
            System.out.print("The minimum element in the array is: " + min);
            sc.close();
        }
}