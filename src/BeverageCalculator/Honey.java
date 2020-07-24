package BeverageCalculator;

/**
 * The honey add-on class
 * @author Minyao Tan
 * @version hw3
 */

public class Honey extends AddOn implements Beverage {

    public Honey(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + " + " + "honey";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 2;
    }
}

