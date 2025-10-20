package org.oop.app;

public class SistemServer extends Hardware {
    private int NrProcesoare;

    public SistemServer(Integer idProdus, String denumire, Double pretUnitar, String numarModel, int NrProcesoare) {
        super(idProdus, denumire, pretUnitar, numarModel);
        this.NrProcesoare = NrProcesoare;
    }

    public SistemServer() {
        super();
    }

    public int getNrProcesoare() {
        return NrProcesoare;
    }

    public void setNrProcesoare(int nrProcesoare) {
        NrProcesoare = nrProcesoare;
    }
}
