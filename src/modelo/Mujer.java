package modelo;

public class Mujer extends Formal {
    private int alturaTaco;

    public Mujer(int numero, String diaVenta, Producto producto, String color, int alturaTaco) {
        super(numero, diaVenta, producto, color);
        this.alturaTaco = alturaTaco;
    }

    public int getAlturaTaco() {
        return alturaTaco;
    }

    public void setAlturaTaco(int alturaTaco) {
        this.alturaTaco = alturaTaco;
    }


    //•	descuento: retornará el valor de descuento que tendrá el calzado, sabiendo que:
    //o	Si la altura del taco es mayor a 10, el descuento será de un 20% del valor venta
    //o	Si el calzado es de hombre y de color es “Rojo” o “Verde el descuento será de un 25%
    @Override
    public int descuento() {
        int descuento = (this.getAlturaTaco()>10) ? Math.round(this.valorVenta()*20/100) : 0;

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
