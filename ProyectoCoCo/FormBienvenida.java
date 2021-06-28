import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class FormBienvenida extends JFrame implements ActionListener{
    private JLabel etiquetaImag, etiquetaT, etiqueta1, etiquetaCR;
    private JTextField campo1;
    private JButton boton1;

    public FormBienvenida(){
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        /*ImageIcon imagen=new ImageIcon("images/logo-coca.png");
        etiquetaImag=new JLabel(imagen);
        etiquetaImag.setBounds(25,15,300,150);
        add(etiquetaImag);*//*Estoy usando Net, entonces sirven las siguientes 5 líneas*/

        etiquetaImag = new JLabel(); 
        etiquetaImag.setIcon(new ImageIcon(getClass().getResource("/images/logo-coca.png")));
        etiquetaImag.setBounds(25,15,300,150);
        add(etiquetaImag);

        etiquetaT=new JLabel("Sistema de control vacacional");
        etiquetaT.setBounds(35,135,300,30);
        etiquetaT.setFont(new Font("Andale Mono",3,18));
        etiquetaT.setForeground(new Color(255,255,255));
        add(etiquetaT);

        etiqueta1=new JLabel("Ingrese su nombre:");
        etiqueta1.setBounds(45,212,200,30);
        etiqueta1.setFont(new Font("Andale Mono",1,12));
        etiqueta1.setForeground(new Color(255,255,255));
        add(etiqueta1);

        campo1=new JTextField();
        campo1.setBounds(45,240,255,25);
        campo1.setBackground(new Color(224,224,224));
        campo1.setFont(new Font("Andale Mono",1,14));
        campo1.setForeground(new Color(255,0,0));
        add(campo1);

        boton1=new JButton("Ingresar");
        boton1.setBounds(70,300,100,30);
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono",1,14));
        boton1.setForeground(new Color(255,0,0));
        add(boton1);
        boton1.addActionListener(this);
        
        etiquetaCR=new JLabel("©2017 Coca-Cola Company");
        etiquetaCR.setBounds(85,375,300,30);
        etiquetaCR.setFont(new Font("Andale Mono",1,12));
        etiquetaCR.setForeground(new Color(255,255,255));
        add(etiquetaCR);
    }
    public void actionPerformed(ActionEvent be){
        if(be.getSource()==boton1){
            /*inicialmente vacío*/
        }
    }
    public static void main(String args[]){
        FormBienvenida bienvenida1=new FormBienvenida();
        bienvenida1.setBounds(0,0,350,450);
        bienvenida1.setVisible(true);
        bienvenida1.setResizable(false);
        bienvenida1.setLocationRelativeTo(null);
    }    
}