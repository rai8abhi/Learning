//package javaLearningPart2;

public class SelectionSort {

    //Method to sort the elements using selection sorting
    public int [] selectionSorting(int [] array){
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[i]){
                    i = j;//searching for lowest index
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        return array;
    }

    //main method
    public static void  main(String arg []){
        BubbleSorting obj = new BubbleSorting();
        int [] array1 = obj.enterElements();
        System.out.println("Array before Selection sorting are:-");
        obj.printElements(array1);
        SelectionSort obj1 = new SelectionSort();
        int [] array2 = obj1.selectionSorting(array1);
        System.out.println("Array after Selection sorting are:- ");
        obj.printElements(array2);
    }

}
