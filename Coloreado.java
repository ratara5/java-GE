import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Coloreado extends JFrame implements ActionListener{
    private JLabel etiqueta1, etiqueta2, etiqueta3;
    private JComboBox comboR, comboG, comboB;
    private JButton boton1;

    public Coloreado(){
        setLayout(null);

        etiqueta1=new JLabel("Rojo");
        etiqueta1.setBounds(10,10,100,30);
        add(etiqueta1);
        etiqueta2=new JLabel("Verde");
        etiqueta2.setBounds(10,50,100,30);
        add(etiqueta2);
         etiqueta3=new JLabel("Azul");
        etiqueta3.setBounds(10,90,100,30);
        add(etiqueta3);

        comboR=new JComboBox();
        comboR.setBounds(130,10,100,30);
        add(comboR);
        for(int i=0; i<=255; i++){
            comboR.addItem(i);
        }
        comboG=new JComboBox();
        comboG.setBounds(130,50,100,30);
        add(comboG);
        for(int i=0; i<=255; i++){
            comboG.addItem(i);
        }
        comboB=new JComboBox();
        comboB.setBounds(130,90,100,30);
        add(comboB);
        for(int i=0; i<=255; i++){
            comboB.addItem(i);
        }

        boton1=new JButton("Fijar Color");
        boton1.setBounds(120,180,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void ItemStateChanged(ItemEvent ie){

    }
    public void actionPerformed(ActionEvent be){
        if(be.getSource()==boton1){
            
            int valorR=Integer.parseInt(comboR.getSelectedItem().toString()), valorG=Integer.parseInt(comboG.getSelectedItem().toString()), valorB=Integer.parseInt(comboB.getSelectedItem().toString());
            Color color1=new Color(valorR, valorG, valorB);
            boton1.setBackground(color1);
        }
    }
    public static void main(String args[]){
        Coloreado coloreado1=new Coloreado();
        coloreado1.setBounds(0,0,400,300);
        coloreado1.setLocationRelativeTo(null);
        coloreado1.setVisible(true);
        coloreado1.setResizable(false);

    }
}