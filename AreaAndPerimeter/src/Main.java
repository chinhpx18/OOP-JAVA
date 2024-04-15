
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

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====Calculator Shape Program=====");

        // Get rectangle dimensions
        System.out.println("Please input side width of Rectangle:");
        int Width = CheckInput.inputInt();
        System.out.println("Please input length of Rectangle:");
        int Length = CheckInput.inputInt();

        // Get circle radius
        System.out.println("Please input radius of Circle:");
        double Radius = CheckInput.inputDouble();

        // Get triangle side lengths
        System.out.println("Please input side A of Triangle:");
        int A = CheckInput.inputInt();
        System.out.println("Please input side B of Triangle:");
        int B = CheckInput.inputInt();
        System.out.println("Please input side C of Triangle:");
        int C = CheckInput.inputInt();
        // Create shape objects
        Rectangle rec = new Rectangle(Length, Width);
        Triangle tri = new Triangle(A, B, C);
        Circle c = new Circle(Radius);

        // Display results
        rec.printResult();
        System.out.println("");
        tri.printResult();
        System.out.println("");
        c.printResult();
    }
}
