package main.java.com.ezequielorazi.tienda.model;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private int maximoStock;
    private double saldoCaja;
    private List<Producto> productos;

    public Tienda(String nombre, int maximoStock, double saldoCaja) {
        this.nombre = nombre;
        this.maximoStock = maximoStock;
        this.saldoCaja = saldoCaja;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        double costoTotal = producto.getPrecioPorUnidad() * cantidad;

        if (saldoCaja < costoTotal) {
            System.out.println("El producto no podrá ser agregado a la tienda por saldo insuficiente en la caja.");
            return;
        }

        int stockActual = productos.stream()
                .filter(p -> p.getId().equals(producto.getId()))
                .mapToInt(Producto::getCantidadStock)
                .sum();

        if (stockActual + cantidad > maximoStock) {
            System.out.println("No se pueden agregar nuevos productos a la tienda ya que se alcanzó el máximo de stock.");
            return;
        }

        saldoCaja -= costoTotal;
        producto.setCantidadStock(stockActual + cantidad);
        productos.add(producto);
        System.out.println("Producto agregado con éxito.");
    }

    public void realizarVenta(ProductoVenta[] venta) {
        double totalVenta = 0;
        for (ProductoVenta pv : venta) {
            Producto producto = pv.getProducto();
            int cantidadVendida = pv.getCantidad();

            if (producto.getCantidadStock() < cantidadVendida) {
                cantidadVendida = producto.getCantidadStock();
                System.out.println("Hay productos con stock disponible menor al solicitado.");
            }

            if (!producto.isDisponibleParaVenta()) {
                System.out.println("El producto " + producto.getId() + " no se encuentra disponible.");
                continue;
            }

            double precioVenta = producto.getPrecioPorUnidad() * cantidadVendida;
            totalVenta += precioVenta;
            producto.setCantidadStock(producto.getCantidadStock() - cantidadVendida);
            if (producto.getCantidadStock() == 0) {
                producto.setDisponibleParaVenta(false);
            }
        }

        saldoCaja += totalVenta;
        System.out.println("TOTAL VENTA: " + totalVenta);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getId() + " " + producto.getDescripcion() + " - Stock: " + producto.getCantidadStock());
        }
    }

    public void mostrarSaldoCaja() {
        System.out.println("Saldo en caja: " + saldoCaja);
    }
}
