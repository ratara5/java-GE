import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class FormTerms extends JFrame implements ActionListener, ChangeListener{
    private JCheckBox check1;
    private JLabel label1;
    private JButton boton1;

    public FormTerms(){
        setLayout(null);

        check1=new JCheckBox();
        check1.setBounds(20,20,20,20);
        check1.addChangeListener(this);
        add(check1);

        label1=new JLabel("Acepto términos y condiciones");
        label1.setBounds(60,20,200,30);
        add(label1);

        boton1=new JButton("Continuar");
        boton1.setBounds(90,60,100,30);
        boton1.setEnabled(false);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void stateChanged(ChangeEvent ce){
        if(check1.isSelected()==true){
            boton1.setEnabled(true);    
        } else {
            boton1.setEnabled(false);
        }
    }
    public void actionPerformed(ActionEvent be){
        if(be.getSource()==boton1){
            System.exit(0);
        }
    }
    public static void main(String args[]){
        FormTerms formterms1=new FormTerms();
        formterms1.setBounds(0,0,300,150);
        formterms1.setVisible(true);
        formterms1.setLocationRelativeTo(null);
        formterms1.setResizable(false);
    }
}