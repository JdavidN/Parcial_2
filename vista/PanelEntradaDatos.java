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
    private JLabel lbNumCuenta;
    private JLabel lbDeposito;
  
    private JLabel lbTipoEdicion;
    private JTextField tfNumCuenta;
    private JTextField tfDeposito;
 
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
        iImagen = new ImageIcon(getClass().getResource("Banco.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,250,276);
        add(lbImagen);
        
        //Creación y adición de etiquetas
        lbNumCuenta = new JLabel("Ingrese Número de Cuenta: ");
        lbNumCuenta.setBounds(280,80,250,30);
        add(lbNumCuenta);
        
        lbDeposito = new JLabel("Ingrese el Deposito Inicial: ");
        lbDeposito.setBounds(280,150,250,30);
        add(lbDeposito);
        

        
        //Creación y adición de campos de texto
        tfNumCuenta = new JTextField();
        tfNumCuenta.setBounds(460, 80, 120, 30);
        add(tfNumCuenta);
        
        tfDeposito = new JTextField();
        tfDeposito.setBounds(460, 150, 120, 30);
        add(tfDeposito);

  

        rbTipoEdicion = new JRadioButton();
        rbTipoEdicion.setBounds(526, 230, 120, 30);
        add(rbTipoEdicion);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto

    public String getNumCuenta()
    {
        return (String) tfNumCuenta.getText();
    }

    public String getDep()
    {
        return (String) tfDeposito.getText();
    }
    


    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNumCuenta.setText("");
        tfDeposito.setText("");
       
        rbTipoEdicion.setText("");
    }

}
