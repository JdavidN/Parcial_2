package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Libro;
import modelo.LibroDeColeccion;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Libro model;
    private LibroDeColeccion model2;
    
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal venPrin, Libro model)
    
    {

        this.venPrin = venPrin;
        this.model = model;
        this.venPrin.miPanelResultados.agregarOyentesBotones2(this);
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("MostrarInfo"))
        {
            try 
            {
                
                String nombreLibro = venPrin.miPanelEntradaDatos.getNomLib();
                String nombreAutor = venPrin.miPanelEntradaDatos.getNomAutor();
                String nombreAutores = venPrin.miPanelEntradaDatos.getNomAutores();
                int anioEdicion = Integer.parseInt(venPrin.miPanelEntradaDatos.getAnioEdicion());

                model = new Libro(nombreLibro, nombreAutor, nombreAutores, anioEdicion);
                venPrin.miPanelResultados.mostrarResultado("Información del libro: \nNombre del libro: " + model.getVariable1() + "\nNombre del autor: " + model.getVariable2() + " " + model.getVariable3() + "\nAño de edición: " + model.getVariable4() );
                venPrin.miPanelOperaciones.activarBotones();
            
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
        }

        if(comando.equals("aceptar"))
        {
          //  String nombreColeccion = venPrin.miLibroDeColeccion.getNombreColeccion();
          //  int NumeroLibroColeccion = Integer.parseInt(venPrin.miLibroDeColeccion.getNumeroLibroColeccion());
          //  model2.LibroDeColeccion(nombreColeccion, NumeroLibroColeccion);
          //  venPrin.miPanelResultados.mostrarResultado("Información de la colección: \nNombre de la colección: " + model2.getNombreColeccion() + "\nNúmero del libro en la colección: " + model2.getNumeroLibroColeccion());
          //  venPrin.miLibroDeColeccion.cerrarDialogo();
        }

        if(comando.equals("MostrarInfoLibroColeccion"))
        {   
            venPrin.crearVentanaLibroColeccion();
            this.venPrin.miLibroDeColeccion.agregarOyentesBotones(this);
        }

        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
        }

        if(comando.equals("limpiar"))
        {
            this.venPrin.miPanelResultados.limpiar();
        }

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
}
