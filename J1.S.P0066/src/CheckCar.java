

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class CheckCar {

    public static void checkCar(Car car, Color color, Day day, String price) throws ExceptionCar {
        boolean colorExists = false;
        boolean dayExists = false;
        boolean priceValid = false;

        for (String availableColor : car.getColors()) {
            if (availableColor.equals(color.name())) {
                colorExists = true;
                break;
            }
        }

        for (String availableDay : car.getDaySells()) {
            if (availableDay.equals(day.name())) {
                dayExists = true;
                break;
            }
        }

        int prices;
        try {
            prices = Integer.parseInt(price);
            if (prices < 0) {
                throw new ExceptionCar("Price must be greater than zero");
            }
        } catch (NumberFormatException e) {
            throw new ExceptionCar("Price must be a valid number");
        }

        for (int availablePrice : car.getPrices()) {
            if (availablePrice == prices || (availablePrice == prices + 100 && color == Color.NO_COLOR)) {
                priceValid = true;
                break;
            }
        }

        if (!colorExists) {
            throw new ExceptionCar("Color Car does not exist");
        }

        if (!dayExists) {
            throw new ExceptionCar("Car can't sell today");
        }

        if (!priceValid) {
            throw new ExceptionCar("Price is not valid");
        }
    }
}
