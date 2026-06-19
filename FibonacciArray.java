import java.util.*;
public class FibonacciArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n=sc.nextInt();
        int[] fibArray=new int[n];
        fibArray[0]=0;
        if(n>1)
        {
            fibArray[1]=1;
        }
        for(int i=2;i<n;i++)
        {
            fibArray[i]=fibArray[i-1]+fibArray[i-2];
        }
        System.out.print("Fibonacci numbers: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(fibArray[i]+" ");
        }
        sc.close();
    }
}