package BeverageCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The controller class with the business logic
 * @author Minyao Tan
 * @version hw3
 */

public class BeverageCalculator implements ActionListener {
    private BeverageCalculatorGUI gui;
    private BeverageSelection beverage;

    /**
     * Constructor
     * @param gui The beverage calculator GUI
     * @param beverage The beverage calculator model
     */
    public BeverageCalculator(BeverageCalculatorGUI gui, BeverageSelection beverage) {
        this.gui = gui;
        this.beverage = beverage;

        gui.addTaskPerformer(this);
    }

    /**
     * Get the beverage based on user selection and then update the GUI with results
     * @param e Action event when calculate button is clicked
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (gui.getBeverage().equals("Coffee")) {
            beverage.setDrink(new Coffee());
        } else if (gui.getBeverage().equals("Black Tea")) {
            beverage.setDrink(new BlackTea());
        } else if (gui.getBeverage().equals("Green Tea")) {
            beverage.setDrink(new GreenTea());
        }

        if (gui.honey()) {
            beverage.setDrink(new Honey(beverage.getDrink()));
        }

        if (gui.ice()) {
            beverage.setDrink(new Ice(beverage.getDrink()));
        }

        if (gui.chocolate()) {
            beverage.setDrink(new Chocolate(beverage.getDrink()));
        }

        if (gui.milk()) {
            beverage.setDrink(new Milk(beverage.getDrink()));
        }

        updateGUI();
    }

    /**
     * Display beverage total price and description in GUI
     */
    public void updateGUI() {
        gui.displayTotal(beverage.getTotal());
        gui.displayDescription(beverage.getDrink().getName());
    }
}
