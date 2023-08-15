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

        // ICON
        ImageIcon icon = new ImageIcon("src/img/conversor-logo.png"); //creates a image icon
        this.setIconImage(icon.getImage()); //change icon of frame

        // LABEL HOME
        JLabel labelHome = new JLabel();
        labelHome.setText("Bienvenido/a al conversor Elige el conversor a utilizar ");
        labelHome.setIconTextGap(10);
        labelHome.setFont(new Font("MV Boli", Font.PLAIN, 30));
        labelHome.setVerticalAlignment(JLabel.CENTER);
        labelHome.setHorizontalAlignment(JLabel.CENTER); //set test LEFT, CENTER, RIGHT
        labelHome.setBounds(0, 0, 250, 590);
        this.setLayout(null);

        // LABEL CONVERSOR MONEDAS
        JLabel labelMonedas = new JLabel();
        labelMonedas.setText("OPCION 1");
        labelMonedas.setText("OPCION 2");
        labelMonedas.setBounds(250, 0, 570, 590);
        labelMonedas.setHorizontalAlignment(JLabel.CENTER);

        // IMAGES
        ImageIcon alura_logo = new ImageIcon("src/img/alura-logo.png");
//        labelHome.setIcon(alura_logo);



        // OTHERS
        Border borderGreen = BorderFactory.createLineBorder(Color.green, 3);
        Border borderRed = BorderFactory.createLineBorder(Color.RED, 3);
        labelHome.setBorder(borderGreen);
        labelMonedas.setBorder(borderRed);

        this.setVisible(true); // makes frame visible
        this.add(labelHome);
        this.add(labelMonedas);
    }
}
