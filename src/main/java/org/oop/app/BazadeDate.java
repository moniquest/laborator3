package org.oop.app;

public class BazadeDate extends Software {private String TipBD;
    public BazadeDate(Integer idProdus, String denumire, Double pretUnitar, String versiune, String tipBD) {
        super(idProdus, denumire, pretUnitar, versiune);
        this.TipBD = tipBD;
    }
    public BazadeDate() {super();}

    public String getTipBD() {
        return TipBD;
    }

    public void setTipBD(String tipBD) {
        TipBD = tipBD;
    }
}
