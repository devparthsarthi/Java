<<<<<<< HEAD
import java.util.*;

public class factorial
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        int result = 1;
       
        for(int i=1; i<=n; i++)
        {
            result *= i;
        }
        System.out.println(result);
        sc.close();
    }
=======
import java.util.*;

public class factorial
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        int result = 1;
       
        for(int i=1; i<=n; i++)
        {
            result *= i;
        }
        System.out.println(result);
        sc.close();
    }
>>>>>>> fb8adb35e35a5a3556d80a2838724055b735bea2
}