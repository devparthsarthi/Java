 import java.util.*;
public class watermelon 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of the watermelon: ");
        int weight = sc.nextInt();
        if (weight > 2 && weight % 2 == 0) 
            {
            System.out.println("YES");
            }
        else 
            {
            System.out.println("NO");
            }
            sc.close();
    }
}
