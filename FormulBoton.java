import javax.swing.*;
import java.awt.event.*; /*darle funcionalidad al botón*/

public class FormulBoton extends JFrame implements ActionListener{
    JButton boton1;
    public FormulBoton(){
        setLayout(null);
        boton1=new JButton("Cerrar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent unaLetra){ /*unaLetra es el espacio en memoria donde se guarda el evento*/
        if(unaLetra.getSource()==boton1){ /*Si el evento se originó en el botón 1*/
            System.exit(0);
        }
    }
    public static void main(String args[]){
        FormulBoton formulario2=new FormulBoton();
        formulario2.setBounds(0,0,450,350);
        formulario2.setLocationRelativeTo(null);
        formulario2.setResizable(false);
        formulario2.setVisible(true);
    }
} 
