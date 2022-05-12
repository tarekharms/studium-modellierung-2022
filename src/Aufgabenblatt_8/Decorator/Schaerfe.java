package Aufgabenblatt_8.Decorator;

public class Schaerfe extends Verbesserung {

    public Schaerfe(Schwert schwert)
    {
        super(schwert);
    }

    @Override
    public void zeichne() {
        this.schwert.zeichne();
    }

    @Override
    public int schaden() {
        int schaden = this.schwert.schaden();

        System.out.println("Plus " + (int)(schaden * 0.25) + " (+25%) Schaden durchs Schärfen");

        return (int)(schaden * 1.25);
    }
}
