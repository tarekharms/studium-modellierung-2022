package aufgabenblatt_6;

public class Benutzer {

    public static void main(String[] args)
    {
        System.out.println("Hello wordl");

        Girokonto girokonto = new Girokonto();
        Sparkonto sparkonto = new Sparkonto();

        girokonto.einzahlen(1000);
        sparkonto.einzahlen(500);

        girokonto.ueberweisen(sparkonto, 200);
        girokonto.auszahlen(150);
        sparkonto.auszahlen(50);

        System.out.println("Girokonto: " + girokonto.getKontostand());
        System.out.println("Sparkonto: " + sparkonto.getKontostand());
    }
}
