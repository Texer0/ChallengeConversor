package app.views;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends JFrame implements ActionListener {
    private DivisasPanel divisasPanel;
    private JRadioButton divisasRadioButton;
    private JRadioButton tiempoRadioButton;
    private JRadioButton longitudRadioButton;
    private JRadioButton masaRadioButton;
    private JRadioButton temperaturaRadioButton;
    private JPanel mainPanel;
    public Image fondo;
    protected JPanel panelOption;
    protected JPanel panelContent;
    protected final int WIDTH = 820;
    protected final int HEIGHT = 590;


    public HomePanel() {

        // SETTINGS
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("Challenge conversor");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //exit out of application
        this.setLocation(500, 200);

        // LOGO
        ImageIcon icon = new ImageIcon("src/img/divisas.png");
        this.setIconImage(icon.getImage());

        // BACKGROUND
        fondo = new ImageIcon("src/img/fondo.png").getImage();

        // MAINPANEL
        mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
            }
        };
        mainPanel.setBounds(0, 0, getWidth(), getHeight());
        JLabel labelFondo = new JLabel();
        labelFondo.setSize(WIDTH, HEIGHT);

        // PANEL OPTIONS
        panelOption = new JPanel();
//        panelOptions.setBackground(Color.RED);
        panelOption.setPreferredSize(new Dimension(WIDTH, 100));
        panelOption.setOpaque(false);

        // PANEL CONTENT
        panelContent = new JPanel();
        panelContent.setPreferredSize(new Dimension(WIDTH, HEIGHT-100));
        panelContent.setBackground(null);
        panelContent.setOpaque(false);

//        panelContent.setBackground(Color.GREEN);

        // BUTTONS
        divisasRadioButton.addActionListener(this);
        tiempoRadioButton.addActionListener(this);
        longitudRadioButton.addActionListener(this);
        masaRadioButton.addActionListener(this);
        temperaturaRadioButton.addActionListener(this);

        ImageIcon divisasIcon = new ImageIcon("src/img/monedas 1.png");
        ImageIcon tiempoIcon = new ImageIcon("src/img/tiempo 1.png");
        ImageIcon longitudIcon = new ImageIcon("src/img/longitud 1.png");
        ImageIcon masaIcon = new ImageIcon("src/img/masa 2.png");
        ImageIcon temperaturaIcon = new ImageIcon("src/img/temperatura 1.png");

        divisasRadioButton.setIcon(divisasIcon);
        tiempoRadioButton.setIcon(tiempoIcon);
        longitudRadioButton.setIcon(longitudIcon);
        masaRadioButton.setIcon(masaIcon);
        temperaturaRadioButton.setIcon(temperaturaIcon);

        ButtonGroup group = new ButtonGroup();
        group.add(divisasRadioButton);
        group.add(tiempoRadioButton);
        group.add(longitudRadioButton);
        group.add(masaRadioButton);
        group.add(temperaturaRadioButton);

        // BACKGROUNDS
        divisasRadioButton.setBackground(null);
        tiempoRadioButton.setBackground(null);
        longitudRadioButton.setBackground(null);
        masaRadioButton.setBackground(null);
        temperaturaRadioButton.setBackground(null);

        divisasRadioButton.setOpaque(false);
        tiempoRadioButton.setOpaque(false);
        longitudRadioButton.setOpaque(false);
        masaRadioButton.setOpaque(false);
        temperaturaRadioButton.setOpaque(false);

        // BORDERS
        Border greenBorder = BorderFactory.createLineBorder(Color.green, 3);
        Border redBorder = BorderFactory.createLineBorder(Color.RED, 3);
        panelOption.setBorder(redBorder);
        panelContent.setBorder(greenBorder);

        // ADDS
        panelOption.add(divisasRadioButton);
        panelOption.add(tiempoRadioButton);
        panelOption.add(longitudRadioButton);
        panelOption.add(masaRadioButton);
        panelOption.add(temperaturaRadioButton);
        mainPanel.add(panelOption, BorderLayout.NORTH);
        mainPanel.add(panelContent, BorderLayout.CENTER);
        this.add(mainPanel);
        this.setVisible(true);
    }

        // BUTTONS FUNCTIONS
        public void actionPerformed(ActionEvent event) {
            if(event.getSource()==divisasRadioButton) {
                System.out.println("divisa presionada");
                mainPanel.remove(panelContent);
                divisasPanel = new DivisasPanel();
                mainPanel.add(divisasPanel, BorderLayout.CENTER);
                revalidate();
                actionButtons(0);
            } else if (event.getSource()==tiempoRadioButton) {
                System.out.println("tiempo presionado");
                actionButtons(1);
            } else if (event.getSource()==longitudRadioButton) {
                System.out.println("longitud presionada");
                actionButtons(2);
            } else if (event.getSource()==masaRadioButton) {
                System.out.println("masa presionada");
                actionButtons(3);
            } else if (event.getSource()==temperaturaRadioButton) {
                System.out.println("temperatura presionada");
                actionButtons(4);
            }
        }
        public void actionButtons(int N) {
            if (N==0) {
            divisasRadioButton.setEnabled(false);
            tiempoRadioButton.setEnabled(true);
            longitudRadioButton.setEnabled(true);
            masaRadioButton.setEnabled(true);
            temperaturaRadioButton.setEnabled(true);
            } else if (N==1) {
                divisasRadioButton.setEnabled(true);
                tiempoRadioButton.setEnabled(false);
                longitudRadioButton.setEnabled(true);
                masaRadioButton.setEnabled(true);
                temperaturaRadioButton.setEnabled(true);
            } else if (N==2) {
                divisasRadioButton.setEnabled(true);
                tiempoRadioButton.setEnabled(true);
                longitudRadioButton.setEnabled(false);
                masaRadioButton.setEnabled(true);
                temperaturaRadioButton.setEnabled(true);
            } else if (N==3) {
                divisasRadioButton.setEnabled(true);
                tiempoRadioButton.setEnabled(true);
                longitudRadioButton.setEnabled(true);
                masaRadioButton.setEnabled(false);
                temperaturaRadioButton.setEnabled(true);
            } else if (N==4) {
                divisasRadioButton.setEnabled(true);
                tiempoRadioButton.setEnabled(true);
                longitudRadioButton.setEnabled(true);
                masaRadioButton.setEnabled(true);
                temperaturaRadioButton.setEnabled(false);
            }
        }
}

