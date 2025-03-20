
package Guia07_actividad3;

public class main {
     public static void main(String[] args) {
        Producto_07 producto = new Producto_07();
        producto.nombre = "Laptop";
        producto.precio = 1200.0;
        producto.cantidadEnStock = 10;

        System.out.println("Producto: " + producto.nombre);
        System.out.println("Precio: $" + producto.precio);
        System.out.println("Cantidad en stock: " + producto.cantidadEnStock);
        System.out.println("Valor total del inventario: $" + producto.calcularValorInventario());
        System.out.println("¿Está disponible? " + producto.estaDisponible());

        producto.cantidadEnStock = 0; // Agotamos el stock
        System.out.println("¿Está disponible ahora? " + producto.estaDisponible());
    }
}
