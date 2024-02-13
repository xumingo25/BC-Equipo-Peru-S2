package modelo;

public class Calzado {
    /*
    *
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
}
