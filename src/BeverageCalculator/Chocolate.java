package BeverageCalculator;

/**
 * The chocolate add-on class
 * @author Minyao Tan
 * @version hw3
 */

public class Chocolate extends AddOn implements Beverage {

    public Chocolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + " + " + "chocolate";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 4;
    }
}


