package org.oop.app;

public class ClientEmail extends Software {

    private int numarConturiMax;

    public ClientEmail(Integer idProdus, String denumire, Double pretUnitar, String versiune, int numarConturiMax) {
        super(idProdus, denumire, pretUnitar, versiune);
        this.numarConturiMax = numarConturiMax;
    }

    public ClientEmail() {
        super();
    }

    public int getNumarConturiMax() {
        return numarConturiMax;
    }

    public void setNumarConturiMax(int numarConturiMax) {
        this.numarConturiMax = numarConturiMax;
    }
}
