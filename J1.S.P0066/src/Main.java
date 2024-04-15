
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String continueFlag = "Y";
        System.out.println("===== Showroom car program =====");

        while (true) {
            System.out.println("Input Information of Car");

            System.out.print("Name: ");
            String carInput = scanner.nextLine();

            System.out.print("Color: ");
            String colorInput = scanner.nextLine();

            System.out.print("Price: ");
            String priceInput = scanner.nextLine();

            System.out.print("Today: ");
            String dayInput = scanner.nextLine();

            System.out.println();

            try {
                Car car = Car.getCar(carInput);
                Color color = Color.getColor(colorInput);
                Day day = Day.getDay(dayInput);

                CheckCar.checkCar(car, color, day, priceInput);
                System.out.println("Sell Car");
                String continueFlag = "Y";
                System.out.print("Do you want to find more? (Y/N): ");
                continueFlag = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Can't sell Car");
                System.out.println(e.getMessage());
            }

            System.out.println();
        }
    }

}
