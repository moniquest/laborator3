package org.oop.app;
import org.oop.app.Software;

public abstract class Software extends Produs {
    protected String versiune;
    // get si set pentru versiune
    /*... ... ...*/
// constructor parametrizat
    public Software(Integer idProdus, String denumire, Double pretUnitar,
                    String versiune) {
        super(idProdus,denumire,pretUnitar);
        this.versiune=versiune;
    }
    public Software() {
    }

    public String getVersiune() {
        return versiune;
    }

    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }
}
