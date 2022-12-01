package modelo;

public class Empleado {

    //--------------------------
    //Atributos
    //--------------------------
    private static int auxTransporte = 117172;
    private String nomEmpleado;
    private String apeEmpleado;
    private int numHoras;
    private int salario;
    private int fecNacimiento;
    
  
    
    //--------------------------
    //Métodos
    //--------------------------
    
    //Constructor
    public Empleado(String pNomEmpleado, String pApeEmpleado, int pNumHoras,  int pSalario, int pFecNacimiento)
    {

        this.nomEmpleado = pNomEmpleado;
        this.apeEmpleado = pApeEmpleado;
        this.numHoras = pNumHoras;
        this.salario = 0;
        this.fecNacimiento = pFecNacimiento;
    }
    public Empleado(String nomEmpleado2, String apeEmpleado2, int numHoras2, int fecNacimiento2)
    {
        this.nomEmpleado = "";
        this.apeEmpleado = "";
        this.numHoras = 0;  
        this.salario = 0;
        this.fecNacimiento = 0;

    }
    

    public static int getAuxTransporte()
    {
        return auxTransporte;
    }

    public String getNomEmpleado()
    {
        return this.nomEmpleado;
    }
    
    
    public String getApeEmpleado()
    {
        return this.apeEmpleado;
    }
    
    public int getNumHoras()
    {
        return this.numHoras;
    }
    
    public int getSalario()
    {
        return this.salario;
    }

    public int getFechaNacimiento()
    {
        return this.fecNacimiento;
    }
    
    public void setNomEmpleado(String pNomEmpleado)
    {
        this.nomEmpleado = pNomEmpleado;
    }

    public void setApeEmpleado(String pApeEmpleado)
    {
        this.apeEmpleado = pApeEmpleado;
    }
    
    public void setNumHoras(int pNumHoras)
    {
        this.numHoras = pNumHoras;
    }
    
    public void setSalario(int pSalario)
    {
        this.salario = pSalario;
    }

    public void setFechaNacimiento(int FechaNacimiento)
    {
        this.fecNacimiento = FechaNacimiento;
    }
    
    public void pago(int pNumHoras, int pSalario, int auxTransporte)
    {
        if(pNumHoras > 70 )
        {
            setSalario(getSalario()+2300000);
            setNumHoras(getNumHoras());
        }
        else
        {
            setSalario(getSalario()+1700000 + getAuxTransporte());
            setNumHoras(getNumHoras());
        }
    }

    public void edad(int pFecNacimiento)
    {
        setFechaNacimiento(2022 - getFechaNacimiento());
    }
    
    public String toString()
    {
        return "DATOS DEL Empleado: \nNomEmpleado: " + nomEmpleado + "\nApeEmpleado: " + apeEmpleado + "\nNumHoras: " + getNumHoras() + "\nSalario: " +salario + "\nEdad: " + getFechaNacimiento();
    }

}

