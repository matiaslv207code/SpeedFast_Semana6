package vista;

import controlador.ControladorPedidos;
import modelo.Pedido;
import javax.swing.*;
import java.awt.*;

// ventana para registrar nuevos pedidos
public class VentanaRegistroPedido extends JFrame {
    private ControladorPedidos controlador;
    private JTextField txtId, txtDireccion;
    private JComboBox<String> cmbTipo;

    public VentanaRegistroPedido(ControladorPedidos controlador) {
        this.controlador = controlador;
        setTitle("Registrar Pedido");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 5, 5));

        // campos de texto para id y direccion
        add(new JLabel("ID:"));
        txtId = new JTextField();
        add(txtId);

        add(new JLabel("Dirección:"));
        txtDireccion = new JTextField();
        add(txtDireccion);

        add(new JLabel("Tipo:"));
        // lista desplegable con los tipos de pedido
        String[] tipos = {"comida", "encomienda", "express"};
        cmbTipo = new JComboBox<>(tipos);
        add(cmbTipo);

        // boton para guardar el registro
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> guardarPedido());
        add(btnGuardar);
    }

    // metodo para validar campos y guardar el pedido en el controlador
    private void guardarPedido() {
        String id = txtId.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String tipo = (String) cmbTipo.getSelectedItem();

        // valida que no queden espacios vacios
        if (id.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // crea el objeto pedido y lo añade a la lista
        Pedido nuevoPedido = new Pedido(id, direccion, tipo);
        controlador.agregarPedido(nuevoPedido);

        // muestra aviso de exito y cierra la ventana
        JOptionPane.showMessageDialog(this, "Pedido registrado exitosamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
}
