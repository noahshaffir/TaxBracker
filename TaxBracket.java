// Author: Noah Shaffir
import java.util.Scanner;
public class TaxBracket {
    public static void main(String[] args) {
        double salary;
        double tax;
        double remaining;
        Scanner sc;
        sc= new Scanner(System.in);
        System.out.println("Welcome to the tax calculator. Please input your yearly salary in order for us to calculate your tax owings. Do not include a dollar sign in your input.");
        salary= sc.nextDouble();
        if (30000 >= salary) {
            tax = 0.1*salary;
            remaining = 0.9*salary;
            System.out.println("You now owe us $"+tax+". This leaves you with $"+remaining+". Thank you for being a good taxpayer and citizen.");
        }
        else if (50000 >= salary){
            tax = 0.25*(salary-3000) + 3000;
            remaining = 0.75*(salary-3000) - 3000;
            System.out.println("You now owe us $"+tax+". This leaves you with $"+remaining+". Thank you for being a good taxpayer and citizen.");
        }
        else if (100000 >= salary){
            tax = 0.45*(salary-15500) + 15500;
            remaining = 0.55*(salary+15500) - 15500;
            System.out.println("You now owe us $"+tax+". This leaves you with $"+remaining+". Thank you for being a good taxpayer and citizen.");
        }
        else if (salary > 100000){
            tax = 0.6*(salary-60500) + 60500;
            remaining= 0.4*(salary-60500) - 60500;
            System.out.println("You now owe us $"+tax+". This leaves you with $"+remaining+". Thank you for being a good taxpayer and citizen.");
        }

    }
}
