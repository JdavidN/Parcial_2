package modelo;

public class Libro
{
    //Atributos
    protected String variable1;
    protected String variable2;
    protected String variable3;
    protected int variable4;
  

    //Métodos
    //Constructor nulo
    public Libro()
    {
    }
    
    //Contructor en parámetro
    public Libro(String pVariable1, String pVariable2, String pVariable3, int pVariable4)
    {
        this.variable1 = pVariable1;
        this.variable2 = pVariable2;
        this.variable3 = pVariable3;
        this.variable4 = pVariable4;
        
    }

    public String getVariable1() 
    {
        return variable1;
    }

    public String getVariable2() 
    {
        return variable2;
    }

    public String getVariable3() 
    {
        return variable3;
    }
    
    public int getVariable4() 
    {
        return variable4;
    }

    public void setVariable1(String variable1) 
    {
        this.variable1 = variable1;
    }

    public void setVariable2(String variable2) 
    {
        this.variable2 = variable2;
    }

    public void setVariable3(String variable3) 
    {
        this.variable3 = variable3;
    }

    public void setVariable4(int variable4)
    {
        this.variable4 = variable4;
    }

    //Métodos de acceso



    

}
