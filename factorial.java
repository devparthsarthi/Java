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
}