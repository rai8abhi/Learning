//package JavaLearningPart1;

import java.util.Scanner;

public class Salebones {

    public static void main(String args[]){

        //Asked the no of sales made.
        System.out.println("Enter the no. of sales you make");
        Scanner sc = new Scanner(System.in);
        int sale = sc.nextInt();
        System.out.println("Entern the no of experince in current Job");
        int year = sc.nextInt();
        int pay=1000;
        int requiredSales =10;
        int requiredExp = 2;

        if (sale>=requiredSales) {
            if (year>=requiredExp) {
                // Calculate the pay
                pay = pay + 250;
                // Display the pay
                System.out.println("Your pay is " + pay);
            }
            else
                System.out.println("Sorry you are not qualified, your experince is less");
        }
        else
        {
            System.out.println("Sorry you are not qualified, fuck your self mc");
        }

    }
}
