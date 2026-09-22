package controlador;

// lista de pedidos en memoria para el sistema
import modelo.Pedido;
import java.util.ArrayList;
import java.util.List;

public class ControladorPedidos {
    // lista interna que almacena los pedidos registrados
    private List<Pedido> listaPedidos;

    // constructor que inicializa la lista vacia
    public ControladorPedidos() {
        listaPedidos = new ArrayList<>();
    }

    // metodo para agregar un nuevo pedido a la lista
    public void agregarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }

    // metodo que devuelve la lista con todos los pedidos guardados
    public List<Pedido> obtenerPedidos() {
        return listaPedidos;
    }
}