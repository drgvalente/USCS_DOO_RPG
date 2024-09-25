package ccomp_aula01;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.Random;

public class CCOMP_Aula01 
{
    
    
    
    public static void SwingScreen()
    {
        // Create a new JFrame
        JFrame frame = new JFrame("My GUI");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set the size of the frame
        //frame.setBackground(Color.BLACK);

        // Create a new JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Set the layout manager

        // Create a text field
        //JTextField textField = new JTextField(20); // 20 columns wide
        JLabel lblHP = new JLabel("100");

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

        // Add the components to the panel
        //panel.add(textField);
        panel.add(lblHP);
        panel.add(btnAttack);
        panel.add(btnDefend);
        panel.add(btnMagic);
        panel.add(btnHeal);
        panel.add(btnHealPotion);
        panel.add(btnManaPotion);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Make the frame visible
        frame.setVisible(true);
        
        btnAttack.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
            // Code to be executed when the button is clicked
            System.out.println("Attack!!");
            }
        });
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
