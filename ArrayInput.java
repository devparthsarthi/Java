<<<<<<< HEAD
import java.util.*;
public class ArrayInput 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(" " + arr[i]);
        }
        sc.close();
    }
}
=======
import java.util.*;
public class ArrayInput 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(" " + arr[i]);
        }
        sc.close();
    }
}
>>>>>>> fb8adb35e35a5a3556d80a2838724055b735bea2
