package app.views;

import javax.swing.*;
import javax.swing.text.BoxView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisasPanel extends JPanel{
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel result;

    public DivisasPanel() {
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setLayout(new GridLayout(3, 3, 10, 10));
        this.add(comboBox1);
        this.add(comboBox2);
        this.add(textField1);
        this.add(textField2);
//        this.add(result);
        this.setVisible(true);
    }
}
