package org.oop.app;

public class SuitaOffice extends Software {
    private String tipSistemOperare;
    // get si set pentru tipSistemOperare

    // constructor parametrizat
    public SuitaOffice (Integer idProdus, String denumire, Double pretUnitar,
                        String versiune, String tipSistemOperare) {
        super(idProdus, denumire, pretUnitar, versiune);
        this.tipSistemOperare = tipSistemOperare;

    }

    public String getTipSistemOperare() {
        return tipSistemOperare;
    }

    public void setTipSistemOperare(String tipSistemOperare) {
        this.tipSistemOperare = tipSistemOperare;
    }
}
