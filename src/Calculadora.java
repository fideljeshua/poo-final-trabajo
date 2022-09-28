/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ANDERSON
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Calculadora
{
    private JFrame ventana01;
    private JButton numero1;
    private JButton numero2;
    private JButton numero3;
    private JButton numero4; 
     private JButton numero5;
     private JButton numero6;
     private JButton numero7;
     private JButton numero8;
    private JButton numero9;
    private JButton numero0;
    private JButton punto;
    private JButton igual;
    private JButton borrar;
    private JButton dividir;
    private JButton multi;
    private JButton resta;
    private JButton sumar;
    private TextField casilla;
    Double num1;
    Double num2;
    Double resultado;
    String operacion;
     
public Calculadora()
{
    ventana01= new JFrame();
    numero1 = new JButton();
    numero2 = new JButton();
    numero3 = new JButton();
    numero4 = new JButton();
    numero5 = new JButton();
    numero6 = new JButton();
    numero7 = new JButton();
    numero8 = new JButton();
    numero9 = new JButton();
    numero0 = new JButton();
    punto = new JButton();
    igual = new JButton();
    borrar  = new JButton();
    dividir  = new JButton();
    multi = new JButton();
    resta = new JButton();
    sumar = new JButton();
    casilla= new TextField();
    ingresarOBjetos();
    
    
}
public void ingresarOBjetos()
{
    ventana01.setSize(350, 350);
    ventana01.setTitle("Calculadora");
    ventana01.getContentPane().setLayout(null);
   // ventana01.getContentPane().setBackground(new Color(000,000,000));
    ventana01.setLocationRelativeTo(null);
    ventana01.setDefaultCloseOperation(3);
    
    numero1.setText("1");
    numero1.setBounds(50, 160, 50, 30);
    numero1.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
     String numero= casilla.getText()+ numero1.getText();
     casilla.setText(numero);
    }
    });
    ventana01.add(numero1);
    
    numero2.setText("2");
    numero2.setBounds(110, 160, 50, 30);
    numero2.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
      String numero= casilla.getText()+ numero2.getText();
      casilla.setText(numero);
    }
    });
    ventana01.add(numero2);
    
    numero3.setText("3");
    numero3.setBounds(170, 160, 50, 30);
    numero3.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
     String numero= casilla.getText()+ numero3.getText();
     casilla.setText(numero);
    }
    });
    ventana01.add(numero3);
    
    numero4.setText("4");
    numero4.setBounds(50, 120, 50, 30);
    numero4.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
     String numero= casilla.getText()+ numero4.getText();
     casilla.setText(numero);
    }
    });
    ventana01.add(numero4);
    
    numero5.setText("5");
    numero5.setBounds(110, 120, 50, 30);
    numero5.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
     String numero= casilla.getText()+ numero5.getText();
     casilla.setText(numero);
    }
    });
    ventana01.add(numero5);
   
    numero6.setText("6");
    numero6.setBounds(170, 120, 50, 30);
    numero6.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
     String numero= casilla.getText()+ numero6.getText();
     casilla.setText(numero);
    }
    });
    ventana01.add(numero6);
   
    numero7.setText("7");
    numero7.setBounds(50,80, 50, 30);
    numero7.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
     String numero= casilla.getText()+ numero7.getText();
     casilla.setText(numero);
    }
    });
    ventana01.add(numero7);
    
    numero8.setText("8");
    numero8.setBounds(110, 80, 50, 30);
    numero8.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
     String numero= casilla.getText()+ numero8.getText();
     casilla.setText(numero);
    }
    });
    ventana01.add(numero8);
    
    numero9.setText("9");
    numero9.setBounds(170, 80, 50, 30);
    numero9.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
    String numero= casilla.getText()+ numero9.getText();
    casilla.setText(numero);
    }
    });
    ventana01.add(numero9);
    
    numero0.setText("0");
    numero0.setBounds(50, 200, 50, 30);
    numero0.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
    String numero= casilla.getText()+ numero0.getText();
     casilla.setText(numero);
    }
    });
    ventana01.add(numero0);
    
    
    punto.setText(".");
    punto.setBounds(110, 200, 50, 30);
    punto.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
    String numero= casilla.getText()+ punto.getText();
    casilla.setText(numero);
    }
    });
    ventana01.add(punto);
    
    igual.setText("=");
    igual.setBounds(170, 200, 50, 30);
    igual.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    { 
    String Elegir;
    num2= Double.parseDouble(casilla.getText());
    if(operacion== "+")
    {
        resultado= num1+num2;
        Elegir = String.format("%.0f",resultado);
        casilla.setText(Elegir);
    }
    else if(operacion== "-")
    {
        resultado= num1-num2;
        Elegir = String.format("%.0f",resultado);
        casilla.setText(Elegir);
    }
    else if(operacion== "X")
    {
        resultado= num1*num2;
        Elegir = String.format("%.0f",resultado);
        casilla.setText(Elegir);
    }
    else if(operacion== "/")
    {
        resultado= num1/num2;
        Elegir = String.format("%.2f",resultado);
        casilla.setText(Elegir);
    }
    }
    });
    ventana01.add(igual);
    
    borrar.setText("C");
    borrar.setBounds(230, 200, 50, 30);
    borrar.addActionListener(new ActionListener()
    {
    @Override
    public void actionPerformed(ActionEvent arg0)
    {
     String numero= casilla.getText()+ numero1.getText();
     casilla.setText("");
    }
    });
    ventana01.add(borrar);
    
    dividir.setText("/");
    dividir.setBounds(230, 160, 50, 30);
    dividir.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    { 
    num1= Double.parseDouble(casilla.getText());
    casilla.setText("");
    operacion="/";
    }
    });
    ventana01.add(dividir);
    
    multi.setText("X");
    multi.setBounds(230, 120, 50, 30);
    multi.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    { 
    num1= Double.parseDouble(casilla.getText());
    casilla.setText("");
    operacion="X";
    }
    });
    ventana01.add( multi);
    
    resta.setText("-");
    resta.setBounds(230, 80, 50, 30);
    resta.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    { 
    num1= Double.parseDouble(casilla.getText());
    casilla.setText("");
    operacion="-";
    }
    });
    ventana01.add( resta);
    
    sumar.setText("+");
    sumar.setBounds(230,40 , 50, 30);
    sumar.addActionListener(new ActionListener()
    {

    @Override
    public void actionPerformed(ActionEvent arg0)
    { 
    num1= Double.parseDouble(casilla.getText());
    casilla.setText("");
    operacion="+";
    }
    });
    ventana01.add( sumar);
    
    casilla.setBounds(50, 40, 170, 35);
    ventana01.add(casilla);
    
    ventana01.setVisible(true);
}
}



