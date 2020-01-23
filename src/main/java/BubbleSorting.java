//package javaLearningPart2;

import java.util.Scanner;

public class BubbleSorting {
    private int length;

    // Method to take input from the User
    public int [] enterElements() {
        System.out.println("Enter the number of elements to be shorted");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        //sc.nextLine();
        int array[] = new int[length];
        // method to take input from the user
        System.out.println("Enter the elements too be sorted");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
            sc.nextLine();
        }
        return array;
    }

    // Method to perform the bubble sorting.
    public int [] sorting(int array[]){
        for (int i = 0; i< length; i++){
            for (int j=1; j< (length-i);j++){
               if(array[j-1]>array[j]){
                   //Swap elements
                   int temp = array[j-1];
                   array[j-1] = array[j];
                   array[j] = temp;
               }
            }
            //System.out.println(array[i]);
        }
        return array;
    }

    // Method to Print the elements of array.
    public void printElements(int array1[]){
        //System.out.println("Elements of array are");
        for (int i=0; i<length; i++){
            System.out.println(array1[i]+"\t");
        }
    }

    // main method.
    public static void main(String arg[]){
            BubbleSorting obj = new BubbleSorting();
            int [] array1 = obj.enterElements();
            System.out.println("Array without Sorting are");
            obj.printElements(array1);
            System.out.println("Array after Sorting are");
            int [] array2 = obj.sorting(array1);
            obj.printElements(array2);
            }
}