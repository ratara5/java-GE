import javax.swing.*;
import java.awt.*; /*Ya que se va a trabajar con colores*/
import java.awt.event.*; /*Ya que se va a trabajar con eventos*/

public class BarraMenu extends JFrame implements ActionListener { /*Para botones y menús se usa la misma clase. Para combobox se use ItemListener*/
    private JMenuBar menuBar; /*Solo se puede crear una*/
    private JMenu menu1; /*JMenu crea una pestaña*/
    private JMenuItem menuItem1, menuItem2, menuItem3; /*Un componente por opción*/

    public BarraMenu(){
        setLayout(null);

        menuBar=new JMenuBar(); /*ASutomáticamente arriba y responsiva*/
        setJMenuBar(menuBar);
        add(menuBar);

        menu1=new JMenu("Opciones");
        menuBar.add(menu1);

        menuItem1=new JMenuItem("Rojo");
        menuItem1.addActionListener(this); /*Va a tener un evento que progarmnaré más adelante*/
        menu1.add(menuItem1);

        menuItem2=new JMenuItem("Verde");
        menuItem2.addActionListener(this); 
        menu1.add(menuItem2);

        menuItem3=new JMenuItem("Azul");
        menuItem3.addActionListener(this);
        menu1.add(menuItem3);
    }
    public void actionPerformed(ActionEvent me){ /* me: menú event*/
        Container contenedor1=this.getContentPane(); /*Contenedor se adapta a las medidas de la interfaz gráfica*/
        if(me.getSource()==menuItem1){
            contenedor1.setBackground(new Color(255,0,0));
        }
        if(me.getSource()==menuItem2){
            contenedor1.setBackground(new Color(0,255,0));
        }
        if(me.getSource()==menuItem3){
            contenedor1.setBackground(new Color(0,0,255));   
        }
        /*no hay que poner else, ya que no hay más eventos programados por nosotros*/
    }
    public static void main(String args[]){
        BarraMenu barramenu1=new BarraMenu();
        barramenu1.setBounds(0,0,400,300);
        barramenu1.setLocationRelativeTo(null);
        barramenu1.setVisible(true);
    }
}