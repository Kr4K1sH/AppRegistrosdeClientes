package entidades;

public class ClienteRegular extends Cliente {
       private TipoPago tipopago;

    public ClienteRegular(String nombre,String cedula, double montoCompra,TipoPago tipopago) {
        super(nombre,cedula,montoCompra);
        this.tipopago = tipopago;
    }
    public double totalPagar(){
        double totalpagar = this.getMontoCompra();
        if(this.tipopago == TipoPago.CONTADO)
            totalpagar -= totalpagar * 0.10;
        //totalpagar = totalpagar *0.9;
        return totalpagar;
    }
    public String toString(){
        return "\nCliente Regular: \n"+super.toString()+"\n forma de pago del cliente: \n "+
            tipopago.toString()+"\nTotal Pagar: "+this.
               totalPagar();
    }


    public void setTipopago(TipoPago tipopago) {
        this.tipopago = tipopago;
    }

    public TipoPago getTipopago() {
        return tipopago;
    }
}
