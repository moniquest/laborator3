package org.oop.app;

public class Smartphone extends Hardware{ private Double CapMemorie;
    public Smartphone(Integer idProdus, String denumire, Double pretUnitar, String numarModel, Double CapMemorie) {
        super(idProdus, denumire, pretUnitar, numarModel);
        this.CapMemorie = CapMemorie;
    }
    public Smartphone() {super();}

    public Double getCapMemorie() {
        return CapMemorie;
    }

    public void setCapMemorie(Double capMemorie) {
        this.CapMemorie = capMemorie;
    }
}
