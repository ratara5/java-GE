import javax.swing.*;
import java.awt.event.*;

public class ComboCaja extends JFrame implements ItemListener{
    private JComboBox combo1;

    public ComboCaja(){
        setLayout(null)

        combo1=new JComboBox();
        combo1.setBounds(20,20,100,30);
        add(combo1);
        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);


    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==combo1){
            String seleccion=combo1.getSelectedItem().toString();
            setTitle(seleccion);
        }

    }
    public static void main(String args[]){
        ComboCaja comboCaja1=new ComboCaja();
        comboCaja1.setBounds(0,0,300,200);
        comboCaja1.setLocationRelativeTo(null);
        comboCaja1.setVisible(true);
        comboCaja1.setResizable(false);
    }
}