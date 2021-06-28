import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.metal.MetalBorders.MenuBarBorder;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class FormApp extends JFrame implements ActionListener/*, ItemListener, ChangeListener*/ { /*Esta interfaz solo requiere ActionListener*/
    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
    private JMenuBar mBar1;
    private JMenu mOpciones, mFondo, mCalcular, mAcerca;
    private JMenuItem mIRojo, mIMorado, mINegro, mINuevo, mISalir, mICalculo, mICreador; /*menu2(It1-It3). Estas son las opciones de colores de fondo 2:It4 3:It5*/
    private JTextField campo1, campo2, campo3;
    private JComboBox combo1, combo2;
    private JTextArea area1;
    private JScrollPane scrollpane1;

    Color rojo=new Color(255,0,0); /*¿Hacer públicos los colores?*/
    Color morado=new Color(255,0,200);
    Color blanco=new Color(255,255,255);
    Color negro=new Color(0,0,0);
    Color gris=new Color(224,224,224);

    public FormApp(){
        
        setLayout(null);
        setTitle("Pantalla principal");
        getContentPane().setBackground(rojo);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        /**/
        label1= new JLabel(); 
        label1.setIcon(new ImageIcon(getClass().getResource("/images/coca-cola-blanco.png")));
        label1.setBounds(5,5,250,100);
        add(label1);

        label2=new JLabel("Bienvenido");
        label2.setFont(new Font("Andale Mono",1,16));
        label2.setForeground(blanco);
        label2.setBackground(gris);
        label2.setBounds(300,30,200,30);
        add(label2);

        label3=new JLabel("Datos del trabajador para el cálculo de vacaciones");
        label3.setFont(new Font("Andale Mono",0,14));
        label3.setForeground(blanco);
        label3.setBackground(gris);
        label3.setBounds(30,160,500,35);
        add(label3);
        
        /**/
        label4=new JLabel("Nombre completo");
        label4.setFont(new Font("Andale Mono",0,10));
        label4.setForeground(blanco);
        label4.setBackground(gris);
        label4.setBounds(15,200,75,25);
        add(label4);

        label5=new JLabel("Primer apellido");
        label5.setFont(new Font("Andale Mono",0,10));
        label5.setForeground(blanco);
        label5.setBackground(gris);
        label5.setBounds(15,270,75,25);
        add(label5);

        label6=new JLabel("Segundo apellido");
        label6.setFont(new Font("Andale Mono",0,10));
        label6.setForeground(blanco);
        label6.setBackground(gris);
        label6.setBounds(15,340,75,25);
        add(label6);

        /**/
        label7=new JLabel("Selecciona el Departamento");
        label7.setFont(new Font("Andale Mono",0,10));
        label7.setForeground(blanco);
        label7.setBounds(140,200,100,25);
        add(label7);

        label8=new JLabel("Selecciona la Antiguedad");
        label8.setFont(new Font("Andale Mono",0,10));
        label8.setForeground(blanco);
        label8.setBounds(140,270,100,25);
        add(label8);

        label9=new JLabel("Resultado del Cálculo");
        label9.setFont(new Font("Andale Mono",0,10));
        label9.setForeground(blanco);
        label9.setBounds(140,340,100,25);
        add(label9);

        label10=new JLabel("(C)2017 The Coca-Cola Company | Todos los derechos reservados");
        label10.setFont(new Font("Andale Mono",0,10));
        label10.setForeground(blanco);
        label10.setBounds(60,485,500,25);
        add(label10);

        /**/
        campo1=new JTextField();
        campo1.setBounds(15,230,100,30);
        add(campo1);
        
        campo2=new JTextField();
        campo2.setBounds(15,300,100,30);
        add(campo2);

        campo3=new JTextField();
        campo3.setBounds(15,370,100,30);
        add(campo3);

        /**/
        combo1=new JComboBox();
        combo1.addItem("logística");
        combo1.addItem("técnico");
        combo1.addItem("gerencia");
        combo1.setBounds(140,230,120,30);
        add(combo1);
        /*combo1.addItemListener(this);*/

        combo2=new JComboBox();
        for(int i=0;i<=20;i++){
            combo2.addItem(i);
        }
        combo2.setBounds(140,300,120,30);
        add(combo2);
        /*combo2.addItemListener(this);*/
    
        /**/
        mBar1=new JMenuBar();
        setJMenuBar(mBar1);
        mBar1.setBackground(rojo);
        mBar1.setForeground(blanco);
        add(mBar1);

        mOpciones=new JMenu("Opciones");
        mFondo=new JMenu("Cambiar fondo");
        mCalcular=new JMenu("Calcular");
        mAcerca=new JMenu("Acerca de");
        mOpciones.setFont(new Font("Andale Mono",1,12));
        mOpciones.setForeground(blanco);
        mFondo.setFont(new Font("Andale Mono",1,12));
        mFondo.setForeground(rojo);
        mCalcular.setFont(new Font("Andale Mono",1,12));
        mCalcular.setForeground(blanco);
        mAcerca.setFont(new Font("Andale Mono",1,12));
        mAcerca.setForeground(blanco);

        mBar1.add(mOpciones);
        mOpciones.add(mFondo);
        mBar1.add(mCalcular);
        mBar1.add(mAcerca);

        mIRojo=new JMenuItem("Rojo");
        mIRojo.setFont(new Font("Andale Mono",1,12));
        mIRojo.setForeground(rojo);
        mINegro=new JMenuItem("Negro");
        mINegro.setFont(new Font("Andale Mono",1,12));
        mINegro.setForeground(rojo);
        mIMorado=new JMenuItem("Morado");
        mIMorado.setFont(new Font("Andale Mono",1,12));
        mIMorado.setForeground(rojo);
        mINuevo=new JMenuItem("Nuevo");
        mINuevo.setFont(new Font("Andale Mono",1,12));
        mINuevo.setForeground(rojo);
        mISalir=new JMenuItem("Salir");
        mISalir.setFont(new Font("Andale Mono",1,12));
        mISalir.setForeground(rojo);
        mICalculo=new JMenuItem("Cálculo");
        mICalculo.setFont(new Font("Andale Mono",1,12));
        mICalculo.setForeground(rojo);
        mICreador=new JMenuItem("El creador");
        mICreador.setFont(new Font("Andale Mono",1,12));
        mICreador.setForeground(rojo);

        mFondo.add(mIRojo);
        mFondo.add(mIMorado);
        mFondo.add(mINegro);
        mOpciones.add(mINuevo);
        mOpciones.add(mISalir);
        mCalcular.add(mICalculo);
        mAcerca.add(mICreador);

        mIRojo.addActionListener(this);
        mIMorado.addActionListener(this);
        mINegro.addActionListener(this);
        mINuevo.addActionListener(this);
        mISalir.addActionListener(this);
        mICalculo.addActionListener(this);
        mICreador.addActionListener(this);

        /**/
        area1= new JTextArea("Aquí aparece el resultado del cálculo de vacaciones");
        area1.setFont(new Font("Andale Mono",0,10));
        area1.setForeground(new Color(255,0,0));
        area1.setBackground(new Color(224,224,224));
        scrollpane1=new JScrollPane(area1);
        scrollpane1.setBounds(140,370,220,85);
        add(scrollpane1);
        

    }
    public void actionPerformed(ActionEvent me){
        if(me.getSource()==mIRojo){
            getContentPane().setBackground(rojo);
        }
        if(me.getSource()==mIMorado){
            getContentPane().setBackground(morado);
        }
        if(me.getSource()==mINegro){
            getContentPane().setBackground(negro);
        }
        if(me.getSource()==mINuevo){
            campo1.setText("");
            campo2.setText("");
            campo3.setText("");
            combo1.setSelectedIndex(0);
            combo2.setSelectedIndex(0);
            area1.setText("");

        }
        if(me.getSource()==mISalir){
            System.exit(0);
        }
        if(me.getSource()==mICalculo){
            String nombre=campo1.getText(), apellido1=campo2.getText(), apellido2=campo3.getText();
            String departamento=combo1.getSelectedItem().toString();
            String antiguedadTxt=combo2.getSelectedItem().toString();
            int antiguedad=Integer.parseInt(antiguedadTxt);
            int aDiasVacas=0;
            if(departamento=="logística"){
                if(antiguedad <=1){
                    aDiasVacas=10;
                }else if(antiguedad>1 && antiguedad<=5){
                    aDiasVacas=15;
                }else{
                    aDiasVacas=20;
                }
            }
            if(departamento=="técnico"){
                if(antiguedad <=1){
                    aDiasVacas=15;
                }else if(antiguedad>1 && antiguedad<=5){
                    aDiasVacas=20;
                }else{
                    aDiasVacas=25;
                }
            }
            if(departamento=="gerencia"){
                if(antiguedad <=1){
                    aDiasVacas=20;
                }else if(antiguedad>1 && antiguedad<=5){
                    aDiasVacas=25;
                }else{
                    aDiasVacas=30;
                }
            }
            area1.setText("El trabajador "+nombre+" "+apellido1+" "+apellido2+" que \npertenece al departamento "+departamento+" y tiene "+antiguedad+" años de \nantigüedad, tiene derecho a "+aDiasVacas+" días de vacaciones.");
            /*Crear función o programa para hacer todo esto función(departamento, antiguedad) y return(aVacas)*/
        }
        if(me.getSource()==mICreador){
            JOptionPane.showMessageDialog(null, "El Creador de esta App soy yo");
        }

    }
    /*public void stateChanged(ChangeEvent ce){

    }*/
    public static void main(String args[]){
        FormApp app=new FormApp();
        app.setBounds(0,0,600,600);
        app.setVisible(true);
        app.setLocationRelativeTo(null);
        app.setResizable(false);
    }
}