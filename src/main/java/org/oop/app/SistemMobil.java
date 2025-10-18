package org.oop.app;

public class SistemMobil extends Hardware {
    private Double CapacitateMemorie;

    public SistemMobil(Integer idProdus, String denumire, Double pretUnitar, String numarModel, Double CapacitateMemorie) {
        super(idProdus, denumire, pretUnitar, numarModel);
        this.CapacitateMemorie = CapacitateMemorie;
    }

    public SistemMobil() {
        super();
    }

    public Double getCapacitateMemorie() {
        return CapacitateMemorie;
    }

    public void setCapacitateMemorie(Double capacitateMemorie) {
        CapacitateMemorie = capacitateMemorie;
    }
}