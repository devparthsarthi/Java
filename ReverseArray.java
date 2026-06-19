import java.util.*;
public class ReverseArray 
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
        System.out.print("The elements of the array in reverse order are: ");
        for(int i=size-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}