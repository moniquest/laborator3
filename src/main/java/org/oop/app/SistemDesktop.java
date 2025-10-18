package org.oop.app;
public class SistemDesktop extends Hardware {
    private String tipArhitectura;

    public SistemDesktop(Integer idProdus, String denumire, Double pretUnitar, String numarModel, String tipArhitectura) {
        super(idProdus, denumire, pretUnitar, numarModel);
        this.tipArhitectura = tipArhitectura;
    }

    public SistemDesktop() {
        super();
    }

    public String getTipArhitectura() {
        return tipArhitectura;
    }

    public void setTipArhitectura(String tipArhitectura) {
        this.tipArhitectura = tipArhitectura;
    }
}
