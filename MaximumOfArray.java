import java.util.*;
public class MaximumOfArray
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
            int max=arr[0];
            for(int i=1;i<n;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
            System.out.print("The maximum element in the array is: " + max);
            sc.close();
        }
}