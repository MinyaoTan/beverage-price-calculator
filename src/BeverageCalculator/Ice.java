package BeverageCalculator;

/**
 * The ice add-on class
 * @author Minyao Tan
 * @version hw3
 */

public class Ice extends AddOn implements Beverage {

    public Ice(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + " + " + "ice";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 1;
    }
}

