import java.util.*;
public class CountEvenNumber
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
        int countEven = 0;
        for(int i=0; i<size; i++)   
        {
            if(arr[i] % 2 == 0)
            {
                countEven++;
            }
        }   
        System.out.print("The number of even elements in the array is: " + countEven);
        sc.close();
    }
}