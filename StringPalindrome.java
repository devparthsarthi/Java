import java.util.*;
public class StringPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1; i>=0; i--)
        {
        rev += str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
        sc.close();
    }
}