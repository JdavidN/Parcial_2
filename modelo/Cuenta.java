package modelo;

public class Cuenta 
{
    protected int numeroCuenta;
    protected int deposito;
    protected double fondosCuenta;

    public Cuenta(int pNumCuenta, int pDeposito)
    {
        this.numeroCuenta = pNumCuenta;
        this.deposito = pDeposito;
    }

    public Cuenta()
    {
        this.fondosCuenta=0;
    }
    public Cuenta(String numeroCuenta2, String deposito2) {
    }

    public int getDeposito() 
    {
        return deposito;
    }

    public void setDeposito(int deposito) 
    {
        this.deposito = deposito;
    }
    public int getNumeroCuenta() 
    {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) 
    {
        this.numeroCuenta = numeroCuenta;
    }

    public double getFondosCuenta() 
    {
     return fondosCuenta;
    }

   public void setFondosCuenta(double fondosCuenta) 
   {
       this.fondosCuenta = fondosCuenta;
   }


   


}