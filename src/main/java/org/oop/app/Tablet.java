package org.oop.app;

public class Tablet extends Hardware{ private Double CapMemorie;
    public Tablet(Integer idProdus, String denumire, Double pretUnitar, String numarModel, Double CapMemorie) {
        super(idProdus, denumire, pretUnitar, numarModel);
        this.CapMemorie = CapMemorie;
    }
    public Tablet() {super();}

    public Double getCapMemorie() {
        return CapMemorie;
    }

    public void setCapMemorie(Double capMemorie) {
        CapMemorie = capMemorie;
    }
}