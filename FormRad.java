import javax.swing.*;
import javax.swing.event.*;
/*import java.awt.event.*;
import java.awt.*;*/

public class FormRad extends JFrame implements ChangeListener{
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup bG;

    public FormRad(){
        setLayout(null);

        bG=new ButtonGroup();

        radio1=new JRadioButton("640x480");
        radio1.setBounds(20,20,100,30);
        add(radio1);
        radio1.addChangeListener(this);
        bG.add(radio1);

        radio2=new JRadioButton("800x600");
        radio2.setBounds(20,50,100,30);
        add(radio2);
        radio2.addChangeListener(this);
        bG.add(radio2);

        radio3=new JRadioButton("1024x768");
        radio3.setBounds(20,80,100,30);
        add(radio3);
        radio3.addChangeListener(this);
        bG.add(radio3);
    }
    public void stateChanged(ChangeEvent e){
        if(radio1.isSelected()==true){
            setSize(640,480);
        }
        if(radio2.isSelected()==true){
            setSize(800,600);
        }
        if(radio3.isSelected()==true){
            setSize(1024,768);
        }

    }
    public static void main(String args[]){
        FormRad formulario7=new FormRad();
        formulario7.setBounds(0,0,400,400);
        /*formulario7.setLocationRelativeTo(null);*/
        formulario7.setVisible(true);
        formulario7.setResizable(false);
    }
}
