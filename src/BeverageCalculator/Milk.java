package BeverageCalculator;

/**
 * The milk class
 * @author Minyao Tan
 * @version hw3
 */

public class Milk extends AddOn implements Beverage {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + " + " + "milk";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 3;
    }
}


