/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0002;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);

    // Check user input number integer
    public static int checkInNum() {
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Don't is empty!");
                } else {
                    int number = Integer.parseInt(input);
                    if (number <= 0) {
                        System.out.println("You must input positive integer!");
                    } else {
                        return number;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }
    }

    // sort array by selection sort
    public static int[] sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Random integer in number range
    public static int[] random(int size) {
        Random rd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            //generate random number
            int randomNumber = rd.nextInt(size);
            //assign value to array's element
            arr[i] = randomNumber;
        }
        // Duyệt qua mảng và kiểm tra xem các phần tử có bị lặp lại hay không
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    // Nếu phần tử bị lặp lại, thì tạo một số nguyên ngẫu nhiên khác
                    arr[i] = rd.nextInt(size);
                    //// Đặt lại vòng lặp bên trong để kiểm tra lại các bản sao
                    j = -1;
                }
            }
        }
        return arr;
    }

    //display array after sort
    public static void display(int[] array) {
        System.out.print(Arrays.toString(array));
    }
}
