
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */ // use array 2 chiều
public enum Car {
    AUDI("AUDI", new String[]{"WHITE", "YELLOW", "ORANGE"},
            new int[]{5500, 3000, 4500},
            new String[]{"FRIDAY", "SUNDAY", "MONDAY"}),
    MERCEDES("MERCEDES", new String[]{"GREEN", "BLUE", "PURPLE"},
            new int[]{5000, 6000, 8500},
            new String[]{"TUESDAY", "SATURDAY", "WEDNESDAY"}),
    BMW("BMW", new String[]{"PINK", "RED", "BROWN"},
            new int[]{2500, 3000, 3500},
            new String[]{"MONDAY", "SUNDAY", "THURSDAY"});

    private String name;
    private String[] colors;
    private int[] prices;
    private String[] daySells;

    Car(String name, String[] colors, int[] prices, String[] daySells) {
        this.name = name;
        this.colors = colors;
        this.prices = prices;
        this.daySells = daySells;
    }

    public String getName() {
        return name;
    }

    public String[] getColors() {
        return colors;
    }

    public int[] getPrices() {
        return prices;
    }

    public String[] getDaySells() {
        return daySells;
    }

    public static Car getCar(String car) throws ExceptionCar {
        for (Car c : Car.values()) {
            if (c.getName().equalsIgnoreCase(car)) {
                return c;
            }
        }
        throw new ExceptionCar("Car break");
    }
}
