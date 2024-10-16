package ccomp_aula01;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Timer;
import java.util.TimerTask;

import java.util.Random;

public class CCOMP_Aula01 
{
    static int mana = 50;
    static long lastUpdate;
    static JProgressBar manaBar;
    static JLabel manaLabel;
    
    
    public static void SwingScreen()
    {
        // Create a new JFrame
        JFrame frame = new JFrame("My GUI");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500); // Set the size of the frame
        //frame.setBackground(Color.BLACK);
        
        // Create a new JPanel
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout()); // Set the layout manager
        
        // Crie as barras de vida e mana
        JProgressBar hpBar = new JProgressBar(0, 100);
        hpBar.setForeground(Color.RED);
        hpBar.setPreferredSize(new Dimension(200, 20));

        manaBar = new JProgressBar(0, 100);
        manaBar.setForeground(Color.BLUE);
        manaBar.setPreferredSize(new Dimension(200, 20));
        manaBar.setValue(mana);

        // Adicione as barras de vida e mana ao JPanel
        topPanel.add(hpBar);
        topPanel.add(manaBar);
        
        // Create a attackPanel for the top line
        JPanel hpPanel = new JPanel();
        hpPanel.setLayout(new FlowLayout());
        
        JLabel lifeLabel = new JLabel("Life: 100/100");
        manaLabel = new JLabel("Mana: 50/50");

        hpPanel.add(lifeLabel);
        hpPanel.add(manaLabel);
        
        // Create a attackPanel for the bottom line
        JPanel potPanel = new JPanel();
        potPanel.setLayout(new FlowLayout());

        // Create labels for HP and mana potions
        JLabel hpPotionsLabel = new JLabel("HP Potions: 5");
        JLabel manaPotionsLabel = new JLabel("Mana Potions: 3");

        potPanel.add(hpPotionsLabel);
        potPanel.add(manaPotionsLabel);

        
        
        // Create a new JPanel
        JPanel attackPanel = new JPanel();
        attackPanel.setLayout(new FlowLayout()); // Set the layout manager
        
        // Create a new JPanel
        JPanel magicPanel = new JPanel();
        attackPanel.setLayout(new FlowLayout()); // Set the layout manager
        
        // Create a new JPanel
        JPanel usePotPanel = new JPanel();
        attackPanel.setLayout(new FlowLayout()); // Set the layout manager

        // Create a text field
        //JTextField textField = new JTextField(20); // 20 columns wide

        // Create a button
        JButton btnAttack = new JButton("Attack");
        btnAttack.setBackground(Color.RED);
        btnAttack.setPreferredSize(new Dimension(100, 30));
        //btnAttack.setBounds(10, 20, 100, 30);
        JButton btnDefend = new JButton("Defend");
        btnDefend.setBackground(Color.GREEN);
        btnDefend.setPreferredSize(new Dimension(100, 30));
        JButton btnMagic = new JButton("Use Magic");
        btnMagic.setBackground(Color.ORANGE);
        btnMagic.setPreferredSize(new Dimension(100, 30));
        JButton btnHeal = new JButton("Heal");
        btnHeal.setBackground(Color.GREEN);
        btnHeal.setPreferredSize(new Dimension(100, 30));
        JButton btnHealPotion = new JButton("Heal Pot");
        btnHealPotion.setBackground(Color.GREEN);
        btnHealPotion.setPreferredSize(new Dimension(100, 30));
        JButton btnManaPotion = new JButton("Mana Pot");
        btnManaPotion.setBackground(Color.BLUE);
        btnManaPotion.setPreferredSize(new Dimension(100, 30));

        // Add the components to the attackPanel
        //panel.add(textField);
        attackPanel.add(btnAttack);
        attackPanel.add(btnDefend);
        magicPanel.add(btnMagic);
        magicPanel.add(btnHeal);
        usePotPanel.add(btnHealPotion);
        usePotPanel.add(btnManaPotion);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        mainPanel.add(topPanel);
        mainPanel.add(hpPanel);
        mainPanel.add(potPanel);
        mainPanel.add(attackPanel);
        mainPanel.add(magicPanel);
        mainPanel.add(usePotPanel);
            
        frame.getContentPane().add(mainPanel);

        // Make the frame visible
        frame.pack();
        frame.setVisible(true);
        
        btnAttack.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
            // Code to be executed when the button is clicked
            System.out.println("Attack!!");
            }
        });
        
        btnMagic.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
            // Code to be executed when the button is clicked
                mana -= 10;
                manaBar.setValue(2*mana);
                manaLabel.setText("Mana: " + mana + "/50");
            }
        });
        
    }
    
    private static void updateGame(long deltaTime) {
        mana += 1;
        manaBar.setValue(2*mana);
        manaLabel.setText("Mana: " + mana + "/50");
        System.out.println(deltaTime);
    }
    
    public static void main(String[] args) 
    {   
        /*
        Faça um jogo simples com uma classe "Warrior" ou "Mage" ou "Archer".
        crie dois objetos do tipo adequado e simule um combate
        DICA:
        */
        Random rnd = new Random();
        float numeroAleatorio = rnd.nextFloat(); // Número aleatório entre 0 e 99
        System.out.println(numeroAleatorio);
 
        Scanner scan = new Scanner(System.in);

        SwingScreen();
        
        lastUpdate = System.currentTimeMillis();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                long currentUpdate = System.currentTimeMillis();
                long deltaTime = currentUpdate - lastUpdate;
                lastUpdate = currentUpdate;
                updateGame(deltaTime);
            }
        }, 0, 1000); // Executa a cada 1 segundo
        
        
        
        /*
        crie uma CLASSE que peça ao usuário três números:
        (a  b  c) e calcule as raízes de uma equação
        de segundo grau utilizando Bhaskara
        delta = b*b-4*a*c
        x1 = (-b + Math.sqrt(delta))/2*a
        x2 = (-b - Math.sqrt(delta))/2*a
        */
        
        //Bhaskara.CalcularBhaskara(1, 0, 0);
        
        /*
        Faça um programa que peça um número inteiro 
        ao usuário e diga se esse número é par ou ímpar 
        */
/*
        System.out.print("Digite um número inteiro: ");
        int num = scan.nextInt();
        if (num%2 == 0)
            System.out.println("o número " + num + " é par");
        else
            System.out.println("o número " + num + " é par");;
*/        
        /*
        Faça um programa que calcule a média final
        de um aluno e diga se está aprovado (>=6)  
        ou reprovado (<6)
        */
/*        
        System.out.print("Digite a nota 1: ");
        float n1 = scan.nextFloat();
        System.out.print("Digite a nota 2: ");
        float n2 = scan.nextFloat();
        
        float media = (n1+n2)/2;
        if (media >= 6)
            System.out.println("UHUUUUU :-)");
        else
            System.out.println("Reprovou :-(");
        
*/
    }   
}
