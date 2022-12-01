package modelo;

public class CuentaCorriente extends Cuenta
{


    public CuentaCorriente(int pNumCuenta, int pDeposito)
    {
        super(pNumCuenta, pDeposito);
    }

    public void calcularFondos()
    {
        fondosCuenta = deposito ;
    }

  
}
