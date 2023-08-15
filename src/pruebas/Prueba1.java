package pruebas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prueba1 extends JFrame implements ActionListener {

    Prueba1() {
        this.setSize(820, 590);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(500, 200);


        this.setLayout(null);
        JPanel panel = new JPanel();
        JRadioButton boton = new JRadioButton("boton");
        boton.setLocation(10, 10);
//        boton.addActionListener(this);

        panel.add(boton);
        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Prueba1 prueba1 = new Prueba1();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
