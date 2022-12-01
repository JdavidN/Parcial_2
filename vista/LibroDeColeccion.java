package vista;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LibroDeColeccion extends JDialog
{

    //----------------------
    //Atributos
    //----------------------
    private JLabel lbTitulo;
    private JLabel lbNombreColeccion;
    private JLabel lbNumeroLibroColeccion;
    private JTextField txNombreColeccion;
    private JTextField txNumeroLibroColeccion;
    private JButton btAceptar;
    
    //-------------------------
    //Métodos
    //-------------------------
        
    //Metodo constructor
    public LibroDeColeccion()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
            
        //Creación y adición del elementos
        lbTitulo = new JLabel("Datos del libro de colección",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 15));
        lbTitulo.setBounds(0,10,500,20);
        add(lbTitulo);
            
        lbNombreColeccion = new JLabel("Nombre de la colección = ",JLabel.LEFT);
        lbNombreColeccion.setFont(new Font("Arial", Font.BOLD, 15));
        lbNombreColeccion.setBounds(10,50,300,20);
        add(lbNombreColeccion);
    
        txNombreColeccion = new JTextField();
        txNombreColeccion.setFont(new Font("Arial", Font.BOLD, 15));
        txNombreColeccion.setBounds(280,50,200,20);
        add(txNombreColeccion);
            
        lbNumeroLibroColeccion = new JLabel("Número del libro en la colección = ",JLabel.LEFT);
        lbNumeroLibroColeccion.setFont(new Font("Arial", Font.BOLD, 15));
        lbNumeroLibroColeccion.setBounds(10,90,300,20);
        add(lbNumeroLibroColeccion);
    
        txNumeroLibroColeccion = new JTextField();
        txNumeroLibroColeccion.setFont(new Font("Arial", Font.BOLD, 15));
        txNumeroLibroColeccion.setBounds(280,90,50,20);
        add(txNumeroLibroColeccion);
    
            
        // Creación de botón aceptar
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 15));
        btAceptar.setBounds(200,120,100,30);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);
                   
        //Caracteristicas de la ventana
        setTitle("Libros de colección");
        setSize(500,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public String getNombreColeccion()
    {
        return txNombreColeccion.getText();
    }

    public String getNumeroLibroColeccion()
    {
        return txNumeroLibroColeccion.getText();
    }
        
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
        
    public void cerrarDialogo()
    {
        this.dispose();
    }
}
