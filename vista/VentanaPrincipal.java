package vista;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public LibroDeColeccion miLibroDeColeccion;


    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);   
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,660,280);
        add(miPanelEntradaDatos);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,290,660,80);
        add(miPanelOperaciones);
        
        //Creación y adición del PanelOperaciones
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,370,660,280);
        add(miPanelResultados);
        
        //Caracteristicas de la ventana
        setTitle("Biblioteca");
        setSize(700,700);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    //Crear ventana Libro de colección
    public void crearVentanaLibroColeccion()
    {
        miLibroDeColeccion = new LibroDeColeccion();
    }
    
}
