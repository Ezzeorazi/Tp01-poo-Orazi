package main.java.com.ezequielorazi.tienda.model;

public class TestTienda {
    public static void main(String[] args) {
        // Crear una instancia de Tienda
        Tienda tienda = new Tienda("Mi Tienda", 1000, 5000);

        // Crear algunos productos
        ProductoEnvasado productoEnvasado = new ProductoEnvasado("AB123", "Cereal", 50, 3.0, 0.10, "Caja", false);
        Bebida bebida = new Bebida("AC456", "Vino Tinto", 30, 15.0, 0.20, 12.0, true);
        ProductoLimpieza productoLimpieza = new ProductoLimpieza("AZ789", "Detergente", 40, 5.0, 0.15, TipoAplicacion.COCINA);

        // Agregar productos a la tienda
        System.out.println("Agregando productos a la tienda...");
        tienda.agregarProducto(productoEnvasado, 100); // Intento agregar con suficiente saldo
        tienda.agregarProducto(bebida, 50); // Intento agregar con suficiente saldo
        tienda.agregarProducto(productoLimpieza, 20); // Intento agregar con suficiente saldo

        // Mostrar estado inicial de los productos
        System.out.println("Estado inicial de los productos:");
        tienda.mostrarProductos();

        // Realizar una venta
        System.out.println("\nRealizando una venta...");
        tienda.realizarVenta(new ProductoVenta[]{
                new ProductoVenta(productoEnvasado, 10),
                new ProductoVenta(bebida, 5)
        });

        // Mostrar estado final de los productos y saldo en caja
        System.out.println("\nEstado final de los productos y saldo en caja:");
        tienda.mostrarProductos();
        tienda.mostrarSaldoCaja();
    }
}