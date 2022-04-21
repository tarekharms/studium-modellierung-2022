package aufgabenblatt_6;

public class KontoBewegung {
    private double betrag;
    private Richtung richtung;

    public KontoBewegung(double betrag, Richtung richtung)
    {
        this.betrag = betrag;
        this.richtung = richtung;
    }

    public Richtung getRichtung()
    {
        return this.richtung;
    }

    public double getBetrag()
    {
        return this.betrag;
    }
}
