package org.oop.app;

public class PlatformaManagementProiecte extends Software   {private int numarProiecteMax;

    public PlatformaManagementProiecte(Integer idProdus, String denumire, Double pretUnitar, String versiune, int numarProiecteMax) {
        super(idProdus, denumire, pretUnitar, versiune);
        this.numarProiecteMax = numarProiecteMax;
    }

    public PlatformaManagementProiecte() {
        super();
    }

    public int getNumarProiecteMax() {
        return numarProiecteMax;
    }

    public void setNumarProiecteMax(int numarProiecteMax) {
        this.numarProiecteMax = numarProiecteMax;
    }
}
