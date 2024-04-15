

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class CheckInput {

    static final Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty");
                } else {
                    int num = Integer.parseInt(sc.nextLine());
                    if (num < 0) {
                        System.out.println("The edges to greater than zero");
                        continue;
                    }
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!!");
                System.out.println("Please input again: ");
            }
        }
    }

    public static double inputDouble() {
        while (true) {
            try {
                double input = Double.parseDouble(sc.nextLine());
                if (input < 0) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("The radius to great than zero");
                System.out.println("Please input again: ");
            }
        }
    }

}
