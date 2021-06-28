import javax.swing.*;
import java.awt.event.*;

public class InterCalcula extends JFrame implements ActionListener{
    private JLabel etiqueta1, etiqueta2, etiquetaRes;
    private JButton boton1;
    private JTextField campo1, campo2;

    public InterCalcula(){
        setLayout(null);

        etiqueta1=new JLabel("Valor 1");
        etiqueta1.setBounds(10,20,100,30);
        add(etiqueta1);

        etiqueta2=new JLabel("Valor 2");
        etiqueta2.setBounds(10,50,100,30);
        add(etiqueta2);

        etiquetaRes=new JLabel("Resultado: ");
        etiquetaRes.setBounds(120, 80, 100, 30);
        add(etiquetaRes);

        campo1=new JTextField();
        campo1.setBounds(130,20,100,30);
        add(campo1);

        campo2=new JTextField();
        campo2.setBounds(130,50,100,30);
        add(campo2);

        boton1=new JButton("Sumar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            int valor1=0, valor2=0, resultado=0;
            valor1=Integer.parseInt(campo1.getText());
            valor2=Integer.parseInt(campo2.getText());
            resultado=valor1+valor2;
            etiquetaRes.setText("Resultado: "+resultado);
        }
    }
    public static void main(String args[]){
        InterCalcula intercalcula1=new InterCalcula();
        intercalcula1.setBounds(0,0,500,500);
        intercalcula1.setLocationRelativeTo(null);
        intercalcula1.setVisible(true);
        intercalcula1.setResizable(false);
    }
}