<<<<<<< HEAD
import java.util.*;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci numbers: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}
=======
import java.util.*;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci numbers: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}
>>>>>>> fb8adb35e35a5a3556d80a2838724055b735bea2
