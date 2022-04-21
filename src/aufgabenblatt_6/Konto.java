package aufgabenblatt_6;

import java.util.List;
import java.util.ArrayList;

public class Konto {
    private int kontonummer;
    protected double habenZins;
    protected List<KontoBewegung> kontobewegungen;

    public Konto()
    {
        this.kontobewegungen = new ArrayList<>();
    }

    public double getKontostand()
    {
        double kontostand = 0;

        for(KontoBewegung kontoBewegung : this.kontobewegungen)
        {
            if(kontoBewegung.getRichtung() == Richtung.EINZAHLEN)
            {
                kontostand += kontoBewegung.getBetrag();
            }
            else
            {
                kontostand -= kontoBewegung.getBetrag();
            }
        }

        return kontostand;
    }

    public void einzahlen(double betrag)
    {
        this.kontobewegungen.add(new KontoBewegung(betrag, Richtung.EINZAHLEN));
    }

    public void auszahlen(double betrag)
    {
        this.kontobewegungen.add(new KontoBewegung(betrag, Richtung.AUSZAHLEN));
    }
}
