package modelo;

public abstract class Calzado extends Object {
    /*
    * número (medida del calzado)
	día de venta  (“semana” o “fin de semana”)
	Producto {"ABC123",10,200}
    * */
    protected int numero;
    protected String diaVenta;
    protected Producto producto;



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDiaVenta() {
        return diaVenta;
    }

    public void setDiaVenta(String diaVenta) {
        this.diaVenta = diaVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Calzado(int numero, String diaVenta, Producto producto) {
        this.numero = numero;
        this.diaVenta = diaVenta;
        this.producto = producto;
    }

    public Calzado() {

    }

    //•	valorVenta: retornará el valor de venta del calzado, sabiendo
    // que el fin de semana, aumenta en un 24% el valor Base y en la
    // semana el valor Base disminuye en un 15%.
    public int valorVenta(){
        int valorVenta = 0;

        if(this.getDiaVenta().equalsIgnoreCase("Semana")){ //-15%
            valorVenta = this.getProducto().getValorBase() - Math.round(this.getProducto().getValorBase()*15/100);
        }else if(this.getDiaVenta().equalsIgnoreCase("Fin de semana")){
            //+24%
            valorVenta = this.getProducto().getValorBase() + Math.round(this.getProducto().getValorBase()*24/100);
        }
        return valorVenta;
    }

    //•	impuestoIva: retornará el valor por concepto de IVA que es el 19% del valor venta
    public int impuestoIva(){
        return Math.round(this.valorVenta()*19/100);
    }

    public abstract int valorAPagar();
}
