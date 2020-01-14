package entidades;

public class ClienteFrecuente extends Cliente{
private int puntos;

public ClienteFrecuente(String nombre,String cedula, double montoCompra,int puntos){

super(nombre,cedula,montoCompra);
this.puntos = puntos;
}

    public double totalPagar(){
        double montoRebajar = this.puntos*100;
        if(montoRebajar<this.getMontoCompra()){
            return this.getMontoCompra()-montoRebajar;
        }else{
            return 0;
        }            }

    public String toString(){
        return "\n Cliente Frecuente: \n"+super.toString()+"\nPuntos: "+this.puntos+"\nTotal a Pagar: "+this.totalPagar();
    }


    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }
}
