import java.util.ArrayList;
import java.util.Scanner;

class Account
{
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance)
    {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount)
    {
        balance += amount;
        System.out.println("Amount Deposited Successfully");
    }

    void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    void display()
    {
        System.out.println("----------------------------");
        System.out.println("Account Number : " + accNo);
        System.out.println("Name           : " + name);
        System.out.println("Balance        : " + balance);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Account> accounts = new ArrayList<>();

        while(true)
        {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    accounts.add(new Account(accNo, name, balance));

                    System.out.println("Account Created Successfully");
                    break;

                case 2:

                    if(accounts.isEmpty())
                    {
                        System.out.println("No Accounts Found");
                    }
                    else
                    {
                        for(Account a : accounts)
                        {
                            a.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Account Number: ");
                    int searchAcc = sc.nextInt();

                    boolean found = false;

                    for(Account a : accounts)
                    {
                        if(a.accNo == searchAcc)
                        {
                            a.display();
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("Account Not Found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double depAmt = sc.nextDouble();

                    found = false;

                    for(Account a : accounts)
                    {
                        if(a.accNo == depAcc)
                        {
                            a.deposit(depAmt);
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("Account Not Found");
                    }

                    break;

                case 5:

                    System.out.print("Enter Account Number: ");
                    int withAcc = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double withAmt = sc.nextDouble();

                    found = false;

                    for(Account a : accounts)
                    {
                        if(a.accNo == withAcc)
                        {
                            a.withdraw(withAmt);
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("Account Not Found");
                    }

                    break;

                case 6:

                    System.out.println("Thank You");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}