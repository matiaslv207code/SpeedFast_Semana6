package modelo;

// clase que representa un pedido del sistema
public class Pedido {
    // atributos basicos del pedido
    private String id;
    private String direccion;
    private String tipo;

    // constructor para inicializar los datos del pedido
    public Pedido(String id, String direccion, String tipo) {
        this.id = id;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    // getters para obtener los valores de los atributos
    public String getId() { return id; }
    public String getDireccion() { return direccion; }
    public String getTipo() { return tipo; }
}