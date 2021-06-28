import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class FormChcBx extends JFrame implements ChangeListener{
    private JCheckBox cuadro1, cuadro2, cuadro3;
    private JLabel etiqueta1, etiqueta2, etiqueta3;

    public FormChcBx(){
        setLayout(null);

        cuadro1=new JCheckBox();
        cuadro1.setBounds(10,20,20,20);
        cuadro1.addChangeListener(this);
        add(cuadro1);
        cuadro2=new JCheckBox();
        cuadro2.setBounds(10,50,20,20);
        cuadro2.addChangeListener(this);
        add(cuadro2);
        cuadro3=new JCheckBox();
        cuadro3.setBounds(10,80,20,20);
        cuadro3.addChangeListener(this);
        add(cuadro3);
        etiqueta1=new JLabel("Inglés");
        etiqueta1.setBounds(30,20,100,30);
        add(etiqueta1);
        etiqueta2=new JLabel("Francés");
        etiqueta2.setBounds(30,50,100,30);
        add(etiqueta2);
        etiqueta3=new JLabel("Alemán");
        etiqueta3.setBounds(30,80,100,30);
        add(etiqueta3);
    } 
    public void stateChanged(ChangeEvent e){
        String texto="";
        if(cuadro1.isSelected()==true){
            texto+=etiqueta1.getText()+" - ";
        }
        if(cuadro2.isSelected()==true){
            texto+=etiqueta2.getText()+" - ";
        }
        if(cuadro3.isSelected()==true){
            texto+=etiqueta3.getText()+" - ";
        }
        setTitle(texto);
    }
    public static void main(String args[]){
        FormChcBx formulario6=new FormChcBx();
        formulario6.setBounds(0,0,300,200);
        formulario6.setVisible(true);
        formulario6.setLocationRelativeTo(null);
    }
}