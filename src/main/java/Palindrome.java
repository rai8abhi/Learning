//package javaLearningPart2;

import java.util.Scanner;

public class Palindrome {
    private String vnumber, revers="";

    // Method to take input from the user
    public void userInput(){
        System.out.println("Enter the number/Word to be checked.");
        Scanner sc = new Scanner(System.in);
        vnumber = sc.nextLine();
    }

    //Method to revers the given number.
    public void reverse (){
        int l = vnumber.length();
        for(int i = l-1; i>=0; i--){
            revers = revers + vnumber.charAt(i);
        }
    }

    //Method to check if number is palindrome or not
    public boolean palindrome(){
        if (vnumber.equals(revers))
            return true;
        else
            return false;
    }
    //Method to display
    public void display(boolean result1){
        if(result1)
            System.out.println("Given number/string is palindrome");
        else
            System.out.println("Given number/string is not a palindrome");
    }
    //main method
    public static void main(String arg[]){
        Palindrome obj = new Palindrome();
        obj.userInput();
        obj.reverse();
        boolean result = obj.palindrome();
        obj.display(result);

    }
}
