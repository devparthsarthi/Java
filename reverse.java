import java.util.*;

public class reverse    
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for(int i=n; i>=1; i--)
        {
            System.out.print(" "+i);
        }
        sc.close();
    }
}