package VendingMachine;

import java.util.Scanner;

public class VendingMachine
{
    public static void main(String[] args) 
    {
        //Display welcome message and instructions
        System.out.println("Welcome to our vending machine");

        //Display snack options
        System.out.println("Snack Options:");
        System.out.println("1.Lebron Ruffles");
        System.out.println("2.Honey Bun");
        System.out.println("3.Natures Valley Bar");
        System.out.println("4.Welch's Gummies");
        System.out.println("5. Oreos");

        String snackChoice;
        double ruffPrice = 2.50;
        double honeyBun = .75;
        double nvBar = 2.00;
        double wGummies = 1.50;
        double oreos = 2.25;

        double snackPrice = 0.0;
        

        System.out.println("Which Snack would you like? ");
        Scanner scan = new Scanner(System.in);
        snackChoice = scan.nextLine();



        switch (snackChoice) {
            case ("Lebron Ruffles"):
            System.out.println("That will cost " + ruffPrice);
                snackPrice = ruffPrice;
                break;
            case("Honey Bun"):
            System.out.println("That will cost " + honeyBun);
                snackPrice = honeyBun;
                break;
            case ("Natures Valley Bar"):
            System.out.println("That will cost " + nvBar);
                snackPrice = nvBar;
                break;
            case ("Welches Gummies"):
            System.out.println("That will cost " + wGummies);
                snackPrice = wGummies;
                break;
            case ("Oreos"):
            System.out.println("That will cost " + oreos);
                snackPrice = oreos;
                break;
            default:
            System.out.println("Invalid choice, please select from the provided options.");
            break;                      
        }

        
        System.out.println("Would you like to purchase this snack? ");
        String userConfirm = scan.nextLine();

        if (userConfirm.equals("Yes")){
            System.out.println("Okay despensing the " + snackChoice);
        }
        else if (userConfirm.equals("no")){

            System.out.println("no snack was chosen" );

        }
        else {
            System.out.println("Error, Please enter yes or no");
        }

        double totalInserted = 0;
        System.out.println("Please insert $1 bills. Type '0' when you are done");
        while (true)
        {
            System.out.println("Please insert $1 bill:");
            int moneyInserted = scan.nextInt();
            if (moneyInserted == 0)
            {
                break;
            }
            else if (moneyInserted == 1)
            {
                totalInserted += moneyInserted;
                System.out.println("Total inserted: $" + totalInserted);
            }
            else
            {
                System.out.println("Invalid amount. Only $1 bills are accepted,");
            }
        }


        //Check if enough money was inserted and calculate change
        if (totalInserted >= snackPrice)
        {
            System.out.println("Thank you for your purchase. Dispensing the snack. ");
            double change = totalInserted - snackPrice;
            if (change > 0)
            {
                System.out.println("Please take your change: $" + change);
            }
            else
            {
                System.out.println("Not enough money inserted. Please take back your money: $" +totalInserted);
            }
        }

        scan.close();

        System.out.println("Wow such an amazing snack choice! please avoid snack overconsumption");

    }
    
}