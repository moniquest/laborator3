package org.oop.app;

public class Laptop extends Hardware{ private Double RAM;
    public Laptop(Integer idProdus, String denumire, Double pretUnitar, String numarModel, Double RAM) {
        super(idProdus, denumire, pretUnitar, numarModel);
        this.RAM = RAM;
    }
    public Laptop() {super();}

    public Double getRAM() {
        return RAM;
    }

    public void setRAM(Double RAM) {
        this.RAM = RAM;
    }
}