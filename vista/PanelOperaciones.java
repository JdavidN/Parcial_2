package vista;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton btInfoLibro;
    public JButton btInfoLibroColeccion;
    public JButton btBorrar;
    public JButton btSalir;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        btInfoLibro = new JButton("Mostrar info libro");
        btInfoLibro.setFont(new Font("Arial", BOLD, 12));
        btInfoLibro.setBounds(30, 30, 140, 30);
        add(btInfoLibro);
        btInfoLibro.setActionCommand("MostrarInfoLibro");

        btInfoLibroColeccion = new JButton("Mostrar info libro colección");
        btInfoLibroColeccion.setFont(new Font("Arial", BOLD, 12));
        btInfoLibroColeccion.setBounds(200, 30, 200, 30);
        add(btInfoLibroColeccion);
        btInfoLibroColeccion.setActionCommand("MostrarInfoLibroColeccion");


        //Crear y agrear boton Borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setFont(new Font("Arial", BOLD, 12));
        btBorrar.setBounds(430, 30, 80, 30);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        //Crear y agrear boton Salir
        btSalir = new JButton("Salir");
        btSalir.setFont(new Font("Arial", BOLD, 12));
        btSalir.setBounds(540, 30, 70, 30);
        this.add(btSalir);
        btSalir.setActionCommand("salir");
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btInfoLibro.addActionListener(pAL);
        btInfoLibroColeccion.addActionListener(pAL);
        btBorrar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }
    
    public void activarBotones()
    {
        btInfoLibro.setEnabled(true);
        btInfoLibroColeccion.setEnabled(true);
        btBorrar.setEnabled(true);
        btSalir.setEnabled(true);
    }
    
}
