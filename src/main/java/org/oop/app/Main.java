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
        catalogProduse.add(new BazadeDate(11,"MYSQL", 0.00,"3.0","SQL"));
        catalogProduse.add(new SistemServer(12,"HPE ProLiant", 25000.0, "DL380 Gen11", 2));
        catalogProduse.add(new Smartphone(13,"Iphone", 2500.0, "17 Pro", 256.0));
        catalogProduse.add(new Tablet(14,"Ipad", 2500.0, "Air", 256.0));
        catalogProduse.add(new Notebook(15,"Lenovo", 250.0, "Slim", 6.0));
        catalogProduse.add(new Laptop(16,"Acer", 250.0, "Nitro", 16.0));
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
                case ClientEmail s -> System.out.println("  -> ClientEmail: " + s.getVersiune() + " - Conturi: " + s.getNumarConturiMax());
                case PlatformaManagementProiecte s -> System.out.println("  -> PlatformaManagementProiecte: " + s.getVersiune() + " - Numar Maxim Proiectee: " + s.getNumarProiecteMax());
                case SistemEnterprise s -> System.out.println("  -> SistemEnterprise: " + s.getVersiune() + " - Licență: " + s.getTipLicenta());
                case MediuDeDezvoltare s -> System.out.println("  -> MediuDeDezvoltare: " + s.getVersiune() + " - Limbaj: " + s.getLimbajProgramare());
                case BazadeDate s -> System.out.println("  -> SistemBazeDeDate: " + s.getVersiune() + " - Tip BD: " + s.getTipBD());
                case SistemServer s -> System.out.println("  -> SistemServer: " + s.getNumarModel() + " - Procesoare: " + s.getNrProcesoare());
                case Smartphone s -> System.out.println("  -> SmartPhone: " + s.getNumarModel() + " - Memorie: " + s.getCapMemorie() + "\"");
                case Tablet s -> System.out.println("  -> Tablet: " + s.getNumarModel() + " - Memorie: " + s.getCapMemorie() + "\"");
                case Notebook s -> System.out.println("  -> Notebook: " + s.getNumarModel() + " - Memorie: " + s.getRAM() + "\"");
                case Laptop s -> System.out.println("  -> Notebook: " + s.getNumarModel() + " - Memorie: " + s.getRAM() + "\"");
                case null -> System.out.println("Produs invalid (null).");
                default -> System.out.println("Tip de produs necunoscut: " + p.getClass().getName());
            }
        }
    }
}