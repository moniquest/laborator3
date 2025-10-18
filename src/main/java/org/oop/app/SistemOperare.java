package org.oop.app;
import org.oop.app.SistemOperare;

public class SistemOperare extends Software {
    private String tipHardware;
    // get si set pentru tipHardware
    /*... ... ...*/
// constructor parametrizat
    public SistemOperare(Integer idProdus, String denumire, Double pretUnitar,
                         String versiune, String tipHardware) {
        super(idProdus, denumire, pretUnitar, versiune);
        this.tipHardware = tipHardware;
    }


    public String getTipHardware() {
        return tipHardware;
    }

    public void setTipHardware(String tipHardware) {
        this.tipHardware = tipHardware;
    }

}
