package vista;

import controlador.ControladorPedidos;
import modelo.Pedido;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

// ventana para listar y ver los pedidos registrados en una tabla
public class VentanaListaPedidos extends JFrame {
    private ControladorPedidos controlador;
    private JTable tablaPedidos;
    private DefaultTableModel modeloTabla;

    public VentanaListaPedidos(ControladorPedidos controlador) {
        this.controlador = controlador;
        setTitle("Listado de Pedidos");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // definimos las columnas y el modelo para la tabla
        String[] columnas = {"ID", "Dirección", "Tipo"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaPedidos = new JTable(modeloTabla);

        // cargamos los datos iniciales
        cargarDatos();

        add(new JScrollPane(tablaPedidos), BorderLayout.CENTER);

        // boton para refrescar la tabla y ver nuevos pedidos
        JButton btnRefrescar = new JButton("Refrescar Tabla");
        btnRefrescar.addActionListener(e -> cargarDatos());
        add(btnRefrescar, BorderLayout.SOUTH);
    }

    // metodo para limpiar y actualizar los datos de la tabla con la lista
    private void cargarDatos() {
        modeloTabla.setRowCount(0);
        for (Pedido p : controlador.obtenerPedidos()) {
            modeloTabla.addRow(new Object[]{p.getId(), p.getDireccion(), p.getTipo()});
        }
    }
}