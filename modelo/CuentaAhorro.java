package modelo;

public class CuentaAhorro extends Cuenta
{
    private static double interes=0.4;
    
    public CuentaAhorro(int pNumCuenta, int pDeposito)
    {
        super(pNumCuenta, pDeposito);
    }

    public String toString()
    {
        return "El numero de cuenta " + numeroCuenta + " tiene un interes del " + interes  ;
    }

    public void calcularFondos()
    {
        fondosCuenta = deposito + (deposito *interes) ;
    }

    public void retirar()
    {
        
    }
}
