import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal 
{
JFrame ventanaPrincipal;
public VentanaPrincipal()
{
ventanaPrincipal = new JFrame();
ventanaPrincipal.setTitle("Programa UNAMBA");
ventanaPrincipal.setSize(800,600);
ventanaPrincipal.getContentPane().setLayout(null);
ventanaPrincipal.getContentPane().setBackground(new Color(249,162,172));
ventanaPrincipal.setLocationRelativeTo(null);


ventanaPrincipal.setVisible(true);
}
}