package main.java.com.ezequielorazi.tienda.model;

public abstract class Producto {
    private String id; // Identificador alfanumérico de longitud 5
    private String descripcion;
    private int cantidadStock;
    private double precioPorUnidad;
    private double porcentajeGanancia;
    private boolean disponibleParaVenta;

    // Constructor
    public Producto(String id, String descripcion, int cantidadStock, double precioPorUnidad, double porcentajeGanancia) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidadStock = cantidadStock;
        this.precioPorUnidad = precioPorUnidad;
        this.porcentajeGanancia = porcentajeGanancia;
        this.disponibleParaVenta = true; // Por defecto está disponible para la venta
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }

    public double getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public void setPorcentajeGanancia(double porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }

    public boolean isDisponibleParaVenta() {
        return disponibleParaVenta;
    }

    public void setDisponibleParaVenta(boolean disponibleParaVenta) {
        this.disponibleParaVenta = disponibleParaVenta;
    }

    // Método abstracto para validar el identificador, que será implementado en las subclases
    public abstract boolean validarIdentificador();
}
