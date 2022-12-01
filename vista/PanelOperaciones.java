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
    public JButton btInfoCuenta;
    public JButton btRetirar;
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
        btInfoCuenta = new JButton("Mostrar info Cuenta");
        btInfoCuenta.setFont(new Font("Arial", BOLD, 12));
        btInfoCuenta.setBounds(30, 30, 160, 30);
        add(btInfoCuenta);
        btInfoCuenta.setActionCommand("MostrarInfoCuenta");

        btRetirar = new JButton("Retirar");
        btRetirar.setFont(new Font("Arial", BOLD, 12));
        btRetirar.setBounds(200, 30, 80, 30);
        add(btRetirar);
        btRetirar.setActionCommand("Retiros");


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
        btInfoCuenta.addActionListener(pAL);
        btRetirar.addActionListener(pAL);
        btBorrar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }
    
    public void activarBotones()
    {
        btInfoCuenta.setEnabled(true);
        btRetirar.setEnabled(true);
        btBorrar.setEnabled(true);
        btSalir.setEnabled(true);
    }
    
}
