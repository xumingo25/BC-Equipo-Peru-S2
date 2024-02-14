package modelo;

public class Deportivo extends Calzado{
    protected String tipoDeporte;
    protected String tipoMaterial;

    public Deportivo(int numero, String diaVenta, Producto producto, String tipoDeporte, String tipoMaterial) {
        super(numero, diaVenta, producto);
        this.tipoDeporte = tipoDeporte;
        this.tipoMaterial = tipoMaterial;
    }

    public Deportivo(){
        super();
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    //•	impuestoMaterial: retornará el valor de impuesto de material el cual es un 15%
    // del valor base si el calzado es de Cuero y de un 6% del valor base si es de Lona
    public int impuestoMaterial(){
        int impuesto = 0;

        if(this.getTipoMaterial().equalsIgnoreCase("Cuero")){ //+15%
            impuesto = Math.round(this.getProducto().getValorBase()*15/100);
        }else if(this.getTipoMaterial().equalsIgnoreCase("Lona")){
            //+6%
            impuesto =  Math.round(this.getProducto().getValorBase()*6/100);
        }
        return impuesto;
    }

    @Override
    public int valorAPagar() {
        int valorAPagar;
        if(this.getProducto().getStock()>0){
            valorAPagar = this.valorVenta() +this.impuestoIva() + this.impuestoMaterial();
            return valorAPagar;
        }else{
            System.out.println("Producto sin stock");
            valorAPagar = -1;
            return  valorAPagar;
        }
    }
}
