package org.oop.app;

public class SistemEnterprise extends Software {
    private String TipLicenta;

    public SistemEnterprise(Integer idProdus, String denumire, Double pretUnitar,
                       String versiune, String TipLicenta) {
        super(idProdus, denumire, pretUnitar, versiune);
        this.TipLicenta = TipLicenta;
    }

    public String getTipLicenta() {
        return TipLicenta;
    }

    public void setTipLicenta(String tipLicenta) {
        TipLicenta = tipLicenta;
    }
}
