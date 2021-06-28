/*JDK: Java Development kit*/
import javax.swing.*;

public class Formulario extends JFrame{ /*heredar de la clase JFrame*/
    private JLabel etiqueta1; /* variable tipo Jlabel (int, var son otros ejemplos de tipo) private ya q solo se van a usar en la interfaz q se programa en el presente código*//*private o public se llaman modificadores de acceso*/
    private JLabel etiqueta2;

    public Formulario(){ /*Constructor. Debe llamarse igual q la clase*/
    setLayout(null); /*indica a través de coordenadas dónde colocar interfaz. Pa evitar q el método la coloque donde quiera, ponemos null*/
    etiqueta1=new JLabel("Interfaz por Raymond"); /*hace lo mismo que un System*/
    etiqueta1.setBounds(10,20,200,300); /*Colocar coordenadas y dimensiones de la etiqueta*/
    add(etiqueta1);
    etiqueta2=new JLabel("Versión 1.0.0.5");
    etiqueta2.setBounds(10,50,200,300);
    add(etiqueta2);
    }
    public static void main(String args[]){ /*Arrancar programa (clase?)*/
        Formulario formulario1=new Formulario(); /*Instanciar ?Se crea el objeto formulario1 de la clase Formulario*/
        formulario1.setBounds(0,0,800,400); /*Dónde aparecer formulario1 dentro de la pantalla y dimensiones*/
        formulario1.setVisible(true); /*Interfaz se va a ver o se va a esconder*/
        formulario1.setLocationRelativeTo(null); /***Pa q' interfaz siempre aparezca en el centro de la pantalla sin importar coordenadas de setBounds*/
        formulario1.setResizable(false); /*bloquea la modificación de medidas del formulario*/
    }
}