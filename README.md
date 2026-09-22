![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🖥️ Actividad Formativa Semana 6 – Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto
- **Nombre completo:** Matías López
- **Sección:** 005A
- **Carrera:** Analista Programador Computacional
- **Sede:** Modalidad Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde al desarrollo de la Semana 6 para la empresa **SpeedFast**. Consiste en la implementación de una interfaz gráfica de escritorio utilizando **Java Swing**, aplicando el patrón de arquitectura **Modelo-Vista-Controlador (MVC)** y un almacenamiento básico en listas en memoria.

El sistema permite a los usuarios interactuar de forma intuitiva con los datos mediante formularios, botones y tablas, cumpliendo con las siguientes funciones:
- **Ventana Principal (`VentanaPrincipal`):** Menú de navegación estructurado con gestores de diseño para acceder a las distintas opciones del sistema.
- **Registro de Pedidos (`VentanaRegistroPedido`):** Formulario con validación de campos vacíos y selección mediante `JComboBox` para registrar nuevos pedidos (comida, encomienda o express) y guardarlos en el controlador.
- **Listado de Pedidos (`VentanaListaPedidos`):** Vista basada en `JTable` y `DefaultTableModel` para visualizar de forma dinámica los pedidos existentes y refrescar los datos en tiempo real.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── controlador/          # Clases que manejan la lógica y el almacenamiento en memoria
│   └── ControladorPedidos.java
├── modelo/               # Clases de dominio del sistema
│   └── Pedido.java
├── vista/                # Interfaces gráficas desarrolladas con Java Swing
│   ├── VentanaListaPedidos.java
│   ├── VentanaPrincipal.java
│   └── VentanaRegistroPedido.java
└── main/                 # Punto de entrada de la aplicación
    └── Main.java
````

---



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/matiaslv207code/SpeedFast_Semana6.git
```

2. Abre el proyecto completo en tu entorno IntelliJ IDEA.

3. Busca en el navegador de carpetas la ruta src -> main -> Main.java.

4. Ejecuta el archivo Main.java para iniciar la aplicación desde la ventana de navegación principal.


---

**Repositorio GitHub:** https://github.com/matiaslv207code/SpeedFast_Semana6

**Fecha de entrega:** \[21/09/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Final Transversal EFT




