package BeverageCalculator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * The GUI class of the beverage calculator
 * @author Minyao Tan
 * @version hw3
 */

public class BeverageCalculatorGUI extends JFrame {
    private JPanel overallPnl = new JPanel();
    private JPanel bevPnl = new JPanel();
    private JPanel addOnPnl = new JPanel();
    private JPanel southPnl = new JPanel();
    private JPanel calcPnl = new JPanel();
    private JPanel fieldPnl = new JPanel();
    private JLabel bevLbl = new JLabel("Beverage: ", SwingConstants.LEFT);
    private JLabel totalLbl = new JLabel("Total: ");
    private JComboBox bevCombo = new JComboBox(beverage);
    private JCheckBox honeyCb = new JCheckBox("Honey");
    private JCheckBox iceCb = new JCheckBox("Ice");
    private JCheckBox chocoCb = new JCheckBox("Chocolate");
    private JCheckBox milkCb = new JCheckBox("Milk");
    private JButton calcBtn = new JButton("Calculate");
    private JTextField totalFd = new JTextField();
    private JTextArea descriptionTA = new JTextArea();

    private static final String[] beverage = {"Coffee", "Black Tea", "Green Tea"};

    /**
     * Construction
     */
    public BeverageCalculatorGUI() {
        initComponents();
    }

    /**
     * Initialize GUI components
     */
    private void initComponents() {
        setTitle("BC Coffee Shop");
        getContentPane().setBackground(Color.orange);

        bevPnl.add(bevLbl);
        bevPnl.add(bevCombo);
        bevPnl.setBackground(Color.orange);
        bevLbl.setHorizontalAlignment(SwingConstants.LEFT);

        honeyCb.setBorder(new EmptyBorder(new Insets(0, 0, 0, 50)));
        iceCb.setBorder(new EmptyBorder(new Insets(0, 0, 0, 50)));
        chocoCb.setBorder(new EmptyBorder(new Insets(0, 0, 0, 50)));
        addOnPnl.add(honeyCb);
        addOnPnl.add(iceCb);
        addOnPnl.add(chocoCb);
        addOnPnl.add(milkCb);
        addOnPnl.setBackground(Color.orange);

        calcPnl.setLayout(new FlowLayout());
        calcPnl.setBackground(Color.orange);
        calcPnl.add(calcBtn);

        southPnl.add(calcPnl);
        southPnl.add(totalLbl);
        southPnl.setBackground(Color.orange);
        southPnl.setLayout(new GridLayout(2, 1));

        fieldPnl.setLayout(new FlowLayout());
        fieldPnl.setBackground(Color.orange);
        fieldPnl.setPreferredSize(new Dimension(400, 200));
        totalFd.setPreferredSize(new Dimension(400, 20));
        totalFd.setEditable(false);
        descriptionTA.setEditable(false);
        descriptionTA.setPreferredSize(new Dimension(400, 300));
        fieldPnl.add(totalFd);
        fieldPnl.add(descriptionTA);

        overallPnl.setLayout(new BoxLayout(overallPnl, BoxLayout.Y_AXIS));
        overallPnl.setBackground(Color.orange);

        overallPnl.add(bevPnl);
        overallPnl.add(addOnPnl);
        overallPnl.add(southPnl);
        overallPnl.add(fieldPnl);
        overallPnl.setBorder(new EmptyBorder(new Insets(0, 0, 20, 0)));

        add(overallPnl);
        pack();
        setVisible(true);
        setPreferredSize(new Dimension(1000, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Add action listener to calculate button
     * @param listener Action listener to calculate button
     */
    public void addTaskPerformer(ActionListener listener) {
        calcBtn.addActionListener(listener);
    }

    /**
     * Get the name of the beverage
     * @return Name of beverage
     */
    public String getBeverage() {
        return String.valueOf(bevCombo.getSelectedItem());
    }

    /**
     * Whether honey is selected
     * @return True if honey is selected, false otherwise
     */
    public boolean honey() {
        return honeyCb.isSelected();
    }

    /**
     * Whether ice is selected
     * @return True if ice is selected, false otherwise
     */
    public boolean ice() {
        return iceCb.isSelected();
    }

    /**
     * Whether chocolate is selected
     * @return True if chocolate is selected, false otherwise
     */
    public boolean chocolate() {
        return chocoCb.isSelected();
    }

    /**
     * Whether milk is selected
     * @return True if milk is selected, false otherwise
     */
    public boolean milk() {
        return milkCb.isSelected();
    }

    /**
     * Display the total price of the beverage
     * @param total Beverage total price
     */
    public void displayTotal(double total) {
        totalFd.setText("$" + total);
    }

    /**
     * Display the description of the beverage
     * @param items Items included in the beverage
     */
    public void displayDescription(String items) {
        descriptionTA.setText(items);
    }

}
