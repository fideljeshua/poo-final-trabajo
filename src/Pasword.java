import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Pasword
{
private JFrame ventana01;
private JTextField cajaNombre;
private JLabel etqNombre;
private JLabel etqPasw;
private JPasswordField cajaPass;
private JButton btnOk;
private JButton btnSalir;
int cont =0;

public Pasword()
{
ventana01= new JFrame();
cajaNombre= new JTextField();
etqNombre = new JLabel();
etqPasw = new JLabel();
cajaPass = new JPasswordField();
btnOk =new JButton();
btnSalir =new JButton();
inicializaObjetos();
}
private void inicializaObjetos()
{
//Ventanas
ventana01.setSize(400,300);
ventana01.setTitle("Ventana de identificación");
ventana01.getContentPane().setLayout(null);
ventana01.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
ventana01.getContentPane().setBackground(new Color(252,203,209));
ventana01.setLocationRelativeTo(null);

//Cajas
cajaNombre.setBounds(150,50,100,30);
ventana01.add(cajaNombre);

cajaPass.setBounds(150,100,100,30);
ventana01.add(cajaPass);

// etqNombre
etqNombre.setText("Ingrese su Nombre");
etqNombre.setBounds(10,50,150,30);
ventana01.add(etqNombre);

etqPasw.setText("Ingrese su Codigo");
etqPasw.setBounds(10,100,150,30);
ventana01.add(etqPasw);

//Botones
btnOk.setBounds(150,200,100,30);
btnOk.setText("Ok");
btnOk.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent arg0) {
// TODO Auto-generated method stub
String nombre = cajaNombre.getText();
char pasword[]= cajaPass.getPassword();

if(nombre.equals("Fidel Jeshua") && cont<=3 && cajaPass.getText().equals("192236"))
{
JOptionPane.showMessageDialog(null, "Bienvenido se ha registrado correctamente Fidel Jeshua");
ventana01.dispose();
new Calculadora();
}
else
{
JOptionPane.showMessageDialog(null, "Los datos son incorrectos ");
cajaNombre.setText("");
cajaPass.setText("");
cajaNombre.requestFocusInWindow();
cont++;
if (cont==3)
{
JOptionPane.showMessageDialog(null, "Muchos intentos");
ventana01.dispose();
}
}
}
});
ventana01.add(btnOk);

btnSalir.setBounds(260,200,100,30);
btnSalir.setText("Salir");
btnSalir.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent arg0) {
// TODO Auto-generated method stub
ventana01.dispose(); //para cerrar la venta individual
//System.exit(0);
}
});
ventana01.add(btnSalir);


ventana01.setVisible(true);
}

}


