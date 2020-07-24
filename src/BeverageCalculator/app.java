package BeverageCalculator;

/**
 * This is the application program for the beverage calculator
 * @author Minyao Tan
 * @version hw3
 */

public class app {

    /**
     * The application method
     * @param args The command-line argument
     */
    public static void main(String[] args) {
        BeverageCalculatorGUI gui = new BeverageCalculatorGUI();
        BeverageSelection beverage = new BeverageSelection();
        BeverageCalculator calculator = new BeverageCalculator(gui, beverage);
    }
}
