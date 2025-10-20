package org.oop.app;

public class Notebook extends Hardware{ private Double RAM;
    public Notebook(Integer idProdus, String denumire, Double pretUnitar, String numarModel, Double RAM) {
        super(idProdus, denumire, pretUnitar, numarModel);
        this.RAM = RAM;
    }
    public Notebook() {super();}

    public Double getRAM() {
        return RAM;
    }

    public void setRAM(Double RAM) {
        this.RAM = RAM;
    }
}
