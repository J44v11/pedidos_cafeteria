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

}
