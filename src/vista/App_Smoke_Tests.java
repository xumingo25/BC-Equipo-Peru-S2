package vista;

import modelo.Deportivo;
import modelo.Hombre;
import modelo.Mujer;
import modelo.Producto;

public class App_Smoke_Tests {
    public static void main(String[] args) {
        Producto producto = new Producto("",10,100);

        producto.setCodigo("123ABC");

        Deportivo calzadoDeportivo = new Deportivo(43,"Fin de semana",producto,"Futbol","Lona");
        Hombre calzadoHombre = new Hombre(43,"Semana",producto,"verde");
        Mujer calzadoMujer = new Mujer(34,"Semana",producto,"Gris",12);
        System.out.println("El valor base del calzado deportivo es: $"+calzadoDeportivo.getProducto().getValorBase());
        System.out.println("El valor venta del calzado deportivo es: $"+calzadoDeportivo.valorVenta());
        System.out.println("El impuesto al iva del calzado deportivo es: $"+calzadoDeportivo.impuestoIva());
        System.out.println("El impuesto al material del calzado deportivo es: $"+calzadoDeportivo.impuestoMaterial());
        System.out.println("El valor a pagar del calzado deportivo es: $"+calzadoDeportivo.valorAPagar());
        System.out.println("--------------------------------------------------------------");
        System.out.println("El valor base del calzado formal de mujer es: $"+calzadoMujer.getProducto().getValorBase());
        System.out.println("El valor venta del calzado formal de mujer es: $"+calzadoMujer.valorVenta());
        System.out.println("El impuesto al iva del calzado formal de mujer es: $"+calzadoMujer.impuestoIva());
        System.out.println("El impuesto especifico del calzado formal de mujer es: $"+calzadoMujer.impuestoEspecifico());
        System.out.println("El descuento del calzado formal de mujer es: $"+calzadoMujer.descuento());
        System.out.println("El valor a pagar del formal de mujer es: $"+calzadoMujer.valorAPagar());
        System.out.println("--------------------------------------------------------------");
        System.out.println("El valor base del calzado formal de hombre es: $"+calzadoHombre.getProducto().getValorBase());
        System.out.println("El valor venta del calzado formal de hombre es: $"+calzadoHombre.valorVenta());
        System.out.println("El impuesto al iva del calzado formal de hombre es: $"+calzadoHombre.impuestoIva());
        System.out.println("El impuesto especifico del calzado formal de hombre es: $"+calzadoHombre.impuestoEspecifico());
        System.out.println("El descuento del calzado formal de hombre es: $"+calzadoHombre.descuento());
        System.out.println("El valor a pagar del formal de hombre es: $"+calzadoHombre.valorAPagar());


    }
}
