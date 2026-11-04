<<<<<<< HEAD
import java.util.*;
public class StringVowelCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count++;
            }
        }
        System.out.print("Number of vowels in the string: " + count);
        sc.close();
    }
=======
import java.util.*;
public class StringVowelCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count++;
            }
        }
        System.out.print("Number of vowels in the string: " + count);
        sc.close();
    }
>>>>>>> fb8adb35e35a5a3556d80a2838724055b735bea2
}