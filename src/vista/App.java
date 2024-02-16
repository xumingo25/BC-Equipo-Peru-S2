package vista;

import controlador.TiendaCalzado;
import modelo.Deportivo;
import modelo.Hombre;
import modelo.Mujer;
import modelo.Producto;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        int opcion;
        String codigoCalzado;

        //Colección (capa de control)
        TiendaCalzado tienda = new TiendaCalzado(new ArrayList<>());

        do{
            opcion = menu();

            switch(opcion){
                case 1: //ingreso
                    codigoCalzado = pideCodigo(); //aqui obtengo el codigo

                    if(tienda.buscarCalzado(codigoCalzado)==-1){
                        //se puede cargar
                        System.out.println("¿Stock?"); int stock = Leer.datoInt();
                        System.out.println("¿Valor base?"); int valorBase = Leer.datoInt();
                        System.out.println("¿Numero (medida)?"); int numero = Leer.datoInt();

                        String diaVenta;
                        do{
                            System.out.println("Favor ingrese dia venta ('Semana' o 'Fin de semana')");
                            diaVenta = Leer.dato(); //semana
                        }while(diaVenta.compareToIgnoreCase("Semana") !=0 &&
                                diaVenta.compareToIgnoreCase("Fin de Semana") !=0);

                        int respuesta;
                        do{
                            System.out.println("\n El calzado a ingresar es: 1) Deportivo    2) Formal Hombre    3) Formal Mujer");
                            System.out.println("-----------------------------------------------------");
                            System.out.println("Favor ingrese una opción para continuar...");
                            System.out.println("-----------------------------------------------------");
                            respuesta = Leer.datoInt(); //3
                        }while(respuesta< 1 || respuesta > 3);
                            // false             false

                        if(respuesta==1){
                            //deportivo
                            System.out.println("¿Tipo de deporte?"); String tipoDeporte = Leer.dato();

                            String tipoMaterial;
                            do{
                                System.out.println("Favor ingrese tipo de material ('Cuero' o 'Lona')");
                                tipoMaterial = Leer.dato(); //
                            }while(tipoMaterial.compareToIgnoreCase("Cuero") !=0 &&
                                    tipoMaterial.compareToIgnoreCase("Lona") !=0);

                            //Producto prod = new Producto(codigoCalzado,stock,valorBase);
                            //Deportivo deportivo = new Deportivo(numero,diaVenta,prod,tipoDeporte,tipoMaterial);
                            //tienda.ingresarCalzadoDeportivo(deportivo);
                            tienda.ingresarCalzadoDeportivo(new Deportivo(numero,diaVenta,new Producto(codigoCalzado,stock,valorBase),tipoDeporte,tipoMaterial));
                            System.out.println("Calzado deportivo ingresado correctamente.");
                        }else{
                            //formal
                            System.out.println("¿Color?"); String color = Leer.dato();

                            if(respuesta==2){
                                //Hombre
                                tienda.ingresarCalzadoHombre(new Hombre(numero,diaVenta,new Producto(codigoCalzado,stock,valorBase),color));
                                System.out.println("Calzado formal de hombre ingresado correctamente.");

                            }else{
                                //Mujer
                                System.out.println("¿Altura de taco?"); int alturaTaco = Leer.datoInt();
                                tienda.ingresarCalzadoMujer(new Mujer(numero,diaVenta,new Producto(codigoCalzado,stock,valorBase),color,alturaTaco));
                                System.out.println("Calzado formal de mujer ingresado correctamente.");
                            }
                        }
                    }else{
                        System.out.println("El codigo "+ codigoCalzado + " se encuentra asociado a otro calzado. Favor revisar");
                    }
                    break;
                case 2: //mostrar calzados mujer
                    System.out.println("----------------Calzados Mujer------------------");
                    System.out.println(tienda.calzadosMujer());
                    System.out.println("------------------------------------------------");
                    break;
                case 3: //valor venta
                    String codigoSolicitado = pideCodigo();
                    System.out.println("----------------Valor Venta $$$-----------------");
                    System.out.println(tienda.valorVenta(codigoSolicitado));
                    System.out.println("------------------------------------------------");
                    break;
                case 4: //calzados top
                    System.out.println("----------------Calzados TOP $------------------");
                    System.out.println(tienda.calzadosTop());
                    System.out.println("------------------------------------------------");
                    break;
                case 5: //impuestos especificos
                    System.out.println("-----------Total Impuestos Especificos $-----------");
                    System.out.println(tienda.totalImpuestosEspecificos());
                    System.out.println("---------------------------------------------------");
                    break;
                case 6: //descuentos
                    System.out.println("-----------Total Impuestos Especificos $-----------");
                    System.out.println(tienda.totalDescuentos());
                    System.out.println("---------------------------------------------------");
                    break;
            }

        }while(opcion!=7);


    }

    public static String pideCodigo(){
        System.out.println("Favor ingrese codigo del calzado");
        return Leer.dato();
    }

    public static int menu(){
        System.out.println("\n ------------ Tienda de Calzado V 1.0 -------------");
        System.out.println("1.\tIngresar Calzado (El ingreso puede ser Calzado de mujer, hombre o deportivo y no puede estar duplicado)");
        System.out.println("2.\tMostrar sólo los calzado de mujer (Día de venta, altura de taco y descuento)");
        System.out.println("3.\tValor Venta");
        System.out.println("4.\tCalzados top (Calzado con valor mayor a 800)");
        System.out.println("5.\tTotal Impuesto Especificos de la tienda");
        System.out.println("6.\tTotal descuentos de la tienda");
        System.out.println("7.\tSalir.");
        System.out.println("-----------------------------------------------------");
        System.out.println("Favor ingrese una opción para continuar...");
        System.out.println("-----------------------------------------------------");
        return Leer.datoInt();
    }
}
