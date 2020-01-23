//package javaLearningPart2;

import sun.print.SunMinMaxPage;

import java.util.Scanner;

public class Armstrong {
    private int  Anumber, Anumber1,n, sum=0;

    //Method to take input from the user
    public void inputnumber (){
        System.out.println("Enter the number to find the Armstrong");
        Scanner sc = new Scanner(System.in);
        Anumber = sc.nextInt();
        /* sc.nextLine(); */
        }

     //Method to find the Armstrong number
    public void checkarmstrong(){
        int Anumber2 = Anumber;
        while (Anumber>0){
            Anumber1 = Anumber%10;
            Anumber = Anumber/10;
            sum = sum+(Anumber1*Anumber1*Anumber1);
//            System.out.println(sum);
        }
        if (sum == Anumber2)
            System.out.println("Given number is armaston number=" + sum);
        else
            System.out.println("Given number isn't armstrong number");

    }
    public static void main(String arg[]){
        Armstrong obj1 = new Armstrong();
        obj1.inputnumber();
        obj1.checkarmstrong();

    }
}
