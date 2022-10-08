package Aufgabenblatt_8.Decorator;

public abstract class Verbesserung implements Schwert {
    protected Schwert schwert;

    public Verbesserung(Schwert schwert)
    {
        this.schwert = schwert;
    }

    public void zeichne() {
        this.schwert.zeichne();
    }

    public int schaden() {
        return this.schwert.schaden();
    }
}
