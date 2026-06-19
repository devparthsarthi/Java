import java.util.*;
public class CheckSortedArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for(int i=0; i<size-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.print("The array is sorted.");
        }
        else
        {
            System.out.print("The array is not sorted.");
        }
        sc.close();
    }
}