package Aufgabenblatt_8.Decorator;

public abstract class Verbesserung implements Schwert {
    protected Schwert schwert;

    public Verbesserung(Schwert schwert)
    {
        this.schwert = schwert;
    }
}
