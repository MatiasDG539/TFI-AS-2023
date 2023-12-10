package tfi_2023.Modulos;

import java.util.ArrayList;

public class Departamento {
    
    private int unidad;
    private String depto;
    private String nomDepto;
    private double monPuro;
    private double saldoFav;
    private double saldoCon;
    private double monTotal;
    
    public Departamento(){}

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getNomDepto() {
        return nomDepto;
    }

    public void setNomDepto(String nomDepto) {
        this.nomDepto = nomDepto;
    }

    public double getMonPuro() {
        return monPuro;
    }

    public void setMonPuro(double monPuro) {
        this.monPuro = monPuro;
    }

    public double getSaldoFav() {
        return saldoFav;
    }

    public void setSaldoFav(double saldoFav) {
        this.saldoFav = saldoFav;
    }

    public double getSaldoCon() {
        return saldoCon;
    }

    public void setSaldoCon(double saldoCon) {
        this.saldoCon = saldoCon;
    }

    public double getMonTotal() {
        return monTotal;
    }

    public void setMonTotal(double monTotal) {
        this.monTotal = monTotal;
    }

    @Override
    public String toString() {
        return "Departamento{" + "Unidad: " + unidad + ", Depto: " + depto + ", Nombre Depto: " + nomDepto + ", Monto puro: " + monPuro + ", Saldo favor: " + saldoFav + ", Saldo contra" + saldoCon + ", Monto total: " + monTotal + '}';
    }
    
}