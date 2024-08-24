package main.java.com.ezequielorazi.tienda.model;

public class ProductoLimpieza extends Producto {
    private TipoAplicacion tipoAplicacion;

    public ProductoLimpieza(String id, String descripcion, int cantidadStock, double precioPorUnidad, double porcentajeGanancia, TipoAplicacion tipoAplicacion) {
        super(id, descripcion, cantidadStock, precioPorUnidad, porcentajeGanancia);
        this.tipoAplicacion = tipoAplicacion;
    }

    public TipoAplicacion getTipoAplicacion() {
        return tipoAplicacion;
    }

    public void setTipoAplicacion(TipoAplicacion tipoAplicacion) {
        this.tipoAplicacion = tipoAplicacion;
    }

    @Override
    public boolean validarIdentificador() {
        return getId().matches("AZ\\d{3}");
    }
}
