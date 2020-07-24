package BeverageCalculator;

/**
 * This is the class of Beverage object
 * @author Minyao Tan
 * @version hw3
 */

public interface Beverage {

    /**
     * Get the name of the beverage including the drink and the add-on items
     * @return Name of the beverage
     */
    public String getName();

    /**
     * Get the price of the beverage
     * @return Price of the beverage
     */
    public double getPrice();
}
