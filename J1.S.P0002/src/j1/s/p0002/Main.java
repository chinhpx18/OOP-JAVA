/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0002;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        
        //enter size of array
        System.out.println("Enter size of array: ");
        int size = SelectionSort.checkInNum();
        //Declaring array
        //Generate random integer in number range for each array element
        int []array = SelectionSort.random(size);
        // 3. Display unsorted array
        System.out.print("Unsorted array:");
        SelectionSort.display(array);
        System.out.println();
        int[] sortedArray = SelectionSort.sortArray(array);
        // 5. Display sorted array
        System.out.print("Sorted array:");
        SelectionSort.display(sortedArray);
    }
}
