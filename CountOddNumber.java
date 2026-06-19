import java.util.*;
public class CountOddNumber 
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
        int countOdd = 0;
        for(int i=0; i<size; i++)   
        {
            if(arr[i] % 2 != 0)
            {
                countOdd++;
            }
        }   
        System.out.print("The number of odd elements in the array is: " + countOdd);
        sc.close();
    }
}