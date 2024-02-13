package modelo;

public class Deportivo extends Calzado{
    protected String tipoDeporte;
    protected String tipoMaterial;

    public Deportivo(int numero, String diaVenta, Producto producto) {
        super(numero, diaVenta, producto);
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
}
