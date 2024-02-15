package vista;

import controlador.TiendaCalzado;
import modelo.Deportivo;
import modelo.Hombre;
import modelo.Mujer;
import modelo.Producto;

import java.util.ArrayList;

public class App_Smoke_Tests {
    public static void main(String[] args) {
        Producto producto = new Producto("123ABC",0,640);
        Producto producto2 = new Producto("123ABC1",10,100);
        Producto producto3 = new Producto("123ABC2",0,1000);
        Producto producto4 = new Producto("123ABC21",0,100);

        Deportivo calzadoDeportivo = new Deportivo(43,"Fin de semana",producto,"Futbol","Lona");
        Hombre calzadoHombre = new Hombre(43,"Semana",producto2,"verde");
        Mujer calzadoMujer = new Mujer(34,"Semana",producto3,"Gris",12);
        Mujer calzadoMujer2 = new Mujer(34,"fin de semana",producto4,"Gris",12);

        TiendaCalzado tienda = new TiendaCalzado(new ArrayList<>());

        System.out.println("La cantidad de calzados es: "+ tienda.getTienda().size());

        tienda.ingresarCalzadoDeportivo(calzadoDeportivo);

        System.out.println("La cantidad de calzados es: "+ tienda.getTienda().size());

        tienda.ingresarCalzadoHombre(calzadoHombre);

        System.out.println("La cantidad de calzados es: "+ tienda.getTienda().size());

        tienda.ingresarCalzadoMujer(calzadoMujer);

        System.out.println("La cantidad de calzados es: "+ tienda.getTienda().size());

        tienda.ingresarCalzadoMujer(calzadoMujer2);

        System.out.println(tienda.calzadosMujer());

        System.out.println(tienda.valorVenta("123ABC1"));

        System.out.println(tienda.calzadosTop());

        System.out.println("El total de impuestos especificos si se vendieran todos los calzados es: $"+
                tienda.totalImpuestosEspecificos());

        System.out.println("El total de descuentos de todos los calzados es: $"+
                tienda.totalDescuentos());

    }
}
