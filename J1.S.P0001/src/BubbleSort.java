
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    public  void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public  void display(int[] array) {
        System.out.print(Arrays.toString(array));
    }

    public  int[] random(int size) {
        int[] arr = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(size);
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = rd.nextInt(size);
                    j = -1;
                }
            }
        }
        return arr;
    }

    public  int getInteger(String message) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    throw new Exception();
                }

                int number = Integer.parseInt(input);
                if (number <= 0) {
                    throw new Exception();
                }

                return number;

            } catch (Exception e) {
                System.out.println("Wrong input. Please input again: ");
            }
        }
    }
}
