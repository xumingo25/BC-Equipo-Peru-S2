package modelo;

public class Producto {
    private String codigo; //"123ABC"
    private int stock; //10
    private int valorBase; //1000

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }

    public Producto(String codigo,int stock, int valorBase){
        this.codigo = codigo;
        this.stock = stock;
        this.valorBase = valorBase;
    }


}
