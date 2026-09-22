package cl.duoc.speedfast;

import controlador.ControladorPedidos;
import vista.VentanaPrincipal;
import javax.swing.*;

// clase principal para iniciar la aplicacion
public class Main {
    public static void main(String[] args) {
        // ejecuta la interfaz grafica en el hilo seguro de swing
        SwingUtilities.invokeLater(() -> {
            ControladorPedidos controlador = new ControladorPedidos(); // instancia el controlador comun
            VentanaPrincipal ventana = new VentanaPrincipal(controlador); // abre la ventana principal
            ventana.setVisible(true); // hace visible la interfaz
        });
    }
}