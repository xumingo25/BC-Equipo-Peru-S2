package modelo;

public class Hombre extends Formal{

    public Hombre(int numero, String diaVenta, Producto producto, String color) {
        super(numero, diaVenta, producto, color);
    }

    //•	descuento: retornará el valor de descuento que tendrá el calzado, sabiendo que:
    //o	Si la altura del taco es mayor a 10, el descuento será de un 20% del valor venta
    //o	Si el calzado es de hombre y de color es “Rojo” o “Verde el descuento será de un 25%
    @Override
    public int descuento() {
        int descuento = (this.getColor().equalsIgnoreCase("rojo") ||
                this.getColor().equalsIgnoreCase("verde")) ? Math.round(this.valorVenta()*25/100) : 0;

        return descuento;
    }

    @Override
    public int valorAPagar() {
        int valorAPagar;
        if(this.getProducto().getStock()>0){
            valorAPagar = this.valorVenta() +this.impuestoIva() + this.impuestoEspecifico() - this.descuento();
            return valorAPagar;
        }else{
            System.out.println("Producto sin stock");
            valorAPagar = -1;
            return  valorAPagar;
        }
    }
}
