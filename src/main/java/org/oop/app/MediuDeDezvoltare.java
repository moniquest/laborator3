package org.oop.app;

public class MediuDeDezvoltare extends Software{
    private String LimbajProgramare;
    public MediuDeDezvoltare(Integer idProdus, String denumire, Double pretUnitar, String versiune, String LimbajProgramare) {
        super(idProdus, denumire, pretUnitar, versiune);
        this.LimbajProgramare = LimbajProgramare; }
    public MediuDeDezvoltare() {super();}

    public String getLimbajProgramare() {
        return LimbajProgramare;
    }

    public void setLimbajProgramare(String limbajProgramare) {
        LimbajProgramare = limbajProgramare;
    }
}
