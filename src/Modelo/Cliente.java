package Modelo;
/**
 *
 * @author Marco
 */
public class Cliente extends Persona{
    private String direccion;

    public Cliente(String direccion, String nombre, int id) {
        super(nombre, id);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
        

    /*
    * pendiente
    */    
    public void comprar(){
        
    }    
    public void pagar(){
        
    }
}
