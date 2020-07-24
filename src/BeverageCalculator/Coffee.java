package BeverageCalculator;

/**
 * The coffee class
 * @author Minyao Tan
 * @version hw3
 */

public class Coffee implements Beverage {

    public Coffee() { }

    @Override
    public String getName() {
        return "coffee";
    }

    @Override
    public double getPrice() {
        return 12;
    }
}
