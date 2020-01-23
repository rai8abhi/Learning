//package javaLearningPart2;

import java.util.Scanner;

public class ArrayInput {
    //Method to take length of array
    private int lenghtArray(){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        return length;
    }

    //Method for single Array
    private int [] singleArray(int length){
        int array[] = new int[length];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<length;i++){
            array[i] = sc.nextInt();
            sc.nextLine();
        }
        return array;
    }
    public static void main (String arg[]){
        ArrayInput obj = new ArrayInput();
        int lenght = obj.lenghtArray();
        int [] array = obj.singleArray(lenght);
        System.out.println("array"+array);
    }
}
