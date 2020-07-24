package BeverageCalculator;

/**
 * The black tea class
 * @author Minyao Tan
 * @version hw3
 */

public class BlackTea implements Beverage {

    public BlackTea() {}

    @Override
    public String getName() {
        return "black tea";
    }

    @Override
    public double getPrice() {
        return 8;
    }
}
