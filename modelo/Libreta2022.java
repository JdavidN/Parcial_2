package modelo;

public class Libreta2022 extends Cuenta
{

    private static double interes=0.8;
    public Libreta2022(int pNumCuenta, int pDeposito)
    {
        super(pNumCuenta, pDeposito);
    }

    

    public String toString()
    {
        return "El numero de cuenta " + numeroCuenta + " tiene un interes del " + interes;
    }

    public void calcularFondos()
    {
        fondosCuenta = deposito + (deposito *interes) ;
    }

    

}
