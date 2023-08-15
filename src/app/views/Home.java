package app.views;

import app.Colors;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Home extends JFrame {
    public Home() {
        // FRAME SETTINGS
        // JFrame frame = new JFrame(); // creates a frame
        this.setSize(820, 590); //sets the size
        this.setTitle("Challenge conversor"); // sets the title
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); // doesn't allow to resizable
        this.setLocation(500, 200);
        this.getContentPane().setBackground(Colors.backgroundcolor); //changes the backgorund color
        this.setLayout(null);

        // ICON
        ImageIcon icon = new ImageIcon("src/img/divisas.png"); //creates a image icon
        this.setIconImage(icon.getImage()); //change icon of frame

        // PANEL HOME
        JPanel panelHome = new JPanel();
        panelHome.setBackground(Colors.panelColor);
        panelHome.setBounds(0, 0, 820, 590);

        // LABELS
        JLabel labelInicial = new JLabel();
//        labelInicial.setIconTextGap(10);
        labelInicial.setText("Elige el conversor a utilizar");
        labelInicial.setFont(new Font("Courier Bold" , Font.CENTER_BASELINE, 15));
        labelInicial.setVerticalAlignment(JLabel.TOP);
        labelInicial.setHorizontalAlignment(JLabel.CENTER); //set test LEFT, CENTER, RIGHT
        labelInicial.setBounds(0, 0, 250, 590);
        labelInicial.setForeground(Color.WHITE);


        // LABEL
        JLabel labelMonedas = new JLabel();
        labelMonedas.setText("OPCION 1"); labelMonedas.setText("OPCION 2");
        labelMonedas.setBounds(250, 0, 570, 590);
        labelMonedas.setHorizontalAlignment(JLabel.CENTER);


        // IMAGES
        ImageIcon alura_logo = new ImageIcon("src/img/alura-logo.png");
//        labelInicial.setIcon(alura_logo);


        // OTHERS
        Border borderGreen = BorderFactory.createLineBorder(Color.green, 3);
        Border borderRed = BorderFactory.createLineBorder(Color.RED, 3);
        labelInicial.setBorder(borderGreen);
        labelMonedas.setBorder(borderRed);

        this.setVisible(true); // makes frame visible
        this.add(labelInicial);
        this.add(labelMonedas);
        this.add(panelHome);
    }
}
