class Animal 
{
    void eat() 
    {
        System.out.println("This animal eats food.");
    }
}
    class Dog extends Animal 
    {
        void bark() 
        {
            System.out.println("The dog barks.");
        }
    }
class Puppy extends Dog 
{
    void weep() 
    {
        System.out.println("The puppy weeps.");
    }
}
public class MultiLevelInheritance
{
    public static void main(String[] args) 
    {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}