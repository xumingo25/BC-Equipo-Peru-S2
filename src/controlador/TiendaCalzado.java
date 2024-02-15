package controlador;

import modelo.Calzado;
import modelo.Deportivo;
import modelo.Hombre;
import modelo.Mujer;

import java.util.ArrayList;

public class TiendaCalzado {
    //Atributos
    private ArrayList<Calzado> tienda; //

    //Métodos
    public ArrayList<Calzado> getTienda() {
        return tienda;
    }

    public void setTienda(ArrayList<Calzado> tienda) {
        this.tienda = tienda;
    }

    public TiendaCalzado(ArrayList<Calzado> tienda) {
        this.tienda = tienda;
    }

    public int buscarCalzado(String codigoCalzado){
        for(int i=0; i < tienda.size(); i++){

            if(tienda.get(i).getProducto().getCodigo().compareToIgnoreCase(codigoCalzado)==0){
                //encontre el codigo en la posición respectiva del indice
                return i;
            }
        }
        return -1; //no existe el codigo de calzado asociado a ninguno de los calzados registrados
    }

    public void ingresarCalzadoDeportivo(Deportivo deportivo){
        if(buscarCalzado(deportivo.getProducto().getCodigo())==-1){
            tienda.add(deportivo);
        }
    }

    public void ingresarCalzadoMujer(Mujer mujer){
        if(buscarCalzado(mujer.getProducto().getCodigo())==-1){
            tienda.add(mujer);
        }
    }

    public void ingresarCalzadoHombre(Hombre hombre){
        if(buscarCalzado(hombre.getProducto().getCodigo())==-1){
            tienda.add(hombre);
        }
    }

    public String calzadosMujer() {
        String mensaje = "";
        Mujer mujer = null;

        for (int i = 0; i < tienda.size(); i++) {
            if (tienda.get(i) instanceof Mujer) {
                mujer = (Mujer) tienda.get(i);
                mensaje = mensaje + "\n dia de venta del calzado: " + mujer.getDiaVenta() + ", Altura de taco: " +
                        mujer.getAlturaTaco() + " y el descuento es: $" + mujer.descuento();
            }

        }
        return mensaje;
    }

    public String valorVenta(String codigo) {
        for (int i = 0; i < tienda.size(); i++) {
            if(tienda.get(i).getProducto().getCodigo().compareToIgnoreCase(codigo)==0){
                return "El valor venta del calzado codigo "+codigo+ " es: $"+tienda.get(i).valorVenta() +
                        " y el nro de calzado es: "+tienda.get(i).getNumero();
            }
        }
        return "El codigo de calzado "+ codigo + " no pertenece a ningun calzado de la tienda. Favor revisar.";
    }

    public String calzadosTop() {
        int suma = 0;
        for (int i = 0; i < tienda.size(); i++) {
            if(tienda.get(i).valorVenta()>800){
                suma = suma + tienda.get(i).getProducto().getStock();
            }
        }

        return "Tienes "+suma + " calzados top (Valor venta mayor a 800)";
    }

    public int totalImpuestosEspecificos() {
        Mujer mujer = null;
        Hombre hombre = null;
        int total = 0;

        for (int i = 0; i < tienda.size(); i++) {
            if(tienda.get(i) instanceof Hombre){
                hombre = (Hombre) tienda.get(i);
                total = total + (hombre.getProducto().getStock()*hombre.impuestoEspecifico());
            } else if (tienda.get(i) instanceof  Mujer) {
                mujer = (Mujer) tienda.get(i);
                total = total + (mujer.impuestoEspecifico()*mujer.getProducto().getStock());
            }
        }
        return total;
    }

    public int totalDescuentos() {
        Mujer mujer = null;
        Hombre hombre = null;
        int total = 0;

        for (int i = 0; i < tienda.size(); i++) {
            if(tienda.get(i) instanceof Hombre){
                hombre = (Hombre) tienda.get(i);
                total = total + (hombre.getProducto().getStock()*hombre.descuento());
            } else if (tienda.get(i) instanceof  Mujer) {
                mujer = (Mujer) tienda.get(i);
                total = total + (mujer.descuento()*mujer.getProducto().getStock());
            }
        }
        return total;
    }
}
