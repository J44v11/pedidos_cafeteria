package net.salesianos.pedido;

public class Pedido {
    
    private int codigo;
    private String cliente;
    private String producto;
    private boolean paraLlevar;

    public Pedido(int codigo, String cliente, String producto, boolean paraLlevar) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.producto = producto;
        this.paraLlevar = paraLlevar;
    }

        public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public boolean isParaLlevar() {
        return paraLlevar;
    }

    public void setParaLlevar(boolean paraLlevar) {
        this.paraLlevar = paraLlevar;

    }

    @Override
    public String toString() {
        return "Pedido: {" + "codigo=" + codigo + ", cliente='" + cliente + "', producto='" + producto + "', paraLlevar=" + paraLlevar + "}";
    }

}
