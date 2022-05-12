package aufgabenblatt_6;

public class Girokonto extends Konto {
    private double dispo;
    private int sollzins;

    public Girokonto()
    {
        super();
    }

    public void ueberweisen(Konto ziel, double betrag)
    {
        this.auszahlen(betrag);
        ziel.einzahlen(betrag);
    }
}
