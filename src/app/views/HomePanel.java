package app.views;

import app.Colors;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.WHITE;

public class HomePanel extends JFrame implements ActionListener {
    private JLabel labelInicial;
    JRadioButton divisasRadioButton;
    JRadioButton tiempoRadioButton;
    JRadioButton longitudRadioButton;
    JRadioButton masaRadioButton;
    JRadioButton temperaturaRadioButton;
    JPanel mainPanel;

    public HomePanel() {
        // SETTINGS
        this.setSize(820, 590); //sets the size
        this.setTitle("Challenge conversor"); // sets the title
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); // doesn't allow to resizable
        this.setLocation(500, 200);
        this.setLayout(null);
//        this.getContentPane().setBackground(Colors.panelColor); //changes the backgorund color
        this.setVisible(true); // makes frame visible

        // PANEL OPTIONS
        JPanel panelOptions = new JPanel();
        panelOptions.setBounds(0, 0, 180, 590);
        panelOptions.setBackground(Colors.panelColor);

        // PANEL CONTENT
        JPanel panelContent = new JPanel();
        panelContent.setBounds(180, 0, 630, 590);
        panelContent.setBackground(Colors.backgroundcolor);

        // IMAGES BUTTONS
//        ImageIcon divisasIcon = new ImageIcon("src/img/divisas.png");
//        ImageIcon tiempoIcon = new ImageIcon("src/img/tiempo.png");
//        ImageIcon longitudIcon = new ImageIcon("src/img/longitud.png");
//        ImageIcon masaIcon = new ImageIcon("src/img/masa.png");
//        ImageIcon temperaturaIcon = new ImageIcon("src/img/temperatura.png");

        // BUTTONS
//        divisasRadioButton = new JRadioButton("Divisas");
//        tiempoRadioButton = new JRadioButton("Tiempo");
//        longitudRadioButton = new JRadioButton("Longitud");
//        masaRadioButton = new JRadioButton("Masa");
//        temperaturaRadioButton = new JRadioButton("Temperatura");

        divisasRadioButton.addActionListener(this);
        tiempoRadioButton.addActionListener(this);
        longitudRadioButton.addActionListener(this);
        masaRadioButton.addActionListener(this);
        temperaturaRadioButton.addActionListener(this);

//        divisasRadioButton.setIcon(divisasIcon);
//        tiempoRadioButton.setIcon(divisasIcon);
//        longitudRadioButton.setIcon(divisasIcon);
//        masaRadioButton.setIcon(divisasIcon);
//        temperaturaRadioButton.setIcon(divisasIcon);

        ButtonGroup group = new ButtonGroup();
        group.add(divisasRadioButton);
        group.add(tiempoRadioButton);
        group.add(longitudRadioButton);
        group.add(masaRadioButton);
        group.add(temperaturaRadioButton);

        // COLORS
        labelInicial.setForeground(WHITE);
        divisasRadioButton.setForeground(WHITE);
        tiempoRadioButton.setForeground(WHITE);
        longitudRadioButton.setForeground(WHITE);
        masaRadioButton.setForeground(WHITE);
        temperaturaRadioButton.setForeground(WHITE);

        // BACKGROUND
        labelInicial.setBackground(null);
        divisasRadioButton.setBackground(null);
        tiempoRadioButton.setBackground(null);
        longitudRadioButton.setBackground(null);
        masaRadioButton.setBackground(null);
        temperaturaRadioButton.setBackground(null);

        // BOUNDS
        this.setLayout(null); // Desactiva el layout manager
        labelInicial.setLocation(10, 10);
        divisasRadioButton.setLocation(10, 50);
        tiempoRadioButton.setLocation(10, 90);
        longitudRadioButton.setLocation(10, 130);
        masaRadioButton.setLocation(10, 170);
        temperaturaRadioButton.setLocation(10, 210);


        // BORDERS
        Border greenBorder = BorderFactory.createLineBorder(Color.green, 3);
        Border redBorder = BorderFactory.createLineBorder(Color.RED, 3);
        panelOptions.setBorder(redBorder);
        panelContent.setBorder(greenBorder);


        // ADDS
        panelOptions.add(labelInicial);
        panelOptions.add(divisasRadioButton);
        panelOptions.add(tiempoRadioButton);
        panelOptions.add(longitudRadioButton);
        panelOptions.add(masaRadioButton);
        panelOptions.add(temperaturaRadioButton);
        this.add(panelOptions);
        this.add(panelContent);

        ImageIcon icon = new ImageIcon("src/img/divisas.png"); //creates a image icon
        this.setIconImage(icon.getImage()); //change icon of frame

    }
        // BUTTONS FUNCTIONS
        public void actionPerformed(ActionEvent event) {
            if(event.getSource()==divisasRadioButton) {
                System.out.println("divisas presionado");
            } else if (event.getSource()==tiempoRadioButton) {
                System.out.println("tiempo presionado");
            } else if (event.getSource()==longitudRadioButton) {
                System.out.println("longitud presionado");
            } else if (event.getSource()==masaRadioButton) {
                System.out.println("masa presionado");
            } else if (event.getSource()==temperaturaRadioButton) {
                System.out.println("temperatura presionado");
            }
        }

}

