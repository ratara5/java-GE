import javax.swing.*;
import java.awt.event.*; /*darle funcionalidad al botón*/

public class FormulCompleto extends JFrame implements ActionListener{
    private JButton boton1, boton2, boton3;
    private JLabel etiqueta1;

    public FormulCompleto(){
        setLayout(null);
        boton1=new JButton("1");
        boton1.setBounds(10,50,100,30);
        add(boton1);
        boton1.addActionListener(this);

        boton2=new JButton("2");
        boton2.setBounds(120,50,100,30);
        add(boton2);
        boton2.addActionListener(this);

        boton3=new JButton("3");
        boton3.setBounds(230,50,100,30);
        add(boton3);
        boton3.addActionListener(this);

        etiqueta1=new JLabel("En espera...");
        etiqueta1.setBounds(50,100,200,30);
        add(etiqueta1);
    }
    public void actionPerformed(ActionEvent e){ /*e es el espacio en memoria donde se guarda el evento*/
        if(e.getSource()==boton1){ /*Si el evento se originó en el botón 1*/
            etiqueta1.setText("Ha presionado el botón 1");
        }
        if(e.getSource()==boton2){ /*Si el evento se originó en el botón 1*/
            etiqueta1.setText("Ha presionado el botón 2");
        }
        if(e.getSource()==boton3){ /*Si el evento se originó en el botón 1*/
            etiqueta1.setText("Ha presionado el botón 3");
        }
    }
    public static void main(String args[]){
        FormulCompleto formulario3=new FormulCompleto();
        formulario3.setBounds(0,0,400,300);
        formulario3.setLocationRelativeTo(null);
        formulario3.setVisible(true);
        formulario3.setResizable(false);
    }
}