import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class FormTyC extends JFrame implements ActionListener, ChangeListener{
    private JLabel label1, label2, label3;
    private JTextArea area1;
    private JScrollPane scrollpane1;
    private JCheckBox cbox1;
    private JButton boton1, boton2;

    public FormTyC(){
        setLayout(null);
        setTitle("Licencia de uso");
        /*getContentPane().setBackground(new Color(255,0,0));*/
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        label1=new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono",1,14));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        label2=new JLabel("Yo Acepto");
        label2.setFont(new Font("Andale Mono",1,12));
        label2.setBounds(30,245,300,30);
        add(label2);

        label3 = new JLabel(); 
        label3.setIcon(new ImageIcon(getClass().getResource("/images/coca-cola.png")));
        label3.setBounds(315,135,300,300);
        add(label3);

        area1=new JTextArea("TÉRMINOS Y CONDICIONES\n\nA. PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE...\nB. PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE...\nC. ...NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFT...\n\nLOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFT.\n\nSI ESTÁ DE ACUERDO VERIFIQUE Yo Acepto Y HAGA CLIC EN Continuar.\n\nPARA MAYOR INFORMACIÓN, VISITE...");
        area1.setFont(new Font("Andale Mono",0,9));
        area1.setEditable(false);
        scrollpane1=new JScrollPane(area1);
        scrollpane1.setBounds(10,40,575,200);
        add(scrollpane1);

        cbox1=new JCheckBox();
        cbox1.setBounds(10,250,20,20);
        cbox1.addChangeListener(this);
        add(cbox1);

        boton1=new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.setFont(new Font("Andale Mono",1,12));
        boton1.setEnabled(false);
        boton1.addActionListener(this);
        add(boton1);

        boton2=new JButton("No Acepto");
        boton2.setBounds(120,290,100,30);
        boton2.setFont(new Font("Andale Mono",1,12));
        boton2.addActionListener(this);
        add(boton2);
    }
    public void actionPerformed(ActionEvent be){
        if(be.getSource()==boton1){
            /*inicialmente sin nada*/
        }
        if(be.getSource()==boton2){
            System.exit(0); /*no funciona*/
        }
    }
    public void stateChanged(ChangeEvent ce){
        if(cbox1.isSelected()==true){
            boton1.setEnabled(true);
        } else {
            boton1.setEnabled(false);
        }
    }
    public static void main(String args[]){
        FormTyC termycond=new  FormTyC();
        termycond.setBounds(0,0,600,360);
        termycond.setLocationRelativeTo(null);
        termycond.setVisible(true);
        termycond.setResizable(false);
    }  
}
