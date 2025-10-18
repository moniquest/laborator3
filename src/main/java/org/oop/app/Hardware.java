package org.oop.app;
import org.oop.app.Produs;
import org.oop.app.Hardware;

public abstract class Hardware extends Produs {

    protected String numarModel;


    public Hardware(Integer idProdus, String denumire, Double pretUnitar, String numarModel) {
        super(idProdus, denumire, pretUnitar);
        this.numarModel = numarModel;
    }


    public Hardware() {
        super();
    }


    public String getNumarModel() {
        return numarModel;
    }

    public void setNumarModel(String numarModel) {
        this.numarModel = numarModel;
    }
}
