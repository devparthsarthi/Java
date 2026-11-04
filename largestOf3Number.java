<<<<<<< HEAD
import java.util.*;
public class largestOf3Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        if(num1>=num2 && num1>=num3)
        {
            System.out.println("Largest number is: " + num1);
        }
        else if(num2>=num1 && num2>=num3)
        {
            System.out.println("Largest number is: " + num2);
        }
        else
        {
            System.out.println("Largest number is: " + num3);
        }
        sc.close();
    }
=======
import java.util.*;
public class largestOf3Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        if(num1>=num2 && num1>=num3)
        {
            System.out.println("Largest number is: " + num1);
        }
        else if(num2>=num1 && num2>=num3)
        {
            System.out.println("Largest number is: " + num2);
        }
        else
        {
            System.out.println("Largest number is: " + num3);
        }
        sc.close();
    }
>>>>>>> fb8adb35e35a5a3556d80a2838724055b735bea2
}