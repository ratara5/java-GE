import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormBarMen extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu menu1, menuInf1, menuInf2;
    private JMenuItem menuItem1, menuItem2, menuItemR, menuItemG, menuItemB;

    public FormBarMen(){
        setLayout(null);

        menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        add(menuBar);

        menu1=new JMenu("Opciones");
        menuBar.add(menu1);

        menuInf1=new JMenu("Tamaño de la ventana");
        menu1.add(menuInf1);
        
        menuInf2=new JMenu("Color de fondo");
        menu1.add(menuInf2);

        menuItem1=new JMenuItem("300x200");
        menuInf1.add(menuItem1);
        menuItem1.addActionListener(this);

        menuItem2=new JMenuItem("640x480");
        menuInf1.add(menuItem2);
        menuItem2.addActionListener(this);

        menuItemR= new JMenuItem("Rojo");
        menuInf2.add(menuItemR);
        menuItemR.addActionListener(this);

        menuItemG=new JMenuItem("Verde");
        menuInf2.add(menuItemG);
        menuItemG.addActionListener(this);

        menuItemB=new JMenuItem("Azul");
        menuInf2.add(menuItemB);
        menuItemB.addActionListener(this);
    }
    public void actionPerformed(ActionEvent me){
        
        if(me.getSource()==menuItem1){
            setSize(300,200);
        }
        if(me.getSource()==menuItem2){
            setSize(640,480);
        }
        if(me.getSource()==menuItemR){
            getContentPane().setBackground(new Color(255,0,0));
        } 
        if(me.getSource()==menuItemG){
            getContentPane().setBackground(new Color(0,255,0));       
        }
        if(me.getSource()==menuItemB){
            getContentPane().setBackground(new Color(0,0,255));
        }
    }
    public static void main(String args[]){
        FormBarMen formbarmen1=new FormBarMen();
        formbarmen1.setBounds(0,0,500,300);
        formbarmen1.setVisible(true);
        formbarmen1.setLocationRelativeTo(null);
    }
}