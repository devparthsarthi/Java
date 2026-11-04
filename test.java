public class test
{
    public static void main(String[] args)
    {
        int[] arr={5,5,5,5,8,5,5,5};
        int group1=arr[0]+arr[1]+arr[2];
        int group2 = arr[3]+arr[4]+arr[5];
        
        if (group1==group2)
        {
            if(arr[6]>arr[7])
            {
                System.out.println("7th apple is heavier");
            }
            else
            {
                System.out.println("8th apple is heavier");
            }
        }
        else if (group1>group2)
        {
            if (arr[0]>arr[1])
            {
                System.out.println("1st apple is heavier");
            }
            else if (arr[1]>arr[0])
            {
                System.out.println("2nd apple is heavier");
            }
            else
            {
                System.out.println("3rd apple is heavier");
            }
        }
        else
        {
            if (arr[3]>arr[4])
            {
                System.out.println("4th apple is heavier");
            }
            else if (arr[4]>arr[3])
            {
                System.out.println("5th apple is heavier");
            }
            else
            {
                System.out.println("6th apple is heavier");
            }
        }
    }
}