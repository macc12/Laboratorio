package Modelo;

/**
 *
 * @author Marco
 */
public class Factura {
    private String infoSuper;
    private Producto[] producto;
    private double subTotal;
    private double costoTotal;
    private int numeroArt;
    private Vendedor vendedor;
    private Cliente cliente;

    public Factura(String infoSuper, Producto[] producto, double subTotal, double costoTotal, int numeroArt, Vendedor vendedor, Cliente cliente) {
        this.infoSuper = infoSuper;
        this.producto = producto;
        this.subTotal = subTotal;
        this.costoTotal = costoTotal;
        this.numeroArt = numeroArt;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    public String getInfoSuper() {
        return infoSuper;
    }

    public void setInfoSuper(String infoSuper) {
        this.infoSuper = infoSuper;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getNumeroArt() {
        return numeroArt;
    }

    public void setNumeroArt(int numeroArt) {
        this.numeroArt = numeroArt;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" + "infoSuper=" + infoSuper + ", producto=" + producto + ", subTotal=" + subTotal + ", costoTotal=" + costoTotal + ", numeroArt=" + numeroArt + ", vendedor=" + vendedor + ", cliente=" + cliente + '}';
    }
    public void imprimirFactura(){
        
    }
}
