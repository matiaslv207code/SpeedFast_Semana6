package vista;

import controlador.ControladorPedidos;
import javax.swing.*;
import java.awt.*;

// ventana principal que sirve como menu para navegar entre opciones
public class VentanaPrincipal extends JFrame {
    private ControladorPedidos controlador;

    public VentanaPrincipal(ControladorPedidos controlador) {
        this.controlador = controlador;
        setTitle("SpeedFast - Gestión de Entregas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // organizamos los botones en una cuadricula de 3 filas
        setLayout(new GridLayout(3, 1, 10, 10));

        // botones requeridos para el menu
        JButton btnRegistrar = new JButton("Registrar pedido");
        JButton btnListar = new JButton("Listar pedidos");
        JButton btnAsignar = new JButton("Asignar repartidor / Iniciar entrega");

        // configuramos la navegacion para abrir las otras ventanas al hacer click
        btnRegistrar.addActionListener(e -> new VentanaRegistroPedido(controlador).setVisible(true));
        btnListar.addActionListener(e -> new VentanaListaPedidos(controlador).setVisible(true));
        btnAsignar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Simulación de entrega iniciada"));

        // agregamos los botones a la ventana
        add(btnRegistrar);
        add(btnListar);
        add(btnAsignar);
    }
}
