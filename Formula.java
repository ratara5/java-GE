import javax.swing.*;
import java.awt.event.*;

public class Formula extends JFrame implements ActionListener{
    private JButton boton1;    
    private JTextField campoTexto1;
    private JTextArea areaTexto1;
    private JScrollPane scrollPanel1;

    String texto="";

    public Formula(){
        setLayout(null);

        boton1=new JButton("Agregar");
        boton1.setBounds(250,10,100,30);
        add(boton1);
        boton1.addActionListener(this);
        campoTexto1=new JTextField();
        campoTexto1.setBounds(10,10,200,30);
        add(campoTexto1);

        areaTexto1=new JTextArea();
        scrollPanel1=new JScrollPane(areaTexto1);
        scrollPanel1.setBounds(10,50,400,300);
        add(scrollPanel1);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            texto += campoTexto1.getText()+"\n";
            areaTexto1.setText(texto);
            campoTexto1.setText("");
            
        }
    }
    public static void main(String args[]){
        Formula formulario5=new Formula();
        formulario5.setBounds(0,0,500,500);
        formulario5.setVisible(true);
        formulario5.setResizable(false);
        formulario5.setLocationRelativeTo(null);
    }
}