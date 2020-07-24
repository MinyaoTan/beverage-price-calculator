package BeverageCalculator;

/**
 * The model of the beverage calculator
 * @author Minyao Tan
 * @version hw3
 */

public class BeverageSelection {
    private Beverage drink;
    private double total;

    public BeverageSelection() {}

    /**
     * Get the beverage object
     * @return The beverage
     */
    public Beverage getDrink() {
        return drink;
    }

    /**
     * Get the total price
     * @return Total price
     */
    public double getTotal() {
        return total;
    }

    /**
     * Set the beverage
     * @param drink The target beverage
     */
    public void setDrink(Beverage drink) {
        this.drink = drink;
        total = drink.getPrice();
    }
}
