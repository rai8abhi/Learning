//package javaLearningPart2;

import java.util.Scanner;

public class Factorial {
    private int Fnumber, fact=1;

    //Method to take input from the user
    public void enter (){
        System.out.println("Enter the number to cal the Factorial");
        Scanner sc1 = new Scanner(System.in);
        Fnumber = sc1.nextInt();
        sc1.nextLine();
    }

    //Method to return the factorial of given number
    public void factorial (){
        for(int i=1;i<=Fnumber;i++)
            fact = fact*i;
    }

    //Method to print the number
    public void printing(){
        System.out.println("Factorial of the given number is = " +fact);
    }

    //main method
    public static void main(String arg []){
        Factorial obj1 =new Factorial();
        obj1.enter();
        obj1.factorial();
        obj1.printing();
    }


}
