import java.util.*;
public class palindromeStringBuilder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String RevStr = sb.toString();

        if(str.equals(RevStr))
        {
            System.out.print("The string is a palindrome.");
        }
        else
        {
            System.out.print("The string is not a palindrome.");
        }
        sc.close();
    }
}