import java.util.Scanner;
class ATM
{
    void Atm_balance()
    {
        System.out.println("Welcome to the ATM");
        System.out.print("Enter your Pin number : ");
        Scanner object= new Scanner(System.in);
        Integer Pin_number = object.nextInt();
        System.out.println("1. Check Balance");
        System.out.println("2.Withdrawal");
        System.out.print("Please select an option: ");
        Integer j= object.nextInt();
    
        int balance = 1000;
        if(Pin_number!=0000)
        {
             if(j==2)
             {
                System.out.print("Enter the amount you wish to withdraw : ");
                Integer withdrawals = object.nextInt();
                if(withdrawals<=balance)
                {
                    
                    System.out.println("Withdrawal is successful");
                    int h = balance-withdrawals;
                    System.out.println("You have withdrawn : "+ withdrawals);
                    System.out.println("You new balance is : "+h);
                }
                else
                {
                      System.out.println("Your withdrawal amount is greater than your current balance");
                }
             }
            else if (j==1)
            {
               System.out.println("Your current balance is : "+ balance);
            }
    }
    }

    public static void main(String[]args)
    {
        ATM obj = new ATM();
        obj.Atm_balance();
    }
}