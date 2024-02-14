package modelo;

public abstract class Formal extends Calzado {
    protected String color;

    public Formal(int numero, String diaVenta, Producto producto, String color) {
        super(numero, diaVenta, producto);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //•	impuestoEspecifico: retornará el valor de impuesto específico el
    // cual es un 7.4% del valor base (el calzado deportivo no paga éste impuesto)
    public int impuestoEspecifico(){
        return (int) Math.round(this.getProducto().getValorBase()*7.4/100);
    }


    public abstract int descuento();
}
