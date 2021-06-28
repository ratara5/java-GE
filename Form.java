import javax.swing.*;
import java.awt.event.*;

public class Form extends JFrame implements ActionListener{
    private JButton boton1;
    private JTextField caja1;
    private JLabel etiqueta1;

    public Form(){
        setLayout(null);
        etiqueta1=new JLabel("Usuario");
        etiqueta1.setBounds(10,20,100,30);
        add(etiqueta1);

        boton1=new JButton("Aceptar");
        boton1.setBounds(10, 50, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

        caja1=new JTextField();
        caja1.setBounds(120,10,100,30);
        add(caja1);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            String texto=caja1.getText(); /*Obtener lo que ingrese el usuario en la caja de texto y llevarlo a una variable*/
            setTitle(texto); /*Modificar el título de la ventana*/
        }
    }
    public static void main(String args[]){
        Form formulario4=new Form();
        formulario4.setBounds(0,0,500,500);
        formulario4.setVisible(true);
        formulario4.setResizable(false);
        formulario4.setLocationRelativeTo(null);
    }
}