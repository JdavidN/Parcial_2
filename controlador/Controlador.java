package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Cuenta;
import modelo.CuentaAhorro;
import modelo.CuentaCorriente;
import modelo.Libreta2022;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Cuenta model;
    
    
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal venPrin, Cuenta model)
    
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
                
                int numeroCuenta = Integer.parseInt(venPrin.miPanelEntradaDatos.getNumCuenta());
                int deposito = Integer.parseInt(venPrin.miPanelEntradaDatos.getDep());
        
               

                model = new Cuenta(numeroCuenta, deposito);
                venPrin.miPanelResultados.mostrarResultado("Información de la cuenta: \nNumero de cuenta: " + model.getNumeroCuenta() + "\nDeposito inicial: " + model.getDeposito() + "\nFondos Totales: " + model.getFondosCuenta() );
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
