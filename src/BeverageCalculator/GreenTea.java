package BeverageCalculator;

/**
 * The green tea class
 * @author Minyao Tan
 * @version hw3
 */

public class GreenTea implements Beverage {

    public GreenTea() {}

    @Override
    public String getName() {
        return "green tea";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
