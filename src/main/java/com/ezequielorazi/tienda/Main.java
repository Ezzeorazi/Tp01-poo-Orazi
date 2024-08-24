//package main.java.com.ezequielorazi.tienda;
//
//import main.java.com.ezequielorazi.tienda.model.*;
//
//public class Main {
//    public static void main(String[] args) {
//        // Crear productos
//        ProductoEnvasado producto1 = new ProductoEnvasado("AB123", "Café", 50, 1.5, 0.2, "Vidrio", false);
//
//        Bebida bebida1 = new Bebida("AC123", "Vino", 30, 10.5, 0.15, 12.5, true);
//
//        // Crear la tienda
//        Tienda miTienda = new Tienda("Tienda de Ezequiel", 100, 1000.0);
//
//        // Agregar productos a la tienda
//        miTienda.agregarProducto(producto1, 20);  // Debería agregar correctamente
//        miTienda.agregarProducto(bebida1, 10);  // Debería agregar correctamente
//
//        // Intentar agregar un producto con saldo insuficiente
//        miTienda.agregarProducto(bebida1, 100);  // Debería fallar por saldo insuficiente
//
//        // Intentar agregar más productos que exceden el stock máximo
//        miTienda.agregarProducto(producto1, 100);  // Debería fallar por stock máximo
//
//        ProductoLimpieza productoLimpieza = new ProductoLimpieza("AZ123", "Limpiador Multiusos", 100, 2.5, 0.15, TipoAplicacion.MULTIUSO);
//
//        // Imprimir los detalles del producto de limpieza
//        System.out.println("ID: " + productoLimpieza.getId());
//        System.out.println("Descripción: " + productoLimpieza.getDescripcion());
//        System.out.println("Cantidad en stock: " + productoLimpieza.getCantidadStock());
//        System.out.println("Precio por unidad: " + productoLimpieza.getPrecioPorUnidad());
//        System.out.println("Porcentaje de ganancia: " + productoLimpieza.getPorcentajeGanancia());
//        System.out.println("Tipo de aplicación: " + productoLimpieza.getTipoAplicacion());
//    }
//    }
//
