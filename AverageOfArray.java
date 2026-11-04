<<<<<<< HEAD
import java.util.*;
public class AverageOfArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }
        double average = (double)sum / n;
        System.out.println("The average of the array elements is: " + average);
        sc.close();
    }
=======
import java.util.*;
public class AverageOfArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }
        double average = (double)sum / n;
        System.out.println("The average of the array elements is: " + average);
        sc.close();
    }
>>>>>>> fb8adb35e35a5a3556d80a2838724055b735bea2
}