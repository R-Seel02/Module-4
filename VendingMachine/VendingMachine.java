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
        

        System.out.println("Which Snack would you like? ");
        Scanner snackName = new Scanner(System.in);
        snackChoice = snackName.nextLine();



        switch (snackChoice) {
            case ("Lebron Ruffles"):
            System.out.println("That will cost " + ruffPrice);
                break;
            case("Honey Bun"):
            System.out.println("That will cost " + honeyBun);
                break;
            case ("Natures Valley Bar"):
            System.out.println("That will cost " + nvBar);
                break;
            case ("Welches Gummies"):
            System.out.println("That will cost " + wGummies);
                break;
            case ("Oreos"):
            System.out.println("That will cost " + oreos);
                break;
            default:
                break;

                
        }

        snackName.close();
        

    }
}