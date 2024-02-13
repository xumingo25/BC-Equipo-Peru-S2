package modelo;

public class Formal extends Calzado {
    protected String color;

    public Formal(int numero, String diaVenta, Producto producto) {
        super(numero, diaVenta, producto);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
