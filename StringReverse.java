import java.util.*;
public class StringReverse
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
        System.out.print(rev);
        sc.close();
    }
}