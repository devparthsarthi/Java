import java.util.*;
public class SearchNumberInArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search in the array:");
        int numToSearch = sc.nextInt();
        boolean found = false;
        for(int i=0; i<size; i++)   
        {
            if(arr[i] == numToSearch)
            {
                found = true;
                break;
            }
        }   
        if(found)
        {
            System.out.print(numToSearch + " is present in the array.");
        }
        else
        {
            System.out.print(numToSearch + " is not present in the array.");
        }
        sc.close();
    }
}
