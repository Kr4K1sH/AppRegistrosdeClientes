package entidades;

public abstract class Cliente {
 
 private static int contCliente =1;
 private int numeroCliente;
 private String nombre;
 private String cedula;
 private double montoCompra;
    
    public Cliente(String nombre, String cedula, double montoCompra) {
    this.nombre = nombre;
    this.cedula = cedula;
    this.montoCompra = montoCompra;
    this.numeroCliente = this.contCliente++;
    }
    
    public String toString(){
        String hilera;
        hilera = "nombre : "+this.nombre+"\n"+
            "Cedula: "+this.cedula+"\n"+
            "Monto Compra: "+this.montoCompra+"\n";
                  return hilera;
    }
    //metodo abstracto que debe de ser definido implementado las clases hijas de forma obligatoria
    public abstract double totalPagar();
    
    public static void setContCliente(int contCliente) {
        Cliente.contCliente = contCliente;
    }

    public static int getContCliente() {
        return contCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setMontoCompra(double montoCompra) {
        this.montoCompra = montoCompra;
    }

    public double getMontoCompra() {
        return montoCompra;
    }
}
