package Modelo;

/**
 *
 * @author Marco
 */
public class Caja {
    private Vendedor vendedor;
    private int numero;
    private double saldo;

    public Caja(Vendedor vendedor, int numero, double saldo) {
        this.vendedor = vendedor;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Caja{" + "vendedor=" + vendedor + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    /*
    * pendiente
    */
    public void facturar(){
        
    }
}
