package vista;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.awt.Color;



public class PanelEntradaDatos extends JPanel
{
    //Atributos
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JLabel lbVariable1;
    private JLabel lbVariable2;
    private JLabel lbVAriable3;
    private JLabel lbVariable4;
    private JLabel lbTipoEdicion;
    private JTextField tfVariable1;
    private JTextField tfVariable2;
    private JTextField tfVAriable3;
    private JTextField tfVariable4;
    private JRadioButton rbTipoEdicion;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("descarga.jpeg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,20,250,276);
        add(lbImagen);
        
        //Creación y adición de etiquetas
        lbVariable1 = new JLabel("Dato1: ");
        lbVariable1.setBounds(276,30,250,30);
        add(lbVariable1);
        
        lbVariable2 = new JLabel("Dato2: ");
        lbVariable2.setBounds(276,80,250,30);
        add(lbVariable2);
        
        lbVAriable3 = new JLabel("Dato3: ");
        lbVAriable3.setBounds(276,130,250,30);
        add(lbVAriable3);

        lbVariable4 = new JLabel("Dato4: ");
        lbVariable4.setBounds(276,180,250,30);
        add(lbVariable4);

        lbTipoEdicion = new JLabel("Marca la opción si es una edición de lujo: ");
        lbTipoEdicion.setBounds(276,230,250,30);
        add(lbTipoEdicion);
        
        //Creación y adición de campos de texto
        tfVariable1 = new JTextField();
        tfVariable1.setBounds(526, 30, 120, 30);
        add(tfVariable1);
        
        tfVariable2 = new JTextField();
        tfVariable2.setBounds(526, 80, 120, 30);
        add(tfVariable2);

        tfVAriable3 = new JTextField();
        tfVAriable3.setBounds(526, 130, 120, 30);
        add(tfVAriable3);

        tfVariable4 = new JTextField();
        tfVariable4.setBounds(526, 180, 120, 30);
        add(tfVariable4);

        rbTipoEdicion = new JRadioButton();
        rbTipoEdicion.setBounds(526, 230, 120, 30);
        add(rbTipoEdicion);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNomLib()
    {
        return (String) tfVariable1.getText();
    }

    public String getNomAutor()
    {
        return (String) tfVariable2.getText();
    }

    public String getNomAutores()
    {
        return tfVAriable3.getText();
    }
    
    public String getAnioEdicion()
    {
        return tfVariable4.getText();
    }

    public String getTipoEdicion()
    {
        return rbTipoEdicion.getText();
    }


    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfVariable1.setText("");
        tfVariable2.setText("");
        tfVAriable3.setText("");
        tfVariable4.setText("");
        rbTipoEdicion.setText("");
    }

}
