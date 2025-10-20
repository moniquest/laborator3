package org.oop.app;
import org.oop.app.Produs;
import org.oop.app.SistemOperare;
import org.oop.app.Hardware;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // (vi) Crearea listei de produse
        List<Produs> catalogProduse = new ArrayList<>();

        // (vi) Instanțierea și adăugarea tuturor produselor în catalog
        catalogProduse.add(new SistemOperare(1, "MS Windows", 450.0, "v10", "x86.64"));
        catalogProduse.add(new SistemOperare(2, "Apple MacOS", 1250.0, "v10.14", "MackBook Pro"));
        catalogProduse.add(new SuitaOffice(3, "MS Office", 850.0, "v2010", "MS Windows 10"));
        catalogProduse.add(new SistemDesktop(4, "PC Dell", 2700.0, "OptiPlex", "mini tower"));
        catalogProduse.add(new SistemMobil(5, "NB Lenovo", 4100.0, "IdeaPad", 16.0)); // Folosim 16.0 pentru Double
        catalogProduse.add(new SistemMobil(6, "iPhone", 6500.0, "11X", 6.0));      // Folosim 6.0 pentru Double
        catalogProduse.add(new SistemEnterprise(7,"SAP", 500.00,"2.0","Community"));
        catalogProduse.add(new ClientEmail(8,"client@.ro", 0.00,"2.0",1));
        catalogProduse.add(new PlatformaManagementProiecte(9,"Jira", 200.00,"2.0",5));
        catalogProduse.add(new MediuDeDezvoltare(10,"Intellij", 100.00,"15.0","Java"));
        // (x) Apelarea celei de-a doua metode de parcurgere (cu 'switch')
        System.out.println("\n--- Testare polimorfism cu 'switch' (Java 21+): ---");
        parcurgePolimorficMachingCaseListaProduse(catalogProduse);
    }

    // Metoda de parcurgere cu 'switch' (de la pagina 5)
    private static void parcurgePolimorficMachingCaseListaProduse(List<Produs> catalogProduse) {
        for (Produs p : catalogProduse) {
            System.out.println("Produs: " + p.getDenumire());
            switch (p) {
                case SistemOperare s -> System.out.println("  -> Tip: SistemOperare | Versiune: " + s.getVersiune() + " | Arhitectură: " + s.getTipHardware());
                case SuitaOffice s -> System.out.println("  -> Tip: SuitaOffice | Versiune: " + s.getVersiune() + " | OS Suportat: " + s.getTipSistemOperare());
                case SistemDesktop s -> System.out.println("  -> Tip: SistemDesktop | Model: " + s.getNumarModel() + " | Arhitectură: " + s.getTipArhitectura());
                case SistemMobil s -> System.out.println("  -> Tip: SistemMobil | Model: " + s.getNumarModel() + " | Memorie: " + s.getCapacitateMemorie() + "GB");
                case null -> System.out.println("Produs invalid (null).");
                default -> System.out.println("Tip de produs necunoscut: " + p.getClass().getName());
            }
        }
    }
}