import java.util.LinkedList;
import java.util.Queue;

import net.salesianos.pedido.Pedido;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Pedido> colaPedidos = new LinkedList<>();

        colaPedidos.add(new Pedido("P001", "Carla", "Cafe con Leche", true));
        colaPedidos.add(new Pedido("P002", "Mario", "Bocadillo de pollo", false));
        colaPedidos.add(new Pedido("P003", "Nerea", "Zumo Natural", true));
        colaPedidos.add(new Pedido("P004", "Ivan", "Tostada Integral", false));
        colaPedidos.add(new Pedido("P005", "Laura", "Té Verde", true));




    }
}
