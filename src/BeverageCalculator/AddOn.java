package BeverageCalculator;

/**
 * This class is the add-on object to a beverage
 * @author Minyao Tan
 * @version hw3
 */

public abstract class AddOn implements Beverage {
    protected Beverage beverage;

    /**
     * Constructor to set the beverage for the add-on object
     * @param beverage
     */
    public AddOn(Beverage beverage) {
        this.beverage = beverage;
    }
}
