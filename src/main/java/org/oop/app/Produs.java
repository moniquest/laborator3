package org.oop.app;
import org.oop.app.Produs;

public class Produs {
    private Integer idProdus;
    private String denumire;
    private Double pretUnitar;

    public Produs() {
    }

    public Produs(Integer idProdus, String denumire, Double pretUnitar) {
        this.idProdus = idProdus;
        this.denumire = denumire;
        this.pretUnitar = pretUnitar;
    }

    public Integer getIdProdus() {
        return idProdus;
    }

    public void setIdProdus(Integer idProdus) {
        this.idProdus = idProdus;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Double getPretUnitar() {
        return pretUnitar;
    }

    public void setPretUnitar(Double pretUnitar) {
        this.pretUnitar = pretUnitar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return this.idProdus.equals(produs.idProdus);
    }

    @Override
    public int hashCode() {
        return idProdus.hashCode();
    }
}