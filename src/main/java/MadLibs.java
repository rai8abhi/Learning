//package Learning;

import java.util.Scanner;

public class MadLibs {

public static void main(String args[]){
        // Seasion of the year
        System.out.println("Enter the Season of year");
        Scanner sc1 = new Scanner(System.in);
        String  year = sc1.nextLine();

        // Whole Number
        System.out.println("Cup of coffee");
        //Scanner sc = new Scanner(System.in);
        int coffee = sc1.nextInt();
        sc1.nextLine();

        //Adjective
        System.out.println("Adjective");
        String adjective = sc1.nextLine();

        //On a [adjective] [season of the year] day , I dink a mininum of [whole number]  cups of coffee
        System.out.println("On a " + adjective+" " + year + " day, I dink a mininum of " + coffee + " cups of coffee.");

    }
}
