import java.util.*;
public class SumOfArray 
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
        int sum = 0;
        for(int i=0; i<size; i++)   
        {
            sum += arr[i];
        }   
        System.out.print("The sum of the array elements is: " + sum);
        sc.close();
    } 
}