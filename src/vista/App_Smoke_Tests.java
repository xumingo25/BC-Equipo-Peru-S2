package vista;

import modelo.Producto;

public class App_Smoke_Tests {
    public static void main(String[] args) {
        Producto producto = new Producto("",10,1000);

        producto.setCodigo("123ABC");

        String nombreProducto = producto.getCodigo();

        System.out.println("El nombre del producto es: "+nombreProducto);
    }
}
