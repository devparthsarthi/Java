import java.util.*;

public class Grade 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if(marks<30) 
        {
            System.out.println("Grade D");
        }
        else if(marks>=30 && marks<60) 
        {
            System.out.println("Grade C");
        }
        else if(marks>=60 && marks<70)
        {
            System.out.println("Grade B");
        }
        else if(marks>=70 && marks<90) 
        {
            System.out.println("Grade A");
        }
        else 
        {
            System.out.println("Grade A+");
        }
        sc.close();
    }
}