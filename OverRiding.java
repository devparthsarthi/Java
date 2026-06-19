class Calculator 
{
    int add(int a, int b) 
    {
        return a + b;
    }
    double add(double a, double b) 
    {
        return a + b;
    }
    int add(int a, int b, int c) 
    {
        return a + b + c;
    }
    int add(int a, int b) 
    {
        return a + b + 10;
    }
}
public class OverRiding
{
    public static void main(String[] args) 
    {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 10.5));
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of 2 integers (overridden): " + calc.add(5, 10));
    }
}