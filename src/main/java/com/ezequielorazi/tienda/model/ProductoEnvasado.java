package main.java.com.ezequielorazi.tienda.model;

public class ProductoEnvasado extends Producto {
    private String tipoEnvase;
    private boolean esImportado;

    public ProductoEnvasado(String id, String descripcion, int cantidadStock, double precioPorUnidad, double porcentajeGanancia, String tipoEnvase, boolean esImportado) {
        super(id, descripcion, cantidadStock, precioPorUnidad, porcentajeGanancia);
        this.tipoEnvase = tipoEnvase;
        this.esImportado = esImportado;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public boolean isEsImportado() {
        return esImportado;
    }

    public void setEsImportado(boolean esImportado) {
        this.esImportado = esImportado;
    }

    @Override
    public boolean validarIdentificador() {
        return getId().matches("AB\\d{3}");
    }
}
