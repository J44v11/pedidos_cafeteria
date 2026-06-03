import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import net.salesianos.pedido.Pedido;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Pedido> colaPedidos = new LinkedList<>();
        Stack<Pedido> historialPreparados = new Stack<>();

        colaPedidos.add(new Pedido("P001", "Carla", "Cafe con Leche", true));
        colaPedidos.add(new Pedido("P002", "Mario", "Bocadillo de pollo", false));
        colaPedidos.add(new Pedido("P003", "Nerea", "Zumo Natural", true));
        colaPedidos.add(new Pedido("P004", "Ivan", "Tostada Integral", false));
        colaPedidos.add(new Pedido("P005", "Laura", "Té Verde", true));

        System.out.println("Pedidos pendientes:");
        for (Pedido pedido : colaPedidos) {
            System.out.println(pedido);
        }

        System.out.println();
        System.out.println("Primer pedido sin eliminar:");
        System.out.println(colaPedidos.peek());
        System.out.println();

        System.out.println("Pedidos preparados:");
        for (int i = 0; i < 3 && !colaPedidos.isEmpty(); i++) {

            Pedido pedidoPreparado = colaPedidos.poll();
            historialPreparados.push(pedidoPreparado);
            System.out.println(pedidoPreparado);
        }

        System.out.println();
        System.out.println("Ultimo pedido preparado: ");
        System.out.println(historialPreparados.peek());
        System.out.println();

        System.out.println();
        System.out.println("Pedido extraido del historial de pedidos preparados:");
        System.out.println(historialPreparados.pop());
        System.out.println();

        System.out.println("Pedidos que quedan pendientes:");
        for (Pedido pedido : colaPedidos) {
            System.out.println(pedido);
        }

        System.out.println();

        if (colaPedidos.isEmpty()) {
            
            System.out.println("No hay pedidos pendientes");
        } else {

            System.out.println("Pedidos pendientes:");
            for (Pedido pedido : colaPedidos) {
                System.out.println(pedido);
            }
        }
    }
}
