package main.java.com.ezequielorazi.tienda.model;

public class Bebida extends Producto {
    private double graduacionAlcoholica;
    private boolean esImportado;

    public Bebida(String id, String descripcion, int cantidadStock, double precioPorUnidad, double porcentajeGanancia, double graduacionAlcoholica, boolean esImportado) {
        super(id, descripcion, cantidadStock, precioPorUnidad, porcentajeGanancia);
        this.graduacionAlcoholica = graduacionAlcoholica;
        this.esImportado = esImportado;
    }

    public double getGraduacionAlcoholica() {
        return graduacionAlcoholica;
    }

    public void setGraduacionAlcoholica(double graduacionAlcoholica) {
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    public boolean isEsImportado() {
        return esImportado;
    }

    public void setEsImportado(boolean esImportado) {
        this.esImportado = esImportado;
    }

    @Override
    public boolean validarIdentificador() {
        return getId().matches("AC\\d{3}");
    }
}
